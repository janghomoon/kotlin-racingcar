# kotlin-racingcar

## step2 문자열 계산기

### commit message
* feat - 새로운 기능에 대한 커밋
* fix - 버그 수정에 대한 커밋
* build - 빌드 관련 파일 수정 / 모듈 설치 또는 삭제에 대한 커밋
* chore - 그 외 자잘한 수정에 대한 커밋
* ci - ci 관련 설정 수정에 대한 커밋
* docs - 문서 수정에 대한 커밋
* style - 코드 스타일 혹은 포맷 등에 관한 커밋
* refactor - 코드 리팩토링에 대한 커밋
* test - 테스트 코드 수정에 대한 커밋
* perf - 성능 개선에 대한 커밋


### todo 리스트
* 문자열 파싱
* 사칙연산 계산
* 예외처리

### 구현 목록
* 덧셈
* 뺄셈
* 곱셈
* 나눗셈
* 입력값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw
* 사칙연산 기호가 아닌 경우 IllegalArgumentException throw
* 사칙 연산을 모두 포함하는 기능 구현
* 공백 문자열을 빈 공백 문자로 분리하려면 String 클래스의 split(" ") 메소드를 활용한다. 반복적인 패턴을 찾아 반복문으로 구현