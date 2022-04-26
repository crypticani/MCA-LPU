import React, { Component } from "react";

this.state = {
    data : [
        {
            "name": "Maruti"
        },
        {
            "name": "Suzuki"
        }
    ]
}
function Car() {
    return (<><h2> Hello, I am in function Car</h2><ul><li>{this.state.data.map((item) => <List data={item} />)}</li></ul></>);

}

class List extends React.Component {
    render() {
        return (
            <ul>
                <li>{this.props.data.name}</li>
            </ul>
        );
    }
}
export default Car;