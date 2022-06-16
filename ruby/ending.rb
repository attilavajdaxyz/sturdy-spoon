def solution(str, ending)
    # TODO: complete
    regex = ending + "$"
    if ( str =~ /#{regex}/ )
      return true
    end
    return false
end