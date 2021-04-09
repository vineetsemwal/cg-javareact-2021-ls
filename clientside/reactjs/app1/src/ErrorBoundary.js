import {Component} from 'react';

class ErrorBoundary extends Component {


    constructor(props) {
        super(props);
        this.state = { hasError: false };
    }


    static getDerivedStateFromError(error){
        return { hasError: true };
    }

    /**
     * 
     * componentDidCatch(error, info)
     */

    render() {
        if (this.state.hasError) {
            return (
            <h3>There was problem in rendering component</h3>
            );
        }

        return (this.props.children);

    }

}

export default ErrorBoundary;