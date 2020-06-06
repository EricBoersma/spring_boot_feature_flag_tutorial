import React from "react";
import {Text, Strong} from 'evergreen-ui';

export default (props) => {
  const {userName, message} = props;

  return(
    <div>
      <Strong size={400} >{userName}: </Strong>
      <Text  size={400}>{message}</Text>
      <hr />
    </div>
  )
}