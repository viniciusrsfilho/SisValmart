import { Component, OnInit } from '@angular/core';
import { LoginService } from '../../login/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private loginService : LoginService, private router : Router) {}

  ngOnInit() {
  }

  logout() {
    this.loginService.fezLogout();
    this.router.navigate(['/home']);
  }
}
