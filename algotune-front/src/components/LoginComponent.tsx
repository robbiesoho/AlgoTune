import React, { useState } from "react";

interface IProps {
  setEmail: any;
  setPassword: any;
}

export const LoginComponent: React.FC<IProps> = (props: IProps) => {

  // const [email, emailSetter] = useState("");
  // const [password, passwordSetter] = useState("");

  function clicked() {
    alert("asdasd");
  }

  return (
    <div id="login-form" className="container">
      <h1>LOGIN</h1>
      <div className="row">
        <div className="col-sm">
          <form>
            <label>Email</label>
            <br />
            <input type="email" required name="email" />
            <br />
            <label>Password</label>
            <br />
            <input type="password" required name="password" />
            <br />
            <br />
            <input type="button" value="Submit" onClick={clicked} />
          </form>
        </div>
        <div className="col-sm"></div>
      </div>
    </div>
  );
};
