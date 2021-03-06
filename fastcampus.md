지도학습이 더 중요하다 생각할 수 있는데, 현실적으로는 labeled data들이 그렇게 많지가 않아서 비지도학습이 더 중요하다고 하는 사람들도 많다.

최근에는 강화학습도 머신러닝의 일부이다 라고 말하는 사람들이 많다. 유명한 알고리즘이다. 유명한 예는 알파고. Agent는 바둑기사. action은 바둑에서 두는 모든 수. state는 바둑 판. reward는 바둑이 끝났을 때 이겼느냐 졌느냐를 사용해서 받는다. Agent가 어느곳에 수를 두어야(어떤 action을 취해야) 먼 미래에 이길 수 있을까에 대해서 학습한 게 알파고.

선형회귀분석

어떠한 직선을 그어서 X를 가지고 Y를 예측하고 싶은건. 중학생 때 배우는 직선의 방정식(y=ax+b)을 이용해서 우리가 원하는 y값을 예측하는게 선형회귀 모델이다. 독립변수(x)와 종속변수(y)가 선형적인 관계가 있다라는 가정하에 분석. 비선형관계에 대해서는 표현을 잘 못한다.

decision tree는 굉장히 직관적이다. 비가오면 축구안함. 비가안오면 축구함.

데이터 사이언스 뿐 아니라 AI에서 아직도 큰 이슈이고 이를 해결하기 위한 연구들이 많이 진행이 되고있다.



Neural Network

각각의 층을 연결하는 weight(가중치)가 있음. 한 node에 연결된 모든 선이 하나의 직선(wx + b)라고 생각하면 됨. 층을 이어서 생기는 수많은 직선들을 사용해서 복잡한 모형을 만들 수 있게 되는게 Neural Network. Feed Forward를 통해 출력값을 내고, 실제값과 출력값의 차이를 보고 다시 weight를 업데이트(선을 수정)시킨다. 이게 Neural Network의 기본원리. 이것도 오버피팅이 잘 된다라는 단점때문에 죽고

SVM이 뜨기 시작함. 2000년대 초중반까지만해도  SVM이 많이 쓰였다. class간의 거리(margin)가 최대가 되도록 직선(decisioin boundary)를 그린다(최대한 합리적으로 그린다). Neural Network같은 경우에는 랜덤하게 긋고 분류만 제대로 되면 그대로 멈춰버림. 그래서 decision boundary가 나쁘게 나옴. 그래서 실제 데이터에는 잘 맞지 않는 오버피팅 현상이 발생함.

그러면 한 군집 사이에 다른 군집의 데이터가 들어가는 경우는? SVM은 학습 과정 내에서 어느 정도 오차를 허용하고 직선을 긋는다. Neural Network나 다른 모델같은 경우는 무조건 학습데이터를 잘 맞추기 위해 선을 과하게 긋는 현상이 있는데 SVM은 학습 과정에서 어느정도 오차를 허용하기 때문에 decision boundary가 잘 나온다. 요즘엔 이거보다 좋은 모델들이 많아서 잘 쓰이지 않는다. 학습하는 시간이 너무오래걸리고 데이터가 커질수록 학습시간이 너무 길어진다. 데이터가 4000개만 되도 SVM은 하루이틀 걸릴 수 있다. regression이나 다른 모델들 같으면 길어야 10분정도면 적합이되는데....

Ensemble(화합, 조합을 이루다.) Learning

가장 요즘 많이쓰이고 성능이 좋다라고 소문이 나있음. 여러개의 모델(기본 모델을 classifier, base learner, weak learner라고 부름)을 결합해서 하나의 모델로 만든다. 보통 decision tree 기반으로 많이 사용하고 대표적으로는 3가지 종류가 꼽힌다.

- Bagging
- Random Forest
- Boosting

여러개의 모델을 만든다음 데이터가 들어왔을 때 예측을 하고 각각의 모델들이 아웃풋을 내고, 아웃풋을 평균을 내거나 투표를 한다.

여러개의 모델의 조합이라서 이렇게 부른다. 성능이 최근에 굉장히 좋아서 캐글 대회를 포함해서 여러 데이터 사이언스 대회에서 거의 우승을 차지하고 있는 알고리즘.

무조건 성능측면에서 정확도를 높여야 한다면 앙상블 러닝을 쓰는게 좋은 결과가 나온다. 하지만 목적이 Y에 영향을 미치는 어떠한 파라미터를 찾는 것인 경우 앙상블러닝이 그렇게 좋지 않을 수 있다.



