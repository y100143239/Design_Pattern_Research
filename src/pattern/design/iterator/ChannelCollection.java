package pattern.design.iterator;

/**
 * Created by Alex on 2017/5/27.
 */
public interface ChannelCollection {
    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);

}
