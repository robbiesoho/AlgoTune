import React, { useState } from 'react';
import { LoginComponent } from '../components/LoginComponent';

export const LoginPage: React.FC<any> = () => {

    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    return (
        <div>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <LoginComponent setEmail={setEmail} setPassword={setPassword}/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <h1>Email: {email} Password: {password}</h1>
        </div>
    )
}