import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  get(id) {
    return http.get(`/messages/${id}`);
  },

  addMessage(message) {
    return http.post('/messages', message);     // Do a REST API POST to the path specified with the data to be posted
  },                                         //   include the value passed as the data to be posted

  updateMessage(message) {
    return http.put(`/messages/${message.id}`, message); // Do a REST API PUT to the path specified with the id as a path variable
  },
  
  deleteMessage(id) {
    return http.delete(`/messages/${id}`);  // Do a REST API DELETE to the path specified with the data passed as a path variable
  }

}