2010년대 들어와서 딥러닝이 뜨기 시작함

overfitting을 방지하는 여러 알고리즘이 발전, GPU의 발전이 NN의 학습을 굉장히 비약적으로 빠르게 향상시켜줌.

정의를 graphical representation learning이라고 많이 함. 다층의 layer를 통해 복잡한 데이터의 학습이 가능토록 함.

원래 이미지 분류를 머신러닝으로 할 수는 있었다. 픽셀의 값들을 하나의 독립변수로 보고 한 네모구간에 해당하는 값을 하나의 벡터로 늘어트린 다음에 학습을 시켰다. 100px * 100px의 경우 차원이 10000이 됨. 독립변수가 10000개가 된 것. 그래서 학습시간이 굉장히 오래걸림. 그리고 X들이 서로 독립이라는 기본가정에서 벗어나지만 그냥 돌린것. 앙상블 러닝, SVM등 그냥 돌려도 성능이 나쁘지 않아서 그냥 쓴 것. 그림 상에서 인접 픽셀들의 관계를 전혀 고려하지 못함.

그래서 CNN을 사용함. fully connected layers에서는 NN의 모델을 그대로 사용한것. 그런데 그 전에 NN의 인풋값을 사진의 graphcal feature를 뽑아서 만든 것을 제외하고 CNN이 기본적인 NN와 다른것은 없다. CNN도 원래 있던 모델 90년대에 나옴. 오버피팅이 너무 심하고, 학습시간이 너무 오래걸려서 잘 안쓰이다가 2010년도에 와서 많이 쓰임.

딥러닝은 다양한 형태로 발전(CNN, RNN, AutoEncoder 등)

Object detection - 이미지를 분류하는 것을 넘어서 그 안에 있는 어떠한 객체를 찾아내고 그 객체가 무엇인지 찾아내는 것

 Image Resolution - 해상도 복원, 저화질을 고화질로 복원할 수 있다.

Style transfer - 몇년 전에 처음 나옴. 사진에 대해서 어떤 화가의 화풍을 적용함.

Colorization - 흑백에 색깔을 입힘. 



네트워크 구조의 발전(딥러닝의 성능을 높이기 위해)

- ResNET
- DenseNET

기타 등등..



GAN

G(Generator)

D(Discriminator) : 판별. 진짜는 진짜로 가짜는 가짜로 판별해야함

x는 real data, z는 noise data

G(z)는 fake data

Generator는 결국 진짜같은 가짜 데이터를 만들어서 Discriminator가 분류할 수 없게끔 만들게하는게 목적.

BigGAN

CycleGAN



SOTA(State of the Art) : 가장 최신식

분류의 SOTA 모델 = 현재 분류의 가장 최신식, 가장 좋은 모델.



강화학습

최근에 GAN과 강화학습이 인공지능의 중요한 개념이 됨.

가장 유명한 것

Q-learning



Q-learning + Deep Learning : DQN(Deep Reinforcement Learning) - 사실 잘 안 쓰임. 성능이 그렇게 좋지않음.

발전단계이나 자율주행등 실제 분야에 강화학습이 사용되기에는 멀었다.

보통 게임을 가지고 진행을 많이 한다. 강화학습 논문들을 보면 대부분 Atari 게임을 가지고 성능을 측정함. 혹은 Unity 게임 환경을 자기가 만들어서 테스트함.



## 머신러닝 모형의 적합성 평가 및 실험 설계

모형이 잘 만들어졌는지 평가하는 방법, 실험을 설계하는 방법

trajining, validation, test 5:3:2 비율로 나눈다.(정석)

train data로 모형 $f$를 추정

validation data로 모형 $f$의 하이퍼 파라미터를 조정

test data로 모형의 성능을 평가.

데이터가 어마어마하게 많으면(수십, 수백만개) 데이터 분할을 한번만 해도 상관은 없지만, 그렇지 않으면 데이터를 분할하면서 데이터의 수가 줄기 때문에, 데이터 분할을 여러번 할 때 마다 성능이 조금 달라질 수 있다. 그래서 실험 설계에 따라서 과정을 여러번 반복하기도 한다.

k-Fold 교차검증(k-Fold Cross Validation)

데이터를 k개로 나눠 하나를 validation data로, 나머지를 training data로 분류 후 k번 반복해서 성능 지표를 평균내서 모형의 적합성을 평가.

