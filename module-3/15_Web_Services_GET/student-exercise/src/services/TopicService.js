import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  getTopics() {
    return http.get('/topics');
  },

  getMessages(topicsID) {
    return http.get(`/topics/${topicID}`)
  },

  getMessages(topicID, messageID) {
    return http.get(`/topics/${topicID}`).then((response) => {
      const messages = response.data.messages;
      return messages.find(message => message.id == messageID);
    })
  }

}
