package mcframe.clientMSBH.MSBHP0040;

import java.util.List;

public interface IfPayRqstBase_MC {
	
	/** 新規種別の支払対象選択画面で反映を行った際に実行されるメソッド */
	public void addPayRqstListIns(List<IfPayRqstBaseRow> list);
	
	/** 更新種別の支払対象選択画面で反映を行った際に実行されるメソッド */
	public void addPayRqstListUpd(List<IfPayRqstBaseRow> list);
	
	/** 
	 * 支払対象選択で検索後に表示したくない買掛明細ＮＯのリスト <br>
	 * 一度支払対象選択で行追加後、再度支払対象選択を開いたときに
	 * 既に追加した行を表示しないようにするために使用することを想定。
	 */
	public String[] getExceptPayRqstNoArr();

}
