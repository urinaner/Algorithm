while dq:
    x, y = dq.popleft()
    for k in range(4):
        nx = dx[k] + x
        ny = dy[k] + y
        

        if 0<=nx<n and 0<=ny<m:
            if arr[nx][ny] == 0:
                arr[nx][ny] = arr[x][y] + 1
                dq.append((nx, ny))