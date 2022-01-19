Feature: Login

  Scenario: Successful login with Valid Credentials
    Given User launches Chrome browser
    When user navigates to "https://account.bbc.com/signin?realm=%2F&clientId=Account&lang=en-GB&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F&isCasso=false&action=sign-in&redirectUri=https%3A%2F%2Fsession.bbc.co.uk%2Fsession%2Fcallback%3Frealm%3D%2F&service=IdSignInService&nonce=ci3XCoVA-Y_yYx38xpOdKrv_o-wkcMIQ3TiE"
    And user enters email as "carlossik@gmail.com" and Password as "1771Kwaku"
    And clicks on Login Button
    Then page Title should be "Hi carlos,welcome to your BBC"
    And browser is closed



