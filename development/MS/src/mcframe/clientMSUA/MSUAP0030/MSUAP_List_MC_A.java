package mcframe.clientMSUA.MSUAP0030;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0030.MSUAC_List.*;


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
		return "mcframe.serverMSUA.MSUAL0030.MSUAL_List";
	}
	/** 
	  * WrkMng:案件管理 メインメソッド<p>
	  * 案件管理テーブルから案件管理情報を取得する<br>
・案件管理区分で絞り込む場合は、wrk_mng_typに案件管理区分を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWrkMng(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWrkMng_GetList(row, info);//リストの取得
		getWrkMng_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWrkMng_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WrkMng:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWrkMng_GetList(MCRow row, MCEventInfo info){
		return getList("getWrkMng", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * WrkMng:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkMng_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WrkMngCols.viewCols(), down, info);
	}

	/** 
	  * WrkMng:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkMng_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WrkMngCols.sortPolicy());
	}


	/** 
	  * SloCanRsn:受注取消理由 メインメソッド<p>
	  * 見積受注理由から、受注取消フラグがオンのものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloCanRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloCanRsn_GetList(row, info);//リストの取得
		getSloCanRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloCanRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloCanRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloCanRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getSloCanRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloCanRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloCanRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloCanRsnCols.viewCols(), down, info);
	}

	/** 
	  * SloCanRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloCanRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloCanRsnCols.sortPolicy());
	}


	/** 
	  * QtnRsltRsn:見積結果理由 メインメソッド<p>
	  * 見積受注理由テーブルから、見積結果フラグがオンのものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQtnRsltRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQtnRsltRsn_GetList(row, info);//リストの取得
		getQtnRsltRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQtnRsltRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QtnRsltRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQtnRsltRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getQtnRsltRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * QtnRsltRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnRsltRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QtnRsltRsnCols.viewCols(), down, info);
	}

	/** 
	  * QtnRsltRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnRsltRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QtnRsltRsnCols.sortPolicy());
	}


	/** 
	  * QtnTerm:見積条件 メインメソッド<p>
	  * 見積受注理由テーブルから、見積条件がオンのものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQtnTerm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQtnTerm_GetList(row, info);//リストの取得
		getQtnTerm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQtnTerm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QtnTerm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQtnTerm_GetList(MCRow row, MCEventInfo info){
		return getList("getQtnTerm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * QtnTerm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnTerm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QtnTermCols.viewCols(), down, info);
	}

	/** 
	  * QtnTerm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnTerm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QtnTermCols.sortPolicy());
	}


	/** 
	  * QtnSloRsn:見積受注理由 メインメソッド<p>
	  * 見積受注理由テーブルから、見積受注理由を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQtnSloRsn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQtnSloRsn_GetList(row, info);//リストの取得
		getQtnSloRsn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQtnSloRsn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QtnSloRsn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQtnSloRsn_GetList(MCRow row, MCEventInfo info){
		return getList("getQtnSloRsn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * QtnSloRsn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnSloRsn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QtnSloRsnCols.viewCols(), down, info);
	}

	/** 
	  * QtnSloRsn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnSloRsn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QtnSloRsnCols.sortPolicy());
	}


	/** 
	  * SlsBdgGrp:予算分類 メインメソッド<p>
	  * 販売予算テーブルから、販売予算の予算分類を取得する<br>
・検索権限で絞り込む場合は、rd_flgに「true」を指定する（無効）<br>
・売上部門が設定されているもののみに絞り込む場合は、dpt_flgに「true」を指定する<br>
・品目体系が設定されているもののみに絞り込む場合は、itm_grp_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsBdgGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsBdgGrp_GetList(row, info);//リストの取得
		getSlsBdgGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsBdgGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsBdgGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsBdgGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getSlsBdgGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SlsBdgGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsBdgGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsBdgGrpCols.viewCols(), down, info);
	}

	/** 
	  * SlsBdgGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsBdgGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsBdgGrpCols.sortPolicy());
	}


	/** 
	  * WrkSts:案件状況 メインメソッド<p>
	  * 案件管理で使用する案件状況を取得する<br>
案件管理区分に「1：案件状況」が設定されている案件管理情報を、案件管理テーブルから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWrkSts(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWrkSts_GetList(row, info);//リストの取得
		getWrkSts_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWrkSts_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WrkSts:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWrkSts_GetList(MCRow row, MCEventInfo info){
		return getList("getWrkSts", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * WrkSts:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkSts_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WrkStsCols.viewCols(), down, info);
	}

	/** 
	  * WrkSts:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkSts_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WrkStsCols.sortPolicy());
	}


	/** 
	  * SloAcc:受注確度 メインメソッド<p>
	  * 案件管理で使用する受注角度を取得する<br>
案件管理区分に「2：受注角度」が設定されている案件管理情報を、案件管理テーブルから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloAcc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloAcc_GetList(row, info);//リストの取得
		getSloAcc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloAcc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloAcc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloAcc_GetList(MCRow row, MCEventInfo info){
		return getList("getSloAcc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloAcc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloAcc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloAccCols.viewCols(), down, info);
	}

	/** 
	  * SloAcc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloAcc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloAccCols.sortPolicy());
	}


	/** 
	  * ActSts:活動状況 メインメソッド<p>
	  * 案件管理で使用する活動状況を取得する<br>
案件管理区分に「3：案件活動状況」が設定されている案件管理情報を、案件管理テーブルから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getActSts(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getActSts_GetList(row, info);//リストの取得
		getActSts_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getActSts_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ActSts:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getActSts_GetList(MCRow row, MCEventInfo info){
		return getList("getActSts", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ActSts:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getActSts_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ActStsCols.viewCols(), down, info);
	}

	/** 
	  * ActSts:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getActSts_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ActStsCols.sortPolicy());
	}


	/** 
	  * SloLoc:受注場所 メインメソッド<p>
	  * 受注引当マスタから場所を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloLoc_GetList(row, info);//リストの取得
		getSloLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getSloLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloLocCols.viewCols(), down, info);
	}

	/** 
	  * SloLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloLocCols.sortPolicy());
	}


	/** 
	  * SloAllocGrp:受注総量引当場所グループ メインメソッド<p>
	  * 受注引当マスタから総量引当場所グループを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloAllocGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloAllocGrp_GetList(row, info);//リストの取得
		getSloAllocGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloAllocGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloAllocGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloAllocGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getSloAllocGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloAllocGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloAllocGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloAllocGrpCols.viewCols(), down, info);
	}

	/** 
	  * SloAllocGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloAllocGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloAllocGrpCols.sortPolicy());
	}


	/** 
	  * SloLgGrp:受注物流グループ メインメソッド<p>
	  * 受注引当マスタから物流グループを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloLgGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloLgGrp_GetList(row, info);//リストの取得
		getSloLgGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloLgGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloLgGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloLgGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getSloLgGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloLgGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloLgGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloLgGrpCols.viewCols(), down, info);
	}

	/** 
	  * SloLgGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloLgGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloLgGrpCols.sortPolicy());
	}


	/** 
	  * CstSloStkGd:受注引当可能格付（得意先対応） メインメソッド<p>
	  * 受注引当格付マスタから、受注可能な（格付マスタの受注フラグがオンである）格付を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCstSloStkGd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCstSloStkGd_GetList(row, info);//リストの取得
		getCstSloStkGd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCstSloStkGd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CstSloStkGd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCstSloStkGd_GetList(MCRow row, MCEventInfo info){
		return getList("getCstSloStkGd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CstSloStkGd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCstSloStkGd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CstSloStkGdCols.viewCols(), down, info);
	}

	/** 
	  * CstSloStkGd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCstSloStkGd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CstSloStkGdCols.sortPolicy());
	}


	/** 
	  * SplnVers:集計別販売計画バージョン メインメソッド<p>
	  * 集計別の月次販売計画のバージョンを取得する<br>
除外バージョンを指定した場合は、それを除いたバージョンを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSplnVers(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSplnVers_GetList(row, info);//リストの取得
		getSplnVers_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSplnVers_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SplnVers:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSplnVers_GetList(MCRow row, MCEventInfo info){
		return getList("getSplnVers", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SplnVers:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnVers_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SplnVersCols.viewCols(), down, info);
	}

	/** 
	  * SplnVers:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnVers_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SplnVersCols.sortPolicy());
	}


	/** 
	  * DmndLoc:需要場所 メインメソッド<p>
	  * 受注引当マスタから場所を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDmndLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDmndLoc_GetList(row, info);//リストの取得
		getDmndLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDmndLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DmndLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDmndLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getDmndLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DmndLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDmndLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DmndLocCols.viewCols(), down, info);
	}

	/** 
	  * DmndLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDmndLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DmndLocCols.sortPolicy());
	}


	/** 
	  * SloItmSub1:受注登録品目枝番１ メインメソッド<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから、枝番１および品目情報を取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloItmSub1(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloItmSub1_GetList(row, info);//リストの取得
		getSloItmSub1_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloItmSub1_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloItmSub1:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloItmSub1_GetList(MCRow row, MCEventInfo info){
		return getList("getSloItmSub1", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloItmSub1:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub1_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmSub1Cols.viewCols(), down, info);
	}

	/** 
	  * SloItmSub1:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub1_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmSub1Cols.sortPolicy());
	}


	/** 
	  * SloItmSub2:受注登録品目枝番２ メインメソッド<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから、枝番２および品目情報を取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloItmSub2(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloItmSub2_GetList(row, info);//リストの取得
		getSloItmSub2_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloItmSub2_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloItmSub2:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloItmSub2_GetList(MCRow row, MCEventInfo info){
		return getList("getSloItmSub2", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloItmSub2:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub2_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmSub2Cols.viewCols(), down, info);
	}

	/** 
	  * SloItmSub2:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub2_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmSub2Cols.sortPolicy());
	}


	/** 
	  * SloItmSub3:受注登録品目枝番３ メインメソッド<p>
	  * 引数の検索区分（品目入力補助検索区分）に応じて、品目マスタから、枝番３および品目情報を取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloItmSub3(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloItmSub3_GetList(row, info);//リストの取得
		getSloItmSub3_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloItmSub3_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloItmSub3:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloItmSub3_GetList(MCRow row, MCEventInfo info){
		return getList("getSloItmSub3", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloItmSub3:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub3_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmSub3Cols.viewCols(), down, info);
	}

	/** 
	  * SloItmSub3:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItmSub3_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmSub3Cols.sortPolicy());
	}


	/** 
	  * SloTrd:取引 メインメソッド<p>
	  * 取引情報を取引マスタから取得する<br>
引数の取引パタン区分を指定した場合は、対応する取引情報を取得する<br>
引数の機能ＩＤを指定した場合は、取引パタン区分を取引パタン制御情報から抽出し、抽出した取引パタン区分に対応する取引情報を取得する<br>
引数の機能IDは、引数の取引パタン区分が未指定か「null」の場合に有効
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloTrd(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloTrd_GetList(row, info);//リストの取得
		getSloTrd_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloTrd_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloTrd:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloTrd_GetList(MCRow row, MCEventInfo info){
		return getList("getSloTrd", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloTrd:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloTrd_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloTrdCols.viewCols(), down, info);
	}

	/** 
	  * SloTrd:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloTrd_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloTrdCols.sortPolicy());
	}


	/** 
	  * WrkNo:案件ＮＯ メインメソッド<p>
	  * 案件テーブルから案件情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWrkNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWrkNo_GetList(row, info);//リストの取得
		getWrkNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWrkNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WrkNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWrkNo_GetList(MCRow row, MCEventInfo info){
		return getList("getWrkNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * WrkNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WrkNoCols.viewCols(), down, info);
	}

	/** 
	  * WrkNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WrkNoCols.sortPolicy());
	}


	/** 
	  * Sno1_WrkNo:手配ＮＯ１＿案件ＮＯ メインメソッド<p>
	  * 案件手配紐付ビューから、取消していないレコードの手配ＮＯと案件ＮＯを取得する<br>
案件手配紐付ビュー：案件情報と案件手配紐付情報とを結合したビュー
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSno1_WrkNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSno1_WrkNo_GetList(row, info);//リストの取得
		getSno1_WrkNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSno1_WrkNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Sno1_WrkNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSno1_WrkNo_GetList(MCRow row, MCEventInfo info){
		return getList("getSno1_WrkNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Sno1_WrkNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSno1_WrkNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(Sno1_WrkNoCols.viewCols(), down, info);
	}

	/** 
	  * Sno1_WrkNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSno1_WrkNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(Sno1_WrkNoCols.sortPolicy());
	}


	/** 
	  * SloNo:受注ＮＯ メインメソッド<p>
	  * 取消していない受注の受注ＮＯを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloNo_GetList(row, info);//リストの取得
		getSloNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloNo_GetList(MCRow row, MCEventInfo info){
		return getList("getSloNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloNoCols.viewCols(), down, info);
	}

	/** 
	  * SloNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloNoCols.sortPolicy());
	}


	/** 
	  * SetItm:品揃 メインメソッド<p>
	  * 以下の引数に対応する品揃テーブルから品情揃報を取得する<br>
　代表品目、代表枝番１－３、 代表品目単位
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSetItm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSetItm_GetList(row, info);//リストの取得
		getSetItm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSetItm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SetItm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSetItm_GetList(MCRow row, MCEventInfo info){
		return getList("getSetItm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SetItm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetItm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SetItmCols.viewCols(), down, info);
	}

	/** 
	  * SetItm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSetItm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SetItmCols.sortPolicy());
	}


	/** 
	  * SloItm:受注登録品目 メインメソッド<p>
	  * 引数の検索区分（品目入力補助検索区分）に対応する、品目および品目情報を、品目マスタから取得する<br>
・品名をNULLにする場合は、sundry_itm_nm_rem_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloItm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloItm_GetList(row, info);//リストの取得
		getSloItm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloItm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloItm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloItm_GetList(MCRow row, MCEventInfo info){
		return getList("getSloItm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SloItm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloItmCols.viewCols(), down, info);
	}

	/** 
	  * SloItm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloItm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloItmCols.sortPolicy());
	}

}
