package org.example.job

import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.job.builder.JobBuilder
import org.springframework.batch.core.repository.JobRepository
import org.springframework.batch.core.step.builder.StepBuilder
import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.batch.repeat.RepeatStatus
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.PlatformTransactionManager

@Configuration
class TestBatch(
    private val jobRepository: JobRepository,
    private val transactionManager: PlatformTransactionManager,
) {

    @Bean
    fun testBatchJob(): Job {
        return JobBuilder("testBatchJob", jobRepository)
            .start(testBatchStep())
            .build()
    }

    @Bean
    fun testBatchStep(): Step {
        return StepBuilder("testBatchStep", jobRepository)
            .tasklet(testTasklet(), transactionManager)
            .build()
    }

    @Bean
    fun testTasklet(): Tasklet {
        return Tasklet { _, _ ->
            println("batch executed")
            RepeatStatus.FINISHED
        }
    }
}
