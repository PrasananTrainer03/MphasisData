import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';
import { Customer } from '../customer';


@Component({
  selector: 'app-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.css']
})
export class WalletComponent implements OnInit {

  
  wallet : Observable<Wallet[]>
  wallet1 : Observable<Wallet[]>
  customer : Customer;
  wallId : number;
  show() {
    this.wallet1=this.walletService.showByWalletCustomerId(this.wallId);
  }

  constructor(private walletService : WalletService) { 
    this.customer = localStorage.getItem('customer')? JSON.parse(localStorage.getItem('customer')):[];
    //alert("Customer Id is " +this.customer.cusId);
    this.wallet1=this.walletService.showByWalletCustomerId(this.customer.cusId);
    // alert(this.customer.cusId);
  //  this.orders=this.customerService.orderHistory(this.customer.cusId);
  //   this.wallet=walletService.showWallet();
  //   this.wallet1=walletService.showByWalletCustomerId(this.wallId);
  }

  ngOnInit() {
  }
}
