import React from "react";
import Axios from "axios";
import { Form, FormGroup, Label, Input, FormText, Button } from "reactstrap";

interface IProps {}

export const SendDataForm: React.FC<IProps> = () => {
  return (
    <Form>
      <FormGroup>
        <Label for="harmony">Harmony</Label>
        <Input type="number" name="harmony" id="harmony" />
      </FormGroup>
      <FormGroup>
        <Label for="examplePassword">Melody</Label>
        <Input type="number" name="melody" id="melody" />
      </FormGroup>
      <FormGroup>
        <Label for="iterations">Iterations</Label>
        <Input type="number" name="iterations" id="iterations" />
      </FormGroup>
      <FormGroup>
        <Label for="iterations">Iterations</Label>
        <Input type="number" name="iterations" id="iterations" />
      </FormGroup>
      <FormGroup>
        <Label for="notes">Notes</Label>
        <Input type="text" name="notes" id="notes" />
      </FormGroup>
      <FormGroup>
        <Label for="proccess-type">Post Processing Type</Label>
        <Input type="select" name="process-type" id="process-type">
          <option>Mod</option>
          <option>Reflect</option>
          <option>None</option>
        </Input>
      </FormGroup>

      <Button>Submit</Button>
    </Form>
  );
};
