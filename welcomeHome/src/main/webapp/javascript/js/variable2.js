// const object = new Object(); // 쓸 수 는 있으나
        // object.name = 'kim' //추천하지 않음
        // object.age = 30; //이건 자바에서 쓰기
        const obj = {
            name: 'Hong', //key : value
            age: 20,
            hobby: ['reading', 'dancing', 'exercise']
        };
        console.log('이름: ' + obj.name);
        console.log('나이: ' + obj['age']);
        console.log('취미: ' + obj.hobby[2]);
        console.log('취미: ' + obj['hobby'][1]);
        let hob = 'hobby';
        console.log('취미: ' + obj[hob][2]); //필요에 따라서는 좀 더 가변적으로 가지고 올 수 있음
        console.log('-------------------')
        const mem1 = {
            id: 'user1',
            name: '홍길동',
            passwd: '1234'
        }
        const mem2 = {
            id: 'user2',
            name: '박민수',
            passwd: '1212'
        }
        const mem3 = {
            id: 'user3',
            name: '김효영',
            passwd: '6543'
        }
        for(field in mem3) {
            console.log(field + ', ' + mem3[field])
        }
        const members = [mem1, mem2, mem3];
        for (let i = 0; i < members.length; i++) {
            // console.log('아이디: ' + members[i].id);
            // console.log('이름: ' + members[i]['name']);
            // console.log('비번: ' + members[i]['passwd'])
            for (field in members[i]) {
                console.log(field + ': ' + members[i][field])
            }
            console.log('-------------------')
        }