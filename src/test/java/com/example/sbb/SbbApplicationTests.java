package com.example.sbb;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;

import com.example.sbb.Answer.Answer;
import com.example.sbb.Answer.AnswerRepository;
import com.example.sbb.Question.Question;
import com.example.sbb.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Transactional
	@Test
	void testJpa() {

		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		List<Answer> answerList = q.getAnswerList();

		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}
}
