# multimodule-setting

가장 루트 프로젝트는 기본 스프링 부트 프로젝트로 생성한다

하위 모듈도 스프링 부트 프로젝트로 생성하되 build.gradle.kts와 src를 제외하고 모두 삭제한다

setting.gradle.kts에 하위 모듈을 import한다

하위 모듈안에 하위 모듈이 존재하는 경우 findProject로 하위 모듈의 이름을 설정한다

상위 모듈에서 하위 모듈의 dependency를 가져올때는 기본적으로 implementation()를 사용하되 하위 모듈이 import한 dependency가 같이 필요한 경우 api()를 사용한다
