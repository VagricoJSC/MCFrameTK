package mcframe.clientMAUA.MAUAP0010;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;


//CLIENT_SETTING_IMPORT (START)
import mcframe.commonMA.constant.*;
import mcframe.clientCore.resource.MCConfig;
import mcframe.commonFS.constant.FSC_MODULE_ID;
//CLIENT_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MAUAP_List_MC_A extends mcframe.clientMAUD.MAUDP0070.MAUDP_ListLogicBase {
	/**
	 * サーバ側のコンボボックス共通クラス名を取得する。
	 *
	 * @return サーバ側のコンボボックス共通クラス名（パッケージも含む)
	 */
	@Override
	protected String getControlClassName() {
		return "mcframe.serverMAUA.MAUAL0010.MAUAL_List";
	}
	/** 
	  * GpGrp:汎用分類 メインメソッド<p>
	  * 汎用分類マスタから有効な汎用分類データを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getGpGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getGpGrp_GetList(row, info);//リストの取得
		getGpGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getGpGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * GpGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getGpGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getGpGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * GpGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getGpGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(GpGrpCols.viewCols(), down, info);
	}

	/** 
	  * GpGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getGpGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(GpGrpCols.sortPolicy());
	}


	/** 
	  * AcDpt:会計部門 メインメソッド<p>
	  * 会計部門マスタから部門情報を取得する<br>
・適用日で絞り込む場合は、以下を指定をする<br>
　　適用日を指定する場合：dtに適用日を指定する<br>
　　運用日付を使用する場合：dtを未指定にし、mode_today_flgに「true」を指定する<br>
・適用日で絞り込まない場合は、ignore_dt_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcDpt(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcDpt_GetList(row, info);//リストの取得
		getAcDpt_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcDpt_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcDpt:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcDpt_GetList(MCRow row, MCEventInfo info){
		return getList("getAcDpt", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcDpt:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcDpt_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcDptCols.viewCols(), down, info);
	}

	/** 
	  * AcDpt:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcDpt_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcDptCols.sortPolicy());
	}


	/** 
	  * AcSubtypem:予備科目区分 メインメソッド<p>
	  * 引数の予備科目区分に対応する科目区分情報を、予備科目区分マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSubtypem(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSubtypem_GetList(row, info);//リストの取得
		getAcSubtypem_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSubtypem_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSubtypem:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSubtypem_GetList(MCRow row, MCEventInfo info){
		return getList("getAcSubtypem", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcSubtypem:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtypem_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSubtypemCols.viewCols(), down, info);
	}

	/** 
	  * AcSubtypem:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtypem_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSubtypemCols.sortPolicy());
	}


	/** 
	  * AcTax:会計税 メインメソッド<p>
	  * 会計税マスタから、税（会計システムで使用する税）情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcTax(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcTax_GetList(row, info);//リストの取得
		getAcTax_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcTax_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcTax:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcTax_GetList(MCRow row, MCEventInfo info){
		return getList("getAcTax", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcTax:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcTax_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcTaxCols.viewCols(), down, info);
	}

	/** 
	  * AcTax:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcTax_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcTaxCols.sortPolicy());
	}


	/** 
	  * SubAccount:補助勘定科目 メインメソッド<p>
	  * 引数の勘定科目に対応する補助勘定科目情報を、補助勘定科目マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSubAccount(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSubAccount_GetList(row, info);//リストの取得
		getSubAccount_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSubAccount_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SubAccount:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSubAccount_GetList(MCRow row, MCEventInfo info){
		return getList("getSubAccount", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SubAccount:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSubAccount_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SubAccountCols.viewCols(), down, info);
	}

	/** 
	  * SubAccount:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSubAccount_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SubAccountCols.sortPolicy());
	}


	/** 
	  * AutoJnlKey:自動仕訳キー メインメソッド<p>
	  * 会計伝票区分に対して自動仕訳情報を判断するためのキーを、自動仕訳キーマスタから取得する<br>
自動仕訳マスタを参照する場合に使用する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAutoJnlKey(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAutoJnlKey_GetList(row, info);//リストの取得
		getAutoJnlKey_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAutoJnlKey_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AutoJnlKey:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAutoJnlKey_GetList(MCRow row, MCEventInfo info){
		return getList("getAutoJnlKey", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AutoJnlKey:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAutoJnlKey_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AutoJnlKeyCols.viewCols(), down, info);
	}

	/** 
	  * AutoJnlKey:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAutoJnlKey_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AutoJnlKeyCols.sortPolicy());
	}


	/** 
	  * NoteRsn:手形理由 メインメソッド<p>
	  * 手形理由情報を手形理由マスタから取得する<br>
手形データを会計システムへ連携する場合に、指定する勘定科目ＣＤを判断するために使用する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getNoteRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getNoteRsn_GetList(row, info);//リストの取得
		getNoteRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getNoteRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * NoteRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getNoteRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getNoteRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * NoteRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNoteRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(NoteRsnCols.viewCols(), down, info);
	}

	/** 
	  * NoteRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNoteRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(NoteRsnCols.sortPolicy());
	}


	/** 
	  * JnlAct:仕訳実行 メインメソッド<p>
	  * 自動仕訳実行するグループを、仕訳実行マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJnlAct(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJnlAct_GetList(row, info);//リストの取得
		getJnlAct_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJnlAct_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JnlAct:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJnlAct_GetList(MCRow row, MCEventInfo info){
		return getList("getJnlAct", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * JnlAct:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlAct_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JnlActCols.viewCols(), down, info);
	}

	/** 
	  * JnlAct:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlAct_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JnlActCols.sortPolicy());
	}


	/** 
	  * JnlGrp:仕訳グループ メインメソッド<p>
	  * 仕訳グループマスタから仕訳グループを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJnlGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJnlGrp_GetList(row, info);//リストの取得
		getJnlGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJnlGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JnlGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJnlGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getJnlGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * JnlGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JnlGrpCols.viewCols(), down, info);
	}

	/** 
	  * JnlGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JnlGrpCols.sortPolicy());
	}


	/** 
	  * JnlPtnBase:自動仕訳パタン種類 メインメソッド<p>
	  * 自動仕訳パタン基本マスタから自動仕訳パタンの種類を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJnlPtnBase(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJnlPtnBase_GetList(row, info);//リストの取得
		getJnlPtnBase_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJnlPtnBase_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JnlPtnBase:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJnlPtnBase_GetList(MCRow row, MCEventInfo info){
		return getList("getJnlPtnBase", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * JnlPtnBase:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlPtnBase_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JnlPtnBaseCols.viewCols(), down, info);
	}

	/** 
	  * JnlPtnBase:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlPtnBase_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JnlPtnBaseCols.sortPolicy());
	}


	/** 
	  * AcRsn:会計理由 メインメソッド<p>
	  * 会計理由マスタから、自動仕訳処理で仕訳条件として使用するための会計理由情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcRsn_GetList(row, info);//リストの取得
		getAcRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getAcRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcRsnCols.viewCols(), down, info);
	}

	/** 
	  * AcRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcRsnCols.sortPolicy());
	}


	/** 
	  * BankAc:口座 メインメソッド<p>
	  * 入金口座や支払口座を管理するための口座情報を、口座マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBankAc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBankAc_GetList(row, info);//リストの取得
		getBankAc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBankAc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BankAc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBankAc_GetList(MCRow row, MCEventInfo info){
		return getList("getBankAc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BankAc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBankAc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BankAcCols.viewCols(), down, info);
	}

	/** 
	  * BankAc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBankAc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BankAcCols.sortPolicy());
	}


	/** 
	  * ItmJnl:品目仕訳 メインメソッド<p>
	  * 自動仕訳処理で勘定科目を決める条件として使用する仕訳情報を、品目仕訳マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmJnl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmJnl_GetList(row, info);//リストの取得
		getItmJnl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmJnl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmJnl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmJnl_GetList(MCRow row, MCEventInfo info){
		return getList("getItmJnl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmJnl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmJnl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmJnlCols.viewCols(), down, info);
	}

	/** 
	  * ItmJnl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmJnl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmJnlCols.sortPolicy());
	}


	/** 
	  * Cur:通貨 メインメソッド<p>
	  * 通貨マスタから通貨情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCur(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCur_GetList(row, info);//リストの取得
		getCur_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCur_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Cur:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCur_GetList(MCRow row, MCEventInfo info){
		return getList("getCur", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Cur:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCur_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CurCols.viewCols(), down, info);
	}

	/** 
	  * Cur:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCur_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CurCols.sortPolicy());
	}


	/** 
	  * AllocGrp:総量引当場所グループ メインメソッド<p>
	  * 総量引当機能で使用される総量引当場所グループ情報を、総量引当場所グループマスタから取得する<br>
NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAllocGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAllocGrp_GetList(row, info);//リストの取得
		getAllocGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAllocGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AllocGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAllocGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getAllocGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AllocGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AllocGrpCols.viewCols(), down, info);
	}

	/** 
	  * AllocGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AllocGrpCols.sortPolicy());
	}


	/** 
	  * Bank:銀行 メインメソッド<p>
	  * 銀行マスタから銀行情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBank(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBank_GetList(row, info);//リストの取得
		getBank_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBank_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Bank:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBank_GetList(MCRow row, MCEventInfo info){
		return getList("getBank", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Bank:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBank_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BankCols.viewCols(), down, info);
	}

	/** 
	  * Bank:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBank_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BankCols.sortPolicy());
	}


	/** 
	  * BankBranch:銀行支店 メインメソッド<p>
	  * 引数の銀行ＣＤに対する銀行支店情報を、銀行支店マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBankBranch(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBankBranch_GetList(row, info);//リストの取得
		getBankBranch_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBankBranch_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BankBranch:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBankBranch_GetList(MCRow row, MCEventInfo info){
		return getList("getBankBranch", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BankBranch:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBankBranch_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BankBranchCols.viewCols(), down, info);
	}

	/** 
	  * BankBranch:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBankBranch_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BankBranchCols.sortPolicy());
	}


	/** 
	  * CalBase:カレンダ メインメソッド<p>
	  * カレンダＣＤとカレンダ名を、カレンダ基本マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalBase(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalBase_GetList(row, info);//リストの取得
		getCalBase_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalBase_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalBase:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalBase_GetList(MCRow row, MCEventInfo info){
		return getList("getCalBase", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalBase:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalBase_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalBaseCols.viewCols(), down, info);
	}

	/** 
	  * CalBase:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalBase_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalBaseCols.sortPolicy());
	}


	/** 
	  * Cntry:国 メインメソッド<p>
	  * 国マスタから国情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCntry(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCntry_GetList(row, info);//リストの取得
		getCntry_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCntry_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Cntry:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCntry_GetList(MCRow row, MCEventInfo info){
		return getList("getCntry", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Cntry:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCntry_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CntryCols.viewCols(), down, info);
	}

	/** 
	  * Cntry:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCntry_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CntryCols.sortPolicy());
	}


	/** 
	  * LgGrp:物流グループ メインメソッド<p>
	  * 物流グループマスタから物流グループ情報を取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・ワーキンググループで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLgGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLgGrp_GetList(row, info);//リストの取得
		getLgGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLgGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LgGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLgGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getLgGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LgGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LgGrpCols.viewCols(), down, info);
	}

	/** 
	  * LgGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LgGrpCols.sortPolicy());
	}


	/** 
	  * LocGrp:製造場所グループ メインメソッド<p>
	  * 製造場所グループ情報を製造場所グループマスタから取得する<br>
・製造場所場所マスタのワーキンググループＣＤで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLocGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLocGrp_GetList(row, info);//リストの取得
		getLocGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLocGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LocGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLocGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getLocGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LocGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LocGrpCols.viewCols(), down, info);
	}

	/** 
	  * LocGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LocGrpCols.sortPolicy());
	}


	/** 
	  * SlipForm:伝票帳票 メインメソッド<p>
	  * 伝票帳票マスタから伝票帳票情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlipForm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlipForm_GetList(row, info);//リストの取得
		getSlipForm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlipForm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlipForm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlipForm_GetList(MCRow row, MCEventInfo info){
		return getList("getSlipForm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlipForm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipForm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlipFormCols.viewCols(), down, info);
	}

	/** 
	  * SlipForm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipForm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlipFormCols.sortPolicy());
	}


	/** 
	  * Trnspt:輸送方法 メインメソッド<p>
	  * 輸送方法マスタから輸送方法情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTrnspt(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTrnspt_GetList(row, info);//リストの取得
		getTrnspt_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTrnspt_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Trnspt:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTrnspt_GetList(MCRow row, MCEventInfo info){
		return getList("getTrnspt", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Trnspt:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrnspt_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TrnsptCols.viewCols(), down, info);
	}

	/** 
	  * Trnspt:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrnspt_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TrnsptCols.sortPolicy());
	}


	/** 
	  * Unit:単位 メインメソッド<p>
	  * 単位マスタから単位情報を取得する<br>
引数の基準単位ＣＤに値が設定されている場合、単位ＣＤと基準単位ＣＤを基に単位換算マスタを外部結合して、単位換算マスタの換算基準数量と換算数量を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getUnit(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getUnit_GetList(row, info);//リストの取得
		getUnit_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getUnit_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Unit:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getUnit_GetList(MCRow row, MCEventInfo info){
		return getList("getUnit", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Unit:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUnit_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(UnitCols.viewCols(), down, info);
	}

	/** 
	  * Unit:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUnit_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(UnitCols.sortPolicy());
	}


	/** 
	  * Area:地域 メインメソッド<p>
	  * 地域マスタから地域情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArea(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArea_GetList(row, info);//リストの取得
		getArea_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArea_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Area:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArea_GetList(MCRow row, MCEventInfo info){
		return getList("getArea", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Area:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArea_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AreaCols.viewCols(), down, info);
	}

	/** 
	  * Area:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArea_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AreaCols.sortPolicy());
	}


	/** 
	  * Xrate:為替レート メインメソッド<p>
	  * 為替レートの種類に対するコードと名称を、為替レート基本マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getXrate(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getXrate_GetList(row, info);//リストの取得
		getXrate_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getXrate_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Xrate:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getXrate_GetList(MCRow row, MCEventInfo info){
		return getList("getXrate", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Xrate:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXrate_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(XrateCols.viewCols(), down, info);
	}

	/** 
	  * Xrate:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXrate_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(XrateCols.sortPolicy());
	}


	/** 
	  * HsGrp:ＨＳ分類 メインメソッド<p>
	  * ＨＳ分類マスタからＨＳ分類情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getHsGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getHsGrp_GetList(row, info);//リストの取得
		getHsGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getHsGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * HsGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getHsGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getHsGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * HsGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getHsGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(HsGrpCols.viewCols(), down, info);
	}

	/** 
	  * HsGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getHsGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(HsGrpCols.sortPolicy());
	}


	/** 
	  * Hs:ＨＳ メインメソッド<p>
	  * ＨＳマスタからＨＳ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getHs(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getHs_GetList(row, info);//リストの取得
		getHs_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getHs_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Hs:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getHs_GetList(MCRow row, MCEventInfo info){
		return getList("getHs", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Hs:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getHs_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(HsCols.viewCols(), down, info);
	}

	/** 
	  * Hs:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getHs_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(HsCols.sortPolicy());
	}


	/** 
	  * ItmGrp:品目分類 メインメソッド<p>
	  * 品目分類マスタから属性情報を取得する<br>
品目分類区分に「null」を指定した場合は「null」を返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp_GetList(row, info);//リストの取得
		getItmGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrpCols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrpCols.sortPolicy());
	}


	/** 
	  * AcItmGrp:会計品目分類 メインメソッド<p>
	  * 会計品目分類マスタから、品目に対する会計品目分類情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcItmGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcItmGrp_GetList(row, info);//リストの取得
		getAcItmGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcItmGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcItmGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcItmGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getAcItmGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcItmGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcItmGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcItmGrpCols.viewCols(), down, info);
	}

	/** 
	  * AcItmGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcItmGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcItmGrpCols.sortPolicy());
	}


	/** 
	  * BizRsn:業務理由 メインメソッド<p>
	  * 実績に設定できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBizRsn_GetList(row, info);//リストの取得
		getBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BizRsnCols.viewCols(), down, info);
	}

	/** 
	  * BizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BizRsnCols.sortPolicy());
	}


	/** 
	  * WkRsn:工数理由 メインメソッド<p>
	  * 工数実績に対する理由情報を、工数理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWkRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWkRsn_GetList(row, info);//リストの取得
		getWkRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWkRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WkRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWkRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getWkRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * WkRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWkRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WkRsnCols.viewCols(), down, info);
	}

	/** 
	  * WkRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWkRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WkRsnCols.sortPolicy());
	}


	/** 
	  * WkCost:工数管理 メインメソッド<p>
	  * 工数管理マスタから工数管理情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWkCost(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWkCost_GetList(row, info);//リストの取得
		getWkCost_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWkCost_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WkCost:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWkCost_GetList(MCRow row, MCEventInfo info){
		return getList("getWkCost", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * WkCost:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWkCost_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WkCostCols.viewCols(), down, info);
	}

	/** 
	  * WkCost:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWkCost_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WkCostCols.sortPolicy());
	}


	/** 
	  * Oper:工程 メインメソッド<p>
	  * 工程マスタから工程情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOper(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOper_GetList(row, info);//リストの取得
		getOper_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOper_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Oper:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOper_GetList(MCRow row, MCEventInfo info){
		return getList("getOper", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Oper:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOper_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OperCols.viewCols(), down, info);
	}

	/** 
	  * Oper:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOper_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OperCols.sortPolicy());
	}


	/** 
	  * BpGrp:取引先分類 メインメソッド<p>
	  * 取引先分類マスタから属性情報を取得する<br>
取引先分類区分に「null」を指定した場合は「null」を返す<br>
取引先分類区分が未指定の場合は、検索条件としては無効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp_GetList(row, info);//リストの取得
		getBpGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrpCols.viewCols(), down, info);
	}

	/** 
	  * BpGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrpCols.sortPolicy());
	}


	/** 
	  * Tterm:取引条件 メインメソッド<p>
	  * 取引先（得意先や発注先）に対する取引条件を、取引条件マスタから取得する<br>
取引条件区分に「null」を指定した場合は「null」を返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTterm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTterm_GetList(row, info);//リストの取得
		getTterm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTterm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Tterm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTterm_GetList(MCRow row, MCEventInfo info){
		return getList("getTterm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Tterm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TtermCols.viewCols(), down, info);
	}

	/** 
	  * Tterm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TtermCols.sortPolicy());
	}


	/** 
	  * SetoffGrp:相殺グループ メインメソッド<p>
	  * 債権債務を相殺可能とするグループ情報を、相殺グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSetoffGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSetoffGrp_GetList(row, info);//リストの取得
		getSetoffGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSetoffGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SetoffGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSetoffGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getSetoffGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SetoffGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetoffGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SetoffGrpCols.viewCols(), down, info);
	}

	/** 
	  * SetoffGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetoffGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SetoffGrpCols.sortPolicy());
	}


	/** 
	  * EximPort:港 メインメソッド<p>
	  * 輸出入における港情報を、港マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getEximPort(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getEximPort_GetList(row, info);//リストの取得
		getEximPort_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getEximPort_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * EximPort:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getEximPort_GetList(MCRow row, MCEventInfo info){
		return getList("getEximPort", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * EximPort:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEximPort_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(EximPortCols.viewCols(), down, info);
	}

	/** 
	  * EximPort:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEximPort_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(EximPortCols.sortPolicy());
	}


	/** 
	  * ExCntnr:輸出梱包容器 メインメソッド<p>
	  * 輸出梱包容器マスタから輸出梱包容器情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExCntnr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExCntnr_GetList(row, info);//リストの取得
		getExCntnr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExCntnr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExCntnr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExCntnr_GetList(MCRow row, MCEventInfo info){
		return getList("getExCntnr", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ExCntnr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExCntnr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExCntnrCols.viewCols(), down, info);
	}

	/** 
	  * ExCntnr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExCntnr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExCntnrCols.sortPolicy());
	}


	/** 
	  * StkGd:格付 メインメソッド<p>
	  * 在庫に対する格付情報を格付マスタから取得する<br>
・見積、受注登録が可能な格付に限定したい場合は、slo_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkGd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkGd_GetList(row, info);//リストの取得
		getStkGd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkGd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkGd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkGd_GetList(MCRow row, MCEventInfo info){
		return getList("getStkGd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StkGd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkGd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkGdCols.viewCols(), down, info);
	}

	/** 
	  * StkGd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkGd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkGdCols.sortPolicy());
	}


	/** 
	  * Trd:取引 メインメソッド<p>
	  * 取引情報を取引マスタから取得する<br>
引数の取引パタン区分を指定した場合は、対応する取引情報を取得する<br>
引数の機能ＩＤを指定した場合は、取引パタン区分を取引パタン制御情報から抽出し、抽出した取引パタン区分に対応する取引情報を取得する<br>
引数の機能IDは、引数の取引パタン区分が未指定か「null」の場合に有効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTrd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTrd_GetList(row, info);//リストの取得
		getTrd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTrd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Trd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTrd_GetList(MCRow row, MCEventInfo info){
		return getList("getTrd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Trd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TrdCols.viewCols(), down, info);
	}

	/** 
	  * Trd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TrdCols.sortPolicy());
	}


	/** 
	  * SlsUpriGrp:販売単価分類 メインメソッド<p>
	  * 同一の販売単価を使用する品目のグループ情報を、販売単価分類マスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsUpriGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsUpriGrp_GetList(row, info);//リストの取得
		getSlsUpriGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsUpriGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsUpriGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsUpriGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsUpriGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsUpriGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsUpriGrpCols.viewCols(), down, info);
	}

	/** 
	  * SlsUpriGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsUpriGrpCols.sortPolicy());
	}


	/** 
	  * SlsUpriRank:販売単価ランク メインメソッド<p>
	  * 取引先に応じて販売単価を変更するためのランク情報を、販売単価ランクマスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsUpriRank(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsUpriRank_GetList(row, info);//リストの取得
		getSlsUpriRank_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsUpriRank_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsUpriRank:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsUpriRank_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsUpriRank", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsUpriRank:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriRank_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsUpriRankCols.viewCols(), down, info);
	}

	/** 
	  * SlsUpriRank:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriRank_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsUpriRankCols.sortPolicy());
	}


	/** 
	  * ItmShipGrp:品目出荷グループ メインメソッド<p>
	  * 受注時の在庫引当を制御する品目のグループ情報を、品目出荷グループマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmShipGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmShipGrp_GetList(row, info);//リストの取得
		getItmShipGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmShipGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmShipGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmShipGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getItmShipGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmShipGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmShipGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmShipGrpCols.viewCols(), down, info);
	}

	/** 
	  * ItmShipGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmShipGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmShipGrpCols.sortPolicy());
	}


	/** 
	  * ShipValid:出荷有効期限グループ メインメソッド<p>
	  * 有効期限に対するルールを制御するグループ情報を、出荷有効期限グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipValid(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipValid_GetList(row, info);//リストの取得
		getShipValid_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipValid_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipValid:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipValid_GetList(MCRow row, MCEventInfo info){
		return getList("getShipValid", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ShipValid:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipValid_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipValidCols.viewCols(), down, info);
	}

	/** 
	  * ShipValid:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipValid_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipValidCols.sortPolicy());
	}


	/** 
	  * ExpnsGrp:原価費目グループ メインメソッド<p>
	  * 原価費目グループマスタから原価費目グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExpnsGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExpnsGrp_GetList(row, info);//リストの取得
		getExpnsGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExpnsGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExpnsGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExpnsGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getExpnsGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ExpnsGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpnsGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExpnsGrpCols.viewCols(), down, info);
	}

	/** 
	  * ExpnsGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpnsGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExpnsGrpCols.sortPolicy());
	}


	/** 
	  * Expns:原価費目 メインメソッド<p>
	  * 原価費目マスタから原価費目情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExpns(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExpns_GetList(row, info);//リストの取得
		getExpns_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExpns_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Expns:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExpns_GetList(MCRow row, MCEventInfo info){
		return getList("getExpns", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Expns:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpns_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExpnsCols.viewCols(), down, info);
	}

	/** 
	  * Expns:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpns_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExpnsCols.sortPolicy());
	}


	/** 
	  * CostMenu:原価メニュー メインメソッド<p>
	  * 原価メニューマスタから原価メニュー情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostMenu(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostMenu_GetList(row, info);//リストの取得
		getCostMenu_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostMenu_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostMenu:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostMenu_GetList(MCRow row, MCEventInfo info){
		return getList("getCostMenu", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostMenu:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostMenu_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostMenuCols.viewCols(), down, info);
	}

	/** 
	  * CostMenu:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostMenu_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostMenuCols.sortPolicy());
	}


	/** 
	  * PfGrp:購買内示グループ メインメソッド<p>
	  * 購買内示グループマスタから購買内示グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPfGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPfGrp_GetList(row, info);//リストの取得
		getPfGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPfGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PfGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPfGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getPfGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PfGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPfGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PfGrpCols.viewCols(), down, info);
	}

	/** 
	  * PfGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPfGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PfGrpCols.sortPolicy());
	}


	/** 
	  * Site:工場・物流倉庫 メインメソッド<p>
	  * 工場や物流倉庫などの場所情報を、工場・物流倉庫マスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSite(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSite_GetList(row, info);//リストの取得
		getSite_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSite_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Site:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSite_GetList(MCRow row, MCEventInfo info){
		return getList("getSite", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Site:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSite_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SiteCols.viewCols(), down, info);
	}

	/** 
	  * Site:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSite_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SiteCols.sortPolicy());
	}


	/** 
	  * Wg:ワーキンググループ メインメソッド<p>
	  * ワーキンググループマスタに登録されているワーキンググループ（ワーキンググループ）情報を取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWg_GetList(row, info);//リストの取得
		getWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Wg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWg_GetList(MCRow row, MCEventInfo info){
		return getList("getWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Wg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WgCols.viewCols(), down, info);
	}

	/** 
	  * Wg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WgCols.sortPolicy());
	}


	/** 
	  * StrLn:棚・ライン メインメソッド<p>
	  * 引数の場所に対応する棚やラインの情報を、棚・ラインマスタから取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStrLn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStrLn_GetList(row, info);//リストの取得
		getStrLn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStrLn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StrLn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStrLn_GetList(MCRow row, MCEventInfo info){
		return getList("getStrLn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StrLn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStrLn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StrLnCols.viewCols(), down, info);
	}

	/** 
	  * StrLn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStrLn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StrLnCols.sortPolicy());
	}


	/** 
	  * ItmTypD:品目区分詳細 メインメソッド<p>
	  * 引数の品目区分に対応する品目区分の詳細情報を、品目区分詳細マスタから取得する<br>
品目区分詳細ＣＤに「null」を指定した場合は「null」を返す<br>
品目区分詳細ＣＤが未指定の場合は、検索条件としては無効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmTypD(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmTypD_GetList(row, info);//リストの取得
		getItmTypD_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmTypD_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmTypD:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmTypD_GetList(MCRow row, MCEventInfo info){
		return getList("getItmTypD", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmTypD:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmTypD_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmTypDCols.viewCols(), down, info);
	}

	/** 
	  * ItmTypD:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmTypD_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmTypDCols.sortPolicy());
	}


	/** 
	  * Spec:仕様 メインメソッド<p>
	  * 仕様マスタから仕様情報（色やサイズ）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSpec(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSpec_GetList(row, info);//リストの取得
		getSpec_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSpec_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Spec:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSpec_GetList(MCRow row, MCEventInfo info){
		return getList("getSpec", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Spec:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSpec_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SpecCols.viewCols(), down, info);
	}

	/** 
	  * Spec:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSpec_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SpecCols.sortPolicy());
	}


	/** 
	  * SpecDesc:仕様項目 メインメソッド<p>
	  * 引数の仕様ＣＤに対応する仕様項目を、仕様項目マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSpecDesc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSpecDesc_GetList(row, info);//リストの取得
		getSpecDesc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSpecDesc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SpecDesc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSpecDesc_GetList(MCRow row, MCEventInfo info){
		return getList("getSpecDesc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SpecDesc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSpecDesc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SpecDescCols.viewCols(), down, info);
	}

	/** 
	  * SpecDesc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSpecDesc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SpecDescCols.sortPolicy());
	}


	/** 
	  * ItmSpecGrp:品目仕様分類 メインメソッド<p>
	  * 類似仕様を持つ品目を分類するための情報を、品目仕様分類マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmSpecGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmSpecGrp_GetList(row, info);//リストの取得
		getItmSpecGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmSpecGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmSpecGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmSpecGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getItmSpecGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmSpecGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSpecGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmSpecGrpCols.viewCols(), down, info);
	}

	/** 
	  * ItmSpecGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSpecGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmSpecGrpCols.sortPolicy());
	}


	/** 
	  * ItmCompGrp:品目構成グループ メインメソッド<p>
	  * 構成主品目に対して選択可能なオプションをグループ化するための情報を、品目構成グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmCompGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmCompGrp_GetList(row, info);//リストの取得
		getItmCompGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmCompGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmCompGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmCompGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getItmCompGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmCompGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmCompGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmCompGrpCols.viewCols(), down, info);
	}

	/** 
	  * ItmCompGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmCompGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmCompGrpCols.sortPolicy());
	}


	/** 
	  * Co:会社 メインメソッド<p>
	  * 会社マスタから自社情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCo_GetList(row, info);//リストの取得
		getCo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Co:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCo_GetList(MCRow row, MCEventInfo info){
		return getList("getCo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Co:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CoCols.viewCols(), down, info);
	}

	/** 
	  * Co:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CoCols.sortPolicy());
	}


	/** 
	  * DptLvl:部門階層 メインメソッド<p>
	  * 部門階層マスタから部門階層を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDptLvl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDptLvl_GetList(row, info);//リストの取得
		getDptLvl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDptLvl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DptLvl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDptLvl_GetList(MCRow row, MCEventInfo info){
		return getList("getDptLvl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DptLvl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptLvl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptLvlCols.viewCols(), down, info);
	}

	/** 
	  * DptLvl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptLvl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptLvlCols.sortPolicy());
	}


	/** 
	  * Da:データアクセス メインメソッド<p>
	  * データアクセス基本マスタからデータアクセス権限情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDa(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDa_GetList(row, info);//リストの取得
		getDa_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDa_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Da:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDa_GetList(MCRow row, MCEventInfo info){
		return getList("getDa", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Da:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDa_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DaCols.viewCols(), down, info);
	}

	/** 
	  * Da:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDa_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DaCols.sortPolicy());
	}


	/** 
	  * AprvRole:承認役割 メインメソッド<p>
	  * 承認役割マスタから承認役割情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAprvRole(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAprvRole_GetList(row, info);//リストの取得
		getAprvRole_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAprvRole_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AprvRole:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAprvRole_GetList(MCRow row, MCEventInfo info){
		return getList("getAprvRole", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AprvRole:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvRole_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AprvRoleCols.viewCols(), down, info);
	}

	/** 
	  * AprvRole:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvRole_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AprvRoleCols.sortPolicy());
	}


	/** 
	  * NumPtn:発番パタン メインメソッド<p>
	  * 引数の発番業務区分に対応する発番パタンを、発番パタンマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getNumPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getNumPtn_GetList(row, info);//リストの取得
		getNumPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getNumPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * NumPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getNumPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getNumPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * NumPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNumPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(NumPtnCols.viewCols(), down, info);
	}

	/** 
	  * NumPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNumPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(NumPtnCols.sortPolicy());
	}


	/** 
	  * Term:対象期間 メインメソッド<p>
	  * 対象期間マスタから「期」に関する情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTerm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTerm_GetList(row, info);//リストの取得
		getTerm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTerm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Term:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTerm_GetList(MCRow row, MCEventInfo info){
		return getList("getTerm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Term:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTerm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TermCols.viewCols(), down, info);
	}

	/** 
	  * Term:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTerm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TermCols.sortPolicy());
	}


	/** 
	  * AcSubtyp1:科目区分値（予備科目区分１） メインメソッド<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分１）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSubtyp1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSubtyp1_GetList(row, info);//リストの取得
		getAcSubtyp1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSubtyp1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSubtyp1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSubtyp1_GetList(MCRow row, MCEventInfo info){
		return getList("getAcSubtyp1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcSubtyp1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSubtyp1Cols.viewCols(), down, info);
	}

	/** 
	  * AcSubtyp1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSubtyp1Cols.sortPolicy());
	}


	/** 
	  * AcSubtyp2:科目区分値（予備科目区分２） メインメソッド<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分２）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSubtyp2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSubtyp2_GetList(row, info);//リストの取得
		getAcSubtyp2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSubtyp2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSubtyp2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSubtyp2_GetList(MCRow row, MCEventInfo info){
		return getList("getAcSubtyp2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcSubtyp2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSubtyp2Cols.viewCols(), down, info);
	}

	/** 
	  * AcSubtyp2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSubtyp2Cols.sortPolicy());
	}


	/** 
	  * AcSubtyp3:科目区分値（予備科目区分３） メインメソッド<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分３）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSubtyp3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSubtyp3_GetList(row, info);//リストの取得
		getAcSubtyp3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSubtyp3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSubtyp3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSubtyp3_GetList(MCRow row, MCEventInfo info){
		return getList("getAcSubtyp3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcSubtyp3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSubtyp3Cols.viewCols(), down, info);
	}

	/** 
	  * AcSubtyp3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSubtyp3Cols.sortPolicy());
	}


	/** 
	  * AcSubtyp4:科目区分値（予備科目区分４） メインメソッド<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分４）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSubtyp4(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSubtyp4_GetList(row, info);//リストの取得
		getAcSubtyp4_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSubtyp4_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSubtyp4:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSubtyp4_GetList(MCRow row, MCEventInfo info){
		return getList("getAcSubtyp4", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcSubtyp4:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp4_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSubtyp4Cols.viewCols(), down, info);
	}

	/** 
	  * AcSubtyp4:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp4_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSubtyp4Cols.sortPolicy());
	}


	/** 
	  * AcSubtyp5:科目区分値（予備科目区分５） メインメソッド<p>
	  * 予備科目区分マスタから科目区分値（予備科目区分５）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSubtyp5(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSubtyp5_GetList(row, info);//リストの取得
		getAcSubtyp5_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSubtyp5_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSubtyp5:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSubtyp5_GetList(MCRow row, MCEventInfo info){
		return getList("getAcSubtyp5", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcSubtyp5:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp5_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSubtyp5Cols.viewCols(), down, info);
	}

	/** 
	  * AcSubtyp5:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp5_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSubtyp5Cols.sortPolicy());
	}


	/** 
	  * ApSubtyp:科目区分値（ＡＰ科目区分） メインメソッド<p>
	  * 予備科目区分マスタから科目区分値（ＡＰ科目区分）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApSubtyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApSubtyp_GetList(row, info);//リストの取得
		getApSubtyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApSubtyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApSubtyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApSubtyp_GetList(MCRow row, MCEventInfo info){
		return getList("getApSubtyp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ApSubtyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSubtyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApSubtypCols.viewCols(), down, info);
	}

	/** 
	  * ApSubtyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSubtyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApSubtypCols.sortPolicy());
	}


	/** 
	  * ArSubtyp:科目区分値（ＡＲ科目区分） メインメソッド<p>
	  * 予備科目区分マスタから科目区分値（ＡＲ科目区分）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArSubtyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArSubtyp_GetList(row, info);//リストの取得
		getArSubtyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArSubtyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArSubtyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArSubtyp_GetList(MCRow row, MCEventInfo info){
		return getList("getArSubtyp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ArSubtyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSubtyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArSubtypCols.viewCols(), down, info);
	}

	/** 
	  * ArSubtyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSubtyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArSubtypCols.sortPolicy());
	}


	/** 
	  * Tax:税 メインメソッド<p>
	  * 税マスタから税（消費税）情報を取得する<br>
・内税で絞り込む場合は、tax_flgに「true」または「false」を指定する<br>
・売上で絞り込む場合は、sls_flgに「true」または「false」を指定する<br>
・仕入で絞り込む場合は、purc_flgに「true」または「false」を指定する<br>
・支給で絞り込む場合は、prov_flgに「true」または「false」を指定する<br>

	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTax(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTax_GetList(row, info);//リストの取得
		getTax_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTax_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Tax:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTax_GetList(MCRow row, MCEventInfo info){
		return getList("getTax", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Tax:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTax_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TaxCols.viewCols(), down, info);
	}

	/** 
	  * Tax:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTax_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TaxCols.sortPolicy());
	}


	/** 
	  * SlsTax:売上税 メインメソッド<p>
	  * 税マスタから売上税（消費税）情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsTax(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsTax_GetList(row, info);//リストの取得
		getSlsTax_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsTax_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsTax:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsTax_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsTax", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsTax:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsTax_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsTaxCols.viewCols(), down, info);
	}

	/** 
	  * SlsTax:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsTax_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsTaxCols.sortPolicy());
	}


	/** 
	  * PurcTax:仕入税 メインメソッド<p>
	  * 税マスタから仕入税（消費税）情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcTax(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcTax_GetList(row, info);//リストの取得
		getPurcTax_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcTax_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcTax:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcTax_GetList(MCRow row, MCEventInfo info){
		return getList("getPurcTax", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PurcTax:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcTax_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcTaxCols.viewCols(), down, info);
	}

	/** 
	  * PurcTax:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcTax_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcTaxCols.sortPolicy());
	}


	/** 
	  * ProvTax:支給税 メインメソッド<p>
	  * 税マスタから支給税（消費税）情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProvTax(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProvTax_GetList(row, info);//リストの取得
		getProvTax_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProvTax_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProvTax:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProvTax_GetList(MCRow row, MCEventInfo info){
		return getList("getProvTax", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ProvTax:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvTax_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProvTaxCols.viewCols(), down, info);
	}

	/** 
	  * ProvTax:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvTax_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProvTaxCols.sortPolicy());
	}


	/** 
	  * PoPrint:注文書表示 メインメソッド<p>
	  * 発注処理における注文書に表示する内容の情報を、注文書表示マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPoPrint(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPoPrint_GetList(row, info);//リストの取得
		getPoPrint_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPoPrint_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PoPrint:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPoPrint_GetList(MCRow row, MCEventInfo info){
		return getList("getPoPrint", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PoPrint:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoPrint_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PoPrintCols.viewCols(), down, info);
	}

	/** 
	  * PoPrint:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoPrint_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PoPrintCols.sortPolicy());
	}


	/** 
	  * JnlPtnSeq:連番（自動仕訳パタン） メインメソッド<p>
	  * 引数の仕訳パタンＣＤに対応する連番を、自動仕訳パタンマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJnlPtnSeq(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJnlPtnSeq_GetList(row, info);//リストの取得
		getJnlPtnSeq_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJnlPtnSeq_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JnlPtnSeq:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJnlPtnSeq_GetList(MCRow row, MCEventInfo info){
		return getList("getJnlPtnSeq", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * JnlPtnSeq:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlPtnSeq_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JnlPtnSeqCols.viewCols(), down, info);
	}

	/** 
	  * JnlPtnSeq:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlPtnSeq_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JnlPtnSeqCols.sortPolicy());
	}


	/** 
	  * CalcPtn:計算パタン メインメソッド<p>
	  * 計算パタンマスタから計算パタン情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcPtn_GetList(row, info);//リストの取得
		getCalcPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcPtnCols.viewCols(), down, info);
	}

	/** 
	  * CalcPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcPtnCols.sortPolicy());
	}


	/** 
	  * CalcGrp:計算グループ メインメソッド<p>
	  * 計算グループマスタから計算グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcGrp_GetList(row, info);//リストの取得
		getCalcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcGrpCols.viewCols(), down, info);
	}

	/** 
	  * CalcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcGrpCols.sortPolicy());
	}


	/** 
	  * CostIo:受払表 メインメソッド<p>
	  * 原価個別受払表マスタから受払表情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostIo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostIo_GetList(row, info);//リストの取得
		getCostIo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostIo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostIo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostIo_GetList(MCRow row, MCEventInfo info){
		return getList("getCostIo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostIo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostIoCols.viewCols(), down, info);
	}

	/** 
	  * CostIo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostIoCols.sortPolicy());
	}


	/** 
	  * CostIoConf:受払項目 メインメソッド<p>
	  * 引数の受払表ＩＤに対応する受払項目を取得する<br>
受払集計単位区分で絞り込める
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostIoConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostIoConf_GetList(row, info);//リストの取得
		getCostIoConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostIoConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostIoConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostIoConf_GetList(MCRow row, MCEventInfo info){
		return getList("getCostIoConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostIoConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostIoConfCols.viewCols(), down, info);
	}

	/** 
	  * CostIoConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostIoConfCols.sortPolicy());
	}


	/** 
	  * AlcPtn:配賦パタン メインメソッド<p>
	  * 配賦パタンマスタから配賦パタン情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcPtn_GetList(row, info);//リストの取得
		getAlcPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcPtnCols.viewCols(), down, info);
	}

	/** 
	  * AlcPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcPtnCols.sortPolicy());
	}


	/** 
	  * AlcAcGrp:配賦科目グループ メインメソッド<p>
	  * 配賦科目グループマスタから配賦科目グループ情報を取得する<br>
配賦科目グループ区分に「null」を指定した場合は「null」を返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcAcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcAcGrp_GetList(row, info);//リストの取得
		getAlcAcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcAcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcAcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcAcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcAcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcAcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcAcGrpCols.viewCols(), down, info);
	}

	/** 
	  * AlcAcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcAcGrpCols.sortPolicy());
	}


	/** 
	  * AlcAc:配賦科目 メインメソッド<p>
	  * 配賦科目マスタから配賦科目情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcAc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcAc_GetList(row, info);//リストの取得
		getAlcAc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcAc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcAc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcAc_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcAc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcAc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcAcCols.viewCols(), down, info);
	}

	/** 
	  * AlcAc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcAcCols.sortPolicy());
	}


	/** 
	  * ItmGrp1:品目分類（品目分類区分１） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分１）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp1_GetList(row, info);//リストの取得
		getItmGrp1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp1_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp1Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp1Cols.sortPolicy());
	}


	/** 
	  * ItmGrp2:品目分類（品目分類区分２） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分２）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp2_GetList(row, info);//リストの取得
		getItmGrp2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp2_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp2Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp2Cols.sortPolicy());
	}


	/** 
	  * ItmGrp3:品目分類（品目分類区分３） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分３）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp3_GetList(row, info);//リストの取得
		getItmGrp3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp3_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp3Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp3Cols.sortPolicy());
	}


	/** 
	  * ItmGrp4:品目分類（品目分類区分４） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分４）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp4(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp4_GetList(row, info);//リストの取得
		getItmGrp4_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp4_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp4:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp4_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp4", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp4:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp4_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp4Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp4:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp4_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp4Cols.sortPolicy());
	}


	/** 
	  * ItmGrp5:品目分類（品目分類区分５） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分５）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp5(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp5_GetList(row, info);//リストの取得
		getItmGrp5_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp5_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp5:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp5_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp5", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp5:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp5_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp5Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp5:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp5_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp5Cols.sortPolicy());
	}


	/** 
	  * ItmGrp6:品目分類（品目分類区分６） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分６）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp6(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp6_GetList(row, info);//リストの取得
		getItmGrp6_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp6_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp6:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp6_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp6", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp6:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp6_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp6Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp6:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp6_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp6Cols.sortPolicy());
	}


	/** 
	  * ItmGrp7:品目分類（品目分類区分７） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分７）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp7(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp7_GetList(row, info);//リストの取得
		getItmGrp7_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp7_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp7:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp7_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp7", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp7:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp7_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp7Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp7:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp7_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp7Cols.sortPolicy());
	}


	/** 
	  * ItmGrp8:品目分類（品目分類区分８） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分８）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp8(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp8_GetList(row, info);//リストの取得
		getItmGrp8_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp8_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp8:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp8_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp8", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp8:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp8_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp8Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp8:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp8_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp8Cols.sortPolicy());
	}


	/** 
	  * ItmGrp9:品目分類（品目分類区分９） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分９）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp9(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp9_GetList(row, info);//リストの取得
		getItmGrp9_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp9_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp9:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp9_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp9", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp9:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp9_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp9Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp9:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp9_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp9Cols.sortPolicy());
	}


	/** 
	  * ItmGrp10:品目分類（品目分類区分１０） メインメソッド<p>
	  * 品目分類マスタから品目分類ＣＤ（品目分類区分１０）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrp10(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrp10_GetList(row, info);//リストの取得
		getItmGrp10_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrp10_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrp10:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrp10_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrp10", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrp10:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp10_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrp10Cols.viewCols(), down, info);
	}

	/** 
	  * ItmGrp10:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrp10_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrp10Cols.sortPolicy());
	}


	/** 
	  * BpGrp1:取引先分類（取引先分類区分１） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分１）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp1_GetList(row, info);//リストの取得
		getBpGrp1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp1_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp1Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp1Cols.sortPolicy());
	}


	/** 
	  * BpGrp2:取引先分類（取引先分類区分２） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分２）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp2_GetList(row, info);//リストの取得
		getBpGrp2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp2_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp2Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp2Cols.sortPolicy());
	}


	/** 
	  * BpGrp3:取引先分類（取引先分類区分３） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分３）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp3_GetList(row, info);//リストの取得
		getBpGrp3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp3_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp3Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp3Cols.sortPolicy());
	}


	/** 
	  * BpGrp4:取引先分類（取引先分類区分４） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分４）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp4(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp4_GetList(row, info);//リストの取得
		getBpGrp4_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp4_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp4:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp4_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp4", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp4:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp4_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp4Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp4:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp4_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp4Cols.sortPolicy());
	}


	/** 
	  * BpGrp5:取引先分類（取引先分類区分５） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分５）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp5(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp5_GetList(row, info);//リストの取得
		getBpGrp5_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp5_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp5:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp5_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp5", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp5:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp5_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp5Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp5:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp5_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp5Cols.sortPolicy());
	}


	/** 
	  * BpGrp6:取引先分類（取引先分類区分６） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分６）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp6(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp6_GetList(row, info);//リストの取得
		getBpGrp6_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp6_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp6:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp6_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp6", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp6:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp6_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp6Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp6:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp6_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp6Cols.sortPolicy());
	}


	/** 
	  * BpGrp7:取引先分類（取引先分類区分７） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分７）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp7(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp7_GetList(row, info);//リストの取得
		getBpGrp7_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp7_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp7:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp7_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp7", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp7:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp7_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp7Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp7:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp7_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp7Cols.sortPolicy());
	}


	/** 
	  * BpGrp8:取引先分類（取引先分類区分８） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分８）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp8(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp8_GetList(row, info);//リストの取得
		getBpGrp8_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp8_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp8:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp8_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp8", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp8:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp8_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp8Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp8:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp8_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp8Cols.sortPolicy());
	}


	/** 
	  * BpGrp9:取引先分類（取引先分類区分９） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分９）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp9(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp9_GetList(row, info);//リストの取得
		getBpGrp9_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp9_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp9:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp9_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp9", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp9:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp9_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp9Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp9:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp9_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp9Cols.sortPolicy());
	}


	/** 
	  * BpGrp10:取引先分類（取引先分類区分１０） メインメソッド<p>
	  * 取引先分類マスタから取引先分類ＣＤ（取引先分類区分１０）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrp10(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrp10_GetList(row, info);//リストの取得
		getBpGrp10_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrp10_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrp10:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrp10_GetList(MCRow row, MCEventInfo info){
		return getList("getBpGrp10", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpGrp10:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp10_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrp10Cols.viewCols(), down, info);
	}

	/** 
	  * BpGrp10:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrp10_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrp10Cols.sortPolicy());
	}


	/** 
	  * CostIoNotInCostIoConf:受払表（個別受払表構成未登録） メインメソッド<p>
	  * 原価個別受払表構成マスタに未登録の受払表を、原価個別受払表マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostIoNotInCostIoConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostIoNotInCostIoConf_GetList(row, info);//リストの取得
		getCostIoNotInCostIoConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostIoNotInCostIoConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostIoNotInCostIoConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostIoNotInCostIoConf_GetList(MCRow row, MCEventInfo info){
		return getList("getCostIoNotInCostIoConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostIoNotInCostIoConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoNotInCostIoConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostIoNotInCostIoConfCols.viewCols(), down, info);
	}

	/** 
	  * CostIoNotInCostIoConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoNotInCostIoConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostIoNotInCostIoConfCols.sortPolicy());
	}


	/** 
	  * CalcCtg:計算カテゴリ メインメソッド<p>
	  * 計算カテゴリマスタから計算カテゴリ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcCtg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcCtg_GetList(row, info);//リストの取得
		getCalcCtg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcCtg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcCtg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcCtg_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcCtg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcCtg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcCtg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcCtgCols.viewCols(), down, info);
	}

	/** 
	  * CalcCtg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcCtg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcCtgCols.sortPolicy());
	}


	/** 
	  * AlcAcGrp1:配賦科目グループ（区分１） メインメソッド<p>
	  * 配賦科目グループ区分１に属する配賦科目グループ情報を、配賦科目グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcAcGrp1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcAcGrp1_GetList(row, info);//リストの取得
		getAlcAcGrp1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcAcGrp1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcAcGrp1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcAcGrp1_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcAcGrp1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcAcGrp1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcAcGrp1Cols.viewCols(), down, info);
	}

	/** 
	  * AlcAcGrp1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcAcGrp1Cols.sortPolicy());
	}


	/** 
	  * AlcAcGrp2:配賦科目グループ（区分２） メインメソッド<p>
	  * 配賦科目グループ区分２に属する配賦科目グループ情報を、配賦科目グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcAcGrp2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcAcGrp2_GetList(row, info);//リストの取得
		getAlcAcGrp2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcAcGrp2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcAcGrp2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcAcGrp2_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcAcGrp2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcAcGrp2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcAcGrp2Cols.viewCols(), down, info);
	}

	/** 
	  * AlcAcGrp2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcAcGrp2Cols.sortPolicy());
	}


	/** 
	  * AlcAcGrp3:配賦科目グループ（区分３） メインメソッド<p>
	  * 配賦科目グループ区分３に属する配賦科目グループ情報を、配賦科目グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcAcGrp3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcAcGrp3_GetList(row, info);//リストの取得
		getAlcAcGrp3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcAcGrp3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcAcGrp3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcAcGrp3_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcAcGrp3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcAcGrp3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcAcGrp3Cols.viewCols(), down, info);
	}

	/** 
	  * AlcAcGrp3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrp3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcAcGrp3Cols.sortPolicy());
	}


	/** 
	  * Tterm1:取引条件（区分１） メインメソッド<p>
	  * 取引条件区分１に属する取引条件情報を、取引条件マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTterm1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTterm1_GetList(row, info);//リストの取得
		getTterm1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTterm1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Tterm1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTterm1_GetList(MCRow row, MCEventInfo info){
		return getList("getTterm1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Tterm1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(Tterm1Cols.viewCols(), down, info);
	}

	/** 
	  * Tterm1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(Tterm1Cols.sortPolicy());
	}


	/** 
	  * Tterm2:取引条件（区分２） メインメソッド<p>
	  * 取引条件区分２に属する取引条件情報を、取引条件マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTterm2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTterm2_GetList(row, info);//リストの取得
		getTterm2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTterm2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Tterm2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTterm2_GetList(MCRow row, MCEventInfo info){
		return getList("getTterm2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Tterm2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(Tterm2Cols.viewCols(), down, info);
	}

	/** 
	  * Tterm2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(Tterm2Cols.sortPolicy());
	}


	/** 
	  * Tterm3:取引条件（区分３） メインメソッド<p>
	  * 取引条件区分３に属する取引条件情報を、取引条件マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTterm3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTterm3_GetList(row, info);//リストの取得
		getTterm3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTterm3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Tterm3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTterm3_GetList(MCRow row, MCEventInfo info){
		return getList("getTterm3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Tterm3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(Tterm3Cols.viewCols(), down, info);
	}

	/** 
	  * Tterm3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTterm3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(Tterm3Cols.sortPolicy());
	}


	/** 
	  * SlsAnly:販売分析 メインメソッド<p>
	  * 引数の販売分析区分に対応するグループ情報を、販売分析マスタから取得する<br>
得意先をグルーピングして販売データを参照する際のグループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsAnly(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsAnly_GetList(row, info);//リストの取得
		getSlsAnly_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsAnly_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsAnly:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsAnly_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsAnly", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsAnly:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsAnlyCols.viewCols(), down, info);
	}

	/** 
	  * SlsAnly:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsAnlyCols.sortPolicy());
	}


	/** 
	  * SlsAnly1:販売分析（区分１） メインメソッド<p>
	  * 販売分析区分１に属する販売分析情報を、販売分析マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsAnly1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsAnly1_GetList(row, info);//リストの取得
		getSlsAnly1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsAnly1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsAnly1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsAnly1_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsAnly1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsAnly1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsAnly1Cols.viewCols(), down, info);
	}

	/** 
	  * SlsAnly1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsAnly1Cols.sortPolicy());
	}


	/** 
	  * SlsAnly2:販売分析（区分２） メインメソッド<p>
	  * 販売分析区分２に属する販売分析情報を、販売分析マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsAnly2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsAnly2_GetList(row, info);//リストの取得
		getSlsAnly2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsAnly2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsAnly2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsAnly2_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsAnly2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsAnly2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsAnly2Cols.viewCols(), down, info);
	}

	/** 
	  * SlsAnly2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsAnly2Cols.sortPolicy());
	}


	/** 
	  * SlsAnly3:販売分析（区分３） メインメソッド<p>
	  * 販売分析区分３に属する販売分析情報を、販売分析マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsAnly3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsAnly3_GetList(row, info);//リストの取得
		getSlsAnly3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsAnly3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsAnly3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsAnly3_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsAnly3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsAnly3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsAnly3Cols.viewCols(), down, info);
	}

	/** 
	  * SlsAnly3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnly3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsAnly3Cols.sortPolicy());
	}


	/** 
	  * PurcBizRsn:業務理由（仕入） メインメソッド<p>
	  * 仕入（経費含む）や入荷を計上するときに使用する理由情報を、業務理由マスタから取得する<br>
・経費購買のみに絞り込む場合は、xpns_purc_flgに「true」を指定する<br>
・経費購買以外に絞り込む場合は、not_xpns_purc_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcBizRsn_GetList(row, info);//リストの取得
		getPurcBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getPurcBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PurcBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * PurcBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcBizRsnCols.sortPolicy());
	}


	/** 
	  * PurcRtnBizRsn:業務理由（仕入返品） メインメソッド<p>
	  * 仕入返品（経費含む）や入荷返品を計上するときに使用する理由情報を、業務理由マスタから取得する<br>
・経費購買のみに絞り込む場合は、xpns_purc_flgに「true」を指定する<br>
・経費購買以外に絞り込む場合は、not_xpns_purc_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcRtnBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcRtnBizRsn_GetList(row, info);//リストの取得
		getPurcRtnBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcRtnBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcRtnBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcRtnBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getPurcRtnBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PurcRtnBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcRtnBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcRtnBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * PurcRtnBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcRtnBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcRtnBizRsnCols.sortPolicy());
	}


	/** 
	  * PurcDscntBizRsn:業務理由（仕入調整） メインメソッド<p>
	  * 仕入値引や仕入値増を計上するときに使用する理由情報を、業務理由マスタから取得する<br>
・仕入調整管轄区分で絞り込む場合は、purc_dscnt_loc_mng_typに管轄区分を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcDscntBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcDscntBizRsn_GetList(row, info);//リストの取得
		getPurcDscntBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcDscntBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcDscntBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcDscntBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getPurcDscntBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PurcDscntBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcDscntBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcDscntBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * PurcDscntBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcDscntBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcDscntBizRsnCols.sortPolicy());
	}


	/** 
	  * SPurcDscntBizRsn:業務理由（生産資産仕入調整） メインメソッド<p>
	  * 生産資産に対する仕入値引や仕入値増を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSPurcDscntBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSPurcDscntBizRsn_GetList(row, info);//リストの取得
		getSPurcDscntBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSPurcDscntBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SPurcDscntBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSPurcDscntBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getSPurcDscntBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SPurcDscntBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSPurcDscntBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SPurcDscntBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * SPurcDscntBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSPurcDscntBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SPurcDscntBizRsnCols.sortPolicy());
	}


	/** 
	  * HPurcDscntBizRsn:業務理由（販売資産仕入調整） メインメソッド<p>
	  * 販売資産に対する仕入値引、仕入値増計上時に使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getHPurcDscntBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getHPurcDscntBizRsn_GetList(row, info);//リストの取得
		getHPurcDscntBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getHPurcDscntBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * HPurcDscntBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getHPurcDscntBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getHPurcDscntBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * HPurcDscntBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getHPurcDscntBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(HPurcDscntBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * HPurcDscntBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getHPurcDscntBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(HPurcDscntBizRsnCols.sortPolicy());
	}


	/** 
	  * SlsBizRsn:業務理由（売上） メインメソッド<p>
	  * 売上（経費含む）や出荷の計上をするときに使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsBizRsn_GetList(row, info);//リストの取得
		getSlsBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * SlsBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsBizRsnCols.sortPolicy());
	}


	/** 
	  * SlsRtnBizRsn:業務理由（売上返品） メインメソッド<p>
	  * 売上返品（経費含む）や出荷返品を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsRtnBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsRtnBizRsn_GetList(row, info);//リストの取得
		getSlsRtnBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsRtnBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsRtnBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsRtnBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsRtnBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsRtnBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsRtnBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsRtnBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * SlsRtnBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsRtnBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsRtnBizRsnCols.sortPolicy());
	}


	/** 
	  * SlsDscntBizRsn:業務理由（売上調整） メインメソッド<p>
	  * 売上値引や売上返品を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsDscntBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsDscntBizRsn_GetList(row, info);//リストの取得
		getSlsDscntBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsDscntBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsDscntBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsDscntBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsDscntBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsDscntBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsDscntBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsDscntBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * SlsDscntBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsDscntBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsDscntBizRsnCols.sortPolicy());
	}


	/** 
	  * AcxfrGrBizRsn:業務理由（他勘定入庫） メインメソッド<p>
	  * 他勘定入庫計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcxfrGrBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcxfrGrBizRsn_GetList(row, info);//リストの取得
		getAcxfrGrBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcxfrGrBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcxfrGrBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcxfrGrBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getAcxfrGrBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcxfrGrBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxfrGrBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcxfrGrBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * AcxfrGrBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxfrGrBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcxfrGrBizRsnCols.sortPolicy());
	}


	/** 
	  * AcxfrGiBizRsn:業務理由（他勘定出庫） メインメソッド<p>
	  * 他勘定出庫を計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcxfrGiBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcxfrGiBizRsn_GetList(row, info);//リストの取得
		getAcxfrGiBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcxfrGiBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcxfrGiBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcxfrGiBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getAcxfrGiBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcxfrGiBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxfrGiBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcxfrGiBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * AcxfrGiBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxfrGiBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcxfrGiBizRsnCols.sortPolicy());
	}


	/** 
	  * DispBizRsn:業務理由（廃棄） メインメソッド<p>
	  * 廃棄計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDispBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDispBizRsn_GetList(row, info);//リストの取得
		getDispBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDispBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DispBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDispBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getDispBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DispBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDispBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DispBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * DispBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDispBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DispBizRsnCols.sortPolicy());
	}


	/** 
	  * StkXfrBizRsn:業務理由（在庫振替） メインメソッド<p>
	  * 在庫振替計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkXfrBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkXfrBizRsn_GetList(row, info);//リストの取得
		getStkXfrBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkXfrBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkXfrBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkXfrBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getStkXfrBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StkXfrBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkXfrBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkXfrBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * StkXfrBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkXfrBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkXfrBizRsnCols.sortPolicy());
	}


	/** 
	  * XfrBizRsn:業務理由（移送） メインメソッド<p>
	  * 移送計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getXfrBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getXfrBizRsn_GetList(row, info);//リストの取得
		getXfrBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getXfrBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * XfrBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getXfrBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getXfrBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * XfrBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXfrBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(XfrBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * XfrBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXfrBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(XfrBizRsnCols.sortPolicy());
	}


	/** 
	  * YieldBizRsn:業務理由（出来高） メインメソッド<p>
	  * 製造出来高計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getYieldBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getYieldBizRsn_GetList(row, info);//リストの取得
		getYieldBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getYieldBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * YieldBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getYieldBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getYieldBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * YieldBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getYieldBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(YieldBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * YieldBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getYieldBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(YieldBizRsnCols.sortPolicy());
	}


	/** 
	  * LossBizRsn:業務理由（ロス） メインメソッド<p>
	  * 投入ロスを計上するときに使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLossBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLossBizRsn_GetList(row, info);//リストの取得
		getLossBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLossBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LossBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLossBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getLossBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LossBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLossBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LossBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * LossBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLossBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LossBizRsnCols.sortPolicy());
	}


	/** 
	  * DfctBizRsn:業務理由（検査不良） メインメソッド<p>
	  * 検査不良計上時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDfctBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDfctBizRsn_GetList(row, info);//リストの取得
		getDfctBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDfctBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DfctBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDfctBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getDfctBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DfctBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDfctBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DfctBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * DfctBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDfctBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DfctBizRsnCols.sortPolicy());
	}


	/** 
	  * SloStkGd:格付（受注） メインメソッド<p>
	  * 見積、受注登録が可能な格付（出荷可能な格付）情報を、格付マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloStkGd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloStkGd_GetList(row, info);//リストの取得
		getSloStkGd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloStkGd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloStkGd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloStkGd_GetList(MCRow row, MCEventInfo info){
		return getList("getSloStkGd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloStkGd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloStkGd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloStkGdCols.viewCols(), down, info);
	}

	/** 
	  * SloStkGd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloStkGd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloStkGdCols.sortPolicy());
	}


	/** 
	  * FeedStkGd:格付（投入引当対象） メインメソッド<p>
	  * 投入引当可能な格付情報を、格付マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getFeedStkGd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getFeedStkGd_GetList(row, info);//リストの取得
		getFeedStkGd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getFeedStkGd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * FeedStkGd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getFeedStkGd_GetList(MCRow row, MCEventInfo info){
		return getList("getFeedStkGd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * FeedStkGd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFeedStkGd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(FeedStkGdCols.viewCols(), down, info);
	}

	/** 
	  * FeedStkGd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFeedStkGd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(FeedStkGdCols.sortPolicy());
	}


	/** 
	  * SlsWg:ワーキンググループ（販売） メインメソッド<p>
	  * 販売機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsWg_GetList(row, info);//リストの取得
		getSlsWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsWg_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsWgCols.viewCols(), down, info);
	}

	/** 
	  * SlsWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsWgCols.sortPolicy());
	}


	/** 
	  * LgWg:ワーキンググループ（物流） メインメソッド<p>
	  * 物流機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLgWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLgWg_GetList(row, info);//リストの取得
		getLgWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLgWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LgWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLgWg_GetList(MCRow row, MCEventInfo info){
		return getList("getLgWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LgWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LgWgCols.viewCols(), down, info);
	}

	/** 
	  * LgWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LgWgCols.sortPolicy());
	}


	/** 
	  * MfgWg:ワーキンググループ（製造） メインメソッド<p>
	  * 製造機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgWg_GetList(row, info);//リストの取得
		getMfgWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgWg_GetList(MCRow row, MCEventInfo info){
		return getList("getMfgWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * MfgWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgWgCols.viewCols(), down, info);
	}

	/** 
	  * MfgWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgWgCols.sortPolicy());
	}


	/** 
	  * PurcWg:ワーキンググループ（購買） メインメソッド<p>
	  * 購買機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcWg_GetList(row, info);//リストの取得
		getPurcWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcWg_GetList(MCRow row, MCEventInfo info){
		return getList("getPurcWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PurcWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcWgCols.viewCols(), down, info);
	}

	/** 
	  * PurcWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcWgCols.sortPolicy());
	}


	/** 
	  * ArWg:ワーキンググループ（債権） メインメソッド<p>
	  * 債権機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArWg_GetList(row, info);//リストの取得
		getArWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArWg_GetList(MCRow row, MCEventInfo info){
		return getList("getArWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ArWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArWgCols.viewCols(), down, info);
	}

	/** 
	  * ArWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArWgCols.sortPolicy());
	}


	/** 
	  * ApWg:ワーキンググループ（債務） メインメソッド<p>
	  * 債務機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApWg_GetList(row, info);//リストの取得
		getApWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApWg_GetList(MCRow row, MCEventInfo info){
		return getList("getApWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ApWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApWgCols.viewCols(), down, info);
	}

	/** 
	  * ApWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApWgCols.sortPolicy());
	}


	/** 
	  * SdWg:ワーキンググループ（需給） メインメソッド<p>
	  * 需給機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSdWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSdWg_GetList(row, info);//リストの取得
		getSdWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSdWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SdWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSdWg_GetList(MCRow row, MCEventInfo info){
		return getList("getSdWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SdWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSdWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SdWgCols.viewCols(), down, info);
	}

	/** 
	  * SdWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSdWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SdWgCols.sortPolicy());
	}


	/** 
	  * IntBankAc:社内口座 メインメソッド<p>
	  * 口座マスタから社内口座情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIntBankAc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIntBankAc_GetList(row, info);//リストの取得
		getIntBankAc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIntBankAc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IntBankAc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIntBankAc_GetList(MCRow row, MCEventInfo info){
		return getList("getIntBankAc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * IntBankAc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIntBankAc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IntBankAcCols.viewCols(), down, info);
	}

	/** 
	  * IntBankAc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIntBankAc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IntBankAcCols.sortPolicy());
	}


	/** 
	  * ExtBankAc:社外口座 メインメソッド<p>
	  * 口座マスタから社外口座情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtBankAc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtBankAc_GetList(row, info);//リストの取得
		getExtBankAc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtBankAc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtBankAc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtBankAc_GetList(MCRow row, MCEventInfo info){
		return getList("getExtBankAc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ExtBankAc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtBankAc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtBankAcCols.viewCols(), down, info);
	}

	/** 
	  * ExtBankAc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtBankAc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtBankAcCols.sortPolicy());
	}


	/** 
	  * CostSls:原価売上分類 メインメソッド<p>
	  * 引数の売上分類区分に対応する原価売上分類情報を、原価売上分類マスタから取得する<br>

	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostSls(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostSls_GetList(row, info);//リストの取得
		getCostSls_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostSls_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostSls:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostSls_GetList(MCRow row, MCEventInfo info){
		return getList("getCostSls", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostSls:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostSlsCols.viewCols(), down, info);
	}

	/** 
	  * CostSls:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostSlsCols.sortPolicy());
	}


	/** 
	  * CostSls1:原価売上分類（区分１） メインメソッド<p>
	  * 売上分類区分１に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostSls1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostSls1_GetList(row, info);//リストの取得
		getCostSls1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostSls1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostSls1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostSls1_GetList(MCRow row, MCEventInfo info){
		return getList("getCostSls1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostSls1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostSls1Cols.viewCols(), down, info);
	}

	/** 
	  * CostSls1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostSls1Cols.sortPolicy());
	}


	/** 
	  * CostSls2:原価売上分類（区分２） メインメソッド<p>
	  * 売上分類区分２に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostSls2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostSls2_GetList(row, info);//リストの取得
		getCostSls2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostSls2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostSls2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostSls2_GetList(MCRow row, MCEventInfo info){
		return getList("getCostSls2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostSls2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostSls2Cols.viewCols(), down, info);
	}

	/** 
	  * CostSls2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostSls2Cols.sortPolicy());
	}


	/** 
	  * CostSls3:原価売上分類（区分３） メインメソッド<p>
	  * 売上分類区分３に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostSls3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostSls3_GetList(row, info);//リストの取得
		getCostSls3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostSls3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostSls3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostSls3_GetList(MCRow row, MCEventInfo info){
		return getList("getCostSls3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostSls3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostSls3Cols.viewCols(), down, info);
	}

	/** 
	  * CostSls3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostSls3Cols.sortPolicy());
	}


	/** 
	  * CostSls4:原価売上分類（区分４） メインメソッド<p>
	  * 売上分類区分４に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostSls4(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostSls4_GetList(row, info);//リストの取得
		getCostSls4_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostSls4_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostSls4:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostSls4_GetList(MCRow row, MCEventInfo info){
		return getList("getCostSls4", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostSls4:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls4_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostSls4Cols.viewCols(), down, info);
	}

	/** 
	  * CostSls4:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls4_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostSls4Cols.sortPolicy());
	}


	/** 
	  * CostSls5:原価売上分類（区分５） メインメソッド<p>
	  * 売上分類区分５に属する原価売上分類情報を、原価売上分類マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostSls5(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostSls5_GetList(row, info);//リストの取得
		getCostSls5_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostSls5_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostSls5:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostSls5_GetList(MCRow row, MCEventInfo info){
		return getList("getCostSls5", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostSls5:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls5_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostSls5Cols.viewCols(), down, info);
	}

	/** 
	  * CostSls5:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSls5_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostSls5Cols.sortPolicy());
	}


	/** 
	  * GpAlc:汎用配賦分類 メインメソッド<p>
	  * 汎用配賦分類マスタから汎用配賦情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getGpAlc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getGpAlc_GetList(row, info);//リストの取得
		getGpAlc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getGpAlc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * GpAlc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getGpAlc_GetList(MCRow row, MCEventInfo info){
		return getList("getGpAlc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * GpAlc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getGpAlc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(GpAlcCols.viewCols(), down, info);
	}

	/** 
	  * GpAlc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getGpAlc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(GpAlcCols.sortPolicy());
	}


	/** 
	  * Sttl:決済方法 メインメソッド<p>
	  * 債権債務機能で使用する決済方法（現金や振込など）の情報を、決済方法マスタから取得する<br>
・税ＣＤを取得する場合は、dtに適用日を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSttl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSttl_GetList(row, info);//リストの取得
		getSttl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSttl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Sttl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSttl_GetList(MCRow row, MCEventInfo info){
		return getList("getSttl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Sttl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSttl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SttlCols.viewCols(), down, info);
	}

	/** 
	  * Sttl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSttl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SttlCols.sortPolicy());
	}


	/** 
	  * ArSttlSetoffDrWtax:債権決済方法（相殺（借方）・源泉税） メインメソッド<p>
	  * 債権債務機能で使用する決済方法（相殺（借方）、源泉税）情報を、決済方法マスタから取得する<br>
・税ＣＤを取得する場合は、dtに適用日を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArSttlSetoffDrWtax(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArSttlSetoffDrWtax_GetList(row, info);//リストの取得
		getArSttlSetoffDrWtax_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArSttlSetoffDrWtax_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArSttlSetoffDrWtax:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArSttlSetoffDrWtax_GetList(MCRow row, MCEventInfo info){
		return getList("getArSttlSetoffDrWtax", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ArSttlSetoffDrWtax:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttlSetoffDrWtax_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArSttlSetoffDrWtaxCols.viewCols(), down, info);
	}

	/** 
	  * ArSttlSetoffDrWtax:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttlSetoffDrWtax_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArSttlSetoffDrWtaxCols.sortPolicy());
	}


	/** 
	  * PreAlcPtn:一次配賦パタン メインメソッド<p>
	  * 一次配賦パタンマスタから一次配賦パタン情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcPtn_GetList(row, info);//リストの取得
		getPreAlcPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcPtnCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcPtnCols.sortPolicy());
	}


	/** 
	  * AlcCoef:配賦係数 メインメソッド<p>
	  * 配賦係数マスタから配賦係数情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcCoef(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcCoef_GetList(row, info);//リストの取得
		getAlcCoef_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcCoef_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcCoef:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcCoef_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcCoef", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcCoef:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCoef_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcCoefCols.viewCols(), down, info);
	}

	/** 
	  * AlcCoef:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCoef_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcCoefCols.sortPolicy());
	}


	/** 
	  * CostDpt:原価部門 メインメソッド<p>
	  * 原価部門マスタから原価部門情報を取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する<br>
・適用年月で絞り込む場合は、以下の設定をする<br>
　　適用年月を指定する場合：ymに期を指定する（mode_this_month_flgは無効になる）<br>
　　運用年月を使用する場合：ymを未指定にし、mode_this_month_flgに「true」を指定する<br>
　　※いずれの場合も、ymに「null」を指定した場合は「null」を返す<br>
・適用年月で絞り込まない場合は、ignore_ym_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostDpt(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostDpt_GetList(row, info);//リストの取得
		getCostDpt_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostDpt_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostDpt:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostDpt_GetList(MCRow row, MCEventInfo info){
		return getList("getCostDpt", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostDpt:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostDpt_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostDptCols.viewCols(), down, info);
	}

	/** 
	  * CostDpt:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostDpt_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostDptCols.sortPolicy());
	}


	/** 
	  * PreAlcDpt:配賦先部門パタン（全部） メインメソッド<p>
	  * 一次配賦先部門マスタから期と配賦先部門パタン情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcDpt(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcDpt_GetList(row, info);//リストの取得
		getPreAlcDpt_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcDpt_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcDpt:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcDpt_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcDpt", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcDpt:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcDpt_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcDptCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcDpt:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcDpt_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcDptCols.sortPolicy());
	}


	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:配賦方法_配賦パタン（費目別原価または利益） メインメソッド<p>
	  * 配賦方法区分に「4:費目別原価」または「5:利益」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsExpnsCostOrProfit(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcRuleAlcPtnAsExpnsCostOrProfit_GetList(row, info);//リストの取得
		getAlcRuleAlcPtnAsExpnsCostOrProfit_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcRuleAlcPtnAsExpnsCostOrProfit_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcRuleAlcPtnAsExpnsCostOrProfit_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcRuleAlcPtnAsExpnsCostOrProfit", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsExpnsCostOrProfit_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcRuleAlcPtnAsExpnsCostOrProfitCols.viewCols(), down, info);
	}

	/** 
	  * AlcRuleAlcPtnAsExpnsCostOrProfit:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsExpnsCostOrProfit_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcRuleAlcPtnAsExpnsCostOrProfitCols.sortPolicy());
	}


	/** 
	  * PreAlcRate:一次配賦基準 メインメソッド<p>
	  * 一次配賦基準マスタから一次配賦基準情報を取得する<br>
一次配賦パタンＣＤに「null」を指定した場合は「null」を返す<br>
一次配賦パタンＣＤが未指定の場合は、検索条件としては無効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcRate(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcRate_GetList(row, info);//リストの取得
		getPreAlcRate_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcRate_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcRate:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcRate_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcRate", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcRate:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRate_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcRateCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcRate:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRate_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcRateCols.sortPolicy());
	}


	/** 
	  * PreAlcRateInPreAlcCtg:一次配賦基準（一次配賦基準カテゴリ登録済） メインメソッド<p>
	  * 一次配賦基準マスタから一次配賦基準を取得する<br>
一次配賦基準カテゴリマスタにも存在するもののみ取得する<br>
・計画月次比率で絞り込む場合は、pln_mly_flg_strに「true」を指定する（「false」は無効）<br>
・実績月次比率で絞り込む場合は、act_mly_flg_strに「true」を指定する（「false」は無効）<br>
・上記の条件をor条件で絞り込む場合は、or_flg_strに「true」を指定する<br>
　※or_flg_strは、pln_mly_flg_strとact_mly_flg_strの両方とも「true」の場合のみ有効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcRateInPreAlcCtg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcRateInPreAlcCtg_GetList(row, info);//リストの取得
		getPreAlcRateInPreAlcCtg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcRateInPreAlcCtg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcRateInPreAlcCtg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcRateInPreAlcCtg_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcRateInPreAlcCtg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcRateInPreAlcCtg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateInPreAlcCtg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcRateInPreAlcCtgCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcRateInPreAlcCtg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateInPreAlcCtg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcRateInPreAlcCtgCols.sortPolicy());
	}


	/** 
	  * PreAlcRateNotPreAlcPtn:一次配賦基準（月次比率絞り込み） メインメソッド<p>
	  * 一次配賦基準マスタから一次配賦基準を取得する<br>
・計画月次比率で絞り込む場合は、pln_mly_flg_strに「true」を指定する（「false」は無効）<br>
・実績月次比率で絞り込む場合は、act_mly_flg_strに「true」を指定する（「false」は無効）<br>
・上記の条件をor条件で絞り込む場合は、or_flg_strに「true」を指定する<br>
　※or_flg_strは、pln_mly_flg_strとact_mly_flg_strの両方とも「true」の場合のみ有効<br>

	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcRateNotPreAlcPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcRateNotPreAlcPtn_GetList(row, info);//リストの取得
		getPreAlcRateNotPreAlcPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcRateNotPreAlcPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcRateNotPreAlcPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcRateNotPreAlcPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcRateNotPreAlcPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcRateNotPreAlcPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateNotPreAlcPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcRateNotPreAlcPtnCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcRateNotPreAlcPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateNotPreAlcPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcRateNotPreAlcPtnCols.sortPolicy());
	}


	/** 
	  * CostCtg:原価品群 メインメソッド<p>
	  * 原価品群マスタから原価品群情報を取得する<br>
品群構成区分に「null」を指定した場合は「null」を返す<br>
品群構成区分が未指定の場合は、検索条件としては無効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostCtg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostCtg_GetList(row, info);//リストの取得
		getCostCtg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostCtg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostCtg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostCtg_GetList(MCRow row, MCEventInfo info){
		return getList("getCostCtg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostCtg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCtg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostCtgCols.viewCols(), down, info);
	}

	/** 
	  * CostCtg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCtg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostCtgCols.sortPolicy());
	}


	/** 
	  * DptBase:部門（基本） メインメソッド<p>
	  * 部門基本マスタから部門のコードと名称を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDptBase(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDptBase_GetList(row, info);//リストの取得
		getDptBase_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDptBase_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DptBase:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDptBase_GetList(MCRow row, MCEventInfo info){
		return getList("getDptBase", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DptBase:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptBase_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptBaseCols.viewCols(), down, info);
	}

	/** 
	  * DptBase:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptBase_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptBaseCols.sortPolicy());
	}


	/** 
	  * DptHis:組織変更履歴 メインメソッド<p>
	  * 組織変更履歴マスタから履歴情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDptHis(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDptHis_GetList(row, info);//リストの取得
		getDptHis_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDptHis_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DptHis:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDptHis_GetList(MCRow row, MCEventInfo info){
		return getList("getDptHis", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DptHis:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptHis_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptHisCols.viewCols(), down, info);
	}

	/** 
	  * DptHis:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptHis_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptHisCols.sortPolicy());
	}


	/** 
	  * AlcCoefAsConfig:配賦係数（配賦係数構成マスタ） メインメソッド<p>
	  * 配賦係数構成区分に「1:配賦係数構成マスタ」が設定されている配賦係数情報を、配賦方法マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcCoefAsConfig(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcCoefAsConfig_GetList(row, info);//リストの取得
		getAlcCoefAsConfig_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcCoefAsConfig_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcCoefAsConfig:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcCoefAsConfig_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcCoefAsConfig", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcCoefAsConfig:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCoefAsConfig_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcCoefAsConfigCols.viewCols(), down, info);
	}

	/** 
	  * AlcCoefAsConfig:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCoefAsConfig_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcCoefAsConfigCols.sortPolicy());
	}


	/** 
	  * AlcCoefAsNotConfig:配賦係数（配賦係数構成マスタ以外） メインメソッド<p>
	  * 配賦係数構成区分に「1:配賦係数構成マスタ」以外が設定されている配賦係数情報を、配賦方法マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcCoefAsNotConfig(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcCoefAsNotConfig_GetList(row, info);//リストの取得
		getAlcCoefAsNotConfig_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcCoefAsNotConfig_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcCoefAsNotConfig:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcCoefAsNotConfig_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcCoefAsNotConfig", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcCoefAsNotConfig:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCoefAsNotConfig_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcCoefAsNotConfigCols.viewCols(), down, info);
	}

	/** 
	  * AlcCoefAsNotConfig:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCoefAsNotConfig_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcCoefAsNotConfigCols.sortPolicy());
	}


	/** 
	  * DptAlcGrp:部門配賦グループ メインメソッド<p>
	  * 原価部門マスタから部門配賦グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDptAlcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDptAlcGrp_GetList(row, info);//リストの取得
		getDptAlcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDptAlcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DptAlcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDptAlcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getDptAlcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DptAlcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptAlcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptAlcGrpCols.viewCols(), down, info);
	}

	/** 
	  * DptAlcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptAlcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptAlcGrpCols.sortPolicy());
	}


	/** 
	  * LocAlcGrp:場所配賦グループ メインメソッド<p>
	  * 場所マスタから場所配賦グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLocAlcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLocAlcGrp_GetList(row, info);//リストの取得
		getLocAlcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLocAlcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LocAlcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLocAlcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getLocAlcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LocAlcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocAlcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LocAlcGrpCols.viewCols(), down, info);
	}

	/** 
	  * LocAlcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocAlcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LocAlcGrpCols.sortPolicy());
	}


	/** 
	  * OperAlcGrp:工程配賦グループ メインメソッド<p>
	  * 工程マスタから工程配賦グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOperAlcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOperAlcGrp_GetList(row, info);//リストの取得
		getOperAlcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOperAlcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * OperAlcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOperAlcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getOperAlcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * OperAlcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOperAlcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OperAlcGrpCols.viewCols(), down, info);
	}

	/** 
	  * OperAlcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOperAlcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OperAlcGrpCols.sortPolicy());
	}


	/** 
	  * BpAlcGrp:取引先配賦グループ メインメソッド<p>
	  * 取引先マスタから取引先配賦グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpAlcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpAlcGrp_GetList(row, info);//リストの取得
		getBpAlcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpAlcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpAlcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpAlcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getBpAlcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpAlcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpAlcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpAlcGrpCols.viewCols(), down, info);
	}

	/** 
	  * BpAlcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpAlcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpAlcGrpCols.sortPolicy());
	}


	/** 
	  * CtgAlcGrp:品群配賦グループ メインメソッド<p>
	  * 原価品群マスタから品群配賦グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCtgAlcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCtgAlcGrp_GetList(row, info);//リストの取得
		getCtgAlcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCtgAlcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CtgAlcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCtgAlcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getCtgAlcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CtgAlcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtgAlcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CtgAlcGrpCols.viewCols(), down, info);
	}

	/** 
	  * CtgAlcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtgAlcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CtgAlcGrpCols.sortPolicy());
	}


	/** 
	  * ItmAlcGrp:品目配賦グループ メインメソッド<p>
	  * 品目マスタから品目配賦グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmAlcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmAlcGrp_GetList(row, info);//リストの取得
		getItmAlcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmAlcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmAlcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmAlcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getItmAlcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmAlcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmAlcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmAlcGrpCols.viewCols(), down, info);
	}

	/** 
	  * ItmAlcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmAlcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmAlcGrpCols.sortPolicy());
	}


	/** 
	  * RptCmpPtn:原価レポート比較パタン メインメソッド<p>
	  * 原価レポート比較マスタから比較パタン情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptCmpPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptCmpPtn_GetList(row, info);//リストの取得
		getRptCmpPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptCmpPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptCmpPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptCmpPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getRptCmpPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptCmpPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptCmpPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptCmpPtnCols.viewCols(), down, info);
	}

	/** 
	  * RptCmpPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptCmpPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptCmpPtnCols.sortPolicy());
	}


	/** 
	  * RptCmpCol:原価レポート比較項目 メインメソッド<p>
	  * 原価レポート比較構成マスタから項目情報を全件取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptCmpCol(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptCmpCol_GetList(row, info);//リストの取得
		getRptCmpCol_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptCmpCol_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptCmpCol:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptCmpCol_GetList(MCRow row, MCEventInfo info){
		return getList("getRptCmpCol", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptCmpCol:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptCmpCol_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptCmpColCols.viewCols(), down, info);
	}

	/** 
	  * RptCmpCol:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptCmpCol_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptCmpColCols.sortPolicy());
	}


	/** 
	  * CalcGrpRptCmpConf:計算グループ（原価レポート比較構成マスタ） メインメソッド<p>
	  * 計算グループ情報を計算グループレポートマスタから取得する<br>
原価レポート比較マスタに存在するものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcGrpRptCmpConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcGrpRptCmpConf_GetList(row, info);//リストの取得
		getCalcGrpRptCmpConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcGrpRptCmpConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcGrpRptCmpConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcGrpRptCmpConf_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcGrpRptCmpConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcGrpRptCmpConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcGrpRptCmpConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcGrpRptCmpConfCols.viewCols(), down, info);
	}

	/** 
	  * CalcGrpRptCmpConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcGrpRptCmpConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcGrpRptCmpConfCols.sortPolicy());
	}


	/** 
	  * ColCmpPtnRptCmpConf:項目（原価レポート比較集計マスタ） メインメソッド<p>
	  * 原価レポート比較構成マスタから項目情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getColCmpPtnRptCmpConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getColCmpPtnRptCmpConf_GetList(row, info);//リストの取得
		getColCmpPtnRptCmpConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getColCmpPtnRptCmpConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ColCmpPtnRptCmpConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getColCmpPtnRptCmpConf_GetList(MCRow row, MCEventInfo info){
		return getList("getColCmpPtnRptCmpConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ColCmpPtnRptCmpConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getColCmpPtnRptCmpConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ColCmpPtnRptCmpConfCols.viewCols(), down, info);
	}

	/** 
	  * ColCmpPtnRptCmpConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getColCmpPtnRptCmpConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ColCmpPtnRptCmpConfCols.sortPolicy());
	}


	/** 
	  * RptPtn:原価レポートパタン メインメソッド<p>
	  * 原価レポートパタンマスタからレポートパタン情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptPtn_GetList(row, info);//リストの取得
		getRptPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getRptPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptPtnCols.viewCols(), down, info);
	}

	/** 
	  * RptPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptPtnCols.sortPolicy());
	}


	/** 
	  * LgOrMfgWg:ワーキンググループ（物流または製造） メインメソッド<p>
	  * 物流または製造機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLgOrMfgWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLgOrMfgWg_GetList(row, info);//リストの取得
		getLgOrMfgWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLgOrMfgWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LgOrMfgWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLgOrMfgWg_GetList(MCRow row, MCEventInfo info){
		return getList("getLgOrMfgWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LgOrMfgWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgOrMfgWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LgOrMfgWgCols.viewCols(), down, info);
	}

	/** 
	  * LgOrMfgWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgOrMfgWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LgOrMfgWgCols.sortPolicy());
	}


	/** 
	  * LgGrpForLoc:物流グループ（場所設定可） メインメソッド<p>
	  * 場所設定が可能な物流グループ情報を、物流グループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・ワーキンググループで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLgGrpForLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLgGrpForLoc_GetList(row, info);//リストの取得
		getLgGrpForLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLgGrpForLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LgGrpForLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLgGrpForLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getLgGrpForLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LgGrpForLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgGrpForLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LgGrpForLocCols.viewCols(), down, info);
	}

	/** 
	  * LgGrpForLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgGrpForLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LgGrpForLocCols.sortPolicy());
	}


	/** 
	  * RptKey:原価レポートキー メインメソッド<p>
	  * 原価レポートキーマスタから原価レポートキー情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptKey(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptKey_GetList(row, info);//リストの取得
		getRptKey_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptKey_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptKey:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptKey_GetList(MCRow row, MCEventInfo info){
		return getList("getRptKey", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptKey:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKey_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptKeyCols.viewCols(), down, info);
	}

	/** 
	  * RptKey:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKey_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptKeyCols.sortPolicy());
	}


	/** 
	  * RptKeyWithTyp:原価レポートキー（区分も表示） メインメソッド<p>
	  * レポートキー区分を含む原価レポートキー情報を、原価レポートキーマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptKeyWithTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptKeyWithTyp_GetList(row, info);//リストの取得
		getRptKeyWithTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptKeyWithTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptKeyWithTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptKeyWithTyp_GetList(MCRow row, MCEventInfo info){
		return getList("getRptKeyWithTyp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptKeyWithTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyWithTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptKeyWithTypCols.viewCols(), down, info);
	}

	/** 
	  * RptKeyWithTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyWithTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptKeyWithTypCols.sortPolicy());
	}


	/** 
	  * RptRow:原価レポート行 メインメソッド<p>
	  * 原価レポート構成マスタからレポート行情報を取得する<br>
引数のレポートパタンＣＤに「null」を指定した場合は「null」を返す<br>

	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptRow(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptRow_GetList(row, info);//リストの取得
		getRptRow_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptRow_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptRow:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptRow_GetList(MCRow row, MCEventInfo info){
		return getList("getRptRow", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptRow:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptRow_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptRowCols.viewCols(), down, info);
	}

	/** 
	  * RptRow:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptRow_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptRowCols.sortPolicy());
	}


	/** 
	  * CostCalcGrp:計算グループ（原価計算） メインメソッド<p>
	  * 計算区分に「2：原価計算（在庫対象外）」または「3：原価計算（在庫計算）」が設定されている計算グループ情報を、計算グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostCalcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostCalcGrp_GetList(row, info);//リストの取得
		getCostCalcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostCalcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostCalcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostCalcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getCostCalcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostCalcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCalcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostCalcGrpCols.viewCols(), down, info);
	}

	/** 
	  * CostCalcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCalcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostCalcGrpCols.sortPolicy());
	}


	/** 
	  * SlsItmGrpBtm:品目体系（最下層） メインメソッド<p>
	  * 販売品目体系マスタから品目体系情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsItmGrpBtm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsItmGrpBtm_GetList(row, info);//リストの取得
		getSlsItmGrpBtm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsItmGrpBtm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsItmGrpBtm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsItmGrpBtm_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsItmGrpBtm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsItmGrpBtm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsItmGrpBtm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsItmGrpBtmCols.viewCols(), down, info);
	}

	/** 
	  * SlsItmGrpBtm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsItmGrpBtm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsItmGrpBtmCols.sortPolicy());
	}


	/** 
	  * ArSttl:債権決済方法 メインメソッド<p>
	  * 債権に関する決済方法情報を、決済方法マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArSttl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArSttl_GetList(row, info);//リストの取得
		getArSttl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArSttl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArSttl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArSttl_GetList(MCRow row, MCEventInfo info){
		return getList("getArSttl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ArSttl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArSttlCols.viewCols(), down, info);
	}

	/** 
	  * ArSttl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArSttlCols.sortPolicy());
	}


	/** 
	  * InspPoint:検査項目 メインメソッド<p>
	  * 検査項目マスタから検査項目情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspPoint(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspPoint_GetList(row, info);//リストの取得
		getInspPoint_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspPoint_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspPoint:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspPoint_GetList(MCRow row, MCEventInfo info){
		return getList("getInspPoint", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * InspPoint:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspPoint_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspPointCols.viewCols(), down, info);
	}

	/** 
	  * InspPoint:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspPoint_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspPointCols.sortPolicy());
	}


	/** 
	  * ItmSub1:枝番１ メインメソッド<p>
	  * 以下の引数に対応する枝番１および品目情報を、品目マスタから取得する<br>
　品目、検索区分（品目入力補助検索区分）<br>
マスタ画面以外では使用できない<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmSub1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmSub1_GetList(row, info);//リストの取得
		getItmSub1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmSub1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmSub1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmSub1_GetList(MCRow row, MCEventInfo info){
		return getList("getItmSub1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmSub1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSub1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmSub1Cols.viewCols(), down, info);
	}

	/** 
	  * ItmSub1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmSub1Cols.sortPolicy());
	}


	/** 
	  * ItmSub2:枝番２ メインメソッド<p>
	  * 以下の引数に対応する枝番２および品目情報を、品目マスタから取得する<br>
　品目、枝番１、検索区分（品目入力補助検索区分）<br>
マスタ画面以外では使用できない<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmSub2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmSub2_GetList(row, info);//リストの取得
		getItmSub2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmSub2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmSub2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmSub2_GetList(MCRow row, MCEventInfo info){
		return getList("getItmSub2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmSub2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSub2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmSub2Cols.viewCols(), down, info);
	}

	/** 
	  * ItmSub2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmSub2Cols.sortPolicy());
	}


	/** 
	  * ItmSub3:枝番３ メインメソッド<p>
	  * 以下の引数に対応する枝番３および品目情報を、品目マスタから取得する<br>
　品目、枝番１、枝番２、検索区分（品目入力補助検索区分）<br>
マスタ画面以外では使用できない<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmSub3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmSub3_GetList(row, info);//リストの取得
		getItmSub3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmSub3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmSub3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmSub3_GetList(MCRow row, MCEventInfo info){
		return getList("getItmSub3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmSub3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSub3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmSub3Cols.viewCols(), down, info);
	}

	/** 
	  * ItmSub3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmSub3Cols.sortPolicy());
	}


	/** 
	  * PreAlcDptInTerm:配賦先部門パタン（期ごと） メインメソッド<p>
	  * 引数の期に対応する配賦先部門パタン情報を、一次配賦先部門マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcDptInTerm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcDptInTerm_GetList(row, info);//リストの取得
		getPreAlcDptInTerm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcDptInTerm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcDptInTerm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcDptInTerm_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcDptInTerm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcDptInTerm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcDptInTerm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcDptInTermCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcDptInTerm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcDptInTerm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcDptInTermCols.sortPolicy());
	}


	/** 
	  * RptKeyWithTypNotInRptKeyConf:原価レポートキー（レポートキー構成未登録） メインメソッド<p>
	  * 原価レポートキー構成マスタに未登録のレポートキー情報を、原価レポートキーマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptKeyWithTypNotInRptKeyConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptKeyWithTypNotInRptKeyConf_GetList(row, info);//リストの取得
		getRptKeyWithTypNotInRptKeyConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptKeyWithTypNotInRptKeyConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptKeyWithTypNotInRptKeyConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptKeyWithTypNotInRptKeyConf_GetList(MCRow row, MCEventInfo info){
		return getList("getRptKeyWithTypNotInRptKeyConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptKeyWithTypNotInRptKeyConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyWithTypNotInRptKeyConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptKeyWithTypNotInRptKeyConfCols.viewCols(), down, info);
	}

	/** 
	  * RptKeyWithTypNotInRptKeyConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyWithTypNotInRptKeyConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptKeyWithTypNotInRptKeyConfCols.sortPolicy());
	}


	/** 
	  * RptPtnNotInRptConf:原価レポートパタン（レポート構成未登録） メインメソッド<p>
	  * 原価レポート構成マスタに存在しないレポートパタン情報を、原価レポートパタンマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptPtnNotInRptConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptPtnNotInRptConf_GetList(row, info);//リストの取得
		getRptPtnNotInRptConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptPtnNotInRptConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptPtnNotInRptConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptPtnNotInRptConf_GetList(MCRow row, MCEventInfo info){
		return getList("getRptPtnNotInRptConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptPtnNotInRptConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptPtnNotInRptConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptPtnNotInRptConfCols.viewCols(), down, info);
	}

	/** 
	  * RptPtnNotInRptConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptPtnNotInRptConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptPtnNotInRptConfCols.sortPolicy());
	}


	/** 
	  * InspPtn:検査パタン メインメソッド<p>
	  * 検査パタンマスタから検査パタン情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspPtn_GetList(row, info);//リストの取得
		getInspPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getInspPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * InspPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspPtnCols.viewCols(), down, info);
	}

	/** 
	  * InspPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspPtnCols.sortPolicy());
	}


	/** 
	  * ProdOrSgaExpns:原価費目（製造・売上原価費目または販売・一般管理費目） メインメソッド<p>
	  * 費目区分に「1：製造・売上原価費目」または「2：販売・一般管理費目」が設定されている費目情報を、原価費目マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProdOrSgaExpns(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProdOrSgaExpns_GetList(row, info);//リストの取得
		getProdOrSgaExpns_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProdOrSgaExpns_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProdOrSgaExpns:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProdOrSgaExpns_GetList(MCRow row, MCEventInfo info){
		return getList("getProdOrSgaExpns", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ProdOrSgaExpns:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdOrSgaExpns_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProdOrSgaExpnsCols.viewCols(), down, info);
	}

	/** 
	  * ProdOrSgaExpns:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdOrSgaExpns_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProdOrSgaExpnsCols.sortPolicy());
	}


	/** 
	  * AlcRuleAlcPtnAsWk:配賦方法_配賦パタン（工数） メインメソッド<p>
	  * 配賦方法区分に「1:工数」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsWk(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcRuleAlcPtnAsWk_GetList(row, info);//リストの取得
		getAlcRuleAlcPtnAsWk_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcRuleAlcPtnAsWk_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcRuleAlcPtnAsWk:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcRuleAlcPtnAsWk_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcRuleAlcPtnAsWk", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcRuleAlcPtnAsWk:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsWk_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcRuleAlcPtnAsWkCols.viewCols(), down, info);
	}

	/** 
	  * AlcRuleAlcPtnAsWk:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsWk_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcRuleAlcPtnAsWkCols.sortPolicy());
	}


	/** 
	  * ExtSys:外部システム メインメソッド<p>
	  * 外部システムマスタから外部システム情報を取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtSys(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtSys_GetList(row, info);//リストの取得
		getExtSys_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtSys_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtSys:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtSys_GetList(MCRow row, MCEventInfo info){
		return getList("getExtSys", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ExtSys:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSys_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtSysCols.viewCols(), down, info);
	}

	/** 
	  * ExtSys:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSys_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtSysCols.sortPolicy());
	}


	/** 
	  * AprvRt:承認ルートパタン メインメソッド<p>
	  * 承認ルートパタンマスタから承認ルートパタン情報を取得する<br>
・承認機能区分で絞り込む場合は、aprv_func_typに承認機能区分を指定する<br>
　aprv_func_typに「null」を指定した場合は「null」を返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAprvRt(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAprvRt_GetList(row, info);//リストの取得
		getAprvRt_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAprvRt_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AprvRt:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAprvRt_GetList(MCRow row, MCEventInfo info){
		return getList("getAprvRt", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AprvRt:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvRt_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AprvRtCols.viewCols(), down, info);
	}

	/** 
	  * AprvRt:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvRt_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AprvRtCols.sortPolicy());
	}


	/** 
	  * LgOrMfgOrSlsWg:ワーキンググループ（物流または製造または販売） メインメソッド<p>
	  * 物流または製造または販売機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLgOrMfgOrSlsWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLgOrMfgOrSlsWg_GetList(row, info);//リストの取得
		getLgOrMfgOrSlsWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLgOrMfgOrSlsWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LgOrMfgOrSlsWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLgOrMfgOrSlsWg_GetList(MCRow row, MCEventInfo info){
		return getList("getLgOrMfgOrSlsWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LgOrMfgOrSlsWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgOrMfgOrSlsWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LgOrMfgOrSlsWgCols.viewCols(), down, info);
	}

	/** 
	  * LgOrMfgOrSlsWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgOrMfgOrSlsWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LgOrMfgOrSlsWgCols.sortPolicy());
	}


	/** 
	  * ItmInspPtn:品目検査パタン メインメソッド<p>
	  * 以下の引数に対応する検査パタン情報を、品目検査パタンマスタから取得する<br>
　品目、枝番１－３、適用日
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmInspPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmInspPtn_GetList(row, info);//リストの取得
		getItmInspPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmInspPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmInspPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmInspPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getItmInspPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmInspPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmInspPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmInspPtnCols.viewCols(), down, info);
	}

	/** 
	  * ItmInspPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmInspPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmInspPtnCols.sortPolicy());
	}


	/** 
	  * LgGrpNotForLoc:物流グループ（場所設定不可） メインメソッド<p>
	  * 場所設定が不可能な物流グループ情報を、物流グループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・ワーキンググループで絞り込む場合は、wg_cdにワーキンググループＣＤを指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLgGrpNotForLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLgGrpNotForLoc_GetList(row, info);//リストの取得
		getLgGrpNotForLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLgGrpNotForLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LgGrpNotForLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLgGrpNotForLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getLgGrpNotForLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LgGrpNotForLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgGrpNotForLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LgGrpNotForLocCols.viewCols(), down, info);
	}

	/** 
	  * LgGrpNotForLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgGrpNotForLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LgGrpNotForLocCols.sortPolicy());
	}


	/** 
	  * ItmInspPtnAsSpec:品目検査パタン（抜取規格検査） メインメソッド<p>
	  * 以下の引数に対応する検査パタン情報を、品目検査パタンマスタから取得する<br>
　品目、枝番１－３、適用日<br>
検査方法区分に「4:抜取規格検査」が設定されているものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmInspPtnAsSpec(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmInspPtnAsSpec_GetList(row, info);//リストの取得
		getItmInspPtnAsSpec_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmInspPtnAsSpec_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmInspPtnAsSpec:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmInspPtnAsSpec_GetList(MCRow row, MCEventInfo info){
		return getList("getItmInspPtnAsSpec", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmInspPtnAsSpec:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmInspPtnAsSpec_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmInspPtnAsSpecCols.viewCols(), down, info);
	}

	/** 
	  * ItmInspPtnAsSpec:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmInspPtnAsSpec_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmInspPtnAsSpecCols.sortPolicy());
	}


	/** 
	  * ShipTerm:出荷条件 メインメソッド<p>
	  * 出荷条件マスタに登録されている出荷条件ＣＤを取得する<br>
出荷元物流グループＣＤと出荷先物流グループＣＤを共に指定している場合、対応する出荷作業グループ情報も取得する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipTerm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipTerm_GetList(row, info);//リストの取得
		getShipTerm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipTerm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipTerm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipTerm_GetList(MCRow row, MCEventInfo info){
		return getList("getShipTerm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ShipTerm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipTerm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipTermCols.viewCols(), down, info);
	}

	/** 
	  * ShipTerm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipTerm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipTermCols.sortPolicy());
	}


	/** 
	  * MpsGrp:ＭＰＳグループ メインメソッド<p>
	  * ＭＰＳグループマスタからＭＰＳグループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMpsGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMpsGrp_GetList(row, info);//リストの取得
		getMpsGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMpsGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MpsGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMpsGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getMpsGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * MpsGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMpsGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MpsGrpCols.viewCols(), down, info);
	}

	/** 
	  * MpsGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMpsGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MpsGrpCols.sortPolicy());
	}


	/** 
	  * BomPtn:構成パタン メインメソッド<p>
	  * 構成表マスタから構成パタンを取得します。
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBomPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBomPtn_GetList(row, info);//リストの取得
		getBomPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBomPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BomPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBomPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getBomPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BomPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BomPtnCols.viewCols(), down, info);
	}

	/** 
	  * BomPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BomPtnCols.sortPolicy());
	}


	/** 
	  * BomPtnParChd:構成パタン（親子） メインメソッド<p>
	  * 構成表マスタから構成パタン（親・子どちらに登録されている構成パタン）を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBomPtnParChd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBomPtnParChd_GetList(row, info);//リストの取得
		getBomPtnParChd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBomPtnParChd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BomPtnParChd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBomPtnParChd_GetList(MCRow row, MCEventInfo info){
		return getList("getBomPtnParChd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BomPtnParChd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomPtnParChd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BomPtnParChdCols.viewCols(), down, info);
	}

	/** 
	  * BomPtnParChd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomPtnParChd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BomPtnParChdCols.sortPolicy());
	}


	/** 
	  * CtgGrp:品群グループ メインメソッド<p>
	  * 原価品群グループマスタから品群グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCtgGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCtgGrp_GetList(row, info);//リストの取得
		getCtgGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCtgGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CtgGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCtgGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getCtgGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CtgGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtgGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CtgGrpCols.viewCols(), down, info);
	}

	/** 
	  * CtgGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtgGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CtgGrpCols.sortPolicy());
	}


	/** 
	  * WkDay:勤務種類 メインメソッド<p>
	  * 勤務種類マスタから勤務種類情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWkDay(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWkDay_GetList(row, info);//リストの取得
		getWkDay_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWkDay_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WkDay:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWkDay_GetList(MCRow row, MCEventInfo info){
		return getList("getWkDay", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * WkDay:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWkDay_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WkDayCols.viewCols(), down, info);
	}

	/** 
	  * WkDay:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWkDay_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WkDayCols.sortPolicy());
	}


	/** 
	  * Rsrc:資源 メインメソッド<p>
	  * 資産マスタから資産情報を取得する<br>
引数の場所ＣＤを指定した場合は、場所マスタの資源ＣＤ１、資源ＣＤ２に設定されている資源ＣＤのみを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRsrc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRsrc_GetList(row, info);//リストの取得
		getRsrc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRsrc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Rsrc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRsrc_GetList(MCRow row, MCEventInfo info){
		return getList("getRsrc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Rsrc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRsrc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RsrcCols.viewCols(), down, info);
	}

	/** 
	  * Rsrc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRsrc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RsrcCols.sortPolicy());
	}


	/** 
	  * SetGrp:品揃グループ メインメソッド<p>
	  * 品揃グループマスタから品揃グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSetGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSetGrp_GetList(row, info);//リストの取得
		getSetGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSetGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SetGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSetGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getSetGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SetGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SetGrpCols.viewCols(), down, info);
	}

	/** 
	  * SetGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SetGrpCols.sortPolicy());
	}


	/** 
	  * PlmWg:ワーキンググループ（ＰＬＭ） メインメソッド<p>
	  * ＰＬＭ機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPlmWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPlmWg_GetList(row, info);//リストの取得
		getPlmWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPlmWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PlmWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPlmWg_GetList(MCRow row, MCEventInfo info){
		return getList("getPlmWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PlmWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPlmWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PlmWgCols.viewCols(), down, info);
	}

	/** 
	  * PlmWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPlmWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PlmWgCols.sortPolicy());
	}


	/** 
	  * StktkBizRsn:業務理由（棚卸） メインメソッド<p>
	  * 棚卸時に使用できる理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStktkBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStktkBizRsn_GetList(row, info);//リストの取得
		getStktkBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStktkBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StktkBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStktkBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getStktkBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StktkBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StktkBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * StktkBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StktkBizRsnCols.sortPolicy());
	}


	/** 
	  * ItmUnit:品目単位 メインメソッド<p>
	  * 以下の引数に対応する品目の単位情報を、品目単位マスタから取得する<br>
　品目、枝番１－３
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmUnit(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmUnit_GetList(row, info);//リストの取得
		getItmUnit_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmUnit_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmUnit:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmUnit_GetList(MCRow row, MCEventInfo info){
		return getList("getItmUnit", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmUnit:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmUnit_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmUnitCols.viewCols(), down, info);
	}

	/** 
	  * ItmUnit:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmUnit_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmUnitCols.sortPolicy());
	}


	/** 
	  * ItmVer:版 メインメソッド<p>
	  * 以下の引数に対応する品目の版情報を、版マスタから取得する<br>
　品目、枝番１－３<br>
工場・物流倉庫ＣＤに「null」指定した場合は「null」を返す<br>
工場・物流倉庫ＣＤが未指定の場合は、絞込み条件としては無効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmVer(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmVer_GetList(row, info);//リストの取得
		getItmVer_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmVer_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmVer:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmVer_GetList(MCRow row, MCEventInfo info){
		return getList("getItmVer", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmVer:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmVer_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmVerCols.viewCols(), down, info);
	}

	/** 
	  * ItmVer:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmVer_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmVerCols.sortPolicy());
	}


	/** 
	  * AltGrp:代替グループ メインメソッド<p>
	  * 引数のワーキンググループに対応する代替グループ情報を、代替グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAltGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAltGrp_GetList(row, info);//リストの取得
		getAltGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAltGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AltGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAltGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getAltGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AltGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAltGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AltGrpCols.viewCols(), down, info);
	}

	/** 
	  * AltGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAltGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AltGrpCols.sortPolicy());
	}


	/** 
	  * AltGrpBom:代替グループ（ＢＯＭ登録） メインメソッド<p>
	  * 引数のワーキンググループに対応する有効な代替グループ情報を、代替グループマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAltGrpBom(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAltGrpBom_GetList(row, info);//リストの取得
		getAltGrpBom_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAltGrpBom_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AltGrpBom:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAltGrpBom_GetList(MCRow row, MCEventInfo info){
		return getList("getAltGrpBom", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AltGrpBom:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAltGrpBom_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AltGrpBomCols.viewCols(), down, info);
	}

	/** 
	  * AltGrpBom:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAltGrpBom_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AltGrpBomCols.sortPolicy());
	}


	/** 
	  * ItmSpec:品目仕様 メインメソッド<p>
	  * 以下の引数に対応する品目仕様情報を、品目仕様マスタから取得する<br>
　品目、枝番１－３、品目枝番、品目仕様分類ＣＤ
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmSpec(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmSpec_GetList(row, info);//リストの取得
		getItmSpec_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmSpec_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmSpec:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmSpec_GetList(MCRow row, MCEventInfo info){
		return getList("getItmSpec", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmSpec:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSpec_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmSpecCols.viewCols(), down, info);
	}

	/** 
	  * ItmSpec:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSpec_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmSpecCols.sortPolicy());
	}


	/** 
	  * BpItm:取引先品目 メインメソッド<p>
	  * 以下の引数に対応する品目情報を、取引先品目マスタから取得する<br>
　適用日、取引先、品目枝番
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpItm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpItm_GetList(row, info);//リストの取得
		getBpItm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpItm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpItm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpItm_GetList(MCRow row, MCEventInfo info){
		return getList("getBpItm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpItm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpItm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpItmCols.viewCols(), down, info);
	}

	/** 
	  * BpItm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpItm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpItmCols.sortPolicy());
	}


	/** 
	  * ItmLcl:品目（ロケール別） メインメソッド<p>
	  * 以下の引数に対応するロケール別情報を、品目マスタ(ロケール別情報)から取得する<br>
　ロケールＣＤ、品目
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmLcl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmLcl_GetList(row, info);//リストの取得
		getItmLcl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmLcl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmLcl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmLcl_GetList(MCRow row, MCEventInfo info){
		return getList("getItmLcl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmLcl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmLcl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmLclCols.viewCols(), down, info);
	}

	/** 
	  * ItmLcl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmLcl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmLclCols.sortPolicy());
	}


	/** 
	  * ItmOper:品目工程 メインメソッド<p>
	  * 以下の引数に対応する品目工程情報を、品目工程マスタから取得する<br>
　品目、枝番１－３、場所<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmOper(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmOper_GetList(row, info);//リストの取得
		getItmOper_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmOper_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmOper:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmOper_GetList(MCRow row, MCEventInfo info){
		return getList("getItmOper", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmOper:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOper_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmOperCols.viewCols(), down, info);
	}

	/** 
	  * ItmOper:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOper_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmOperCols.sortPolicy());
	}


	/** 
	  * ItmDtlSub1:品目詳細（枝番１） メインメソッド<p>
	  * 引数の品目に対応する枝番１および品目詳細情報を、品目詳細マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlSub1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlSub1_GetList(row, info);//リストの取得
		getItmDtlSub1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlSub1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlSub1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlSub1_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlSub1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlSub1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlSub1Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlSub1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlSub1Cols.sortPolicy());
	}


	/** 
	  * ItmDtlSub2:品目詳細（枝番２） メインメソッド<p>
	  * 以下の引数に対応する枝番２および品目詳細情報を、品目詳細マスタから取得する<br>
　品目、枝番１
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlSub2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlSub2_GetList(row, info);//リストの取得
		getItmDtlSub2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlSub2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlSub2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlSub2_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlSub2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlSub2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlSub2Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlSub2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlSub2Cols.sortPolicy());
	}


	/** 
	  * ItmDtlSub3:品目詳細（枝番３） メインメソッド<p>
	  * 以下の引数に対応する枝番３および品目詳細情報を、品目詳細マスタから取得する<br>
　品目、枝番１、枝番2
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlSub3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlSub3_GetList(row, info);//リストの取得
		getItmDtlSub3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlSub3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlSub3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlSub3_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlSub3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlSub3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlSub3Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlSub3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlSub3Cols.sortPolicy());
	}


	/** 
	  * LossRsn:ロス理由 メインメソッド<p>
	  * 以下の引数に対応するロス理由情報を、ロス理由マスタから取得する<br>
　品目区分、品目区分詳細ＣＤ　
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLossRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLossRsn_GetList(row, info);//リストの取得
		getLossRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLossRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LossRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLossRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getLossRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LossRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLossRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LossRsnCols.viewCols(), down, info);
	}

	/** 
	  * LossRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLossRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LossRsnCols.sortPolicy());
	}


	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:業務理由（他勘定入庫、他勘定出庫、廃棄） メインメソッド<p>
	  * 理由情報を業務理由マスタから取得する<br>
引数で取得対象を指定した場合は、対応するソート順でソートされる<br>
（例：廃棄フラグがオンの場合は、廃棄ソート順でソート）<br>
ソート対象として採用されるのは1つのフラグのみであり、以下の優先順で採用される<br>
　廃棄、他勘定出庫、他勘定入庫<br>
・他勘定入庫理由を取得対象とする場合は、acxfr_gr_flgに「true」を指定する<br>
・他勘定出庫理由を取得対象とする場合は、acxfr_gi_flgに「true」を指定する<br>
・廃棄理由を取得対象とする場合は、disp_flgに「true」を指定する<br>

	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcxfrGrAcxfrGiDispBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcxfrGrAcxfrGiDispBizRsn_GetList(row, info);//リストの取得
		getAcxfrGrAcxfrGiDispBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcxfrGrAcxfrGiDispBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcxfrGrAcxfrGiDispBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getAcxfrGrAcxfrGiDispBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxfrGrAcxfrGiDispBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcxfrGrAcxfrGiDispBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * AcxfrGrAcxfrGiDispBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxfrGrAcxfrGiDispBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcxfrGrAcxfrGiDispBizRsnCols.sortPolicy());
	}


	/** 
	  * ArrBizRsn:業務理由（仕入、売上返品、移送） メインメソッド<p>
	  * 理由情報を業務理由マスタから取得する<br>
取得対象を指定した場合は、対応するソート順でソートされる（経費購買理由は対象外）<br>
（例：仕入フラグがオンの場合は、仕入ソート順でソート）<br>
ソート対象として採用されるのは1つのフラグのみであり、以下の優先順で採用される<br>
　移送、売上返品、仕入<br>
・仕入理由を取得対象とする場合は、purc_flgに「true」を指定する<br>
・経費購買理由を取得対象とする場合は、xpns_purc_flgに「true」を指定する<br>
・売上返品理由を取得対象とする場合は、sls_rtn_flgに「true」を指定する<br>
・移送対象理由を取得対象とする場合は、xfr_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArrBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArrBizRsn_GetList(row, info);//リストの取得
		getArrBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArrBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArrBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArrBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getArrBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ArrBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArrBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArrBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * ArrBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArrBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArrBizRsnCols.sortPolicy());
	}


	/** 
	  * ShipBizRsn:業務理由（売上、移送） メインメソッド<p>
	  * 理由情報を業務理由マスタから取得する<br>
取得対象を指定した場合は、対応するソート順でソートされる<br>
（例：売上フラグがオンの場合は、売上ソート順でソート）<br>
ソート対象として採用されるのは1つのフラグのみであり、以下の優先順で採用される<br>
　移送、売上<br>
・売上理由を取得対象とする場合は、sls_flgに「true」を指定する<br>
・移送対象理由を取得対象とする場合は、xfr_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipBizRsn_GetList(row, info);//リストの取得
		getShipBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getShipBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ShipBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * ShipBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipBizRsnCols.sortPolicy());
	}


	/** 
	  * SlsAllBizRsn:業務理由（売上、売上返品、売上調整） メインメソッド<p>
	  * 理由情報を業務理由マスタから取得する<br>
取得対象を指定した場合は、対応するソート順でソートされる<br>
（例：売上フラグがオンの場合は、売上ソート順でソート）<br>
ソート対象として複数のフラグを指定した場合は、業務理由ＣＤでソートする<br>
・売上理由を取得対象とする場合は、sls_flgに「true」を指定する<br>
・売上返品理由を取得対象とする場合は、sls_rtn_flgに「true」を指定する<br>
・売上調整理由を取得対象とする場合は、sls_dscnt_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsAllBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsAllBizRsn_GetList(row, info);//リストの取得
		getSlsAllBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsAllBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsAllBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsAllBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsAllBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsAllBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAllBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsAllBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * SlsAllBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAllBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsAllBizRsnCols.sortPolicy());
	}


	/** 
	  * ShipWk:出荷作業 メインメソッド<p>
	  * 出荷作業マスタから出荷作業情報を取得する<br>
出荷作業グループＣＤと出荷予定時刻で絞り込める
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipWk(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipWk_GetList(row, info);//リストの取得
		getShipWk_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipWk_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipWk:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipWk_GetList(MCRow row, MCEventInfo info){
		return getList("getShipWk", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ShipWk:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipWk_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipWkCols.viewCols(), down, info);
	}

	/** 
	  * ShipWk:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipWk_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipWkCols.sortPolicy());
	}


	/** 
	  * ShipWkGrp:出荷作業グループ メインメソッド<p>
	  * 出荷作業グループマスタから出荷作業グループ情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipWkGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipWkGrp_GetList(row, info);//リストの取得
		getShipWkGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipWkGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipWkGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipWkGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getShipWkGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ShipWkGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipWkGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipWkGrpCols.viewCols(), down, info);
	}

	/** 
	  * ShipWkGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipWkGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipWkGrpCols.sortPolicy());
	}


	/** 
	  * InptAcxfrBizRsn:投入用他勘定振替理由 メインメソッド<p>
	  * 業務理由マスタから投入用他勘定振替理由情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptAcxfrBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptAcxfrBizRsn_GetList(row, info);//リストの取得
		getInptAcxfrBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptAcxfrBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptAcxfrBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptAcxfrBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getInptAcxfrBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * InptAcxfrBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptAcxfrBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptAcxfrBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * InptAcxfrBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptAcxfrBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptAcxfrBizRsnCols.sortPolicy());
	}


	/** 
	  * ArSttlNotRcvSchd:債権決済方法（貸方相殺源泉税振替以外） メインメソッド<p>
	  * 債権決済方法フラグが設定されている、かつ債権決済方法区分に「５：相殺（貸方）」「6：源泉税」「７：振替」以外が設定されている決済方法情報を、決済方法マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArSttlNotRcvSchd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArSttlNotRcvSchd_GetList(row, info);//リストの取得
		getArSttlNotRcvSchd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArSttlNotRcvSchd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArSttlNotRcvSchd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArSttlNotRcvSchd_GetList(MCRow row, MCEventInfo info){
		return getList("getArSttlNotRcvSchd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ArSttlNotRcvSchd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttlNotRcvSchd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArSttlNotRcvSchdCols.viewCols(), down, info);
	}

	/** 
	  * ArSttlNotRcvSchd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttlNotRcvSchd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArSttlNotRcvSchdCols.sortPolicy());
	}


	/** 
	  * SlsItmGrpLvl:販売品目体系階層 メインメソッド<p>
	  * 販売品目体系マスタから販売品目体系階層を取得する<br>
販売品目体系階層は重複を省いて取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsItmGrpLvl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsItmGrpLvl_GetList(row, info);//リストの取得
		getSlsItmGrpLvl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsItmGrpLvl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsItmGrpLvl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsItmGrpLvl_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsItmGrpLvl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsItmGrpLvl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsItmGrpLvl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsItmGrpLvlCols.viewCols(), down, info);
	}

	/** 
	  * SlsItmGrpLvl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsItmGrpLvl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsItmGrpLvlCols.sortPolicy());
	}


	/** 
	  * ParmRemark:システムパラメータ概要 メインメソッド<p>
	  * システムパラメータ概要テーブルからシステムパラメータ概要情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getParmRemark(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getParmRemark_GetList(row, info);//リストの取得
		getParmRemark_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getParmRemark_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ParmRemark:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getParmRemark_GetList(MCRow row, MCEventInfo info){
		return getList("getParmRemark", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ParmRemark:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getParmRemark_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ParmRemarkCols.viewCols(), down, info);
	}

	/** 
	  * ParmRemark:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getParmRemark_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ParmRemarkCols.sortPolicy());
	}


	/** 
	  * ParmBizGrp:システムパラメータ業務分類 メインメソッド<p>
	  * システムパラメータ概要テーブルから業務分類情報を取得する<br>
業務分類は重複を省いて取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getParmBizGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getParmBizGrp_GetList(row, info);//リストの取得
		getParmBizGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getParmBizGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ParmBizGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getParmBizGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getParmBizGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ParmBizGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getParmBizGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ParmBizGrpCols.viewCols(), down, info);
	}

	/** 
	  * ParmBizGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getParmBizGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ParmBizGrpCols.sortPolicy());
	}


	/** 
	  * DptForEndDtChk:部門（適用終了日チェック用） メインメソッド<p>
	  * 適用開始日と適用終了日に対応する部門ＣＤを部門マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDptForEndDtChk(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDptForEndDtChk_GetList(row, info);//リストの取得
		getDptForEndDtChk_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDptForEndDtChk_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DptForEndDtChk:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDptForEndDtChk_GetList(MCRow row, MCEventInfo info){
		return getList("getDptForEndDtChk", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DptForEndDtChk:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptForEndDtChk_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptForEndDtChkCols.viewCols(), down, info);
	}

	/** 
	  * DptForEndDtChk:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptForEndDtChk_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptForEndDtChkCols.sortPolicy());
	}


	/** 
	  * ExtSysEdi:外部システム（ＥＤＩ） メインメソッド<p>
	  * 外部システム区分が「1：ＥＤＩ」「6：ＥＤＩ（ＭＣＦ）」である外部システム情報を、外部システムマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtSysEdi(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtSysEdi_GetList(row, info);//リストの取得
		getExtSysEdi_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtSysEdi_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtSysEdi:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtSysEdi_GetList(MCRow row, MCEventInfo info){
		return getList("getExtSysEdi", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ExtSysEdi:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysEdi_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtSysEdiCols.viewCols(), down, info);
	}

	/** 
	  * ExtSysEdi:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysEdi_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtSysEdiCols.sortPolicy());
	}


	/** 
	  * ApSttl:債務決済方法 メインメソッド<p>
	  * 債務に関する決済方法情報を、決済方法マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApSttl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApSttl_GetList(row, info);//リストの取得
		getApSttl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApSttl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApSttl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApSttl_GetList(MCRow row, MCEventInfo info){
		return getList("getApSttl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ApSttl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSttl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApSttlCols.viewCols(), down, info);
	}

	/** 
	  * ApSttl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSttl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApSttlCols.sortPolicy());
	}


	/** 
	  * ItmDtlPurcUpriSub1:品目詳細（購買単価用）（枝番１） メインメソッド<p>
	  * 引数の品目に対応する枝番１および品目詳細情報(購買単価に使用するもの)を、品目詳細マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlPurcUpriSub1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlPurcUpriSub1_GetList(row, info);//リストの取得
		getItmDtlPurcUpriSub1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlPurcUpriSub1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlPurcUpriSub1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlPurcUpriSub1_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlPurcUpriSub1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlPurcUpriSub1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpriSub1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlPurcUpriSub1Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlPurcUpriSub1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpriSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlPurcUpriSub1Cols.sortPolicy());
	}


	/** 
	  * ItmDtlPurcUpriSub2:品目詳細（購買単価用）（枝番２） メインメソッド<p>
	  * 以下の引数に対応する枝番２および品目詳細情報(購買単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlPurcUpriSub2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlPurcUpriSub2_GetList(row, info);//リストの取得
		getItmDtlPurcUpriSub2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlPurcUpriSub2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlPurcUpriSub2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlPurcUpriSub2_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlPurcUpriSub2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlPurcUpriSub2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpriSub2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlPurcUpriSub2Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlPurcUpriSub2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpriSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlPurcUpriSub2Cols.sortPolicy());
	}


	/** 
	  * ItmDtlPurcUpriSub3:品目詳細（購買単価用）（枝番３） メインメソッド<p>
	  * 以下の引数に対応する枝番３および品目詳細情報(購買単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１、枝番2
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlPurcUpriSub3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlPurcUpriSub3_GetList(row, info);//リストの取得
		getItmDtlPurcUpriSub3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlPurcUpriSub3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlPurcUpriSub3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlPurcUpriSub3_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlPurcUpriSub3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlPurcUpriSub3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpriSub3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlPurcUpriSub3Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlPurcUpriSub3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpriSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlPurcUpriSub3Cols.sortPolicy());
	}


	/** 
	  * ItmDtlProcUpriSub1:品目詳細（加工単価用）（枝番１） メインメソッド<p>
	  * 引数の品目に対応する枝番１および品目詳細情報(加工単価に使用するもの)を、品目詳細マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlProcUpriSub1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlProcUpriSub1_GetList(row, info);//リストの取得
		getItmDtlProcUpriSub1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlProcUpriSub1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlProcUpriSub1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlProcUpriSub1_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlProcUpriSub1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlProcUpriSub1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpriSub1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlProcUpriSub1Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlProcUpriSub1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpriSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlProcUpriSub1Cols.sortPolicy());
	}


	/** 
	  * ItmDtlProcUpriSub2:品目詳細（加工単価用）（枝番２） メインメソッド<p>
	  * 以下の引数に対応する枝番２および品目詳細情報(加工単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlProcUpriSub2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlProcUpriSub2_GetList(row, info);//リストの取得
		getItmDtlProcUpriSub2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlProcUpriSub2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlProcUpriSub2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlProcUpriSub2_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlProcUpriSub2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlProcUpriSub2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpriSub2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlProcUpriSub2Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlProcUpriSub2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpriSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlProcUpriSub2Cols.sortPolicy());
	}


	/** 
	  * ItmDtlProcUpriSub3:品目詳細（加工単価用）（枝番３） メインメソッド<p>
	  * 以下の引数に対応する枝番３および品目詳細情報(加工単価に使用するもの)を、品目詳細マスタから取得する<br>
　品目、枝番１、枝番2
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlProcUpriSub3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlProcUpriSub3_GetList(row, info);//リストの取得
		getItmDtlProcUpriSub3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlProcUpriSub3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlProcUpriSub3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlProcUpriSub3_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlProcUpriSub3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlProcUpriSub3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpriSub3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlProcUpriSub3Cols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlProcUpriSub3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpriSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlProcUpriSub3Cols.sortPolicy());
	}


	/** 
	  * CostWg:ワーキンググループ（原価用） メインメソッド<p>
	  * 販売、物流、製造、購買、いずれかの機能を持つワーキンググループ情報を、ワーキンググループマスタから取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostWg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostWg_GetList(row, info);//リストの取得
		getCostWg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostWg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostWg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostWg_GetList(MCRow row, MCEventInfo info){
		return getList("getCostWg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostWg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostWg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostWgCols.viewCols(), down, info);
	}

	/** 
	  * CostWg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostWg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostWgCols.sortPolicy());
	}


	/** 
	  * RptPtnInCalcRptPtn:原価レポートパタン（計算グループレポートマスタ） メインメソッド<p>
	  * 引数の計算グループに対応する原価レポートキー情報を、計算グループレポートマスタから取得する<br>
原価レポートキーマスタにも存在するものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptPtnInCalcRptPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptPtnInCalcRptPtn_GetList(row, info);//リストの取得
		getRptPtnInCalcRptPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptPtnInCalcRptPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptPtnInCalcRptPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptPtnInCalcRptPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getRptPtnInCalcRptPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptPtnInCalcRptPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptPtnInCalcRptPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptPtnInCalcRptPtnCols.viewCols(), down, info);
	}

	/** 
	  * RptPtnInCalcRptPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptPtnInCalcRptPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptPtnInCalcRptPtnCols.sortPolicy());
	}


	/** 
	  * RptKeyWithTypInCalcRptPtn:原価レポートキー（計算グループレポートマスタ） メインメソッド<p>
	  * 以下の引数に対応する原価レポートキー情報を、計算グループレポートマスタから取得する<br>
　計算グループ、レポートパタン<br>
原価レポートキーマスタからレポートキー区分を取得できるものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptKeyWithTypInCalcRptPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptKeyWithTypInCalcRptPtn_GetList(row, info);//リストの取得
		getRptKeyWithTypInCalcRptPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptKeyWithTypInCalcRptPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptKeyWithTypInCalcRptPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptKeyWithTypInCalcRptPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getRptKeyWithTypInCalcRptPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * RptKeyWithTypInCalcRptPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyWithTypInCalcRptPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptKeyWithTypInCalcRptPtnCols.viewCols(), down, info);
	}

	/** 
	  * RptKeyWithTypInCalcRptPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyWithTypInCalcRptPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptKeyWithTypInCalcRptPtnCols.sortPolicy());
	}


	/** 
	  * AlcRuleAlcPtnAsInptQty:配賦方法_配賦パタン（投入数量） メインメソッド<p>
	  * 配賦方法区分に「6:投入数量」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す<br>
termに「null」を指定した場合はnullを返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsInptQty(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcRuleAlcPtnAsInptQty_GetList(row, info);//リストの取得
		getAlcRuleAlcPtnAsInptQty_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcRuleAlcPtnAsInptQty_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcRuleAlcPtnAsInptQty:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcRuleAlcPtnAsInptQty_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcRuleAlcPtnAsInptQty", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcRuleAlcPtnAsInptQty:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsInptQty_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcRuleAlcPtnAsInptQtyCols.viewCols(), down, info);
	}

	/** 
	  * AlcRuleAlcPtnAsInptQty:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsInptQty_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcRuleAlcPtnAsInptQtyCols.sortPolicy());
	}


	/** 
	  * AlcRuleAlcPtnAsOtherVal:配賦方法_配賦パタン（任意配賦基準値） メインメソッド<p>
	  * 配賦方法区分に「7:任意配賦基準値」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す<br>
termに「null」を指定した場合はnullを返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcRuleAlcPtnAsOtherVal(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcRuleAlcPtnAsOtherVal_GetList(row, info);//リストの取得
		getAlcRuleAlcPtnAsOtherVal_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcRuleAlcPtnAsOtherVal_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcRuleAlcPtnAsOtherVal:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcRuleAlcPtnAsOtherVal_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcRuleAlcPtnAsOtherVal", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcRuleAlcPtnAsOtherVal:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsOtherVal_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcRuleAlcPtnAsOtherValCols.viewCols(), down, info);
	}

	/** 
	  * AlcRuleAlcPtnAsOtherVal:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleAlcPtnAsOtherVal_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcRuleAlcPtnAsOtherValCols.sortPolicy());
	}


	/** 
	  * AlcTgtAlcPtnAsAlc:配賦対象区分_配賦パタン（汎用配賦） メインメソッド<p>
	  * 配賦方法区分に「5:汎用配賦」が設定されている配賦パタン情報を、配賦方法マスタから取得する<br>
・期で絞り込む場合は、以下の設定をする<br>
　　期を指定する場合：termに期を指定する（mode_this_term_flgは無効になる）<br>
　　運用期を使用する場合：termを未指定にし、mode_this_term_flgに「true」を指定する<br>
　※termに「null」を指定した場合は「null」を返す<br>
上記のいずれの条件も指定しない場合はnullを返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcTgtAlcPtnAsAlc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcTgtAlcPtnAsAlc_GetList(row, info);//リストの取得
		getAlcTgtAlcPtnAsAlc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcTgtAlcPtnAsAlc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcTgtAlcPtnAsAlc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcTgtAlcPtnAsAlc_GetList(MCRow row, MCEventInfo info){
		return getList("getAlcTgtAlcPtnAsAlc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AlcTgtAlcPtnAsAlc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcTgtAlcPtnAsAlc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcTgtAlcPtnAsAlcCols.viewCols(), down, info);
	}

	/** 
	  * AlcTgtAlcPtnAsAlc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcTgtAlcPtnAsAlc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcTgtAlcPtnAsAlcCols.sortPolicy());
	}


	/** 
	  * ActPtn:計算実行パタン メインメソッド<p>
	  * 計算実行パタンマスタから計算実行パタンを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getActPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getActPtn_GetList(row, info);//リストの取得
		getActPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getActPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ActPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getActPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getActPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ActPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getActPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ActPtnCols.viewCols(), down, info);
	}

	/** 
	  * ActPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getActPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ActPtnCols.sortPolicy());
	}


	/** 
	  * CostMenuNotInMenuConfig:原価メニュー（原価メニュー構成未登録） メインメソッド<p>
	  * 原価メニュー構成マスタに未登録のメニューを、原価メニューマスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostMenuNotInMenuConfig(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostMenuNotInMenuConfig_GetList(row, info);//リストの取得
		getCostMenuNotInMenuConfig_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostMenuNotInMenuConfig_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostMenuNotInMenuConfig:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostMenuNotInMenuConfig_GetList(MCRow row, MCEventInfo info){
		return getList("getCostMenuNotInMenuConfig", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostMenuNotInMenuConfig:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostMenuNotInMenuConfig_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostMenuNotInMenuConfigCols.viewCols(), down, info);
	}

	/** 
	  * CostMenuNotInMenuConfig:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostMenuNotInMenuConfig_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostMenuNotInMenuConfigCols.sortPolicy());
	}


	/** 
	  * AcSlipTypInCostSlipJnl:会計伝票区分（原価会計伝票区分仕訳マスタ登録済） メインメソッド<p>
	  * 原価会計伝票区分仕訳マスタから会計伝票区分を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSlipTypInCostSlipJnl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSlipTypInCostSlipJnl_GetList(row, info);//リストの取得
		getAcSlipTypInCostSlipJnl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSlipTypInCostSlipJnl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSlipTypInCostSlipJnl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSlipTypInCostSlipJnl_GetList(MCRow row, MCEventInfo info){
		return getList("getAcSlipTypInCostSlipJnl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AcSlipTypInCostSlipJnl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSlipTypInCostSlipJnl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSlipTypInCostSlipJnlCols.viewCols(), down, info);
	}

	/** 
	  * AcSlipTypInCostSlipJnl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSlipTypInCostSlipJnl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSlipTypInCostSlipJnlCols.sortPolicy());
	}


	/** 
	  * CostIoInCalcCostIo:受払表（計算グループ受払表マスタ） メインメソッド<p>
	  * 引数の計算グループに対応する受払表ＩＤを、計算グループ受払表マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostIoInCalcCostIo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostIoInCalcCostIo_GetList(row, info);//リストの取得
		getCostIoInCalcCostIo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostIoInCalcCostIo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostIoInCalcCostIo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostIoInCalcCostIo_GetList(MCRow row, MCEventInfo info){
		return getList("getCostIoInCalcCostIo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostIoInCalcCostIo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoInCalcCostIo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostIoInCalcCostIoCols.viewCols(), down, info);
	}

	/** 
	  * CostIoInCalcCostIo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoInCalcCostIo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostIoInCalcCostIoCols.sortPolicy());
	}


	/** 
	  * StkEval:在庫評価 メインメソッド<p>
	  * 在庫評価マスタから在庫評価情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkEval(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkEval_GetList(row, info);//リストの取得
		getStkEval_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkEval_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkEval:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkEval_GetList(MCRow row, MCEventInfo info){
		return getList("getStkEval", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StkEval:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkEval_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkEvalCols.viewCols(), down, info);
	}

	/** 
	  * StkEval:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkEval_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkEvalCols.sortPolicy());
	}


	/** 
	  * InptBizRsn:業務理由（投入） メインメソッド<p>
	  * 投入データに使用する理由情報を、業務理由マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptBizRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptBizRsn_GetList(row, info);//リストの取得
		getInptBizRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptBizRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptBizRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptBizRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getInptBizRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * InptBizRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptBizRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptBizRsnCols.viewCols(), down, info);
	}

	/** 
	  * InptBizRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptBizRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptBizRsnCols.sortPolicy());
	}


	/** 
	  * FixCalcGrp:計算グループ（確定用） メインメソッド<p>
	  * 以下の全てに合致する計算グループ情報を計算グループマスタから取得する<br>
・計算区分に「2:原価計算（在庫対象外）」「3:原価計算（在庫計算）」「4.その他」のいずれかが設定されている<br>
・一次配賦計算区分に「2.計算」が設定されている
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getFixCalcGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getFixCalcGrp_GetList(row, info);//リストの取得
		getFixCalcGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getFixCalcGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * FixCalcGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getFixCalcGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getFixCalcGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * FixCalcGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFixCalcGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(FixCalcGrpCols.viewCols(), down, info);
	}

	/** 
	  * FixCalcGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFixCalcGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(FixCalcGrpCols.sortPolicy());
	}


	/** 
	  * SiteCo:倉庫事業者 メインメソッド<p>
	  * 倉庫事業者マスタから倉庫事業者情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSiteCo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSiteCo_GetList(row, info);//リストの取得
		getSiteCo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSiteCo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SiteCo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSiteCo_GetList(MCRow row, MCEventInfo info){
		return getList("getSiteCo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SiteCo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSiteCo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SiteCoCols.viewCols(), down, info);
	}

	/** 
	  * SiteCo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSiteCo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SiteCoCols.sortPolicy());
	}


	/** 
	  * ExtSysScm:外部システム（ＳＣＭ） メインメソッド<p>
	  * 外部システム区分が「2：ＳＣＭ」「7：ＳＣＭ（ＭＤ）」である外部システム情報を、外部システムマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtSysScm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtSysScm_GetList(row, info);//リストの取得
		getExtSysScm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtSysScm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtSysScm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtSysScm_GetList(MCRow row, MCEventInfo info){
		return getList("getExtSysScm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ExtSysScm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysScm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtSysScmCols.viewCols(), down, info);
	}

	/** 
	  * ExtSysScm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysScm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtSysScmCols.sortPolicy());
	}


	/** 
	  * LgCtl:物流制御情報 メインメソッド<p>
	  * 物流制御マスタから物流制御情報を取得する<br>
出荷条件ＣＤが指定され、出荷条件ＣＤが一致する物流制御マスタが取得できない場合は、出荷条件ＣＤがNULL文字の物流制御マスタを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLgCtl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLgCtl_GetList(row, info);//リストの取得
		getLgCtl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLgCtl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LgCtl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLgCtl_GetList(MCRow row, MCEventInfo info){
		return getList("getLgCtl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LgCtl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgCtl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LgCtlCols.viewCols(), down, info);
	}

	/** 
	  * LgCtl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLgCtl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LgCtlCols.sortPolicy());
	}


	/** 
	  * ApSttlPaySchdCtl:債務決済方法（支払予定制御） メインメソッド<p>
	  * 債務決済方法フラグが設定されている、かつ下記以外の債務決済区分が設定されている決済方法情報を、決済方法マスタから取得する<br>
「7：源泉税」、「A：照合済残高振替払出」、「B：照合済残高振替受入」、「C：未照合残高振替払出」、「D：未照合残高振替受入」
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApSttlPaySchdCtl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApSttlPaySchdCtl_GetList(row, info);//リストの取得
		getApSttlPaySchdCtl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApSttlPaySchdCtl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApSttlPaySchdCtl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApSttlPaySchdCtl_GetList(MCRow row, MCEventInfo info){
		return getList("getApSttlPaySchdCtl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ApSttlPaySchdCtl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSttlPaySchdCtl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApSttlPaySchdCtlCols.viewCols(), down, info);
	}

	/** 
	  * ApSttlPaySchdCtl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSttlPaySchdCtl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApSttlPaySchdCtlCols.sortPolicy());
	}


	/** 
	  * StrgTgtReport:保存対象帳票 メインメソッド<p>
	  * 保存対象帳票マスタから帳票ＩＤを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStrgTgtReport(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStrgTgtReport_GetList(row, info);//リストの取得
		getStrgTgtReport_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStrgTgtReport_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StrgTgtReport:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStrgTgtReport_GetList(MCRow row, MCEventInfo info){
		return getList("getStrgTgtReport", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StrgTgtReport:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStrgTgtReport_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StrgTgtReportCols.viewCols(), down, info);
	}

	/** 
	  * StrgTgtReport:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStrgTgtReport_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StrgTgtReportCols.sortPolicy());
	}


	/** 
	  * ExtSysAc:外部システム（ＡＣ） メインメソッド<p>
	  * 外部システム区分が「5：会計」「A：会計（ＳＡＰ）」である外部システム情報を、外部システムマスタから取得する<br>
・NULL文字を使用したい場合は、mode_nullval_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtSysAc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtSysAc_GetList(row, info);//リストの取得
		getExtSysAc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtSysAc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtSysAc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtSysAc_GetList(MCRow row, MCEventInfo info){
		return getList("getExtSysAc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ExtSysAc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysAc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtSysAcCols.viewCols(), down, info);
	}

	/** 
	  * ExtSysAc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysAc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtSysAcCols.sortPolicy());
	}


	/** 
	  * LocaleEntry:ロケールエントリ メインメソッド<p>
	  * システムで利用可能なロケールのリストを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLocaleEntry(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLocaleEntry_GetList(row, info);//リストの取得
		getLocaleEntry_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLocaleEntry_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LocaleEntry:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLocaleEntry_GetList(MCRow row, MCEventInfo info){
		return null;
	}
	/** 
	  * LocaleEntry:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocaleEntry_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LocaleEntryCols.viewCols(), down, info);
	}

	/** 
	  * LocaleEntry:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocaleEntry_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LocaleEntryCols.sortPolicy());
	}


	/** 
	  * UsrComTyp:社員区分 メインメソッド<p>
	  * 社員区分を表す定数を取得する<br>
社員区分：社員か社外者かを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getUsrComTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getUsrComTyp_GetList(row, info);//リストの取得
		getUsrComTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getUsrComTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * UsrComTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getUsrComTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_USR_COM_TYP.list(row);
	}
	/** 
	  * UsrComTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUsrComTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(UsrComTypCols.viewCols(), down, info);
	}

	/** 
	  * UsrComTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUsrComTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(UsrComTypCols.sortPolicy());
	}


	/** 
	  * AcSlipTyp:会計伝票区分 メインメソッド<p>
	  * 会計伝票区分を表す定数を取得する<br>
会計伝票区分：原価・会計ＩＦ用データに対する種類を表す<br>
属性値が「true」の定数に絞り込む場合は、ac_typ_atrに属性名を指定する<br>
<br>
引数設定例）<br>
row.setStringNE(AcSlipTypCols.$i_ac_typ_atr, MAC_AC_SLIP_TYP.$IS_TRAN_TYP)
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSlipTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSlipTyp_GetList(row, info);//リストの取得
		getAcSlipTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSlipTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSlipTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSlipTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AC_SLIP_TYP.list(row);
	}
	/** 
	  * AcSlipTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSlipTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSlipTypCols.viewCols(), down, info);
	}

	/** 
	  * AcSlipTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSlipTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSlipTypCols.sortPolicy());
	}


	/** 
	  * DcTyp:貸借区分 メインメソッド<p>
	  * 貸借区分を表す定数を取得する<br>
貸借区分：貸借を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDcTyp_GetList(row, info);//リストの取得
		getDcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DC_TYP.list(row);
	}
	/** 
	  * DcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DcTypCols.viewCols(), down, info);
	}

	/** 
	  * DcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DcTypCols.sortPolicy());
	}


	/** 
	  * AcTyp:勘定科目区分 メインメソッド<p>
	  * 勘定科目区分を表す定数を取得する<br>
勘定科目区分：勘定科目の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcTyp_GetList(row, info);//リストの取得
		getAcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AC_TYP.list(row);
	}
	/** 
	  * AcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcTypCols.viewCols(), down, info);
	}

	/** 
	  * AcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcTypCols.sortPolicy());
	}


	/** 
	  * AcIfTyp:会計ＩＦ区分 メインメソッド<p>
	  * 会計ＩＦ区分を表す定数を取得する<br>
会計ＩＦ区分：会計システムへの送信先を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcIfTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcIfTyp_GetList(row, info);//リストの取得
		getAcIfTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcIfTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcIfTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcIfTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AC_IF_TYP.list(row);
	}
	/** 
	  * AcIfTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcIfTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcIfTypCols.viewCols(), down, info);
	}

	/** 
	  * AcIfTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcIfTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcIfTypCols.sortPolicy());
	}


	/** 
	  * BpSetTyp:取引先出力区分 メインメソッド<p>
	  * 取引先出力区分を表す定数を取得する<br>
取引先出力区分：仕訳レコードに出力する取引先の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpSetTyp_GetList(row, info);//リストの取得
		getBpSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BP_SET_TYP.list(row);
	}
	/** 
	  * BpSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpSetTypCols.viewCols(), down, info);
	}

	/** 
	  * BpSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpSetTypCols.sortPolicy());
	}


	/** 
	  * ItmSetTyp:品目出力区分 メインメソッド<p>
	  * 品目出力区分を表す定数を取得する<br>
品目出力区分：仕訳レコードに出力する品目の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmSetTyp_GetList(row, info);//リストの取得
		getItmSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ITM_SET_TYP.list(row);
	}
	/** 
	  * ItmSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmSetTypCols.viewCols(), down, info);
	}

	/** 
	  * ItmSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmSetTypCols.sortPolicy());
	}


	/** 
	  * AmtTyp:仕訳金額区分 メインメソッド<p>
	  * 仕訳金額区分を表す定数を取得する<br>
仕訳金額区分：仕訳レコードの金額項目及び消費税項目に出力する金額を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAmtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAmtTyp_GetList(row, info);//リストの取得
		getAmtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAmtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AmtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAmtTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AMT_TYP.list(row);
	}
	/** 
	  * AmtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AmtTypCols.viewCols(), down, info);
	}

	/** 
	  * AmtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AmtTypCols.sortPolicy());
	}


	/** 
	  * ForeignTyp:国外取引区分 メインメソッド<p>
	  * 国外取引区分を表す定数を取得する<br>
国外取引区分：取引の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getForeignTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getForeignTyp_GetList(row, info);//リストの取得
		getForeignTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getForeignTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ForeignTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getForeignTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_FOREIGN_TYP.list(row);
	}
	/** 
	  * ForeignTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getForeignTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ForeignTypCols.viewCols(), down, info);
	}

	/** 
	  * ForeignTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getForeignTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ForeignTypCols.sortPolicy());
	}


	/** 
	  * UnFixTyp:金額未確定区分 メインメソッド<p>
	  * 金額未確定区分を表す定数を取得する<br>
金額未確定区分：仕入や売上時の取引の状態を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getUnFixTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getUnFixTyp_GetList(row, info);//リストの取得
		getUnFixTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getUnFixTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * UnFixTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getUnFixTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_UN_FIX_TYP.list(row);
	}
	/** 
	  * UnFixTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUnFixTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(UnFixTypCols.viewCols(), down, info);
	}

	/** 
	  * UnFixTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUnFixTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(UnFixTypCols.sortPolicy());
	}


	/** 
	  * QualityTyp:在庫良品区分 メインメソッド<p>
	  * 在庫良品区分を表す定数を取得する<br>
在庫良品区分：在庫の良品・不良を表す<br>
属性値が「true」の定数に絞り込む場合は、typ_atrに属性名を指定する<br>
実装仕様書で指定する場合は、リテラル("is_xxx_typ")として指定する<br>
<br>
引数設定例）<br>
row.setStringNE(QualityTypCols.$i_typ_atr, MAC_QUALITY_TYP.$IS_INSP_TYP)
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQualityTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQualityTyp_GetList(row, info);//リストの取得
		getQualityTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQualityTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QualityTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQualityTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_QUALITY_TYP.list(row);
	}
	/** 
	  * QualityTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQualityTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QualityTypCols.viewCols(), down, info);
	}

	/** 
	  * QualityTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQualityTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QualityTypCols.sortPolicy());
	}


	/** 
	  * InvLocTyp:在庫場所区分 メインメソッド<p>
	  * 在庫場所区分を表す定数を取得する<br>
在庫場所区分：在庫の保管場所に関数する状態を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInvLocTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInvLocTyp_GetList(row, info);//リストの取得
		getInvLocTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInvLocTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InvLocTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInvLocTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INV_LOC_TYP.list(row);
	}
	/** 
	  * InvLocTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInvLocTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InvLocTypCols.viewCols(), down, info);
	}

	/** 
	  * InvLocTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInvLocTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InvLocTypCols.sortPolicy());
	}


	/** 
	  * DelTyp:削除区分 メインメソッド<p>
	  * 削除区分を表す定数を取得する<br>
削除区分：会計送信用データの削除方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDelTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDelTyp_GetList(row, info);//リストの取得
		getDelTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDelTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DelTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDelTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DEL_TYP.list(row);
	}
	/** 
	  * DelTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDelTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DelTypCols.viewCols(), down, info);
	}

	/** 
	  * DelTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDelTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DelTypCols.sortPolicy());
	}


	/** 
	  * DptTyp:仕訳部門区分 メインメソッド<p>
	  * 仕訳部門区分を表す定数を取得する<br>
仕訳部門区分：仕訳データに設定する部門を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDptTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDptTyp_GetList(row, info);//リストの取得
		getDptTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDptTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DptTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDptTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DPT_TYP.list(row);
	}
	/** 
	  * DptTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptTypCols.viewCols(), down, info);
	}

	/** 
	  * DptTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptTypCols.sortPolicy());
	}


	/** 
	  * SummaryTyp:集計区分 メインメソッド<p>
	  * 集計区分を表す定数を取得する<br>
集計区分：仕訳データの集計方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSummaryTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSummaryTyp_GetList(row, info);//リストの取得
		getSummaryTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSummaryTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SummaryTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSummaryTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SUMMARY_TYP.list(row);
	}
	/** 
	  * SummaryTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSummaryTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SummaryTypCols.viewCols(), down, info);
	}

	/** 
	  * SummaryTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSummaryTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SummaryTypCols.sortPolicy());
	}


	/** 
	  * SumColTyp:集計項目区分 メインメソッド<p>
	  * 集計項目区分を表す定数を取得する<br>
集計項目区分：仕訳データの集計ＣＤを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSumColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSumColTyp_GetList(row, info);//リストの取得
		getSumColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSumColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SumColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSumColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SUM_COL_TYP.list(row);
	}
	/** 
	  * SumColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSumColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SumColTypCols.viewCols(), down, info);
	}

	/** 
	  * SumColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSumColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SumColTypCols.sortPolicy());
	}


	/** 
	  * SetColTyp:設定項目区分 メインメソッド<p>
	  * 設定項目区分を表す定数を取得する<br>
設定項目区分：自動仕訳時に集計ＣＤに対して指定する項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSetColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSetColTyp_GetList(row, info);//リストの取得
		getSetColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSetColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SetColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSetColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SET_COL_TYP.list(row);
	}
	/** 
	  * SetColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SetColTypCols.viewCols(), down, info);
	}

	/** 
	  * SetColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SetColTypCols.sortPolicy());
	}


	/** 
	  * DataTyp:データ状況区分 メインメソッド<p>
	  * データ状況区分を表す定数を取得する<br>
データ状況区分：仕訳データのステータスを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDataTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDataTyp_GetList(row, info);//リストの取得
		getDataTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDataTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DataTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDataTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DATA_TYP.list(row);
	}
	/** 
	  * DataTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDataTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DataTypCols.viewCols(), down, info);
	}

	/** 
	  * DataTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDataTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DataTypCols.sortPolicy());
	}


	/** 
	  * AbsTyp:摘要区分 メインメソッド<p>
	  * 摘要区分を表す定数を取得する<br>
摘要区分：仕訳データの摘要欄に出力する値を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAbsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAbsTyp_GetList(row, info);//リストの取得
		getAbsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAbsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AbsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAbsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ABS_TYP.list(row);
	}
	/** 
	  * AbsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAbsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AbsTypCols.viewCols(), down, info);
	}

	/** 
	  * AbsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAbsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AbsTypCols.sortPolicy());
	}


	/** 
	  * AcSubtyp:予備科目区分 メインメソッド<p>
	  * 予備科目区分を表す定数を取得する<br>
予備科目区分：勘定科目マスタの区分値を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcSubtyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcSubtyp_GetList(row, info);//リストの取得
		getAcSubtyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcSubtyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcSubtyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcSubtyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AC_SUBTYP.list(row);
	}
	/** 
	  * AcSubtyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcSubtypCols.viewCols(), down, info);
	}

	/** 
	  * AcSubtyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcSubtyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcSubtypCols.sortPolicy());
	}


	/** 
	  * PtnTyp:仕訳パタン設定区分 メインメソッド<p>
	  * 仕訳パタン設定区分を表す定数を取得する<br>
仕訳パタン設定区分：仕訳パタンの設定方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPtnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPtnTyp_GetList(row, info);//リストの取得
		getPtnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPtnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PtnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPtnTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PTN_TYP.list(row);
	}
	/** 
	  * PtnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPtnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PtnTypCols.viewCols(), down, info);
	}

	/** 
	  * PtnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPtnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PtnTypCols.sortPolicy());
	}


	/** 
	  * IdTyp:伝票ＩＤ区分 メインメソッド<p>
	  * 伝票ＩＤ区分を表す定数を取得する<br>
伝票ＩＤ区分：仕訳データの伝票グループＩＤの取得方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIdTyp_GetList(row, info);//リストの取得
		getIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIdTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ID_TYP.list(row);
	}
	/** 
	  * IdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IdTypCols.viewCols(), down, info);
	}

	/** 
	  * IdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IdTypCols.sortPolicy());
	}


	/** 
	  * MasterTyp:マスタ連携区分 メインメソッド<p>
	  * マスタ連携区分を表す定数を取得する<br>
マスタ連携区分：会計マスタ送信時の対象マスタを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMasterTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMasterTyp_GetList(row, info);//リストの取得
		getMasterTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMasterTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MasterTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMasterTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MASTER_TYP.list(row);
	}
	/** 
	  * MasterTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMasterTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MasterTypCols.viewCols(), down, info);
	}

	/** 
	  * MasterTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMasterTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MasterTypCols.sortPolicy());
	}


	/** 
	  * AmtSignTyp:金額符号区分 メインメソッド<p>
	  * 金額符号区分を表す定数を取得する<br>
金額符号区分：仕訳元の伝票の符号を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAmtSignTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAmtSignTyp_GetList(row, info);//リストの取得
		getAmtSignTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAmtSignTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AmtSignTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAmtSignTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AMT_SIGN_TYP.list(row);
	}
	/** 
	  * AmtSignTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtSignTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AmtSignTypCols.viewCols(), down, info);
	}

	/** 
	  * AmtSignTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtSignTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AmtSignTypCols.sortPolicy());
	}


	/** 
	  * AbsBTyp:手形摘要区分 メインメソッド<p>
	  * 手形摘要区分を表す定数を取得する<br>
手形摘要区分：会計手形データの摘要欄に出力する値を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAbsBTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAbsBTyp_GetList(row, info);//リストの取得
		getAbsBTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAbsBTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AbsBTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAbsBTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ABS_B_TYP.list(row);
	}
	/** 
	  * AbsBTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAbsBTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AbsBTypCols.viewCols(), down, info);
	}

	/** 
	  * AbsBTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAbsBTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AbsBTypCols.sortPolicy());
	}


	/** 
	  * MasterImpTyp:マスタ取込区分 メインメソッド<p>
	  * マスタ取込区分を表す定数を取得する<br>
マスタ取込区分：会計システムからマスタを取り込む方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMasterImpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMasterImpTyp_GetList(row, info);//リストの取得
		getMasterImpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMasterImpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MasterImpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMasterImpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MASTER_IMP_TYP.list(row);
	}
	/** 
	  * MasterImpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMasterImpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MasterImpTypCols.viewCols(), down, info);
	}

	/** 
	  * MasterImpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMasterImpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MasterImpTypCols.sortPolicy());
	}


	/** 
	  * MasterSendTyp:マスタ送信区分 メインメソッド<p>
	  * マスタ送信区分を表す定数を取得する<br>
マスタ送信区分：会計システムへマスタを送信する方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMasterSendTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMasterSendTyp_GetList(row, info);//リストの取得
		getMasterSendTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMasterSendTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MasterSendTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMasterSendTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MASTER_SEND_TYP.list(row);
	}
	/** 
	  * MasterSendTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMasterSendTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MasterSendTypCols.viewCols(), down, info);
	}

	/** 
	  * MasterSendTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMasterSendTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MasterSendTypCols.sortPolicy());
	}


	/** 
	  * AcTableTyp:会計ＩＦテーブル区分 メインメソッド<p>
	  * 会計ＩＦテーブル区分を表す定数を取得する<br>
会計ＩＦテーブル区分：会計ＩＦ用データの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcTableTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcTableTyp_GetList(row, info);//リストの取得
		getAcTableTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcTableTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcTableTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcTableTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AC_TABLE_TYP.list(row);
	}
	/** 
	  * AcTableTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcTableTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcTableTypCols.viewCols(), down, info);
	}

	/** 
	  * AcTableTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcTableTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcTableTypCols.sortPolicy());
	}


	/** 
	  * ClsJnlTyp:決算仕訳区分 メインメソッド<p>
	  * 決算仕訳区分を表す定数を取得する<br>
決算仕訳区分：決算仕訳の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getClsJnlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getClsJnlTyp_GetList(row, info);//リストの取得
		getClsJnlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getClsJnlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ClsJnlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getClsJnlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CLS_JNL_TYP.list(row);
	}
	/** 
	  * ClsJnlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getClsJnlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ClsJnlTypCols.viewCols(), down, info);
	}

	/** 
	  * ClsJnlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getClsJnlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ClsJnlTypCols.sortPolicy());
	}


	/** 
	  * TaxTyp:税区分 メインメソッド<p>
	  * 税区分を表す定数を取得する<br>
税区分：課税方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTaxTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTaxTyp_GetList(row, info);//リストの取得
		getTaxTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTaxTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * TaxTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTaxTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_TAX_TYP.list(row);
	}
	/** 
	  * TaxTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTaxTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TaxTypCols.viewCols(), down, info);
	}

	/** 
	  * TaxTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTaxTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TaxTypCols.sortPolicy());
	}


	/** 
	  * ArTyp:債権区分 メインメソッド<p>
	  * 債権区分を表す定数を取得する<br>
債権区分：債権の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArTyp_GetList(row, info);//リストの取得
		getArTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AR_TYP.list(row);
	}
	/** 
	  * ArTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArTypCols.viewCols(), down, info);
	}

	/** 
	  * ArTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArTypCols.sortPolicy());
	}


	/** 
	  * ApTyp:債務区分 メインメソッド<p>
	  * 債務区分を表す定数を取得する<br>
債務区分：債務の種類を表す<br>
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApTyp_GetList(row, info);//リストの取得
		getApTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AP_TYP.list(row);
	}
	/** 
	  * ApTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApTypCols.viewCols(), down, info);
	}

	/** 
	  * ApTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApTypCols.sortPolicy());
	}


	/** 
	  * BankAcTyp:口座区分 メインメソッド<p>
	  * 口座区分を表す定数を取得する<br>
口座区分：口座の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBankAcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBankAcTyp_GetList(row, info);//リストの取得
		getBankAcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBankAcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BankAcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBankAcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BANK_AC_TYP.list(row);
	}
	/** 
	  * BankAcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBankAcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BankAcTypCols.viewCols(), down, info);
	}

	/** 
	  * BankAcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBankAcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BankAcTypCols.sortPolicy());
	}


	/** 
	  * InspQlqnTyp:定性定量区分 メインメソッド<p>
	  * 定性定量区分を表す定数を取得する<br>
定性定量区分：定性検査、定量検査を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspQlqnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspQlqnTyp_GetList(row, info);//リストの取得
		getInspQlqnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspQlqnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspQlqnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspQlqnTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INSP_QLQN_TYP.list(row);
	}
	/** 
	  * InspQlqnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspQlqnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspQlqnTypCols.viewCols(), down, info);
	}

	/** 
	  * InspQlqnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspQlqnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspQlqnTypCols.sortPolicy());
	}


	/** 
	  * AdjTyp:端数調整区分 メインメソッド<p>
	  * 端数調整区分を表す定数を取得する<br>
端数調整区分：受払上の端数金額を調整する方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAdjTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAdjTyp_GetList(row, info);//リストの取得
		getAdjTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAdjTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AdjTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAdjTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ADJ_TYP.list(row);
	}
	/** 
	  * AdjTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdjTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AdjTypCols.viewCols(), down, info);
	}

	/** 
	  * AdjTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdjTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AdjTypCols.sortPolicy());
	}


	/** 
	  * MstNm:マスタ名 メインメソッド<p>
	  * マスタ名を表す定数を取得する<br>
マスタ名：マスタを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMstNm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMstNm_GetList(row, info);//リストの取得
		getMstNm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMstNm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MstNm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMstNm_GetList(MCRow row, MCEventInfo info){
		return MAC_MST_NM.list(row);
	}
	/** 
	  * MstNm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMstNm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MstNmCols.viewCols(), down, info);
	}

	/** 
	  * MstNm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMstNm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MstNmCols.sortPolicy());
	}


	/** 
	  * StkMngTyp:在庫管理区分 メインメソッド<p>
	  * 在庫管理区分を表す定数を取得する<br>
在庫管理区分：品目に対する在庫管理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkMngTyp_GetList(row, info);//リストの取得
		getStkMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkMngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_STK_MNG_TYP.list(row);
	}
	/** 
	  * StkMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkMngTypCols.viewCols(), down, info);
	}

	/** 
	  * StkMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkMngTypCols.sortPolicy());
	}


	/** 
	  * AssetMngTyp:資産管理区分 メインメソッド<p>
	  * 資産管理区分を表す定数を取得する<br>
資産管理区分：品目に対する資産管理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAssetMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAssetMngTyp_GetList(row, info);//リストの取得
		getAssetMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAssetMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AssetMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAssetMngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ASSET_MNG_TYP.list(row);
	}
	/** 
	  * AssetMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAssetMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AssetMngTypCols.viewCols(), down, info);
	}

	/** 
	  * AssetMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAssetMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AssetMngTypCols.sortPolicy());
	}


	/** 
	  * ItmTyp:品目区分 メインメソッド<p>
	  * 品目区分を表す定数を取得する<br>
品目区分：品目に対する種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmTyp_GetList(row, info);//リストの取得
		getItmTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ITM_TYP.list(row);
	}
	/** 
	  * ItmTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmTypCols.viewCols(), down, info);
	}

	/** 
	  * ItmTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmTypCols.sortPolicy());
	}


	/** 
	  * LotMngTyp:ロット管理区分 メインメソッド<p>
	  * ロット管理区分を表す定数を取得する<br>
ロット管理区分：ロット管理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLotMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLotMngTyp_GetList(row, info);//リストの取得
		getLotMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLotMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LotMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLotMngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOT_MNG_TYP.list(row);
	}
	/** 
	  * LotMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LotMngTypCols.viewCols(), down, info);
	}

	/** 
	  * LotMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LotMngTypCols.sortPolicy());
	}


	/** 
	  * SublotMngTyp:サブロット管理区分 メインメソッド<p>
	  * サブロット管理区分を表す定数を取得する<br>
サブロット管理区分：サブロット管理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSublotMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSublotMngTyp_GetList(row, info);//リストの取得
		getSublotMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSublotMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SublotMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSublotMngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SUBLOT_MNG_TYP.list(row);
	}
	/** 
	  * SublotMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSublotMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SublotMngTypCols.viewCols(), down, info);
	}

	/** 
	  * SublotMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSublotMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SublotMngTypCols.sortPolicy());
	}


	/** 
	  * LotNoTyp:ロットＮＯ発番区分 メインメソッド<p>
	  * ロットＮＯ発番区分を表す定数を取得する<br>
ロットＮＯ発番区分：ロット、サブロットの発番方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLotNoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLotNoTyp_GetList(row, info);//リストの取得
		getLotNoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLotNoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LotNoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLotNoTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOT_NO_TYP.list(row);
	}
	/** 
	  * LotNoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotNoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LotNoTypCols.viewCols(), down, info);
	}

	/** 
	  * LotNoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotNoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LotNoTypCols.sortPolicy());
	}


	/** 
	  * TaxCalcTyp:税計算区分 メインメソッド<p>
	  * 税計算区分を表す定数を取得する<br>
税計算区分：税計算方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTaxCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTaxCalcTyp_GetList(row, info);//リストの取得
		getTaxCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTaxCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * TaxCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTaxCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_TAX_CALC_TYP.list(row);
	}
	/** 
	  * TaxCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTaxCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TaxCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * TaxCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTaxCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TaxCalcTypCols.sortPolicy());
	}


	/** 
	  * BillClTyp:請求締処理区分 メインメソッド<p>
	  * 請求締処理区分を表す定数を取得する<br>
請求締処理区分：請求締処理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillClTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillClTyp_GetList(row, info);//リストの取得
		getBillClTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillClTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillClTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillClTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_CL_TYP.list(row);
	}
	/** 
	  * BillClTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillClTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillClTypCols.viewCols(), down, info);
	}

	/** 
	  * BillClTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillClTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillClTypCols.sortPolicy());
	}


	/** 
	  * SlsDtlOutpTyp:売上明細出力区分 メインメソッド<p>
	  * 売上明細出力区分を表す定数を取得する<br>
売上明細出力区分：売上明細の出力方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsDtlOutpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsDtlOutpTyp_GetList(row, info);//リストの取得
		getSlsDtlOutpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsDtlOutpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsDtlOutpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsDtlOutpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLS_DTL_OUTP_TYP.list(row);
	}
	/** 
	  * SlsDtlOutpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsDtlOutpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsDtlOutpTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsDtlOutpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsDtlOutpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsDtlOutpTypCols.sortPolicy());
	}


	/** 
	  * BillDtlSubttlTyp:請求書明細小計区分 メインメソッド<p>
	  * 請求書明細小計区分を表す定数を取得する<br>
請求書明細小計区分：請求書明細の小計の表示方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillDtlSubttlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillDtlSubttlTyp_GetList(row, info);//リストの取得
		getBillDtlSubttlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillDtlSubttlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillDtlSubttlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillDtlSubttlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_DTL_SUBTTL_TYP.list(row);
	}
	/** 
	  * BillDtlSubttlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDtlSubttlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillDtlSubttlTypCols.viewCols(), down, info);
	}

	/** 
	  * BillDtlSubttlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDtlSubttlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillDtlSubttlTypCols.sortPolicy());
	}


	/** 
	  * BillDtlBrkTyp:請求書明細改頁区分 メインメソッド<p>
	  * 請求書明細改頁区分を表す定数を取得する<br>
請求書明細改頁区分：請求書明細の改頁方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillDtlBrkTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillDtlBrkTyp_GetList(row, info);//リストの取得
		getBillDtlBrkTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillDtlBrkTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillDtlBrkTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillDtlBrkTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_DTL_BRK_TYP.list(row);
	}
	/** 
	  * BillDtlBrkTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDtlBrkTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillDtlBrkTypCols.viewCols(), down, info);
	}

	/** 
	  * BillDtlBrkTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDtlBrkTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillDtlBrkTypCols.sortPolicy());
	}


	/** 
	  * BillDtlSortTyp:請求書明細並順区分 メインメソッド<p>
	  * 請求書明細並順区分を表す定数を取得する<br>
請求書明細並順区分：請求書明細の並び順を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillDtlSortTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillDtlSortTyp_GetList(row, info);//リストの取得
		getBillDtlSortTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillDtlSortTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillDtlSortTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillDtlSortTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_DTL_SORT_TYP.list(row);
	}
	/** 
	  * BillDtlSortTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDtlSortTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillDtlSortTypCols.viewCols(), down, info);
	}

	/** 
	  * BillDtlSortTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDtlSortTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillDtlSortTypCols.sortPolicy());
	}


	/** 
	  * BillBasisTyp:請求起算区分 メインメソッド<p>
	  * 請求起算区分を表す定数を取得する<br>
請求起算区分：請求時の起算方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillBasisTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillBasisTyp_GetList(row, info);//リストの取得
		getBillBasisTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillBasisTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillBasisTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillBasisTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_BASIS_TYP.list(row);
	}
	/** 
	  * BillBasisTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillBasisTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillBasisTypCols.viewCols(), down, info);
	}

	/** 
	  * BillBasisTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillBasisTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillBasisTypCols.sortPolicy());
	}


	/** 
	  * JanTyp:ＪＡＮ区分 メインメソッド<p>
	  * ＪＡＮ区分を表す定数を取得する<br>
ＪＡＮ区分：ＪＡＮの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJanTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJanTyp_GetList(row, info);//リストの取得
		getJanTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJanTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JanTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJanTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_JAN_TYP.list(row);
	}
	/** 
	  * JanTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJanTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JanTypCols.viewCols(), down, info);
	}

	/** 
	  * JanTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJanTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JanTypCols.sortPolicy());
	}


	/** 
	  * BaTyp:前後区分 メインメソッド<p>
	  * 前後区分を表す定数を取得する<br>
前後区分：前倒し、後倒しを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBaTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBaTyp_GetList(row, info);//リストの取得
		getBaTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBaTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BaTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBaTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BA_TYP.list(row);
	}
	/** 
	  * BaTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBaTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BaTypCols.viewCols(), down, info);
	}

	/** 
	  * BaTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBaTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BaTypCols.sortPolicy());
	}


	/** 
	  * PurcTyp:購買区分 メインメソッド<p>
	  * 購買区分を表す定数を取得する<br>
購買区分：購買の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcTyp_GetList(row, info);//リストの取得
		getPurcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PURC_TYP.list(row);
	}
	/** 
	  * PurcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcTypCols.sortPolicy());
	}


	/** 
	  * EximXpnsTyp:輸出入諸掛区分 メインメソッド<p>
	  * 輸出入諸掛区分を表す定数を取得する<br>
輸出入諸掛区分：輸出入の諸掛を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getEximXpnsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getEximXpnsTyp_GetList(row, info);//リストの取得
		getEximXpnsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getEximXpnsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * EximXpnsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getEximXpnsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXIM_XPNS_TYP.list(row);
	}
	/** 
	  * EximXpnsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEximXpnsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(EximXpnsTypCols.viewCols(), down, info);
	}

	/** 
	  * EximXpnsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEximXpnsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(EximXpnsTypCols.sortPolicy());
	}


	/** 
	  * AsstTyp:資産区分 メインメソッド<p>
	  * 資産区分を表す定数を取得する<br>
資産区分：資産の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAsstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAsstTyp_GetList(row, info);//リストの取得
		getAsstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAsstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AsstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAsstTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ASST_TYP.list(row);
	}
	/** 
	  * AsstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAsstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AsstTypCols.viewCols(), down, info);
	}

	/** 
	  * AsstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAsstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AsstTypCols.sortPolicy());
	}


	/** 
	  * ProvTyp:支給区分 メインメソッド<p>
	  * 支給区分を表す定数を取得する<br>
支給区分：支給の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProvTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProvTyp_GetList(row, info);//リストの取得
		getProvTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProvTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProvTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProvTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PROV_TYP.list(row);
	}
	/** 
	  * ProvTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProvTypCols.viewCols(), down, info);
	}

	/** 
	  * ProvTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProvTypCols.sortPolicy());
	}


	/** 
	  * DtAdjstTyp:日付調整区分 メインメソッド<p>
	  * 日付調整区分を表す定数を取得する<br>
日付調整区分：指定の時刻(0時－23時で指定)がどの日付に属するかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDtAdjstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDtAdjstTyp_GetList(row, info);//リストの取得
		getDtAdjstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDtAdjstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DtAdjstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDtAdjstTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DT_ADJST_TYP.list(row);
	}
	/** 
	  * DtAdjstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDtAdjstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DtAdjstTypCols.viewCols(), down, info);
	}

	/** 
	  * DtAdjstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDtAdjstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DtAdjstTypCols.sortPolicy());
	}


	/** 
	  * ClTyp:締区分 メインメソッド<p>
	  * 締区分を表す定数を取得する<br>
締区分：締め処理の対象業務を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getClTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getClTyp_GetList(row, info);//リストの取得
		getClTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getClTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ClTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getClTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CL_TYP.list(row);
	}
	/** 
	  * ClTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getClTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ClTypCols.viewCols(), down, info);
	}

	/** 
	  * ClTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getClTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ClTypCols.sortPolicy());
	}


	/** 
	  * ClStsTyp:締処理状況区分 メインメソッド<p>
	  * 締処理状況区分を表す定数を取得する<br>
締処理状況区分：締め処理の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getClStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getClStsTyp_GetList(row, info);//リストの取得
		getClStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getClStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ClStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getClStsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CL_STS_TYP.list(row);
	}
	/** 
	  * ClStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getClStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ClStsTypCols.viewCols(), down, info);
	}

	/** 
	  * ClStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getClStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ClStsTypCols.sortPolicy());
	}


	/** 
	  * SlsBasisTyp:売上計上区分 メインメソッド<p>
	  * 売上計上区分を表す定数を取得する<br>
売上計上区分：売上計上の基準を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsBasisTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsBasisTyp_GetList(row, info);//リストの取得
		getSlsBasisTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsBasisTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsBasisTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsBasisTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLS_BASIS_TYP.list(row);
	}
	/** 
	  * SlsBasisTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsBasisTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsBasisTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsBasisTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsBasisTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsBasisTypCols.sortPolicy());
	}


	/** 
	  * SloProcTyp:受注手配区分 メインメソッド<p>
	  * 受注手配区分を表す定数を取得する<br>
受注手配区分：受注データに対する処理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloProcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloProcTyp_GetList(row, info);//リストの取得
		getSloProcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloProcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloProcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloProcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLO_PROC_TYP.list(row);
	}
	/** 
	  * SloProcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloProcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloProcTypCols.viewCols(), down, info);
	}

	/** 
	  * SloProcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloProcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloProcTypCols.sortPolicy());
	}


	/** 
	  * ItmGrpTyp:品目分類区分 メインメソッド<p>
	  * 品目分類区分を表す定数を取得する<br>
品目分類区分：品目分類の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrpTyp_GetList(row, info);//リストの取得
		getItmGrpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ITM_GRP_TYP.list(row);
	}
	/** 
	  * ItmGrpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrpTypCols.viewCols(), down, info);
	}

	/** 
	  * ItmGrpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrpTypCols.sortPolicy());
	}


	/** 
	  * BpGrpTyp:取引先分類区分 メインメソッド<p>
	  * 取引先分類区分を表す定数を取得する<br>
取引先分類区分：取引先分類の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpGrpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpGrpTyp_GetList(row, info);//リストの取得
		getBpGrpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpGrpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpGrpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpGrpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BP_GRP_TYP.list(row);
	}
	/** 
	  * BpGrpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpGrpTypCols.viewCols(), down, info);
	}

	/** 
	  * BpGrpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpGrpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpGrpTypCols.sortPolicy());
	}


	/** 
	  * NoteTyp:手形区分 メインメソッド<p>
	  * 手形区分を表す定数を取得する<br>
手形区分：手形種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getNoteTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getNoteTyp_GetList(row, info);//リストの取得
		getNoteTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getNoteTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * NoteTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getNoteTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_NOTE_TYP.list(row);
	}
	/** 
	  * NoteTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNoteTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(NoteTypCols.viewCols(), down, info);
	}

	/** 
	  * NoteTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNoteTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(NoteTypCols.sortPolicy());
	}


	/** 
	  * AprvStsTyp:承認状況区分 メインメソッド<p>
	  * 承認状況区分を表す定数を取得する<br>
承認状況区分：承認データのヘッダに対するステータスを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAprvStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAprvStsTyp_GetList(row, info);//リストの取得
		getAprvStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAprvStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AprvStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAprvStsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_APRV_STS_TYP.list(row);
	}
	/** 
	  * AprvStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AprvStsTypCols.viewCols(), down, info);
	}

	/** 
	  * AprvStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AprvStsTypCols.sortPolicy());
	}


	/** 
	  * AprvDStsTyp:承認明細状況区分 メインメソッド<p>
	  * 承認明細状況区分を表す定数を取得する<br>
承認明細状況区分：承認データの明細に対するステータスを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAprvDStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAprvDStsTyp_GetList(row, info);//リストの取得
		getAprvDStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAprvDStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AprvDStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAprvDStsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_APRV_D_STS_TYP.list(row);
	}
	/** 
	  * AprvDStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvDStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AprvDStsTypCols.viewCols(), down, info);
	}

	/** 
	  * AprvDStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvDStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AprvDStsTypCols.sortPolicy());
	}


	/** 
	  * SignTyp:符号区分 メインメソッド<p>
	  * 符号区分を表す定数を取得する<br>
符号区分：不等号の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSignTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSignTyp_GetList(row, info);//リストの取得
		getSignTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSignTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SignTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSignTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SIGN_TYP.list(row);
	}
	/** 
	  * SignTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSignTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SignTypCols.viewCols(), down, info);
	}

	/** 
	  * SignTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSignTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SignTypCols.sortPolicy());
	}


	/** 
	  * BindCondTyp:結合条件区分 メインメソッド<p>
	  * 結合条件区分を表す定数を取得する<br>
結合条件区分：集合の結合条件を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBindCondTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBindCondTyp_GetList(row, info);//リストの取得
		getBindCondTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBindCondTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BindCondTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBindCondTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BIND_COND_TYP.list(row);
	}
	/** 
	  * BindCondTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBindCondTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BindCondTypCols.viewCols(), down, info);
	}

	/** 
	  * BindCondTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBindCondTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BindCondTypCols.sortPolicy());
	}


	/** 
	  * SnoTyp:手配ＮＯ区分 メインメソッド<p>
	  * 手配ＮＯ区分を表す定数を取得する<br>
手配ＮＯ区分：手配ＮＯの展開方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSnoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSnoTyp_GetList(row, info);//リストの取得
		getSnoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSnoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SnoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSnoTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SNO_TYP.list(row);
	}
	/** 
	  * SnoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSnoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SnoTypCols.viewCols(), down, info);
	}

	/** 
	  * SnoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSnoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SnoTypCols.sortPolicy());
	}


	/** 
	  * AltItmTyp:代替品目選択区分 メインメソッド<p>
	  * 代替品目選択区分を表す定数を取得する<br>
代替品目選択区分：代替品目の選択方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAltItmTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAltItmTyp_GetList(row, info);//リストの取得
		getAltItmTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAltItmTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AltItmTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAltItmTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALT_ITM_TYP.list(row);
	}
	/** 
	  * AltItmTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAltItmTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AltItmTypCols.viewCols(), down, info);
	}

	/** 
	  * AltItmTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAltItmTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AltItmTypCols.sortPolicy());
	}


	/** 
	  * YieldTyp:出来高区分 メインメソッド<p>
	  * 出来高区分を表す定数を取得する<br>
出来高区分：出来高の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getYieldTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getYieldTyp_GetList(row, info);//リストの取得
		getYieldTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getYieldTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * YieldTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getYieldTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_YIELD_TYP.list(row);
	}
	/** 
	  * YieldTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getYieldTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(YieldTypCols.viewCols(), down, info);
	}

	/** 
	  * YieldTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getYieldTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(YieldTypCols.sortPolicy());
	}


	/** 
	  * OffstTyp:オフセット区分 メインメソッド<p>
	  * オフセット区分を表す定数を取得する<br>
オフセット区分：オフセットの起算日を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOffstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOffstTyp_GetList(row, info);//リストの取得
		getOffstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOffstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * OffstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOffstTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_OFFST_TYP.list(row);
	}
	/** 
	  * OffstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOffstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OffstTypCols.viewCols(), down, info);
	}

	/** 
	  * OffstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOffstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OffstTypCols.sortPolicy());
	}


	/** 
	  * MrpProcTyp:ＭＲＰ処理区分 メインメソッド<p>
	  * ＭＲＰ処理区分を表す定数を取得する<br>
ＭＲＰ処理区分：ＭＲＰにおけるオーダ展開処理の動作を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrpProcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrpProcTyp_GetList(row, info);//リストの取得
		getMrpProcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrpProcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrpProcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrpProcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MRP_PROC_TYP.list(row);
	}
	/** 
	  * MrpProcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpProcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrpProcTypCols.viewCols(), down, info);
	}

	/** 
	  * MrpProcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpProcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrpProcTypCols.sortPolicy());
	}


	/** 
	  * BkfTyp:バックフラッシュ区分 メインメソッド<p>
	  * バックフラッシュ区分を表す定数を取得する<br>
バックフラッシュ区分：バックフラッシュの方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBkfTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBkfTyp_GetList(row, info);//リストの取得
		getBkfTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBkfTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BkfTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBkfTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BKF_TYP.list(row);
	}
	/** 
	  * BkfTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBkfTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BkfTypCols.viewCols(), down, info);
	}

	/** 
	  * BkfTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBkfTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BkfTypCols.sortPolicy());
	}


	/** 
	  * LotIssueTyp:ロット発番タイミング区分 メインメソッド<p>
	  * ロット発番タイミング区分を表す定数を取得する<br>
ロット発番タイミング区分：ロットＮＯの発番が必須となるタイミングを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLotIssueTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLotIssueTyp_GetList(row, info);//リストの取得
		getLotIssueTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLotIssueTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LotIssueTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLotIssueTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOT_ISSUE_TYP.list(row);
	}
	/** 
	  * LotIssueTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotIssueTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LotIssueTypCols.viewCols(), down, info);
	}

	/** 
	  * LotIssueTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotIssueTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LotIssueTypCols.sortPolicy());
	}


	/** 
	  * PurcIdTyp:購買識別区分 メインメソッド<p>
	  * 購買識別区分を表す定数を取得する<br>
購買識別区分：購買品の種別を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcIdTyp_GetList(row, info);//リストの取得
		getPurcIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcIdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcIdTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PURC_ID_TYP.list(row);
	}
	/** 
	  * PurcIdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcIdTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcIdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcIdTypCols.sortPolicy());
	}


	/** 
	  * PurcFixTyp:購買確定タイミング区分 メインメソッド<p>
	  * 購買確定タイミング区分を表す定数を取得する<br>
購買確定タイミング区分：工程外注に対する購買データの確定タイミングを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcFixTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcFixTyp_GetList(row, info);//リストの取得
		getPurcFixTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcFixTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcFixTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcFixTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PURC_FIX_TYP.list(row);
	}
	/** 
	  * PurcFixTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcFixTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcFixTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcFixTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcFixTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcFixTypCols.sortPolicy());
	}


	/** 
	  * InspBindTyp:検査実施単位区分 メインメソッド<p>
	  * 検査実施単位区分を表す定数を取得する<br>
検査実施単位区分：検査を実施する単位を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspBindTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspBindTyp_GetList(row, info);//リストの取得
		getInspBindTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspBindTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspBindTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspBindTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INSP_BIND_TYP.list(row);
	}
	/** 
	  * InspBindTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspBindTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspBindTypCols.viewCols(), down, info);
	}

	/** 
	  * InspBindTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspBindTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspBindTypCols.sortPolicy());
	}


	/** 
	  * InspInstIssueTyp:検査指図タイミング区分 メインメソッド<p>
	  * 検査指図タイミング区分を表す定数を取得する<br>
検査指図タイミング区分：製造検査指図のタイミングを表す（製造検査以外の場合は使用されない）
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspInstIssueTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspInstIssueTyp_GetList(row, info);//リストの取得
		getInspInstIssueTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspInstIssueTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspInstIssueTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspInstIssueTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INSP_INST_ISSUE_TYP.list(row);
	}
	/** 
	  * InspInstIssueTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspInstIssueTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspInstIssueTypCols.viewCols(), down, info);
	}

	/** 
	  * InspInstIssueTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspInstIssueTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspInstIssueTypCols.sortPolicy());
	}


	/** 
	  * InspMtdTyp:検査方法区分 メインメソッド<p>
	  * 検査方法区分を表す定数を取得する<br>
検査方法区分：検査方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspMtdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspMtdTyp_GetList(row, info);//リストの取得
		getInspMtdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspMtdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspMtdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspMtdTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INSP_MTD_TYP.list(row);
	}
	/** 
	  * InspMtdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspMtdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspMtdTypCols.viewCols(), down, info);
	}

	/** 
	  * InspMtdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspMtdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspMtdTypCols.sortPolicy());
	}


	/** 
	  * LmtDtFrmTyp:期限起算日区分 メインメソッド<p>
	  * 期限起算日区分を表す定数を取得する<br>
期限起算日区分：期限を算出する際に採用する起算日を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLmtDtFrmTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLmtDtFrmTyp_GetList(row, info);//リストの取得
		getLmtDtFrmTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLmtDtFrmTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LmtDtFrmTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLmtDtFrmTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LMT_DT_FRM_TYP.list(row);
	}
	/** 
	  * LmtDtFrmTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLmtDtFrmTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LmtDtFrmTypCols.viewCols(), down, info);
	}

	/** 
	  * LmtDtFrmTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLmtDtFrmTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LmtDtFrmTypCols.sortPolicy());
	}


	/** 
	  * AprvFuncTyp:承認機能区分 メインメソッド<p>
	  * 承認機能区分を表す定数を取得する<br>
承認機能区分：承認対象機能を表す<br>
(一時的に廃棄予定、他勘定出庫予定、他勘定入庫予定は対象外としている）
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAprvFuncTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAprvFuncTyp_GetList(row, info);//リストの取得
		getAprvFuncTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAprvFuncTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AprvFuncTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAprvFuncTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_APRV_FUNC_TYP.list(row);
	}
	/** 
	  * AprvFuncTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvFuncTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AprvFuncTypCols.viewCols(), down, info);
	}

	/** 
	  * AprvFuncTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAprvFuncTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AprvFuncTypCols.sortPolicy());
	}


	/** 
	  * TtermTyp:取引条件区分 メインメソッド<p>
	  * 取引条件区分を表す定数を取得する<br>
取引条件区分：取引条件の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTtermTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTtermTyp_GetList(row, info);//リストの取得
		getTtermTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTtermTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * TtermTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTtermTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_TTERM_TYP.list(row);
	}
	/** 
	  * TtermTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTtermTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TtermTypCols.viewCols(), down, info);
	}

	/** 
	  * TtermTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTtermTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TtermTypCols.sortPolicy());
	}


	/** 
	  * LotInhTyp:継承方法区分 メインメソッド<p>
	  * 継承方法区分を表す定数を取得する<br>
継承方法区分：継承元のロットが複数レコード存在した場合の、継承方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLotInhTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLotInhTyp_GetList(row, info);//リストの取得
		getLotInhTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLotInhTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LotInhTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLotInhTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOT_INH_TYP.list(row);
	}
	/** 
	  * LotInhTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotInhTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LotInhTypCols.viewCols(), down, info);
	}

	/** 
	  * LotInhTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotInhTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LotInhTypCols.sortPolicy());
	}


	/** 
	  * LotInhColTyp:継承項目区分 メインメソッド<p>
	  * 継承項目区分を表す定数を取得する<br>
継承項目区分：ロット継承機能で継承可能な項目を表す。値はST_SUBLOTの列名と一致している必要がある
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLotInhColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLotInhColTyp_GetList(row, info);//リストの取得
		getLotInhColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLotInhColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LotInhColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLotInhColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOT_INH_COL_TYP.list(row);
	}
	/** 
	  * LotInhColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotInhColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LotInhColTypCols.viewCols(), down, info);
	}

	/** 
	  * LotInhColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotInhColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LotInhColTypCols.sortPolicy());
	}


	/** 
	  * SlsUpriReqTyp:販売単価取得区分 メインメソッド<p>
	  * 販売単価取得区分を表す定数を取得する<br>
販売単価取得区分：販売単価を取得する際の基準日を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsUpriReqTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsUpriReqTyp_GetList(row, info);//リストの取得
		getSlsUpriReqTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsUpriReqTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsUpriReqTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsUpriReqTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLS_UPRI_REQ_TYP.list(row);
	}
	/** 
	  * SlsUpriReqTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriReqTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsUpriReqTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsUpriReqTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriReqTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsUpriReqTypCols.sortPolicy());
	}


	/** 
	  * PurcUpriReqTyp:購買単価取得区分 メインメソッド<p>
	  * 購買単価取得区分を表す定数を取得する<br>
購買単価取得区分：購買単価を取得する際の基準日を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcUpriReqTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcUpriReqTyp_GetList(row, info);//リストの取得
		getPurcUpriReqTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcUpriReqTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcUpriReqTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcUpriReqTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PURC_UPRI_REQ_TYP.list(row);
	}
	/** 
	  * PurcUpriReqTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcUpriReqTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcUpriReqTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcUpriReqTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcUpriReqTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcUpriReqTypCols.sortPolicy());
	}


	/** 
	  * XfrStkMngTyp:積送在庫管轄先区分 メインメソッド<p>
	  * 積送在庫管轄先区分を表す定数を取得する<br>
積送在庫管轄先区分：積送在庫の在庫場所を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getXfrStkMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getXfrStkMngTyp_GetList(row, info);//リストの取得
		getXfrStkMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getXfrStkMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * XfrStkMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getXfrStkMngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_XFR_STK_MNG_TYP.list(row);
	}
	/** 
	  * XfrStkMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXfrStkMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(XfrStkMngTypCols.viewCols(), down, info);
	}

	/** 
	  * XfrStkMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXfrStkMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(XfrStkMngTypCols.sortPolicy());
	}


	/** 
	  * ProvRcvTyp:支給積送管理区分 メインメソッド<p>
	  * 支給積送管理区分を表す定数を取得する<br>
支給積送管理区分：支給処理における着荷処理の有無及び積送在庫の在庫場所を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProvRcvTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProvRcvTyp_GetList(row, info);//リストの取得
		getProvRcvTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProvRcvTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProvRcvTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProvRcvTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PROV_RCV_TYP.list(row);
	}
	/** 
	  * ProvRcvTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvRcvTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProvRcvTypCols.viewCols(), down, info);
	}

	/** 
	  * ProvRcvTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvRcvTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProvRcvTypCols.sortPolicy());
	}


	/** 
	  * ProvBasisTyp:支給計上区分 メインメソッド<p>
	  * 支給計上区分を表す定数を取得する<br>
支給計上区分：有償支給計上を行うタイミングを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProvBasisTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProvBasisTyp_GetList(row, info);//リストの取得
		getProvBasisTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProvBasisTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProvBasisTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProvBasisTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PROV_BASIS_TYP.list(row);
	}
	/** 
	  * ProvBasisTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvBasisTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProvBasisTypCols.viewCols(), down, info);
	}

	/** 
	  * ProvBasisTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvBasisTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProvBasisTypCols.sortPolicy());
	}


	/** 
	  * AllocCtlTyp:引当制御区分 メインメソッド<p>
	  * 引当制御区分を表す定数を取得する<br>
引当制御区分：投入品に対する引当制御を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAllocCtlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAllocCtlTyp_GetList(row, info);//リストの取得
		getAllocCtlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAllocCtlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AllocCtlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAllocCtlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALLOC_CTL_TYP.list(row);
	}
	/** 
	  * AllocCtlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocCtlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AllocCtlTypCols.viewCols(), down, info);
	}

	/** 
	  * AllocCtlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocCtlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AllocCtlTypCols.sortPolicy());
	}


	/** 
	  * InptCtlTyp:投入制御区分 メインメソッド<p>
	  * 投入制御区分を表す定数を取得する<br>
投入制御区分：投入品に対するＭＲＰ処理や投入の可否制御を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptCtlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptCtlTyp_GetList(row, info);//リストの取得
		getInptCtlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptCtlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptCtlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptCtlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INPT_CTL_TYP.list(row);
	}
	/** 
	  * InptCtlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptCtlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptCtlTypCols.viewCols(), down, info);
	}

	/** 
	  * InptCtlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptCtlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptCtlTypCols.sortPolicy());
	}


	/** 
	  * BillCanSlipTyp:請求書取消伝票表示区分 メインメソッド<p>
	  * 請求書取消伝票表示区分を表す定数を取得する<br>
請求書取消伝票表示区分：請求書明細に取消伝票や無効伝票を出力制御を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillCanSlipTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillCanSlipTyp_GetList(row, info);//リストの取得
		getBillCanSlipTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillCanSlipTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillCanSlipTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillCanSlipTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_CAN_SLIP_TYP.list(row);
	}
	/** 
	  * BillCanSlipTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillCanSlipTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillCanSlipTypCols.viewCols(), down, info);
	}

	/** 
	  * BillCanSlipTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillCanSlipTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillCanSlipTypCols.sortPolicy());
	}


	/** 
	  * AllocTyp:引当区分 メインメソッド<p>
	  * 引当区分を表す定数を取得する<br>
引当区分：受注に対する引当制御を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAllocTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAllocTyp_GetList(row, info);//リストの取得
		getAllocTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAllocTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AllocTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAllocTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALLOC_TYP.list(row);
	}
	/** 
	  * AllocTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AllocTypCols.viewCols(), down, info);
	}

	/** 
	  * AllocTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AllocTypCols.sortPolicy());
	}


	/** 
	  * AllocScopeTyp:引当範囲区分 メインメソッド<p>
	  * 引当範囲区分を表す定数を取得する<br>
引当範囲区分：受注に対する引当範囲を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAllocScopeTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAllocScopeTyp_GetList(row, info);//リストの取得
		getAllocScopeTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAllocScopeTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AllocScopeTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAllocScopeTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALLOC_SCOPE_TYP.list(row);
	}
	/** 
	  * AllocScopeTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocScopeTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AllocScopeTypCols.viewCols(), down, info);
	}

	/** 
	  * AllocScopeTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocScopeTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AllocScopeTypCols.sortPolicy());
	}


	/** 
	  * ProcUpriTyp:加工単価区分 メインメソッド<p>
	  * 加工単価区分を表す定数を取得する<br>
加工単価区分：加工単価の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProcUpriTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProcUpriTyp_GetList(row, info);//リストの取得
		getProcUpriTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProcUpriTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProcUpriTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProcUpriTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PROC_UPRI_TYP.list(row);
	}
	/** 
	  * ProcUpriTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProcUpriTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProcUpriTypCols.viewCols(), down, info);
	}

	/** 
	  * ProcUpriTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProcUpriTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProcUpriTypCols.sortPolicy());
	}


	/** 
	  * ArSttlTyp:債権決済区分 メインメソッド<p>
	  * 債権決済区分を表す定数を取得する<br>
債権決済区分：現金や振込などの債権決済方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArSttlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArSttlTyp_GetList(row, info);//リストの取得
		getArSttlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArSttlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArSttlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArSttlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AR_STTL_TYP.list(row);
	}
	/** 
	  * ArSttlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArSttlTypCols.viewCols(), down, info);
	}

	/** 
	  * ArSttlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSttlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArSttlTypCols.sortPolicy());
	}


	/** 
	  * BillPrntTyp:請求書発行区分 メインメソッド<p>
	  * 請求書発行区分を表す定数を取得する<br>
請求書発行区分：請求書を発行するタイミングを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillPrntTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillPrntTyp_GetList(row, info);//リストの取得
		getBillPrntTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillPrntTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillPrntTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillPrntTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_PRNT_TYP.list(row);
	}
	/** 
	  * BillPrntTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillPrntTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillPrntTypCols.viewCols(), down, info);
	}

	/** 
	  * BillPrntTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillPrntTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillPrntTypCols.sortPolicy());
	}


	/** 
	  * MfgInstUnitTyp:製造指図単位区分 メインメソッド<p>
	  * 製造指図単位区分を表す定数を取得する<br>
製造指図単位区分：製造指図を発行する単位を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgInstUnitTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgInstUnitTyp_GetList(row, info);//リストの取得
		getMfgInstUnitTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgInstUnitTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgInstUnitTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgInstUnitTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MFG_INST_UNIT_TYP.list(row);
	}
	/** 
	  * MfgInstUnitTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgInstUnitTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgInstUnitTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgInstUnitTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgInstUnitTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgInstUnitTypCols.sortPolicy());
	}


	/** 
	  * PreInspInfTyp:先行検査引継区分 メインメソッド<p>
	  * 先行検査引継区分を表す定数を取得する<br>
先行検査引継区分：先行サンプル品の検査（先行検査）結果を引き継ぐ方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreInspInfTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreInspInfTyp_GetList(row, info);//リストの取得
		getPreInspInfTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreInspInfTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreInspInfTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreInspInfTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PRE_INSP_INF_TYP.list(row);
	}
	/** 
	  * PreInspInfTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreInspInfTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreInspInfTypCols.viewCols(), down, info);
	}

	/** 
	  * PreInspInfTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreInspInfTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreInspInfTypCols.sortPolicy());
	}


	/** 
	  * CompSpecTyp:構成・仕様管理区分 メインメソッド<p>
	  * 構成・仕様管理区分を表す定数を取得する<br>
構成・仕様管理区分：構成管理・仕様管理する方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCompSpecTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCompSpecTyp_GetList(row, info);//リストの取得
		getCompSpecTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCompSpecTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CompSpecTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCompSpecTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COMP_SPEC_TYP.list(row);
	}
	/** 
	  * CompSpecTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompSpecTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CompSpecTypCols.viewCols(), down, info);
	}

	/** 
	  * CompSpecTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompSpecTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CompSpecTypCols.sortPolicy());
	}


	/** 
	  * BillDptTyp:請求部門区分 メインメソッド<p>
	  * 請求部門区分を表す定数を取得する<br>
請求部門区分：請求先を担当する部門を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillDptTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillDptTyp_GetList(row, info);//リストの取得
		getBillDptTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillDptTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillDptTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillDptTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_DPT_TYP.list(row);
	}
	/** 
	  * BillDptTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDptTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillDptTypCols.viewCols(), down, info);
	}

	/** 
	  * BillDptTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDptTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillDptTypCols.sortPolicy());
	}


	/** 
	  * ArDptTyp:債権部門区分 メインメソッド<p>
	  * 債権部門区分を表す定数を取得する<br>
債権部門区分：債権（売掛金）を表す部門を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArDptTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArDptTyp_GetList(row, info);//リストの取得
		getArDptTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArDptTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArDptTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArDptTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AR_DPT_TYP.list(row);
	}
	/** 
	  * ArDptTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArDptTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArDptTypCols.viewCols(), down, info);
	}

	/** 
	  * ArDptTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArDptTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArDptTypCols.sortPolicy());
	}


	/** 
	  * LotBackStopTyp:ロット逆転禁止区分 メインメソッド<p>
	  * ロット逆転禁止区分を表す定数を取得する<br>
ロット逆転禁止区分：出荷ロットに対する逆転チェック方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLotBackStopTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLotBackStopTyp_GetList(row, info);//リストの取得
		getLotBackStopTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLotBackStopTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LotBackStopTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLotBackStopTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOT_BACK_STOP_TYP.list(row);
	}
	/** 
	  * LotBackStopTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotBackStopTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LotBackStopTypCols.viewCols(), down, info);
	}

	/** 
	  * LotBackStopTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotBackStopTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LotBackStopTypCols.sortPolicy());
	}


	/** 
	  * ExpnsTyp:費目区分 メインメソッド<p>
	  * 費目区分を表す定数を取得する<br>
費目区分：費目の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExpnsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExpnsTyp_GetList(row, info);//リストの取得
		getExpnsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExpnsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExpnsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExpnsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXPNS_TYP.list(row);
	}
	/** 
	  * ExpnsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpnsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExpnsTypCols.viewCols(), down, info);
	}

	/** 
	  * ExpnsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpnsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExpnsTypCols.sortPolicy());
	}


	/** 
	  * DirectTyp:直間区分 メインメソッド<p>
	  * 直間区分を表す定数を取得する<br>
直間区分：費目に対する直接費・間接費を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDirectTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDirectTyp_GetList(row, info);//リストの取得
		getDirectTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDirectTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DirectTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDirectTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DIRECT_TYP.list(row);
	}
	/** 
	  * DirectTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDirectTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DirectTypCols.viewCols(), down, info);
	}

	/** 
	  * DirectTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDirectTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DirectTypCols.sortPolicy());
	}


	/** 
	  * VarTyp:固変区分 メインメソッド<p>
	  * 固変区分を表す定数を取得する<br>
固変区分：費目に対する固定費・変動費を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getVarTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getVarTyp_GetList(row, info);//リストの取得
		getVarTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getVarTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * VarTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getVarTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_VAR_TYP.list(row);
	}
	/** 
	  * VarTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getVarTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(VarTypCols.viewCols(), down, info);
	}

	/** 
	  * VarTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getVarTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(VarTypCols.sortPolicy());
	}


	/** 
	  * CostCalcTyp:原価計算区分 メインメソッド<p>
	  * 原価計算区分を表す定数を取得する<br>
原価計算区分：原価計算方法の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostCalcTyp_GetList(row, info);//リストの取得
		getCostCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COST_CALC_TYP.list(row);
	}
	/** 
	  * CostCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * CostCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostCalcTypCols.sortPolicy());
	}


	/** 
	  * SaTyp:予実区分 メインメソッド<p>
	  * 予実区分を表す定数を取得する<br>
予実区分：計算入力値の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSaTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSaTyp_GetList(row, info);//リストの取得
		getSaTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSaTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SaTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSaTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SA_TYP.list(row);
	}
	/** 
	  * SaTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSaTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SaTypCols.viewCols(), down, info);
	}

	/** 
	  * SaTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSaTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SaTypCols.sortPolicy());
	}


	/** 
	  * ExpCalcTyp:展開計算区分 メインメソッド<p>
	  * 展開計算区分を表す定数を取得する<br>
展開計算区分：展開計算の計算方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExpCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExpCalcTyp_GetList(row, info);//リストの取得
		getExpCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExpCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExpCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExpCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXP_CALC_TYP.list(row);
	}
	/** 
	  * ExpCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExpCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * ExpCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExpCalcTypCols.sortPolicy());
	}


	/** 
	  * PreAlcCalcTyp:一次配賦計算区分 メインメソッド<p>
	  * 一次配賦計算区分を表す定数を取得する<br>
一次配賦計算区分：一次配賦計算の計算方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcCalcTyp_GetList(row, info);//リストの取得
		getPreAlcCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PRE_ALC_CALC_TYP.list(row);
	}
	/** 
	  * PreAlcCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcCalcTypCols.sortPolicy());
	}


	/** 
	  * AlcCalcTyp:配賦率計算区分 メインメソッド<p>
	  * 配賦率計算区分を表す定数を取得する<br>
配賦率計算区分：配賦率計算の計算方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcCalcTyp_GetList(row, info);//リストの取得
		getAlcCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALC_CALC_TYP.list(row);
	}
	/** 
	  * AlcCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * AlcCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcCalcTypCols.sortPolicy());
	}


	/** 
	  * CostSlsTyp:原価売上分類区分 メインメソッド<p>
	  * 原価売上分類区分を表す定数を取得する<br>
原価売上分類区分：原価売上分類の属性を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostSlsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostSlsTyp_GetList(row, info);//リストの取得
		getCostSlsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostSlsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostSlsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostSlsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COST_SLS_TYP.list(row);
	}
	/** 
	  * CostSlsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSlsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostSlsTypCols.viewCols(), down, info);
	}

	/** 
	  * CostSlsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostSlsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostSlsTypCols.sortPolicy());
	}


	/** 
	  * MfgPurcTyp:製造購買区分 メインメソッド<p>
	  * 製造購買区分を表す定数を取得する<br>
製造購買区分：計算パタンごとの製造・購買を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgPurcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgPurcTyp_GetList(row, info);//リストの取得
		getMfgPurcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgPurcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgPurcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgPurcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MFG_PURC_TYP.list(row);
	}
	/** 
	  * MfgPurcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgPurcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgPurcTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgPurcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgPurcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgPurcTypCols.sortPolicy());
	}


	/** 
	  * EvalTyp:金額評価区分 メインメソッド<p>
	  * 金額評価区分を表す定数を取得する<br>
金額評価区分：在庫・払出評価金額の計算方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getEvalTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getEvalTyp_GetList(row, info);//リストの取得
		getEvalTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getEvalTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * EvalTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getEvalTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EVAL_TYP.list(row);
	}
	/** 
	  * EvalTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEvalTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(EvalTypCols.viewCols(), down, info);
	}

	/** 
	  * EvalTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEvalTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(EvalTypCols.sortPolicy());
	}


	/** 
	  * UnitCalcTyp:単価計算区分 メインメソッド<p>
	  * 単価計算区分を表す定数を取得する<br>
単価計算区分：単価計算方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getUnitCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getUnitCalcTyp_GetList(row, info);//リストの取得
		getUnitCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getUnitCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * UnitCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getUnitCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_UNIT_CALC_TYP.list(row);
	}
	/** 
	  * UnitCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUnitCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(UnitCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * UnitCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUnitCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(UnitCalcTypCols.sortPolicy());
	}


	/** 
	  * ActSetTyp:実績設定区分 メインメソッド<p>
	  * 実績設定区分を表す定数を取得する<br>
実績設定区分：実績データに対する設定方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getActSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getActSetTyp_GetList(row, info);//リストの取得
		getActSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getActSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ActSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getActSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ACT_SET_TYP.list(row);
	}
	/** 
	  * ActSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getActSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ActSetTypCols.viewCols(), down, info);
	}

	/** 
	  * ActSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getActSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ActSetTypCols.sortPolicy());
	}


	/** 
	  * ExpSetTyp:展開引継区分 メインメソッド<p>
	  * 展開引継区分を表す定数を取得する<br>
展開引継区分：展開計算時に親品目の情報を引継ぎ方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExpSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExpSetTyp_GetList(row, info);//リストの取得
		getExpSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExpSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExpSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExpSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXP_SET_TYP.list(row);
	}
	/** 
	  * ExpSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExpSetTypCols.viewCols(), down, info);
	}

	/** 
	  * ExpSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExpSetTypCols.sortPolicy());
	}


	/** 
	  * BdAggTyp:内訳集計区分 メインメソッド<p>
	  * 内訳集計区分を表す定数を取得する<br>
内訳集計区分：原価計算時の内訳情報を集計方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBdAggTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBdAggTyp_GetList(row, info);//リストの取得
		getBdAggTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBdAggTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BdAggTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBdAggTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BD_AGG_TYP.list(row);
	}
	/** 
	  * BdAggTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBdAggTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BdAggTypCols.viewCols(), down, info);
	}

	/** 
	  * BdAggTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBdAggTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BdAggTypCols.sortPolicy());
	}


	/** 
	  * AlcTgtTyp:配賦対象区分 メインメソッド<p>
	  * 配賦対象区分を表す定数を取得する<br>
配賦対象区分：配賦パタンに対して配賦対象となるデータを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcTgtTyp_GetList(row, info);//リストの取得
		getAlcTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALC_TGT_TYP.list(row);
	}
	/** 
	  * AlcTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * AlcTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcTgtTypCols.sortPolicy());
	}


	/** 
	  * AlcRuleTyp:配賦方法区分 メインメソッド<p>
	  * 配賦方法区分を表す定数を取得する<br>
配賦方法区分：配賦パタンに対する配賦方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcRuleTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcRuleTyp_GetList(row, info);//リストの取得
		getAlcRuleTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcRuleTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcRuleTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcRuleTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALC_RULE_TYP.list(row);
	}
	/** 
	  * AlcRuleTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcRuleTypCols.viewCols(), down, info);
	}

	/** 
	  * AlcRuleTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRuleTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcRuleTypCols.sortPolicy());
	}


	/** 
	  * DiffCalcTyp:差異計算区分 メインメソッド<p>
	  * 差異計算区分を表す定数を取得する<br>
差異計算区分：差異計算をする際に出力する差異の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDiffCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDiffCalcTyp_GetList(row, info);//リストの取得
		getDiffCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDiffCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DiffCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDiffCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DIFF_CALC_TYP.list(row);
	}
	/** 
	  * DiffCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDiffCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DiffCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * DiffCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDiffCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DiffCalcTypCols.sortPolicy());
	}


	/** 
	  * InptItmTyp:投入対象区分 メインメソッド<p>
	  * 投入対象区分を表す定数を取得する<br>
投入対象区分：原価情報を元にする配賦処理を行う際に対象とする投入品を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptItmTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptItmTyp_GetList(row, info);//リストの取得
		getInptItmTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptItmTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptItmTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptItmTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INPT_ITM_TYP.list(row);
	}
	/** 
	  * InptItmTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptItmTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptItmTypCols.viewCols(), down, info);
	}

	/** 
	  * InptItmTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptItmTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptItmTypCols.sortPolicy());
	}


	/** 
	  * AlcValTyp:配賦基準値区分 メインメソッド<p>
	  * 配賦基準値区分を表す定数を取得する<br>
配賦基準値区分：配賦基準値を元にする配賦処理を行う際に対象とする項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcValTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcValTyp_GetList(row, info);//リストの取得
		getAlcValTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcValTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcValTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcValTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALC_VAL_TYP.list(row);
	}
	/** 
	  * AlcValTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcValTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcValTypCols.viewCols(), down, info);
	}

	/** 
	  * AlcValTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcValTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcValTypCols.sortPolicy());
	}


	/** 
	  * AlcAcGrpTyp:配賦科目グループ区分 メインメソッド<p>
	  * 配賦科目グループ区分を表す定数を取得する<br>
配賦科目グループ区分：配賦科目グループの属性を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcAcGrpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcAcGrpTyp_GetList(row, info);//リストの取得
		getAlcAcGrpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcAcGrpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcAcGrpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcAcGrpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ALC_AC_GRP_TYP.list(row);
	}
	/** 
	  * AlcAcGrpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcAcGrpTypCols.viewCols(), down, info);
	}

	/** 
	  * AlcAcGrpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcAcGrpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcAcGrpTypCols.sortPolicy());
	}


	/** 
	  * CalcCtgTyp:計算カテゴリ区分 メインメソッド<p>
	  * 計算カテゴリ区分を表す定数を取得する<br>
計算カテゴリ区分：計算カテゴリごとに登録するデータの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcCtgTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcCtgTyp_GetList(row, info);//リストの取得
		getCalcCtgTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcCtgTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcCtgTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcCtgTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CALC_CTG_TYP.list(row);
	}
	/** 
	  * CalcCtgTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcCtgTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcCtgTypCols.viewCols(), down, info);
	}

	/** 
	  * CalcCtgTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcCtgTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcCtgTypCols.sortPolicy());
	}


	/** 
	  * CtgConfigTyp:品群構成区分 メインメソッド<p>
	  * 品群構成区分を表す定数を取得する<br>
品群構成区分：品群構成の作成方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCtgConfigTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCtgConfigTyp_GetList(row, info);//リストの取得
		getCtgConfigTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCtgConfigTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CtgConfigTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCtgConfigTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CTG_CONFIG_TYP.list(row);
	}
	/** 
	  * CtgConfigTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtgConfigTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CtgConfigTypCols.viewCols(), down, info);
	}

	/** 
	  * CtgConfigTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtgConfigTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CtgConfigTypCols.sortPolicy());
	}


	/** 
	  * DptConfigTyp:部門構成区分 メインメソッド<p>
	  * 部門構成区分を表す定数を取得する<br>
部門構成区分：部門構成の作成方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDptConfigTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDptConfigTyp_GetList(row, info);//リストの取得
		getDptConfigTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDptConfigTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DptConfigTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDptConfigTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DPT_CONFIG_TYP.list(row);
	}
	/** 
	  * DptConfigTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptConfigTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptConfigTypCols.viewCols(), down, info);
	}

	/** 
	  * DptConfigTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDptConfigTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptConfigTypCols.sortPolicy());
	}


	/** 
	  * CoefConfigTyp:配賦係数構成区分 メインメソッド<p>
	  * 配賦係数構成区分を表す定数を取得する<br>
配賦係数構成区分：配賦係数構成の作成方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCoefConfigTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCoefConfigTyp_GetList(row, info);//リストの取得
		getCoefConfigTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCoefConfigTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CoefConfigTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCoefConfigTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COEF_CONFIG_TYP.list(row);
	}
	/** 
	  * CoefConfigTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCoefConfigTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CoefConfigTypCols.viewCols(), down, info);
	}

	/** 
	  * CoefConfigTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCoefConfigTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CoefConfigTypCols.sortPolicy());
	}


	/** 
	  * RptKeyTyp:レポートキー区分 メインメソッド<p>
	  * レポートキー区分を表す定数を取得する<br>
レポートキー区分：原価レポートを作成する際にキー項目となる種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptKeyTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptKeyTyp_GetList(row, info);//リストの取得
		getRptKeyTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptKeyTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptKeyTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptKeyTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RPT_KEY_TYP.list(row);
	}
	/** 
	  * RptKeyTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptKeyTypCols.viewCols(), down, info);
	}

	/** 
	  * RptKeyTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptKeyTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptKeyTypCols.sortPolicy());
	}


	/** 
	  * PreAlcTyp:一次配賦区分 メインメソッド<p>
	  * 一次配賦区分を表す定数を取得する<br>
一次配賦区分：各項目に対して一次配賦計算時の処理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcTyp_GetList(row, info);//リストの取得
		getPreAlcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PRE_ALC_TYP.list(row);
	}
	/** 
	  * PreAlcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcTypCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcTypCols.sortPolicy());
	}


	/** 
	  * RptTgtTyp:レポート対象区分 メインメソッド<p>
	  * レポート対象区分を表す定数を取得する<br>
レポート対象区分：原価レポートで集計対象となる内容を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptTgtTyp_GetList(row, info);//リストの取得
		getRptTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RPT_TGT_TYP.list(row);
	}
	/** 
	  * RptTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * RptTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptTgtTypCols.sortPolicy());
	}


	/** 
	  * QtyUnitTyp:数量単位区分 メインメソッド<p>
	  * 数量単位区分を表す定数を取得する<br>
数量単位区分：使用する数量単位を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQtyUnitTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQtyUnitTyp_GetList(row, info);//リストの取得
		getQtyUnitTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQtyUnitTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QtyUnitTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQtyUnitTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_QTY_UNIT_TYP.list(row);
	}
	/** 
	  * QtyUnitTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtyUnitTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QtyUnitTypCols.viewCols(), down, info);
	}

	/** 
	  * QtyUnitTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtyUnitTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QtyUnitTypCols.sortPolicy());
	}


	/** 
	  * UpriSetTyp:評価単価設定区分 メインメソッド<p>
	  * 評価単価設定区分を表す定数を取得する<br>
評価単価設定区分：評価単価の自動設定方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getUpriSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getUpriSetTyp_GetList(row, info);//リストの取得
		getUpriSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getUpriSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * UpriSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getUpriSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_UPRI_SET_TYP.list(row);
	}
	/** 
	  * UpriSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUpriSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(UpriSetTypCols.viewCols(), down, info);
	}

	/** 
	  * UpriSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUpriSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(UpriSetTypCols.sortPolicy());
	}


	/** 
	  * IoTgtTyp:受払対象区分 メインメソッド<p>
	  * 受払対象区分を表す定数を取得する<br>
受払対象区分：原価個別受払表の各項目に出力する内容を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoTgtTyp_GetList(row, info);//リストの取得
		getIoTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_IO_TGT_TYP.list(row);
	}
	/** 
	  * IoTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * IoTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoTgtTypCols.sortPolicy());
	}


	/** 
	  * IoSmlTyp:受払集計単位区分 メインメソッド<p>
	  * 受払集計単位区分を表す定数を取得する<br>
受払集計単位区分：原価個別受払表の各項目に出力する集計単位を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoSmlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoSmlTyp_GetList(row, info);//リストの取得
		getIoSmlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoSmlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoSmlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoSmlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_IO_SML_TYP.list(row);
	}
	/** 
	  * IoSmlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSmlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoSmlTypCols.viewCols(), down, info);
	}

	/** 
	  * IoSmlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSmlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoSmlTypCols.sortPolicy());
	}


	/** 
	  * BalCalcTyp:差額計算区分 メインメソッド<p>
	  * 差額計算区分を表す定数を取得する<br>
差額計算区分：原価個別受払表で受払差額の計算を行うときの処理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBalCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBalCalcTyp_GetList(row, info);//リストの取得
		getBalCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBalCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BalCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBalCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BAL_CALC_TYP.list(row);
	}
	/** 
	  * BalCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBalCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BalCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * BalCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBalCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BalCalcTypCols.sortPolicy());
	}


	/** 
	  * ExpAllocTyp:展開割付区分 メインメソッド<p>
	  * 展開割付区分を表す定数を取得する<br>
展開割付区分：展開計算時に各場所・取引先への予定数の割付方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExpAllocTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExpAllocTyp_GetList(row, info);//リストの取得
		getExpAllocTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExpAllocTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExpAllocTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExpAllocTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXP_ALLOC_TYP.list(row);
	}
	/** 
	  * ExpAllocTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpAllocTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExpAllocTypCols.viewCols(), down, info);
	}

	/** 
	  * ExpAllocTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExpAllocTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExpAllocTypCols.sortPolicy());
	}


	/** 
	  * ChkCostTyp:取込チェック区分 メインメソッド<p>
	  * 取込チェック区分を表す定数を取得する<br>
取込チェック区分：原価マスタ取込処理でマスタチェックをした際の結果を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getChkCostTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getChkCostTyp_GetList(row, info);//リストの取得
		getChkCostTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getChkCostTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ChkCostTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getChkCostTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CHK_COST_TYP.list(row);
	}
	/** 
	  * ChkCostTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getChkCostTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ChkCostTypCols.viewCols(), down, info);
	}

	/** 
	  * ChkCostTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getChkCostTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ChkCostTypCols.sortPolicy());
	}


	/** 
	  * IoTransTyp:入出庫振替区分 メインメソッド<p>
	  * 入出庫振替区分を表す定数を取得する<br>
入出庫振替区分：入出庫実績を取り込むときに他の実績へ振り替えることを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoTransTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoTransTyp_GetList(row, info);//リストの取得
		getIoTransTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoTransTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoTransTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoTransTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_IO_TRANS_TYP.list(row);
	}
	/** 
	  * IoTransTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoTransTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoTransTypCols.viewCols(), down, info);
	}

	/** 
	  * IoTransTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoTransTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoTransTypCols.sortPolicy());
	}


	/** 
	  * SetTgtTyp:設定対象区分 メインメソッド<p>
	  * 設定対象区分を表す定数を取得する<br>
設定対象区分：費目別原価データを作成するときに作成先となる実績を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSetTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSetTgtTyp_GetList(row, info);//リストの取得
		getSetTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSetTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SetTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSetTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SET_TGT_TYP.list(row);
	}
	/** 
	  * SetTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SetTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * SetTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SetTgtTypCols.sortPolicy());
	}


	/** 
	  * AmtSetTyp:金額設定区分 メインメソッド<p>
	  * 金額設定区分を表す定数を取得する<br>
金額設定区分：費目別原価データを作成するときに使用する単価データを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAmtSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAmtSetTyp_GetList(row, info);//リストの取得
		getAmtSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAmtSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AmtSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAmtSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AMT_SET_TYP.list(row);
	}
	/** 
	  * AmtSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AmtSetTypCols.viewCols(), down, info);
	}

	/** 
	  * AmtSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AmtSetTypCols.sortPolicy());
	}


	/** 
	  * CostIoTyp:原価入出庫区分 メインメソッド<p>
	  * 原価入出庫区分を表す定数を取得する<br>
原価入出庫区分：入出庫データに対する種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostIoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostIoTyp_GetList(row, info);//リストの取得
		getCostIoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostIoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostIoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostIoTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COST_IO_TYP.list(row);
	}
	/** 
	  * CostIoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostIoTypCols.viewCols(), down, info);
	}

	/** 
	  * CostIoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostIoTypCols.sortPolicy());
	}


	/** 
	  * PreAlcSetTyp:一次配賦設定区分 メインメソッド<p>
	  * 一次配賦設定区分を表す定数を取得する<br>
一次配賦設定区分：一次配賦比率を作成するときに対象となるデータを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcSetTyp_GetList(row, info);//リストの取得
		getPreAlcSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PRE_ALC_SET_TYP.list(row);
	}
	/** 
	  * PreAlcSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcSetTypCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcSetTypCols.sortPolicy());
	}


	/** 
	  * RqmtPlnImpTyp:月次計画取込区分 メインメソッド<p>
	  * 月次計画取込区分を表す定数を取得する<br>
月次計画取込区分：月次計画の元となるテーブルを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRqmtPlnImpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRqmtPlnImpTyp_GetList(row, info);//リストの取得
		getRqmtPlnImpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRqmtPlnImpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RqmtPlnImpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRqmtPlnImpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RQMT_PLN_IMP_TYP.list(row);
	}
	/** 
	  * RqmtPlnImpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRqmtPlnImpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RqmtPlnImpTypCols.viewCols(), down, info);
	}

	/** 
	  * RqmtPlnImpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRqmtPlnImpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RqmtPlnImpTypCols.sortPolicy());
	}


	/** 
	  * MfgPlnImpTyp:製造計画取込区分 メインメソッド<p>
	  * 製造計画取込区分を表す定数を取得する<br>
製造計画取込区分：製造計画を取り込む対象テーブルを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgPlnImpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgPlnImpTyp_GetList(row, info);//リストの取得
		getMfgPlnImpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgPlnImpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgPlnImpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgPlnImpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MFG_PLN_IMP_TYP.list(row);
	}
	/** 
	  * MfgPlnImpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgPlnImpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgPlnImpTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgPlnImpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgPlnImpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgPlnImpTypCols.sortPolicy());
	}


	/** 
	  * PurcPlnImpTyp:購買計画取込区分 メインメソッド<p>
	  * 購買計画取込区分を表す定数を取得する<br>
購買計画取込区分：購買計画の元となるテーブルを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcPlnImpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcPlnImpTyp_GetList(row, info);//リストの取得
		getPurcPlnImpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcPlnImpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcPlnImpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcPlnImpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PURC_PLN_IMP_TYP.list(row);
	}
	/** 
	  * PurcPlnImpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcPlnImpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcPlnImpTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcPlnImpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcPlnImpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcPlnImpTypCols.sortPolicy());
	}


	/** 
	  * SlsPlnImpTyp:売上計画取込区分 メインメソッド<p>
	  * 売上計画取込区分を表す定数を取得する<br>
売上計画取込区分：売上計画の元となるテーブルを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsPlnImpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsPlnImpTyp_GetList(row, info);//リストの取得
		getSlsPlnImpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsPlnImpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsPlnImpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsPlnImpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLS_PLN_IMP_TYP.list(row);
	}
	/** 
	  * SlsPlnImpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsPlnImpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsPlnImpTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsPlnImpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsPlnImpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsPlnImpTypCols.sortPolicy());
	}


	/** 
	  * LossEvalTyp:評価損計算区分 メインメソッド<p>
	  * 評価損計算区分を表す定数を取得する<br>
評価損計算区分：評価損計算を行うかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLossEvalTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLossEvalTyp_GetList(row, info);//リストの取得
		getLossEvalTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLossEvalTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LossEvalTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLossEvalTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOSS_EVAL_TYP.list(row);
	}
	/** 
	  * LossEvalTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLossEvalTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LossEvalTypCols.viewCols(), down, info);
	}

	/** 
	  * LossEvalTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLossEvalTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LossEvalTypCols.sortPolicy());
	}


	/** 
	  * PsUseTyp:生販使用区分 メインメソッド<p>
	  * 生販使用区分を表す定数を取得する<br>
生販使用区分：原価管理で実績を取り込む際に使用するデータを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPsUseTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPsUseTyp_GetList(row, info);//リストの取得
		getPsUseTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPsUseTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PsUseTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPsUseTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PS_USE_TYP.list(row);
	}
	/** 
	  * PsUseTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPsUseTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PsUseTypCols.viewCols(), down, info);
	}

	/** 
	  * PsUseTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPsUseTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PsUseTypCols.sortPolicy());
	}


	/** 
	  * DiffUseTyp:差異使用区分 メインメソッド<p>
	  * 差異使用区分を表す定数を取得する<br>
差異使用区分：差異１－５項目で使用する項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDiffUseTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDiffUseTyp_GetList(row, info);//リストの取得
		getDiffUseTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDiffUseTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DiffUseTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDiffUseTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DIFF_USE_TYP.list(row);
	}
	/** 
	  * DiffUseTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDiffUseTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DiffUseTypCols.viewCols(), down, info);
	}

	/** 
	  * DiffUseTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDiffUseTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DiffUseTypCols.sortPolicy());
	}


	/** 
	  * WipTyp:仕掛区分 メインメソッド<p>
	  * 仕掛区分を表す定数を取得する<br>
仕掛区分：仕掛管理の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWipTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWipTyp_GetList(row, info);//リストの取得
		getWipTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWipTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WipTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWipTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_WIP_TYP.list(row);
	}
	/** 
	  * WipTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWipTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WipTypCols.viewCols(), down, info);
	}

	/** 
	  * WipTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWipTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WipTypCols.sortPolicy());
	}


	/** 
	  * InptLocTyp:投入場所区分 メインメソッド<p>
	  * 投入場所区分を表す定数を取得する<br>
投入場所区分：入出庫振替区分で投入振替とした場合の振替先となる投入場所を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptLocTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptLocTyp_GetList(row, info);//リストの取得
		getInptLocTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptLocTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptLocTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptLocTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INPT_LOC_TYP.list(row);
	}
	/** 
	  * InptLocTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptLocTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptLocTypCols.viewCols(), down, info);
	}

	/** 
	  * InptLocTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptLocTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptLocTypCols.sortPolicy());
	}


	/** 
	  * SlsUpriImpTyp:販売単価取込区分 メインメソッド<p>
	  * 販売単価取込区分を表す定数を取得する<br>
販売単価取込区分：販売単価の元となるマスタを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsUpriImpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsUpriImpTyp_GetList(row, info);//リストの取得
		getSlsUpriImpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsUpriImpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsUpriImpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsUpriImpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLS_UPRI_IMP_TYP.list(row);
	}
	/** 
	  * SlsUpriImpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriImpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsUpriImpTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsUpriImpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsUpriImpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsUpriImpTypCols.sortPolicy());
	}


	/** 
	  * CostTableTyp:原価テーブル区分 メインメソッド<p>
	  * 原価テーブル区分を表す定数を取得する<br>
原価テーブル区分：項目処理区分を参照して処理を行うテーブルを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostTableTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostTableTyp_GetList(row, info);//リストの取得
		getCostTableTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostTableTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostTableTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostTableTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COST_TABLE_TYP.list(row);
	}
	/** 
	  * CostTableTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostTableTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostTableTypCols.viewCols(), down, info);
	}

	/** 
	  * CostTableTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostTableTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostTableTypCols.sortPolicy());
	}


	/** 
	  * TgtColTyp:対象項目区分 メインメソッド<p>
	  * 対象項目区分を表す定数を取得する<br>
対象項目区分：項目処理区分を参照して処理を行う項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTgtColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTgtColTyp_GetList(row, info);//リストの取得
		getTgtColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTgtColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * TgtColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTgtColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_TGT_COL_TYP.list(row);
	}
	/** 
	  * TgtColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTgtColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TgtColTypCols.viewCols(), down, info);
	}

	/** 
	  * TgtColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTgtColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TgtColTypCols.sortPolicy());
	}


	/** 
	  * ColProcTyp:項目処理区分 メインメソッド<p>
	  * 項目処理区分を表す定数を取得する<br>
項目処理区分：原価テーブル区分と対象項目区分で指定した項目に対して行う処理を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getColProcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getColProcTyp_GetList(row, info);//リストの取得
		getColProcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getColProcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ColProcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getColProcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COL_PROC_TYP.list(row);
	}
	/** 
	  * ColProcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getColProcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ColProcTypCols.viewCols(), down, info);
	}

	/** 
	  * ColProcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getColProcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ColProcTypCols.sortPolicy());
	}


	/** 
	  * TrdPtnTyp:取引パタン区分 メインメソッド<p>
	  * 取引パタン区分を表す定数を取得する<br>
取引パタン区分：取引パタンの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTrdPtnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTrdPtnTyp_GetList(row, info);//リストの取得
		getTrdPtnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTrdPtnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * TrdPtnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTrdPtnTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_TRD_PTN_TYP.list(row);
	}
	/** 
	  * TrdPtnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrdPtnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TrdPtnTypCols.viewCols(), down, info);
	}

	/** 
	  * TrdPtnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrdPtnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TrdPtnTypCols.sortPolicy());
	}


	/** 
	  * RndTyp:端数処理区分 メインメソッド<p>
	  * 端数処理区分を表す定数を取得する<br>
端数処理区分：端数処理時の処理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRndTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRndTyp_GetList(row, info);//リストの取得
		getRndTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRndTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RndTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRndTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RND_TYP.list(row);
	}
	/** 
	  * RndTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRndTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RndTypCols.viewCols(), down, info);
	}

	/** 
	  * RndTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRndTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RndTypCols.sortPolicy());
	}


	/** 
	  * ShipSchdSplitTyp:出荷予定分割区分 メインメソッド<p>
	  * 出荷予定分割区分を表す定数を取得する<br>
出荷予定分割区分：出荷数を満たす在庫が引当できない場合の制御を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipSchdSplitTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipSchdSplitTyp_GetList(row, info);//リストの取得
		getShipSchdSplitTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipSchdSplitTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipSchdSplitTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipSchdSplitTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SHIP_SCHD_SPLIT_TYP.list(row);
	}
	/** 
	  * ShipSchdSplitTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipSchdSplitTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipSchdSplitTypCols.viewCols(), down, info);
	}

	/** 
	  * ShipSchdSplitTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipSchdSplitTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipSchdSplitTypCols.sortPolicy());
	}


	/** 
	  * MultiMstNm:マスタ名（マルチマスタ） メインメソッド<p>
	  * マスタ名のうち、マルチマスタ登録画面の対象であるものを取得する<br>
マスタ名：マスタを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMultiMstNm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMultiMstNm_GetList(row, info);//リストの取得
		getMultiMstNm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMultiMstNm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MultiMstNm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMultiMstNm_GetList(MCRow row, MCEventInfo info){
		return MAC_MST_NM.list(row);
	}
	/** 
	  * MultiMstNm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMultiMstNm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MultiMstNmCols.viewCols(), down, info);
	}

	/** 
	  * MultiMstNm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMultiMstNm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MultiMstNmCols.sortPolicy());
	}


	/** 
	  * BigNumRndTyp:数値丸め区分 メインメソッド<p>
	  * 数値丸め区分を表す定数を取得する<br>
数値丸め区分：数値を丸める単位を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBigNumRndTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBigNumRndTyp_GetList(row, info);//リストの取得
		getBigNumRndTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBigNumRndTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BigNumRndTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBigNumRndTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BIG_NUM_RND_TYP.list(row);
	}
	/** 
	  * BigNumRndTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBigNumRndTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BigNumRndTypCols.viewCols(), down, info);
	}

	/** 
	  * BigNumRndTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBigNumRndTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BigNumRndTypCols.sortPolicy());
	}


	/** 
	  * LocMngTyp:管轄区分 メインメソッド<p>
	  * 管轄区分を表す定数を取得する<br>
管轄区分：在庫の資産が生産資産か販売資産かを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLocMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLocMngTyp_GetList(row, info);//リストの取得
		getLocMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLocMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LocMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLocMngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOC_MNG_TYP.list(row);
	}
	/** 
	  * LocMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LocMngTypCols.viewCols(), down, info);
	}

	/** 
	  * LocMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLocMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LocMngTypCols.sortPolicy());
	}


	/** 
	  * SnoMngTyp:手配ＮＯ管理区分 メインメソッド<p>
	  * 手配ＮＯ管理区分を表す定数を取得する<br>
手配ＮＯ管理区分：手配ＮＯの管理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSnoMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSnoMngTyp_GetList(row, info);//リストの取得
		getSnoMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSnoMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SnoMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSnoMngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SNO_MNG_TYP.list(row);
	}
	/** 
	  * SnoMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSnoMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SnoMngTypCols.viewCols(), down, info);
	}

	/** 
	  * SnoMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSnoMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SnoMngTypCols.sortPolicy());
	}


	/** 
	  * SnoNoTyp:手配ＮＯ発番区分 メインメソッド<p>
	  * 手配ＮＯ発番区分を表す定数を取得する<br>
手配ＮＯ発番区分：手配ＮＯの発番方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSnoNoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSnoNoTyp_GetList(row, info);//リストの取得
		getSnoNoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSnoNoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SnoNoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSnoNoTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SNO_NO_TYP.list(row);
	}
	/** 
	  * SnoNoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSnoNoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SnoNoTypCols.viewCols(), down, info);
	}

	/** 
	  * SnoNoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSnoNoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SnoNoTypCols.sortPolicy());
	}


	/** 
	  * CredActTyp:与信限度額超過処理区分 メインメソッド<p>
	  * 与信限度額超過処理区分を表す定数を取得する<br>
与信限度額超過処理区分：与信限度額超過に対する処理を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCredActTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCredActTyp_GetList(row, info);//リストの取得
		getCredActTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCredActTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CredActTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCredActTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CRED_ACT_TYP.list(row);
	}
	/** 
	  * CredActTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCredActTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CredActTypCols.viewCols(), down, info);
	}

	/** 
	  * CredActTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCredActTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CredActTypCols.sortPolicy());
	}


	/** 
	  * RcvRegTyp:入金登録区分 メインメソッド<p>
	  * 入金登録区分を表す定数を取得する<br>
入金登録区分：入金登録処理が必要な決済方法かどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRcvRegTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRcvRegTyp_GetList(row, info);//リストの取得
		getRcvRegTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRcvRegTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RcvRegTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRcvRegTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RCV_REG_TYP.list(row);
	}
	/** 
	  * RcvRegTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRcvRegTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RcvRegTypCols.viewCols(), down, info);
	}

	/** 
	  * RcvRegTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRcvRegTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RcvRegTypCols.sortPolicy());
	}


	/** 
	  * SlsPurcTyp:売上仕入税区分 メインメソッド<p>
	  * 売上仕入税区分を表す定数を取得する<br>
売上仕入税区分：税の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsPurcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsPurcTyp_GetList(row, info);//リストの取得
		getSlsPurcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsPurcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsPurcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsPurcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLS_PURC_TYP.list(row);
	}
	/** 
	  * SlsPurcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsPurcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsPurcTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsPurcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsPurcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsPurcTypCols.sortPolicy());
	}


	/** 
	  * DebtCredIdTyp:債権債務先識別区分 メインメソッド<p>
	  * 債権債務先識別区分を表す定数を取得する<br>
債権債務先識別区分：売掛消込や相殺消込の相手先を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDebtCredIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDebtCredIdTyp_GetList(row, info);//リストの取得
		getDebtCredIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDebtCredIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DebtCredIdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDebtCredIdTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DEBT_CRED_ID_TYP.list(row);
	}
	/** 
	  * DebtCredIdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDebtCredIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DebtCredIdTypCols.viewCols(), down, info);
	}

	/** 
	  * DebtCredIdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDebtCredIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DebtCredIdTypCols.sortPolicy());
	}


	/** 
	  * ApSttlTyp:債務決済区分 メインメソッド<p>
	  * 債務決済区分を表す定数を取得する<br>
債務決済区分：現金や振込などの債務決済方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApSttlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApSttlTyp_GetList(row, info);//リストの取得
		getApSttlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApSttlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApSttlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApSttlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AP_STTL_TYP.list(row);
	}
	/** 
	  * ApSttlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSttlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApSttlTypCols.viewCols(), down, info);
	}

	/** 
	  * ApSttlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSttlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApSttlTypCols.sortPolicy());
	}


	/** 
	  * ApSetoffTyp:債務相殺先区分 メインメソッド<p>
	  * 債務相殺先区分を表す定数を取得する<br>
債務相殺先区分：現金や振込などの債務決済方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApSetoffTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApSetoffTyp_GetList(row, info);//リストの取得
		getApSetoffTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApSetoffTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApSetoffTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApSetoffTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AP_SETOFF_TYP.list(row);
	}
	/** 
	  * ApSetoffTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSetoffTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApSetoffTypCols.viewCols(), down, info);
	}

	/** 
	  * ApSetoffTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApSetoffTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApSetoffTypCols.sortPolicy());
	}


	/** 
	  * AcxferAcSlipTyp:会計伝票区分（他勘定） メインメソッド<p>
	  * 会計伝票区分を表す定数のうち、入出庫実績振替マスタで使用できるものを取得する<br>
会計伝票区分：原価・会計ＩＦ用データに対する種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAcxferAcSlipTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAcxferAcSlipTyp_GetList(row, info);//リストの取得
		getAcxferAcSlipTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAcxferAcSlipTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AcxferAcSlipTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAcxferAcSlipTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AC_SLIP_TYP.list(row);
	}
	/** 
	  * AcxferAcSlipTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxferAcSlipTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AcxferAcSlipTypCols.viewCols(), down, info);
	}

	/** 
	  * AcxferAcSlipTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAcxferAcSlipTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AcxferAcSlipTypCols.sortPolicy());
	}


	/** 
	  * FuncTyp:機能区分 メインメソッド<p>
	  * 機能区分を表す定数を取得する<br>
機能区分：入力値チェックを行なう機能を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getFuncTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getFuncTyp_GetList(row, info);//リストの取得
		getFuncTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getFuncTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * FuncTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getFuncTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_FUNC_TYP.list(row);
	}
	/** 
	  * FuncTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFuncTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(FuncTypCols.viewCols(), down, info);
	}

	/** 
	  * FuncTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFuncTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(FuncTypCols.sortPolicy());
	}


	/** 
	  * CrryovrMonsTyp:サイト区分 メインメソッド<p>
	  * サイト区分を表す定数を取得する<br>
サイト区分：支払や入金のサイト計算を月単位とするか日単位とするかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCrryovrMonsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCrryovrMonsTyp_GetList(row, info);//リストの取得
		getCrryovrMonsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCrryovrMonsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CrryovrMonsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCrryovrMonsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CRRYOVR_MONS_TYP.list(row);
	}
	/** 
	  * CrryovrMonsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCrryovrMonsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CrryovrMonsTypCols.viewCols(), down, info);
	}

	/** 
	  * CrryovrMonsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCrryovrMonsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CrryovrMonsTypCols.sortPolicy());
	}


	/** 
	  * SlipEachLotTyp:ロット明細分割区分 メインメソッド<p>
	  * ロット明細分割区分を表す定数を取得する<br>
ロット明細分割区分：ロットＮＯ・サブロットＮＯに対する納品書や仕入実績を作成する方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlipEachLotTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlipEachLotTyp_GetList(row, info);//リストの取得
		getSlipEachLotTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlipEachLotTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlipEachLotTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlipEachLotTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLIP_EACH_LOT_TYP.list(row);
	}
	/** 
	  * SlipEachLotTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipEachLotTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlipEachLotTypCols.viewCols(), down, info);
	}

	/** 
	  * SlipEachLotTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipEachLotTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlipEachLotTypCols.sortPolicy());
	}


	/** 
	  * IfProcTyp:ＩＦ処理区分 メインメソッド<p>
	  * ＩＦ処理区分を表す定数を取得する<br>
ＩＦ処理区分：ＥＳＢで扱う処理を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIfProcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIfProcTyp_GetList(row, info);//リストの取得
		getIfProcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIfProcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IfProcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIfProcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_IF_PROC_TYP.list(row);
	}
	/** 
	  * IfProcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfProcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IfProcTypCols.viewCols(), down, info);
	}

	/** 
	  * IfProcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfProcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IfProcTypCols.sortPolicy());
	}


	/** 
	  * DayWeekTyp:曜日区分 メインメソッド<p>
	  * 曜日区分を表す定数を取得する<br>
曜日区分：曜日を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDayWeekTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDayWeekTyp_GetList(row, info);//リストの取得
		getDayWeekTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDayWeekTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DayWeekTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDayWeekTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DAY_WEEK_TYP.list(row);
	}
	/** 
	  * DayWeekTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDayWeekTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DayWeekTypCols.viewCols(), down, info);
	}

	/** 
	  * DayWeekTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDayWeekTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DayWeekTypCols.sortPolicy());
	}


	/** 
	  * CalcPdTyp:期間計算区分 メインメソッド<p>
	  * 期間計算区分を表す定数を取得する<br>
期間計算区分：有効期限、使用期限を起算日から算出する際の単位を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcPdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcPdTyp_GetList(row, info);//リストの取得
		getCalcPdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcPdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcPdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcPdTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_CALC_PD_TYP.list(row);
	}
	/** 
	  * CalcPdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcPdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcPdTypCols.viewCols(), down, info);
	}

	/** 
	  * CalcPdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcPdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcPdTypCols.sortPolicy());
	}


	/** 
	  * EvalAcSlipTyp:会計伝票区分（評価） メインメソッド<p>
	  * 会計伝票区分を表す定数のうち、個別評価設定マスタで使用できるものを取得する<br>
会計伝票区分：原価・会計ＩＦ用データに対する種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getEvalAcSlipTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getEvalAcSlipTyp_GetList(row, info);//リストの取得
		getEvalAcSlipTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getEvalAcSlipTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * EvalAcSlipTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getEvalAcSlipTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_AC_SLIP_TYP.list(row);
	}
	/** 
	  * EvalAcSlipTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEvalAcSlipTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(EvalAcSlipTypCols.viewCols(), down, info);
	}

	/** 
	  * EvalAcSlipTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEvalAcSlipTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(EvalAcSlipTypCols.sortPolicy());
	}


	/** 
	  * RqmtTyp:所要区分 メインメソッド<p>
	  * 所要区分を表す定数を取得する<br>
所要区分：ＭＲＰで日次生産依頼に対して現状在庫やオーダ残（入庫予定）を加味するかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRqmtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRqmtTyp_GetList(row, info);//リストの取得
		getRqmtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRqmtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RqmtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRqmtTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RQMT_TYP.list(row);
	}
	/** 
	  * RqmtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRqmtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RqmtTypCols.viewCols(), down, info);
	}

	/** 
	  * RqmtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRqmtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RqmtTypCols.sortPolicy());
	}


	/** 
	  * DateDivTyp:日ばらし区分 メインメソッド<p>
	  * 日ばらし区分を表す定数を取得する<br>
日ばらし区分：月次生産依頼を日ばらしする際の方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDateDivTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDateDivTyp_GetList(row, info);//リストの取得
		getDateDivTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDateDivTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DateDivTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDateDivTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DATE_DIV_TYP.list(row);
	}
	/** 
	  * DateDivTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDateDivTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DateDivTypCols.viewCols(), down, info);
	}

	/** 
	  * DateDivTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDateDivTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DateDivTypCols.sortPolicy());
	}


	/** 
	  * SlsAnlyTyp:販売分析区分 メインメソッド<p>
	  * 販売分析区分を表す定数を取得する<br>
販売分析区分：販売分析の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsAnlyTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsAnlyTyp_GetList(row, info);//リストの取得
		getSlsAnlyTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsAnlyTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsAnlyTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsAnlyTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLS_ANLY_TYP.list(row);
	}
	/** 
	  * SlsAnlyTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnlyTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsAnlyTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsAnlyTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAnlyTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsAnlyTypCols.sortPolicy());
	}


	/** 
	  * SplnSetTyp:販売計画設定区分 メインメソッド<p>
	  * 販売計画設定区分を表す定数を取得する<br>
販売計画設定区分：販売計画を登録する際に数量を入力するか金額を入力するかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSplnSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSplnSetTyp_GetList(row, info);//リストの取得
		getSplnSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSplnSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SplnSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSplnSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SPLN_SET_TYP.list(row);
	}
	/** 
	  * SplnSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SplnSetTypCols.viewCols(), down, info);
	}

	/** 
	  * SplnSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SplnSetTypCols.sortPolicy());
	}


	/** 
	  * NumBizTyp:発番業務区分 メインメソッド<p>
	  * 発番業務区分を表す定数を取得する<br>
発番業務区分：発番を伴う業務を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getNumBizTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getNumBizTyp_GetList(row, info);//リストの取得
		getNumBizTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getNumBizTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * NumBizTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getNumBizTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_NUM_BIZ_TYP.list(row);
	}
	/** 
	  * NumBizTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNumBizTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(NumBizTypCols.viewCols(), down, info);
	}

	/** 
	  * NumBizTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNumBizTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(NumBizTypCols.sortPolicy());
	}


	/** 
	  * SeqTyp:シーケンス区分 メインメソッド<p>
	  * シーケンス区分を表す定数を取得する<br>
シーケンス区分：シーケンスの発行方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSeqTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSeqTyp_GetList(row, info);//リストの取得
		getSeqTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSeqTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SeqTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSeqTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SEQ_TYP.list(row);
	}
	/** 
	  * SeqTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSeqTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SeqTypCols.viewCols(), down, info);
	}

	/** 
	  * SeqTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSeqTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SeqTypCols.sortPolicy());
	}


	/** 
	  * ElmTyp:要素区分 メインメソッド<p>
	  * 要素区分を表す定数を取得する<br>
要素区分：発番される文字列の構成要素を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getElmTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getElmTyp_GetList(row, info);//リストの取得
		getElmTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getElmTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ElmTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getElmTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ELM_TYP.list(row);
	}
	/** 
	  * ElmTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getElmTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ElmTypCols.viewCols(), down, info);
	}

	/** 
	  * ElmTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getElmTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ElmTypCols.sortPolicy());
	}


	/** 
	  * ViaDlvTyp:配送先経由区分 メインメソッド<p>
	  * 配送先経由区分を表す定数を取得する<br>
配送先経由区分：荷後に配送先の在庫となるかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getViaDlvTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getViaDlvTyp_GetList(row, info);//リストの取得
		getViaDlvTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getViaDlvTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ViaDlvTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getViaDlvTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_VIA_DLV_TYP.list(row);
	}
	/** 
	  * ViaDlvTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getViaDlvTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ViaDlvTypCols.viewCols(), down, info);
	}

	/** 
	  * ViaDlvTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getViaDlvTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ViaDlvTypCols.sortPolicy());
	}


	/** 
	  * InptItmAddTyp:投入品追加許可区分 メインメソッド<p>
	  * 投入品追加許可区分を表す定数を取得する<br>
投入品追加許可区分：製造指図や製造実績画面でＢＯＭマスタに登録されていない投入品を追加できるかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptItmAddTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptItmAddTyp_GetList(row, info);//リストの取得
		getInptItmAddTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptItmAddTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptItmAddTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptItmAddTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INPT_ITM_ADD_TYP.list(row);
	}
	/** 
	  * InptItmAddTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptItmAddTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptItmAddTypCols.viewCols(), down, info);
	}

	/** 
	  * InptItmAddTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptItmAddTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptItmAddTypCols.sortPolicy());
	}


	/** 
	  * InptItmDelTyp:投入品削除許可区分 メインメソッド<p>
	  * 投入品削除許可区分を表す定数を取得する<br>
投入品削除許可区分：製造指図画面で投入品を削除できるかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptItmDelTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptItmDelTyp_GetList(row, info);//リストの取得
		getInptItmDelTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptItmDelTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptItmDelTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptItmDelTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_INPT_ITM_DEL_TYP.list(row);
	}
	/** 
	  * InptItmDelTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptItmDelTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptItmDelTypCols.viewCols(), down, info);
	}

	/** 
	  * InptItmDelTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptItmDelTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptItmDelTypCols.sortPolicy());
	}


	/** 
	  * SchTgtTyp:スケジューラ対象区分 メインメソッド<p>
	  * スケジューラ対象区分を表す定数を取得する<br>
スケジューラ対象区分：外部スケジューラシステムへのインターフェース対象かどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSchTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSchTgtTyp_GetList(row, info);//リストの取得
		getSchTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSchTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SchTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSchTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SCH_TGT_TYP.list(row);
	}
	/** 
	  * SchTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSchTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SchTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * SchTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSchTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SchTgtTypCols.sortPolicy());
	}


	/** 
	  * ShipInstTyp:出荷指図区分 メインメソッド<p>
	  * 出荷指図区分を表す定数を取得する<br>
出荷指図区分：出荷指図が必要かどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipInstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipInstTyp_GetList(row, info);//リストの取得
		getShipInstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipInstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipInstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipInstTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SHIP_INST_TYP.list(row);
	}
	/** 
	  * ShipInstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipInstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipInstTypCols.viewCols(), down, info);
	}

	/** 
	  * ShipInstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipInstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipInstTypCols.sortPolicy());
	}


	/** 
	  * PeriodTyp:期間区分 メインメソッド<p>
	  * 期間区分を表す定数を取得する<br>
期間区分：日次、月次などの期間の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPeriodTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPeriodTyp_GetList(row, info);//リストの取得
		getPeriodTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPeriodTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PeriodTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPeriodTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PERIOD_TYP.list(row);
	}
	/** 
	  * PeriodTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPeriodTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PeriodTypCols.viewCols(), down, info);
	}

	/** 
	  * PeriodTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPeriodTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PeriodTypCols.sortPolicy());
	}


	/** 
	  * ExeStsTyp:ＰＧ実行状況区分 メインメソッド<p>
	  * ＰＧ実行状況区分を表す定数を取得する<br>
ＰＧ実行状況区分：プログラムの実行結果を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExeStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExeStsTyp_GetList(row, info);//リストの取得
		getExeStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExeStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExeStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExeStsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXE_STS_TYP.list(row);
	}
	/** 
	  * ExeStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExeStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExeStsTypCols.viewCols(), down, info);
	}

	/** 
	  * ExeStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExeStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExeStsTypCols.sortPolicy());
	}


	/** 
	  * DataCrudTyp:データ更新区分 メインメソッド<p>
	  * データ更新区分を表す定数を取得する<br>
データ更新区分：サービスで使用するデータ処理の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDataCrudTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDataCrudTyp_GetList(row, info);//リストの取得
		getDataCrudTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDataCrudTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DataCrudTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDataCrudTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_DATA_CRUD_TYP.list(row);
	}
	/** 
	  * DataCrudTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDataCrudTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DataCrudTypCols.viewCols(), down, info);
	}

	/** 
	  * DataCrudTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDataCrudTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DataCrudTypCols.sortPolicy());
	}


	/** 
	  * ProdPlnTyp:生産計画立案区分 メインメソッド<p>
	  * 生産計画立案区分を表す定数を取得する<br>
生産計画立案区分：日次生産依頼に対応するデータの作成方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProdPlnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProdPlnTyp_GetList(row, info);//リストの取得
		getProdPlnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProdPlnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProdPlnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProdPlnTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PROD_PLN_TYP.list(row);
	}
	/** 
	  * ProdPlnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdPlnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProdPlnTypCols.viewCols(), down, info);
	}

	/** 
	  * ProdPlnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdPlnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProdPlnTypCols.sortPolicy());
	}


	/** 
	  * SdrvStsTyp:送受信状況区分 メインメソッド<p>
	  * 送受信状況区分を表す定数を取得する<br>
送受信状況区分：ＥＳＢ機能でファイルの送受信状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSdrvStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSdrvStsTyp_GetList(row, info);//リストの取得
		getSdrvStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSdrvStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SdrvStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSdrvStsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SDRV_STS_TYP.list(row);
	}
	/** 
	  * SdrvStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSdrvStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SdrvStsTypCols.viewCols(), down, info);
	}

	/** 
	  * SdrvStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSdrvStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SdrvStsTypCols.sortPolicy());
	}


	/** 
	  * ExtSysTyp:外部システム区分 メインメソッド<p>
	  * 外部システム区分を表す定数を取得する<br>
外部システム区分：ＥＳＢ機能で連携対象とするシステムの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtSysTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtSysTyp_GetList(row, info);//リストの取得
		getExtSysTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtSysTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtSysTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtSysTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXT_SYS_TYP.list(row);
	}
	/** 
	  * ExtSysTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtSysTypCols.viewCols(), down, info);
	}

	/** 
	  * ExtSysTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtSysTypCols.sortPolicy());
	}


	/** 
	  * IfCtlTyp:ＩＦ制御区分 メインメソッド<p>
	  * ＩＦ制御区分を表す定数を取得する<br>
ＩＦ制御区分：通信手順やファイル出力方法などを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIfCtlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIfCtlTyp_GetList(row, info);//リストの取得
		getIfCtlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIfCtlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IfCtlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIfCtlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_IF_CTL_TYP.list(row);
	}
	/** 
	  * IfCtlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfCtlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IfCtlTypCols.viewCols(), down, info);
	}

	/** 
	  * IfCtlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfCtlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IfCtlTypCols.sortPolicy());
	}


	/** 
	  * ColConvTyp:項目変換区分 メインメソッド<p>
	  * 項目変換区分を表す定数を取得する<br>
項目変換区分：コード変換を行うか、または変換対象がなかった場合どう扱うかの処理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getColConvTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getColConvTyp_GetList(row, info);//リストの取得
		getColConvTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getColConvTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ColConvTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getColConvTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COL_CONV_TYP.list(row);
	}
	/** 
	  * ColConvTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getColConvTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ColConvTypCols.viewCols(), down, info);
	}

	/** 
	  * ColConvTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getColConvTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ColConvTypCols.sortPolicy());
	}


	/** 
	  * AttachInfoTyp:付加情報区分 メインメソッド<p>
	  * 付加情報区分を表す定数を取得する<br>
付加情報区分：品目付加情報マスタでデータの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAttachInfoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAttachInfoTyp_GetList(row, info);//リストの取得
		getAttachInfoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAttachInfoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AttachInfoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAttachInfoTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ATTACH_INFO_TYP.list(row);
	}
	/** 
	  * AttachInfoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAttachInfoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AttachInfoTypCols.viewCols(), down, info);
	}

	/** 
	  * AttachInfoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAttachInfoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AttachInfoTypCols.sortPolicy());
	}


	/** 
	  * BomTyp:ＢＯＭ区分 メインメソッド<p>
	  * ＢＯＭ区分を表す定数を取得する<br>
ＢＯＭ区分：汎用ＢＯＭでＢＯＭの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBomTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBomTyp_GetList(row, info);//リストの取得
		getBomTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBomTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BomTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBomTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BOM_TYP.list(row);
	}
	/** 
	  * BomTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BomTypCols.viewCols(), down, info);
	}

	/** 
	  * BomTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BomTypCols.sortPolicy());
	}


	/** 
	  * ExtSysLocTyp:外部システム場所区分 メインメソッド<p>
	  * 外部システム場所区分を表す定数を取得する<br>
外部システム場所区分：場所情報を外部システムへ連携する際に場所の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtSysLocTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtSysLocTyp_GetList(row, info);//リストの取得
		getExtSysLocTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtSysLocTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtSysLocTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtSysLocTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXT_SYS_LOC_TYP.list(row);
	}
	/** 
	  * ExtSysLocTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysLocTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtSysLocTypCols.viewCols(), down, info);
	}

	/** 
	  * ExtSysLocTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtSysLocTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtSysLocTypCols.sortPolicy());
	}


	/** 
	  * MstSetTyp:マスタ設定区分 メインメソッド<p>
	  * マスタ設定区分を表す定数を取得する<br>
マスタ設定区分：マスタが全社共通か会社別かを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMstSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMstSetTyp_GetList(row, info);//リストの取得
		getMstSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMstSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MstSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMstSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MST_SET_TYP.list(row);
	}
	/** 
	  * MstSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMstSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MstSetTypCols.viewCols(), down, info);
	}

	/** 
	  * MstSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMstSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MstSetTypCols.sortPolicy());
	}


	/** 
	  * StdUpriSelTyp:標準単価取得区分 メインメソッド<p>
	  * 標準単価取得区分を表す定数を取得する<br>
標準単価取得区分：標準単価マスタから値を取得する方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStdUpriSelTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStdUpriSelTyp_GetList(row, info);//リストの取得
		getStdUpriSelTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStdUpriSelTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StdUpriSelTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStdUpriSelTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_STD_UPRI_SEL_TYP.list(row);
	}
	/** 
	  * StdUpriSelTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStdUpriSelTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StdUpriSelTypCols.viewCols(), down, info);
	}

	/** 
	  * StdUpriSelTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStdUpriSelTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StdUpriSelTypCols.sortPolicy());
	}


	/** 
	  * BatchLogTyp:バッチログ区分 メインメソッド<p>
	  * バッチログ区分を表す定数を取得する<br>
バッチログ区分：バッチ処理で出力するログの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBatchLogTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBatchLogTyp_GetList(row, info);//リストの取得
		getBatchLogTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBatchLogTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BatchLogTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBatchLogTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BATCH_LOG_TYP.list(row);
	}
	/** 
	  * BatchLogTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBatchLogTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BatchLogTypCols.viewCols(), down, info);
	}

	/** 
	  * BatchLogTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBatchLogTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BatchLogTypCols.sortPolicy());
	}


	/** 
	  * PushNtcTyp:プッシュ通知区分 メインメソッド<p>
	  * プッシュ通知区分を表す定数を取得する<br>
プッシュ通知区分：プッシュ通知を行なう対象を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPushNtcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPushNtcTyp_GetList(row, info);//リストの取得
		getPushNtcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPushNtcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PushNtcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPushNtcTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PUSH_NTC_TYP.list(row);
	}
	/** 
	  * PushNtcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPushNtcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PushNtcTypCols.viewCols(), down, info);
	}

	/** 
	  * PushNtcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPushNtcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PushNtcTypCols.sortPolicy());
	}


	/** 
	  * MsgImpTyp:メッセージ重要度区分 メインメソッド<p>
	  * メッセージ重要度区分を表す定数を取得する<br>
メッセージ重要度区分：プッシュ通知を行なう際に付与される重要度を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMsgImpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMsgImpTyp_GetList(row, info);//リストの取得
		getMsgImpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMsgImpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MsgImpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMsgImpTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MSG_IMP_TYP.list(row);
	}
	/** 
	  * MsgImpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMsgImpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MsgImpTypCols.viewCols(), down, info);
	}

	/** 
	  * MsgImpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMsgImpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MsgImpTypCols.sortPolicy());
	}


	/** 
	  * PushTyp:プッシュ受信方式区分 メインメソッド<p>
	  * プッシュ受信方式区分を表す定数を取得する<br>
プッシュ受信方式区分：プッシュ通知方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPushTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPushTyp_GetList(row, info);//リストの取得
		getPushTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPushTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PushTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPushTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PUSH_TYP.list(row);
	}
	/** 
	  * PushTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPushTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PushTypCols.viewCols(), down, info);
	}

	/** 
	  * PushTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPushTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PushTypCols.sortPolicy());
	}


	/** 
	  * BomChngTyp:ＢＯＭ切替区分 メインメソッド<p>
	  * ＢＯＭ切替区分を表す定数を取得する<br>
ＢＯＭ切替区分：ＢＯＭの子品目を切るかえる方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBomChngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBomChngTyp_GetList(row, info);//リストの取得
		getBomChngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBomChngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BomChngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBomChngTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BOM_CHNG_TYP.list(row);
	}
	/** 
	  * BomChngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomChngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BomChngTypCols.viewCols(), down, info);
	}

	/** 
	  * BomChngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBomChngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BomChngTypCols.sortPolicy());
	}


	/** 
	  * BpProvBasisTyp:支給計上区分（取引先マスタ用） メインメソッド<p>
	  * 支給計上区分を表す定数を取得する<br>
支給計上区分：有償支給計上を行うタイミングを表す<br>
取引先マスタの支給計上区分に指定できる値を返す<br>
取引先が有償支給先の場合にのみ、以下の条件で値を返す<br>
・下請対象の場合：「3：使用基準」のみを返す<br>
・着荷登録不要（積送管理しない）の場合：「1：出荷基準」「3：使用基準」を返す<br>
・上記以外の場合：「2：着荷基準」「3：使用基準」を返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpProvBasisTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpProvBasisTyp_GetList(row, info);//リストの取得
		getBpProvBasisTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpProvBasisTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpProvBasisTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpProvBasisTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PROV_BASIS_TYP.list(row);
	}
	/** 
	  * BpProvBasisTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpProvBasisTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpProvBasisTypCols.viewCols(), down, info);
	}

	/** 
	  * BpProvBasisTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpProvBasisTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpProvBasisTypCols.sortPolicy());
	}


	/** 
	  * WgRqstTyp:ワーキンググループ間依頼種類区分 メインメソッド<p>
	  * ワーキンググループ間依頼種類区分を表す定数を取得する<br>
ワーキンググループ間依頼種類区分：ワーキングクループ間の依頼方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWgRqstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWgRqstTyp_GetList(row, info);//リストの取得
		getWgRqstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWgRqstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WgRqstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWgRqstTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_WG_RQST_TYP.list(row);
	}
	/** 
	  * WgRqstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WgRqstTypCols.viewCols(), down, info);
	}

	/** 
	  * WgRqstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WgRqstTypCols.sortPolicy());
	}


	/** 
	  * SlipStsTyp:伝票状況区分 メインメソッド<p>
	  * 伝票状況区分を表す定数を取得する<br>
伝票状況区分：伝票のステータスを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlipStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlipStsTyp_GetList(row, info);//リストの取得
		getSlipStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlipStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlipStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlipStsTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_SLIP_STS_TYP.list(row);
	}
	/** 
	  * SlipStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlipStsTypCols.viewCols(), down, info);
	}

	/** 
	  * SlipStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlipStsTypCols.sortPolicy());
	}


	/** 
	  * JnlKeyColTyp:仕訳キー項目区分 メインメソッド<p>
	  * 仕訳キー項目区分を表す定数を取得する<br>
仕訳キー項目区分：仕訳キー項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJnlKeyColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJnlKeyColTyp_GetList(row, info);//リストの取得
		getJnlKeyColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJnlKeyColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JnlKeyColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJnlKeyColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_JNL_KEY_COL_TYP.list(row);
	}
	/** 
	  * JnlKeyColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlKeyColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JnlKeyColTypCols.viewCols(), down, info);
	}

	/** 
	  * JnlKeyColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlKeyColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JnlKeyColTypCols.sortPolicy());
	}


	/** 
	  * JnlKeySetColTyp:仕訳キー設定項目区分 メインメソッド<p>
	  * 仕訳キー設定項目区分を表す定数を取得する<br>
仕訳キー設定項目区分：会計ＩＦ取込、原価会計ＩＦ送信時、仕訳キー項目に値を設定するための連携項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJnlKeySetColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJnlKeySetColTyp_GetList(row, info);//リストの取得
		getJnlKeySetColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJnlKeySetColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JnlKeySetColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJnlKeySetColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_JNL_KEY_SET_COL_TYP.list(row);
	}
	/** 
	  * JnlKeySetColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlKeySetColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JnlKeySetColTypCols.viewCols(), down, info);
	}

	/** 
	  * JnlKeySetColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlKeySetColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JnlKeySetColTypCols.sortPolicy());
	}


	/** 
	  * ItmMfgInstNoSetTyp:品目製造指図ＮＯ設定区分 メインメソッド<p>
	  * 品目製造指図ＮＯ設定区分を表す定数を取得する<br>
品目製造指図ＮＯ設定区分：原価管理へ実績データを連携する際に品目製造指図ＮＯに設定する項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmMfgInstNoSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmMfgInstNoSetTyp_GetList(row, info);//リストの取得
		getItmMfgInstNoSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmMfgInstNoSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmMfgInstNoSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmMfgInstNoSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_ITM_MFG_INST_NO_SET_TYP.list(row);
	}
	/** 
	  * ItmMfgInstNoSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmMfgInstNoSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmMfgInstNoSetTypCols.viewCols(), down, info);
	}

	/** 
	  * ItmMfgInstNoSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmMfgInstNoSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmMfgInstNoSetTypCols.sortPolicy());
	}


	/** 
	  * MfgActNoSetTyp:製造実績ＮＯ設定区分 メインメソッド<p>
	  * 製造実績ＮＯ設定区分を表す定数を取得する<br>
製造実績ＮＯ設定区分：原価管理へ実績データを連携する際に製造実績ＮＯに設定する項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgActNoSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgActNoSetTyp_GetList(row, info);//リストの取得
		getMfgActNoSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgActNoSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgActNoSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgActNoSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_MFG_ACT_NO_SET_TYP.list(row);
	}
	/** 
	  * MfgActNoSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgActNoSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgActNoSetTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgActNoSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgActNoSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgActNoSetTypCols.sortPolicy());
	}


	/** 
	  * OperActNoSetTyp:工程実績ＮＯ設定区分 メインメソッド<p>
	  * 工程実績ＮＯ設定区分を表す定数を取得する<br>
工程実績ＮＯ設定区分：原価管理へ実績データを連携する際に工程実績ＮＯに設定する項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOperActNoSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOperActNoSetTyp_GetList(row, info);//リストの取得
		getOperActNoSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOperActNoSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * OperActNoSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOperActNoSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_OPER_ACT_NO_SET_TYP.list(row);
	}
	/** 
	  * OperActNoSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOperActNoSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OperActNoSetTypCols.viewCols(), down, info);
	}

	/** 
	  * OperActNoSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOperActNoSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OperActNoSetTypCols.sortPolicy());
	}


	/** 
	  * AddConcatColTyp:追加結合項目区分 メインメソッド<p>
	  * 継承項目区分を表す定数のうち、追加結合項目として使用できるものを取得する<br>
継承項目区分：ロット継承機能で継承可能な項目を表す区分。値はST_SUBLOTの列名と一致している必要がある
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAddConcatColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAddConcatColTyp_GetList(row, info);//リストの取得
		getAddConcatColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAddConcatColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AddConcatColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAddConcatColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_LOT_INH_COL_TYP.list(row);
	}
	/** 
	  * AddConcatColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAddConcatColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AddConcatColTypCols.viewCols(), down, info);
	}

	/** 
	  * AddConcatColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAddConcatColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AddConcatColTypCols.sortPolicy());
	}


	/** 
	  * IfColTyp:ＩＦ項目区分 メインメソッド<p>
	  * ＩＦ項目区分を表す定数を取得する<br>
ＩＦ項目区分：品目や取引先などコード変換対象を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIfColTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIfColTyp_GetList(row, info);//リストの取得
		getIfColTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIfColTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IfColTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIfColTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_IF_COL_TYP.list(row);
	}
	/** 
	  * IfColTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfColTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IfColTypCols.viewCols(), down, info);
	}

	/** 
	  * IfColTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfColTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IfColTypCols.sortPolicy());
	}


	/** 
	  * IfUpdTyp:ＩＦ更新区分 メインメソッド<p>
	  * ＩＦ更新区分を表す定数を取得する<br>
ＩＦ更新区分：エラー発生時の処理方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIfUpdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIfUpdTyp_GetList(row, info);//リストの取得
		getIfUpdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIfUpdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IfUpdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIfUpdTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_IF_UPD_TYP.list(row);
	}
	/** 
	  * IfUpdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfUpdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IfUpdTypCols.viewCols(), down, info);
	}

	/** 
	  * IfUpdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfUpdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IfUpdTypCols.sortPolicy());
	}


	/** 
	  * PayApTyp:支払債務区分 メインメソッド<p>
	  * 支払債務区分を表す定数を取得する<br>
支払債務区分：支払を行う債務の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayApTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayApTyp_GetList(row, info);//リストの取得
		getPayApTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayApTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayApTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayApTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PAY_AP_TYP.list(row);
	}
	/** 
	  * PayApTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayApTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayApTypCols.viewCols(), down, info);
	}

	/** 
	  * PayApTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayApTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayApTypCols.sortPolicy());
	}


	/** 
	  * ExtMasterTyp:外部マスタ連携区分 メインメソッド<p>
	  * 外部マスタ連携区分を表す定数を取得する<br>
外部マスタ連携区分：外部マスタ送信時の対象マスタを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getExtMasterTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getExtMasterTyp_GetList(row, info);//リストの取得
		getExtMasterTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getExtMasterTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ExtMasterTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getExtMasterTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_EXT_MASTER_TYP.list(row);
	}
	/** 
	  * ExtMasterTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtMasterTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ExtMasterTypCols.viewCols(), down, info);
	}

	/** 
	  * ExtMasterTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getExtMasterTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ExtMasterTypCols.sortPolicy());
	}


	/** 
	  * CompoundJnlTyp:複合仕訳区分 メインメソッド<p>
	  * 複合仕訳区分を表す定数を取得する<br>
複合仕訳区分：仕訳の作成方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCompoundJnlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCompoundJnlTyp_GetList(row, info);//リストの取得
		getCompoundJnlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCompoundJnlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CompoundJnlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCompoundJnlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_COMPOUND_JNL_TYP.list(row);
	}
	/** 
	  * CompoundJnlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompoundJnlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CompoundJnlTypCols.viewCols(), down, info);
	}

	/** 
	  * CompoundJnlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompoundJnlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CompoundJnlTypCols.sortPolicy());
	}


	/** 
	  * OutsrcUpriTyp:外注単価区分 メインメソッド<p>
	  * 外注単価区分を表す定数を取得する<br>
外注単価区分：外注品の購買単価の取得方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOutsrcUpriTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOutsrcUpriTyp_GetList(row, info);//リストの取得
		getOutsrcUpriTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOutsrcUpriTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * OutsrcUpriTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOutsrcUpriTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_OUTSRC_UPRI_TYP.list(row);
	}
	/** 
	  * OutsrcUpriTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOutsrcUpriTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OutsrcUpriTypCols.viewCols(), down, info);
	}

	/** 
	  * OutsrcUpriTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOutsrcUpriTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OutsrcUpriTypCols.sortPolicy());
	}


	/** 
	  * PurcBasisTyp:仕入計上区分 メインメソッド<p>
	  * 仕入計上区分を表す定数を取得する<br>
仕入計上区分：仕入計上の基準を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcBasisTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcBasisTyp_GetList(row, info);//リストの取得
		getPurcBasisTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcBasisTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcBasisTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcBasisTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PURC_BASIS_TYP.list(row);
	}
	/** 
	  * PurcBasisTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcBasisTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcBasisTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcBasisTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcBasisTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcBasisTypCols.sortPolicy());
	}


	/** 
	  * PrntTyp:帳票発行区分 メインメソッド<p>
	  * 帳票発行区分を表す定数を取得する<br>
帳票発行区分：帳票の発行単位を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPrntTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPrntTyp_GetList(row, info);//リストの取得
		getPrntTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPrntTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PrntTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPrntTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PRNT_TYP.list(row);
	}
	/** 
	  * PrntTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPrntTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PrntTypCols.viewCols(), down, info);
	}

	/** 
	  * PrntTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPrntTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PrntTypCols.sortPolicy());
	}


	/** 
	  * PayNtcDtlSubttlTyp:支払通知書明細小計区分 メインメソッド<p>
	  * 支払通知書明細小計区分を表す定数を取得する<br>
支払通知書明細小計区分：支払通知書明細の小計の表示方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayNtcDtlSubttlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayNtcDtlSubttlTyp_GetList(row, info);//リストの取得
		getPayNtcDtlSubttlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayNtcDtlSubttlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayNtcDtlSubttlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayNtcDtlSubttlTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PAY_NTC_DTL_SUBTTL_TYP.list(row);
	}
	/** 
	  * PayNtcDtlSubttlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDtlSubttlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayNtcDtlSubttlTypCols.viewCols(), down, info);
	}

	/** 
	  * PayNtcDtlSubttlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDtlSubttlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayNtcDtlSubttlTypCols.sortPolicy());
	}


	/** 
	  * PayNtcDtlBrkTyp:支払通知書明細改頁区分 メインメソッド<p>
	  * 支払通知書明細改頁区分を表す定数を取得する<br>
支払通知書明細改頁区分：支払通知書明細の改頁方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayNtcDtlBrkTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayNtcDtlBrkTyp_GetList(row, info);//リストの取得
		getPayNtcDtlBrkTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayNtcDtlBrkTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayNtcDtlBrkTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayNtcDtlBrkTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PAY_NTC_DTL_BRK_TYP.list(row);
	}
	/** 
	  * PayNtcDtlBrkTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDtlBrkTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayNtcDtlBrkTypCols.viewCols(), down, info);
	}

	/** 
	  * PayNtcDtlBrkTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDtlBrkTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayNtcDtlBrkTypCols.sortPolicy());
	}


	/** 
	  * PayNtcDtlSortTyp:支払通知書明細並順区分 メインメソッド<p>
	  * 支払通知書明細並順区分を表す定数を取得する<br>
支払通知書明細並順区分：支払通知書明細の並び順を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayNtcDtlSortTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayNtcDtlSortTyp_GetList(row, info);//リストの取得
		getPayNtcDtlSortTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayNtcDtlSortTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayNtcDtlSortTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayNtcDtlSortTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PAY_NTC_DTL_SORT_TYP.list(row);
	}
	/** 
	  * PayNtcDtlSortTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDtlSortTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayNtcDtlSortTypCols.viewCols(), down, info);
	}

	/** 
	  * PayNtcDtlSortTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDtlSortTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayNtcDtlSortTypCols.sortPolicy());
	}


	/** 
	  * PayNtcCanSlipTyp:支払通知書取消伝票表示区 メインメソッド<p>
	  * 支払通知書取消伝票表示区分を表す定数を取得する<br>
支払通知書取消伝票表示区分：支払通知書明細に取消伝票や無効伝票を出力制御を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayNtcCanSlipTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayNtcCanSlipTyp_GetList(row, info);//リストの取得
		getPayNtcCanSlipTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayNtcCanSlipTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayNtcCanSlipTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayNtcCanSlipTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PAY_NTC_CAN_SLIP_TYP.list(row);
	}
	/** 
	  * PayNtcCanSlipTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcCanSlipTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayNtcCanSlipTypCols.viewCols(), down, info);
	}

	/** 
	  * PayNtcCanSlipTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcCanSlipTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayNtcCanSlipTypCols.sortPolicy());
	}


	/** 
	  * PayNtcDHisTyp:支払通知書明細履歴区分 メインメソッド<p>
	  * 支払通知書明細履歴区分を表す定数を取得する<br>
支払通知書明細履歴区分：支払通知書明細履歴の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayNtcDHisTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayNtcDHisTyp_GetList(row, info);//リストの取得
		getPayNtcDHisTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayNtcDHisTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayNtcDHisTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayNtcDHisTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_PAY_NTC_D_HIS_TYP.list(row);
	}
	/** 
	  * PayNtcDHisTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDHisTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayNtcDHisTypCols.viewCols(), down, info);
	}

	/** 
	  * PayNtcDHisTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcDHisTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayNtcDHisTypCols.sortPolicy());
	}


	/** 
	  * BizTyp:業務区分 メインメソッド<p>
	  * 業務区分を表す定数を取得する<br>
業務区分：業務の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBizTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBizTyp_GetList(row, info);//リストの取得
		getBizTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBizTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BizTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBizTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BIZ_TYP.list(row);
	}
	/** 
	  * BizTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BizTypCols.viewCols(), down, info);
	}

	/** 
	  * BizTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BizTypCols.sortPolicy());
	}


	/** 
	  * BillDHisTyp:請求書明細履歴区分 メインメソッド<p>
	  * 請求書明細履歴区分を表す定数を取得する<br>
請求書明細履歴区分：請求書明細履歴の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillDHisTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillDHisTyp_GetList(row, info);//リストの取得
		getBillDHisTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillDHisTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillDHisTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillDHisTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_BILL_D_HIS_TYP.list(row);
	}
	/** 
	  * BillDHisTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDHisTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillDHisTypCols.viewCols(), down, info);
	}

	/** 
	  * BillDHisTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDHisTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillDHisTypCols.sortPolicy());
	}


	/** 
	  * RptNmElmTyp:帳票名称要素区分 メインメソッド<p>
	  * 帳票名称要素区分を表す定数を取得する<br>
帳票名称要素区分：帳票ファイル名称の構成要素を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptNmElmTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptNmElmTyp_GetList(row, info);//リストの取得
		getRptNmElmTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptNmElmTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptNmElmTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptNmElmTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RPT_NM_ELM_TYP.list(row);
	}
	/** 
	  * RptNmElmTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptNmElmTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptNmElmTypCols.viewCols(), down, info);
	}

	/** 
	  * RptNmElmTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptNmElmTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptNmElmTypCols.sortPolicy());
	}


	/** 
	  * RptAttrTyp:帳票属性区分 メインメソッド<p>
	  * 帳票属性区分を表す定数を取得する<br>
帳票属性区分：帳票属性を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptAttrTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptAttrTyp_GetList(row, info);//リストの取得
		getRptAttrTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptAttrTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptAttrTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptAttrTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RPT_ATTR_TYP.list(row);
	}
	/** 
	  * RptAttrTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptAttrTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptAttrTypCols.viewCols(), down, info);
	}

	/** 
	  * RptAttrTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptAttrTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptAttrTypCols.sortPolicy());
	}


	/** 
	  * RptAttrSetTyp:帳票属性設定区分 メインメソッド<p>
	  * 帳票属性設定区分を表す定数を取得する<br>
帳票属性設定区分：帳票属性区分に対して指定する項目を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRptAttrSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRptAttrSetTyp_GetList(row, info);//リストの取得
		getRptAttrSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRptAttrSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RptAttrSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRptAttrSetTyp_GetList(MCRow row, MCEventInfo info){
		return MAC_RPT_ATTR_SET_TYP.list(row);
	}
	/** 
	  * RptAttrSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptAttrSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RptAttrSetTypCols.viewCols(), down, info);
	}

	/** 
	  * RptAttrSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRptAttrSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RptAttrSetTypCols.sortPolicy());
	}


	/** 
	  * Account:勘定科目 メインメソッド<p>
	  * 会計システムで使用する科目情報を、勘定科目マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAccount(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAccount_GetList(row, info);//リストの取得
		getAccount_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAccount_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Account:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAccount_GetList(MCRow row, MCEventInfo info){
		return getList("getAccount", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Account:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAccount_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AccountCols.viewCols(), down, info);
	}

	/** 
	  * Account:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAccount_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AccountCols.sortPolicy());
	}


	/** 
	  * Bp:取引先 メインメソッド<p>
	  * 引数の検索区分（取引先入力補助検索区分）に対応する取引先情報を、取引先マスタから取得する<br>
・取引先名を「null」にする場合は、sundry_bp_nm_rem_flgを「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する<br>
・手入力時と存在チェック時に、チェック対象の取引先を参照取引先と比較する場合は、check_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBp_GetList(row, info);//リストの取得
		getBp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Bp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBp_GetList(MCRow row, MCEventInfo info){
		return getList("getBp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Bp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpCols.viewCols(), down, info);
	}

	/** 
	  * Bp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpCols.sortPolicy());
	}


	/** 
	  * Dpt:部門 メインメソッド<p>
	  * 引数の検索区分（部門入力補助検索区分）および適用日に対応する部門情報を、部門マスタから取得する<br>
・適用日を運用日付として部門情報を取得する場合は、mode_today_flgに「true」を指定する<br>
・検索枠で使用する場合は、mode_today_flg、dpt_nm_rem_flgの両方に「true」を指定する<br>
・担当者権限マスタに従い担当者の所属する部門に絞り込む場合は、usr_cdに担当者ＣＤを指定する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する<br>
・更新権限付きのワーキンググループを持つ部門ＣＤのみを取得する場合は、wr_wg_flgに「true」を指定する<br>
・業務対象外部門に「true」を指定すると、部門マスタの〇〇部門フラグが全て「false」の部門を取得する<br>
・仕入直送にtrue、検索区分に「4：営業部門」を指定した場合は、売上部門に対応する場所を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDpt(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDpt_GetList(row, info);//リストの取得
		getDpt_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDpt_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Dpt:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDpt_GetList(MCRow row, MCEventInfo info){
		return getList("getDpt", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Dpt:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDpt_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DptCols.viewCols(), down, info);
	}

	/** 
	  * Dpt:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDpt_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DptCols.sortPolicy());
	}


	/** 
	  * Loc:場所 メインメソッド<p>
	  * 指定した検索区分（場所入力補助検索区分）に応じて、場所マスタから場所情報を取得する<br>
・ＤＡＣ制御を加味した絞込をする場合は、以下を指定する<br>
　　検索の場合：rd_flgに「true」を指定する<br>
　　更新の場合：wr_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLoc_GetList(row, info);//リストの取得
		getLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Loc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Loc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LocCols.viewCols(), down, info);
	}

	/** 
	  * Loc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LocCols.sortPolicy());
	}


	/** 
	  * Itm:品目 メインメソッド<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから品目情報を取得する<br>
・品名を取得しない場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItm_GetList(row, info);//リストの取得
		getItm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Itm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItm_GetList(MCRow row, MCEventInfo info){
		return getList("getItm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Itm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmCols.viewCols(), down, info);
	}

	/** 
	  * Itm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmCols.sortPolicy());
	}


	/** 
	  * Usr:担当者 メインメソッド<p>
	  * 担当者マスタから担当者情報を取得する<br>
・担当者権限マスタの部門情報を付与する場合は、dtに適用日を指定する<br>
　担当者権限マスタの担当者情報を取得する場合は、referring_usr_acl_flgに「true」を指定し、dtに適用日を指定する<br>
　※これらの指定はサーバチェック時には無効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getUsr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getUsr_GetList(row, info);//リストの取得
		getUsr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getUsr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Usr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getUsr_GetList(MCRow row, MCEventInfo info){
		return getList("getUsr", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Usr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUsr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(UsrCols.viewCols(), down, info);
	}

	/** 
	  * Usr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUsr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(UsrCols.sortPolicy());
	}


	/** 
	  * SplnItm:販売計画品目 メインメソッド<p>
	  * 販売計画品目マスタから販売計画品目情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSplnItm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSplnItm_GetList(row, info);//リストの取得
		getSplnItm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSplnItm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SplnItm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSplnItm_GetList(MCRow row, MCEventInfo info){
		return getList("getSplnItm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SplnItm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnItm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SplnItmCols.viewCols(), down, info);
	}

	/** 
	  * SplnItm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnItm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SplnItmCols.sortPolicy());
	}


	/** 
	  * ItmDtl:品目詳細 メインメソッド<p>
	  * 品目詳細マスタから品目詳細情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtl_GetList(row, info);//リストの取得
		getItmDtl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtl_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlCols.sortPolicy());
	}


	/** 
	  * ItmDtlPurcUpri:品目詳細（購買単価用） メインメソッド<p>
	  * 品目詳細マスタから品目詳細情報(購買単価に使用するもの)を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlPurcUpri(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlPurcUpri_GetList(row, info);//リストの取得
		getItmDtlPurcUpri_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlPurcUpri_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlPurcUpri:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlPurcUpri_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlPurcUpri", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlPurcUpri:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpri_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlPurcUpriCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlPurcUpri:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlPurcUpri_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlPurcUpriCols.sortPolicy());
	}


	/** 
	  * ItmDtlProcUpri:品目詳細（加工単価用） メインメソッド<p>
	  * 品目詳細マスタから品目詳細情報(加工単価に使用するもの)を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlProcUpri(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlProcUpri_GetList(row, info);//リストの取得
		getItmDtlProcUpri_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlProcUpri_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlProcUpri:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlProcUpri_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlProcUpri", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlProcUpri:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpri_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlProcUpriCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlProcUpri:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlProcUpri_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlProcUpriCols.sortPolicy());
	}


	/** 
	  * BpView:取引先View メインメソッド<p>
	  * 引数の検索区分（取引先入力補助検索区分）に対応する取引先情報を、取引先マスタViewから取得する<br>
・取引先名を「null」にする場合は、sundry_bp_nm_rem_flgを「true」を指定する<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を指定する<br>
・手入力時と存在チェック時に、チェック対象の取引先を参照取引先と比較する場合は、check_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBpView(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBpView_GetList(row, info);//リストの取得
		getBpView_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBpView_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BpView:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBpView_GetList(MCRow row, MCEventInfo info){
		return getList("getBpView", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BpView:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpView_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BpViewCols.viewCols(), down, info);
	}

	/** 
	  * BpView:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBpView_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BpViewCols.sortPolicy());
	}

}
