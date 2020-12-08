import React from 'react';
import { Form, Input, Label } from "reactstrap";

interface IProps {

}

export const LoginComponent: React.FC<IProps> = (props: IProps) => {
    return (
        <div>
            <Form>
                <Label>Email</Label>
                <Input type="email" required name="email"/>
                <Label>Password</Label>
                <Input type="password" required name="password"/>
                <Input type="button" value="Submit"/>
            </Form>
        </div>
    );
}