LOOCV(Leave-One-Out Cross Validation)

데이터가 적을 때 사용

데이터의 수만큼 데이터 모델을 만듬. 각 모델은 하나의 샘플만 제외하면서 모델을 만들고 제외한 샘플로 성능 지표를 계산함. 이렇게 도출된 n개의 성능 지표를 평균 내서 최종 성능 지표를 도출.



데이터의 수에따른 실험 설계(데이터 모델 설정)

데이터 분할 > k-Fold CV > LOOCV



데이터 분석과정

raw 데이터를 행과 열로 이루어진 데이터로 만듬(전처리:Preprocessing 혹은 Feature Engineering) - 실험 설계 - 모델링

맘에 들지 않으면 데이터 전처리나 실험설계 부분을 다시 해본다.

전처리 시 원래 변수에서 파생되어져 나온 파생변수를 만들 수 있다.(누적 접속일, 누적 획득경험치, 평균획득 경험치 등) 파생 변수를 만들 때 어떤 변수가 결과에 영향을 끼칠까 고민해보고 파생변수를 만들어야한다.

이렇게 Feature를 잘 만들어놓으면, 모델은 어떤 것을 쓰던 모델의 성능은 올라갈 수 밖에 없다. Feature는 목적에 맞게 합리적으로 만들어야 한다.

실수할 수 있는 부분 - 순서가 결과에 영향을 미치는 경우?, class imbalance

오버피팅을 방지하기 위한 기술들만 발전하고 있고, 오버피팅을 해결하기 위한 방법론은 없다.

간단한 모형일수록 편이(편파성)가 높아지고, 분산이 낮아진다.

복잡할 모형일수록 편파성이 낮아지고, 분산이 높아진다.

분산과 편파성의 트레이드오프(딜레마)



데이터 자체가 모집단의 특성을 모두 가진다면 오버피팅시키면 된다. 하지만 학습데이터가 모집단의 특성을 완벽하게 대변한다는 보장이 없기 때문에 오버피팅을 방지해야한다.



## 회귀분석

**통계학**

모집단을 알아야 한다.

모집단 - 전부다 수집을 할 수 없는 집단이라고 생각해도 될듯.(ex. 전세계 사람들)

이러한 경우에 통계학은 모집단을 모두 얻을 수 없기 때문에 표본이 필요하다.

통계학은 모집단보다는 표본을 통해서 모집단이 가지고 있는 정보를 최대한 효율적으로 잘 알고자 하는게 통계학이다.

모집단의 모수

모집단은 굉장히 많은 관측치들의 모음이다. 모든 정보에 대해 관심이 있지는 않을 것. 전반적인 형태, 그 중심이 어디에 있는가. 평균, 분산 등에 관심이 있다.

우리가 관심을 가지는 평균 or 분산 등을 모수(Parameter)라고 한다.

모수를 알기 위해서 표본에서 통계량을 계산을 해내고, 통계량을 활용해서 모수를 알아내고자 한다. 이것이 통계학에서 주로 다루는 주제다.

모수(Parameter) : 수치로 표현되는 모집단의 특성.

통계량(Statistic) : 표본의 관측값들에 의해서 결정되는 양.



통계학에서 주로 다루는 자료는?

1. 수치형 자료(양적자료. 기본적으로 숫자 자료)

   - 연속형(ex. 몸무게, 키)

     두 자료의 사이에 항상 새로운 값들이 들어갈 수 있다.

   - 이산형(ex. 사람 수, 전화통화 수)

     분절될 수가 없는 숫자자료

     1.5명이라는건 있을 수 없다.

2. 범주형 자료(질적자료. 구분된 객체)

   - 순위형(ex. 학점)

     범주형 자료에 순서(순위)까지 존재.

     구분도 되고 순서도 존재한다.

   - 명목형(ex. 성별)

     순서가 없는 경우



자료가 달라지면 행하는 분석도 달라진다.

설명변수 - 독립변수, 입력변수, X라고도 표현됨.

반응변수 - 종속변수, 출력변수, Y라고도 표현됨.



자료의 요약 (표,그림) - 어떻게 보여줄건가. 자료의 값을 하나하나 관심을 가지고 어떤값인가 보는게 이상적일 수 있으나,  자료가 천개, 만개 등등 늘어나버리면 자료를 하나하나 보는게 불가능하고, 값 하나하나에 의미가 있다기보다는 전반적으로 어떤 값을 가지는가(집단의 형태, 위치)가 중요하게 된다. 그러면 그것들을 어떻게 잘 표현할 것인가가 중요해진다.

