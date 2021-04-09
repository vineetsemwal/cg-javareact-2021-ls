import {Component} from 'react';
/**
 * very useful in the production
 * 
 * default react behavior is if there is an err in the component then whole page stops functioning
 * instead of that we can use error boundaries component like this one
 * our components can be child of error boundaries components in that case 
 *  if there is err in component now err boundary component will only display message
 *  else our component will be displayed
 * 
 */
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