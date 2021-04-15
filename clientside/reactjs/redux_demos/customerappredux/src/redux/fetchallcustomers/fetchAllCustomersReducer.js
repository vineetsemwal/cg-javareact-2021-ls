import fetchAllCustomersContants from "./fetchAllCustomersConstants";

const initialState = {
    progress: false,
    customers: [],
    error: []
};

export default function fetchAllCustomersReducer(state = initialState, action) {

    if (action.type === fetchAllCustomersContants.fetchAllCustomersFail ||
        action.type === fetchAllCustomersContants.fetchAllCustomersRequest ||
        action.type === fetchAllCustomersContants.fetchAllCustomersSuccess

    ) {

        let newState = { ...state, ...action };
        return newState;
    }

    return state;
}