package mcframe.clientMAUD.MAUDP0010;

import java.util.List;
import mcframe.clientCore.beans.MCButtonGroup;
import mcframe.clientCore.beans.MCCheckBox;
import mcframe.clientCore.beans.MCRowBeans;
import mcframe.commonCore.container.MCContainer;

/**
 * 以下の操作種別とステータスを持つ画面<br/>
 * 操作種別<br/>
 * <li>登録（値=0）</li>
 * <li>訂正（値=1）</li>
 * <li>取消（値=2）</li>
 * <li>参照（値=3）</li>
 * ステータス<br/>
 * <li>INS</li>
 * <li>SRCH</li>
 * <li>UPD</li>
 * <li>FIX_U</li>
 * <li>DEL</li>
 * <li>FIX_D</li>
 * <li>REF</li>
 */
public interface IfOpePanel_MC {
	/**
	 * 操作種別のボタングループを取得する
	 *
	 */
	public MCButtonGroup getOpeButtonGroup ();
	/**
	 * 登録用のコンテナを取得する
	 *
	 */
	public List<MCContainer> opePanelGetRegBlocks();
	/**
	 * 検索条件用のコンテナを取得する
	 *
	 */
	public List<MCContainer> opePanelGetCndBlocks();

	/**
	 * 検索枠の最新ＦＬＧの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 * 
	 * @return　検索枠の最新ＦＬＧ画面部品
	 */
	public MCCheckBox getCndLatestFlg();
	
	/**
	 * 検索枠のリビジョンＮＯの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 * 
	 * @return　検索枠のリビジョンＮＯ画面部品
	 */
	public MCRowBeans getCndRevNo();
	
	/**
	 * 登録枠の最新ＦＬＧの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 * 
	 * @return　登録枠の最新ＦＬＧ画面部品
	 */
	public MCCheckBox getRegLatestFlg();
	
	/**
	 * 登録枠の取消ＦＬＧの画面部品を返します。<br>
	 * 取消データを照会できるアプリでオーバーライドします。
	 * 
	 * @return　登録枠の取消ＦＬＧ画面部品
	 */
	public MCCheckBox getRegCanFlg();
	
	/**
	 * 検索前のステータス設定メソッド。
	 * 訂正、取消、参照時で、対象のデータを検索する前に設定するステータスです。
	 * 単票画面で独自の検索前ステータスがある場合は、オーバーライドします。
	 * 
	 * @return　検索枠のリビジョンＮＯ画面部品
	 */
	public void setSRCHStatus();
	
	/**
	 * 登録のステータス設定メソッド。
	 * 直接手動で登録する場合や、登録対象のデータを検索した後に設定するステータスです。
	 * 単票画面で独自のステータスがある場合は、オーバーライドします。
	 */
	public void setINSStatus();
	
	/**
	 * 訂正のステータス設定メソッド。
	 * 訂正対象のデータを検索した後に設定するステータスです。
	 * 単票画面で独自のステータスがある場合は、オーバーライドします。
	 */
	public void setUPDStatus();
	
	/**
	 * 取消のステータス設定メソッド。
	 * 取消対象のデータを検索した後に設定するステータスです。
	 * 単票画面で独自のステータスがある場合は、オーバーライドします。
	 */
	public void setDELStatus();
	
	/**
	 * 参照のステータス設定メソッド。
	 * 対象のデータを検索した後に設定するステータスです。
	 * 単票画面で独自のステータスがある場合は、オーバーライドします。
	 */
	public void setREFStatus();
	
	/**
	 * 登録後のステータス設定メソッド。
	 * 単票画面で独自のステータスがある場合は、オーバーライドします。
	 */
	public void setFIX_IStatus();
	
	/**
	 * 訂正後のステータス設定メソッド。
	 * 単票画面で独自のステータスがある場合は、オーバーライドします。
	 */
	public void setFIX_UStatus();
	
	/**
	 * 取消後のステータス設定メソッド。
	 * 単票画面で独自のステータスがある場合は、オーバーライドします。
	 */
	public void setFIX_DStatus();
	
	/**
	 * 指定されたステータスが「SRCH」かどうか確認する
	 */
	public boolean isSRCHStatus(String status);
	
	/**
	 * 指定されたステータスが「REF」かどうか確認する
	 */
	public boolean isREFStatus(String status);
	
	/**
	 * 指定されたステータスが「INS」かどうか確認する
	 */
	public boolean isINSStatus(String status);
	
	/**
	 * 指定されたステータスが「UPD」かどうか確認する
	 */
	public boolean isUPDStatus(String status);
	
	/**
	 * 指定されたステータスが「DEL」かどうか確認する
	 */
	public boolean isDELStatus(String status);
	
	/**
	 * 指定されたステータスが「FIX_I」かどうか確認する
	 */
	public boolean isFIX_IStatus(String status);
	
	/**
	 * 指定されたステータスが「FIX_U」かどうか確認する
	 */
	public boolean isFIX_UStatus(String status);
	
	/**
	 * 指定されたステータスが「FIX_D」かどうか確認する
	 */
	public boolean isFIX_DStatus(String status);
	
	/**
	 * 指定された種別が「登録」かどうか確認する
	 */
	public boolean isINSOpe(String ope);
	
	/**
	 * 指定された種別が「訂正」かどうか確認する
	 */
	public boolean isUPDOpe(String ope);
	
	/**
	 * 指定された種別が「取消」かどうか確認する
	 */
	public boolean isDELOpe(String ope);
	
	/**
	 * 指定された種別が「参照」かどうか確認する
	 */
	public boolean isREFOpe(String ope);
}