1. 범주형 자료

   - 도수 분포표

     각각의 범주가 몇개의 카운트를 가지는가(도수가 몇개가 되는가)에 대한 표

   - 막대 / 원형 그래프

     본질적으로는 도수 분포표에서 얻어내는 것이지만, 우리가 가진 자료의 형태에 따라서 원형 혹은 막대그래프 형태로 나타내서 시각적으로 잘 나타낼 수 있도록 나타내서 살펴보는 경우가 많다.

2. 연속형 자료(값이 촘촘하게 실수값을 가지기 때문에, 앞의 방식으로 살펴볼 수가 없음. 촘촘한 자료들을 한데 묶어서 표현해 주면 됨.)

   - Box plot

     박스 부분에 많은 자료가 위치. 실선부분에 대부분의 자료가 들어가있다. 바깥의 점이 이상치일 가능성이 높은 데이터들.

   - 히스토그램(Histogram)

     연속형 변수가 전반적으로 어디서 많이 나오고 어디서 적게 나오는지 살펴보는 그림이다.

자료의 요약 (수치) - 모집단의 요약값을 구체적으로 알아내기 위해서는 수치화시켜야 한다.



중심 경향값(대표값)

- 평균(Mean) - $\mu$ 평균값을 뮤로 표현함.
- 중앙값(Median)
- 최빈값(Mode)

Mean값은 Median값보다 이상치에 대한 영향을 많이 받는다.



산포도(퍼진 정도)

- 분산(Variance) - 가장 많이 사용함

  $ \sigma^2 = \frac {\sum^N_{i=1} (x_i-\mu)^2} N$

  분산 역시 중심으로부터 멀리 떨어진 이상치의 영향을 많이 받음

- 사분위수 범위(Inter quartile range)

  크기순으로 정렬해서 하위 25%, 상위 25% 떼고 나머지 중앙 50%의 관측치가 가지는 범위



정규분포 - 대표적으로 많이 쓰이고 자료의 수치요약에 대해서도 정규분포와 관련된 값이 있다.

- 종모양을 가진 좌우대칭 형태.
- 평균값에서 가장 많은 데이터가 존재
- 평균값에 따라서 중심이 이동하고, 분산이 작을수록 위로 솟고, 작을수로 낮고 멀리 퍼지게 된다.
- 대부분의 자연과학 현상을 설명할 때 많이 쓰이는 분포다.



분포도

- 왜도(Skewness)
  - 분포의 비대칭 정도
  - Left-skewed를 Negative skewed로 표현하기도 함.
- 첨도(Kurtosis)
  - 정규분포를 0으로 기준을 잡음.
  - 정규분포보다 뾰족하게 솟으면 첨도는 양수. 꼬리는 낮아짐.
  - 덜 뾰족하게 낮아지면 첨도는 음수.

표본에서 얻어낸 통계량/추정량을 통해서 모집단에 대한 예상(추정, 추론) (모수)



추정량의 종류(표본 관측치의 개수: n)

표본 평균 $\bar X$

표본 분산 $s^2$



확률실험(Random experiment): 주사위를 던지는 시행. 주사위 눈의 숫자로 결과를 표시.

표본공간(Sample space) 

- S = {1,2,3,4,5,6}
- $\Omega$ = {1,2,3,4,5,6}

근원사건(Sample outcome)

- 1,2,3,4,5,6

사건(Event)

- 짝수가 나오는 사건 A = {2,4,6}



확률실험(Random experiment): 두 동전을 던지는 시행. H,T의 쌍으로 결과를 표시

표본공간(Sample space) 

- S = {(H,H), (H,T), (T,H), (T,T)}
- $\Omega$ = {(H,H), (H,T), (T,H), (T,T)}

근원사건(Sample outcome)

- (H,H), (H,T), (T,H), (T,T)

사건(Event)

- 앞면이 한번이라도 나오는 사건 A = {(H,H), (H,T), (T,H)}



확률

- $P(A) = \frac {\left| A \right|} {\left| S \right|} = \frac 3 6 = \frac 1 2$
- 절대값이 아니라 cardinality - 집합의 크기(안에 들어가있는 원소의 개수)
- 