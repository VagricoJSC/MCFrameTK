package mcframe.clientMSUA.MSUAP0050;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0050.MSUAC_List.*;


//CLIENT_SETTING_IMPORT (START)
import mcframe.commonMS.constant.*;
import mcframe.clientCore.resource.MCConfig;
import mcframe.commonFS.constant.FSC_MODULE_ID;
//CLIENT_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MSUAP_List_MC_A extends mcframe.clientFXBA.FXBAP0020.FXBAP_ListLogicBase {
	/**
	 * サーバ側のコンボボックス共通クラス名を取得する。
	 *
	 * @return サーバ側のコンボボックス共通クラス名（パッケージも含む)
	 */
	@Override
	protected String getControlClassName() {
		return "mcframe.serverMSUA.MSUAL0050.MSUAL_List";
	}
	/** 
	  * PoCrctRsn:発注訂正理由 メインメソッド<p>
	  * 発注訂正理由テーブルから発注訂正理由を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPoCrctRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPoCrctRsn_GetList(row, info);//リストの取得
		getPoCrctRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPoCrctRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PoCrctRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPoCrctRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getPoCrctRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PoCrctRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoCrctRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PoCrctRsnCols.viewCols(), down, info);
	}

	/** 
	  * PoCrctRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoCrctRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PoCrctRsnCols.sortPolicy());
	}


	/** 
	  * PurcSrchTgtTyp:購買検索対象区分 メインメソッド<p>
	  * 購買検索対象区分を表す定数を取得する<br>
購買検索対象区分：購買管理サブモジュールで検索対象区分で指定できるＮＯを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcSrchTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcSrchTgtTyp_GetList(row, info);//リストの取得
		getPurcSrchTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcSrchTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcSrchTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcSrchTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PURC_SRCH_TGT_TYP.list(row);
	}
	/** 
	  * PurcSrchTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcSrchTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcSrchTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcSrchTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcSrchTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcSrchTgtTypCols.sortPolicy());
	}


	/** 
	  * PurcDlvSlipSrcTyp:購買納品書作成元区分 メインメソッド<p>
	  * 購買納品書作成元区分を表す定数を取得する<br>
購買納品書作成元区分：購買納品書の作成元となったトランザクションを表す。
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcDlvSlipSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcDlvSlipSrcTyp_GetList(row, info);//リストの取得
		getPurcDlvSlipSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcDlvSlipSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcDlvSlipSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcDlvSlipSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PURC_DLV_SLIP_SRC_TYP.list(row);
	}
	/** 
	  * PurcDlvSlipSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcDlvSlipSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcDlvSlipSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcDlvSlipSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcDlvSlipSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcDlvSlipSrcTypCols.sortPolicy());
	}

}
