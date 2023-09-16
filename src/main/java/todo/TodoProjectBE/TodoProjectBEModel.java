package todo.TodoProjectBE;

import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class TodoProjectBEModel {

    @NonNull
    private String id;
}
