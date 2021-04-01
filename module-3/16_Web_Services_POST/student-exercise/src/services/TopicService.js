import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },

  addTopic(topic) {
    return http.post('/topics', topic);     // Do a REST API POST to the path specified with the data to be posted
  },                                         //   include the value passed as the data to be posted

  updateTopic(topic) {
    return http.put(`/topics/${topic.id}`, topic); // Do a REST API PUT to the path specified with the id as a path variable
  },
  
  deleteTopic(id) {
    return http.delete(`/topics/${id}`);  // Do a REST API DELETE to the path specified with the data passed as a path variable
  }
}
