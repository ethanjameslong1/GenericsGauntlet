public abstract class Potion<T> extends Item
{
  public int level;
  public Potion(T owner)
  {
    usesLeft=1;
    type='P';
    this.user=owner;
  }
}
