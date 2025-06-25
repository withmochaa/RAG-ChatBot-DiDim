<div align="center">
  <img src="./images/beodidim10.jpg" alt="버디딤 로고" width="400"/>
  <h1>버디딤(BuddyDim): 세종대학교 외국인 유학생을 위한 AI 챗봇</h1>
  <p>세종대학교 외국인 유학생들의 학교생활 적응을 돕기 위해 개발된 AI 백과사전 서비스입니다.</p>
</div>

<br>

<div align="center">
  <img src="./images/beodidim6.jpg" alt="프로젝트 소개" width="800"/>
</div>

---

## 📌 프로젝트 개요

**버디딤(BUDDY DIM)**은 정보 접근에 어려움을 겪는 세종대학교 외국인 유학생들을 위한 맞춤형 AI 챗봇 서비스입니다. 복잡한 학교 공지, 시설 안내, 학사 제도 등 방대한 정보를 쉽고 빠르게 얻을 수 있도록 돕고, 정서적 교감을 통해 성공적인 캠퍼스 라이프를 지원하는 것을 목표로 합니다.

<br>

## 겪고 있는 문제점

> 학생들이 느끼는 다양한 불편함이 있습니다. 저희는 여기서 소수의 외국인 학생들의 소리에 귀 기울였습니다.

<div align="center">
  <img src="./images/beodidim1.jpg" alt="문제 상황" width="800"/>
</div>

<br>

## ✨ 버디딤의 해결책

> 학교생활에서 가장 어렵게 느껴지는 건 상대적으로 정보를 쉽게 얻을 수 없다는 점입니다. 버디딤은 이 문제를 해결합니다.

<div align="center">
  <img src="./images/beodidim9.jpg" alt="문제 해결" width="800"/>
</div>

*   **#선택적 정보 습득**: 백과사전처럼 방대한 정보 속에서 필요한 정보만 콕! 짚어 찾아내 줍니다.
*   **#정서적 교감**: 챗봇을 미디어 속 친구로 인식하여 대화 속에서 친밀감을 형성할 수 있습니다.
*   **#대화형 서비스**: 개인에게 맞춤화된 즉각적인 상호작용을 통해 궁금증을 해결합니다.

<br>

## 🎨 주요 기능

<div align="center">
  <img src="./images/beodidim8.jpg" alt="주요 기능" width="800"/>
</div>

*   **다국어 지원**: Papago API를 활용해 사용자가 입력하는 언어를 탐지하고, 해당 언어에 맞춰 서비스를 제공합니다.
*   **맞춤형 서비스**: AI를 활용하여 사용자의 의도를 정확히 반영한 맞춤형 채팅 서비스를 제공합니다.
*   **사용자 커스터마이징**: 사용자가 직접 엑셀 파일을 업로드하여 개인 시간표를 관리할 수 있습니다.
*   **학교 정보 안내**: 외국인 학생들이 캠퍼스 라이프를 원활히 즐길 수 있도록 주요 시설 및 제도를 안내합니다.

<br>

## 📱 서비스 화면

| 엑셀 파일 시간표 업로드 | 사용하는 언어 선택 |
| :---: | :---: |
| <img src="./images/beodidim5.jpg" alt="시간표 업로드" width="350"/> | <img src="./images/beodidim5.jpg" alt="언어 선택" width="350" style="object-position: right;"/> |
| **캐릭터 화면** | **채팅 화면** |
| <img src="./images/beodidim4.jpg" alt="캐릭터 화면" width="350"/> | <img src="./images/beodidim4.jpg" alt="채팅 화면" width="350" style="object-position: right;"/> |

<br>

## 🏗️ 서비스 아키텍처

### 시스템 구성도
<div align="center">
  <img src="./images/beodidim2.jpg" alt="서비스 아키텍처" width="800"/>
</div>

### AI 처리 과정
<div align="center">
  <img src="./images/beodidim3.jpg" alt="AI 처리 과정" width="800"/>
</div>

1.  **NLP 과정 (Sentence Transformer)**
    - 문장의 유사도를 파악하기 위해 문장을 고차원 벡터로 임베딩합니다.
    - 비슷한 의미를 가진 문장들의 벡터가 임베딩 공간에서 가까운 위치하도록 하여 유사도를 판별하고, 사용자의 질문 의도에 맞는 Class를 선정합니다.

2.  **정보 탐색 과정 (RAG)**
    - 정보 검색(Retrieval)과 텍스트 생성(Generation)을 결합하여, 신뢰할 수 있는 내부 데이터(교내 수강편람 PDF 등)를 기반으로 답변을 생성합니다.
    - 이를 통해 LLM의 '환각(Hallucination)' 현상을 최소화하고 정확하고 양질의 답변을 제공합니다.

<br>

## 🛠️ 기술 스택

| 구분 | 기술 |
| --- | --- |
| **Frontend** | <img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=black"> <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white"> <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white"> |
| **Backend** | <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white"> <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=white"> <img src="https://img.shields.io/badge/gRPC-00ADD8?style=for-the-badge&logo=gRPC&logoColor=white"> |
| **AI** | <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=Python&logoColor=white"> <img src="https://img.shields.io/badge/PyTorch-EE4C2C?style=for-the-badge&logo=PyTorch&logoColor=white"> |
| **Database** | <img src="https://img.shields.io/badge/H2-4479A1?style=for-the-badge&logo=H2&logoColor=white"> |
| **APIs & Models** | `Sentence Transformer` `RAG` `ChatGPT` `Papago API` |
| **Tools** | <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white"> <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"> |

<br>

## 👥 팀원 소개

<div align="center">
  <img src="./images/beodidim7.jpg" alt="팀원 소개" width="800"/>
</div>

| 역할 | 이름 |
| :---: | :---: |
| **Back-end** | 이승용, 신혜빈 |
| **Front-end**| 김범수 |
| **AI** | 김강민 |
| **Designer** | 김희연 |

