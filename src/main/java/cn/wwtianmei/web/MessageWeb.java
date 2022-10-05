package cn.wwtianmei.web;

import cn.wwtianmei.common.api.Result;
import cn.wwtianmei.domain.MsgPush;
import cn.wwtianmei.mapper.MsgPushMapper;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Produces(MediaType.APPLICATION_JSON)
@Path("/message")
public class MessageWeb {
    @Inject
    MsgPushMapper msgPushMapper;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Result<MsgPush> getMessage(@PathParam("id") Integer id) {
        Optional<MsgPush> result = Optional.ofNullable(msgPushMapper.selectById(id));
        return result.map(success -> Result.data(success)).orElseGet(() -> Result.data(null));
    }

}
