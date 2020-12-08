import React from "react";
import { Form, Input, Label } from "reactstrap";

interface IProps {}

export const LoginComponent: React.FC<IProps> = (props: IProps) => {
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
            <input type="button" value="Submit" />
          </form>
        </div>
        <div className="col-sm"></div>
      </div>
    </div>
  );
};
