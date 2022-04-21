import React, { Component } from "react";
class Props extends React.Component {
    constructor() {
        super();
        this.state = {
            data:
                [
                    {
                        "name": "Aniket"
                    },
                    {
                        "name": "Amit"
                    },
                    {
                        "name": "Harsh"
                    },
                    {
                        "name": "Pranav"
                    },
                ]
        }
    }
    render() {
        return (
            <div>
                <StudentList />
                <ul>
                    {this.state.data.map((item) => <List data={item} />)}
                </ul>
                
            </div>
        );
    }
}
class StudentList extends React.Component {
    render() {
        return (
            <div>
                <h2>Student Name Detail</h2>
            </div>
        );
    }
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

export default Props;