package mcframe.clientMSUA.MSUAP0010;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


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
		return "mcframe.serverMSUA.MSUAL0010.MSUAL_List";
	}
	/** 
	  * SpplByLoc:発注先（場所対応） メインメソッド<p>
	  * 引数の場所に対応する発注先を、場所マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSpplByLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSpplByLoc_GetList(row, info);//リストの取得
		getSpplByLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSpplByLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SpplByLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSpplByLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getSpplByLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SpplByLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSpplByLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SpplByLocCols.viewCols(), down, info);
	}

	/** 
	  * SpplByLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSpplByLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SpplByLocCols.sortPolicy());
	}


	/** 
	  * InXfrTyp:積送品区分 メインメソッド<p>
	  * 積送品区分を表す定数を取得する<br>
積送品区分：在庫が積送中であるか表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInXfrTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInXfrTyp_GetList(row, info);//リストの取得
		getInXfrTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInXfrTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InXfrTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInXfrTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IN_XFR_TYP.list(row);
	}
	/** 
	  * InXfrTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInXfrTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InXfrTypCols.viewCols(), down, info);
	}

	/** 
	  * InXfrTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInXfrTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InXfrTypCols.sortPolicy());
	}


	/** 
	  * StkIdTyp:在庫識別区分 メインメソッド<p>
	  * 在庫識別区分を表す定数を取得する<br>
在庫識別区分：他社資産在庫の在庫の用途を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkIdTyp_GetList(row, info);//リストの取得
		getStkIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkIdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkIdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_STK_ID_TYP.list(row);
	}
	/** 
	  * StkIdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkIdTypCols.viewCols(), down, info);
	}

	/** 
	  * StkIdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkIdTypCols.sortPolicy());
	}


	/** 
	  * ItmOrdLdStsTyp:品目オーダ負荷状況区分 メインメソッド<p>
	  * 品目オーダ負荷状況区分を表す定数を取得する<br>
品目オーダ負荷状況区分：品目オーダレベルの状態を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmOrdLdStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmOrdLdStsTyp_GetList(row, info);//リストの取得
		getItmOrdLdStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmOrdLdStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmOrdLdStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmOrdLdStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ITM_ORD_LD_STS_TYP.list(row);
	}
	/** 
	  * ItmOrdLdStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOrdLdStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmOrdLdStsTypCols.viewCols(), down, info);
	}

	/** 
	  * ItmOrdLdStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOrdLdStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmOrdLdStsTypCols.sortPolicy());
	}


	/** 
	  * LdDtlTyp:負荷明細区分 メインメソッド<p>
	  * 負荷明細区分を表す定数を取得する<br>
負荷明細区分：負荷確認における負荷項目のラベルを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLdDtlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLdDtlTyp_GetList(row, info);//リストの取得
		getLdDtlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLdDtlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LdDtlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLdDtlTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_LD_DTL_TYP.list(row);
	}
	/** 
	  * LdDtlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLdDtlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LdDtlTypCols.viewCols(), down, info);
	}

	/** 
	  * LdDtlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLdDtlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LdDtlTypCols.sortPolicy());
	}


	/** 
	  * LdSubCalcTyp:負荷内訳計算区分 メインメソッド<p>
	  * 負荷内訳計算区分を表す定数を取得する<br>
負荷内訳計算区分：負荷の内訳計算方法の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLdSubCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLdSubCalcTyp_GetList(row, info);//リストの取得
		getLdSubCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLdSubCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LdSubCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLdSubCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_LD_SUB_CALC_TYP.list(row);
	}
	/** 
	  * LdSubCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLdSubCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LdSubCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * LdSubCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLdSubCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LdSubCalcTypCols.sortPolicy());
	}


	/** 
	  * DmndTyp:需要区分 メインメソッド<p>
	  * 需要区分を表す定数を取得する<br>
需要区分：需要元の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDmndTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDmndTyp_GetList(row, info);//リストの取得
		getDmndTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDmndTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DmndTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDmndTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_DMND_TYP.list(row);
	}
	/** 
	  * DmndTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDmndTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DmndTypCols.viewCols(), down, info);
	}

	/** 
	  * DmndTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDmndTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DmndTypCols.sortPolicy());
	}


	/** 
	  * IoTyp:入出庫区分 メインメソッド<p>
	  * 入出庫区分を表す定数を取得する<br>
入出庫区分：入庫と出庫を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoTyp_GetList(row, info);//リストの取得
		getIoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IO_TYP.list(row);
	}
	/** 
	  * IoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoTypCols.viewCols(), down, info);
	}

	/** 
	  * IoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoTypCols.sortPolicy());
	}


	/** 
	  * TrnTyp:トランザクション区分 メインメソッド<p>
	  * トランザクション区分を表す定数を取得する<br>
トランザクション区分：受払実績の作成元となった実績トランザクションの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTrnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTrnTyp_GetList(row, info);//リストの取得
		getTrnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTrnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * TrnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTrnTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_TRN_TYP.list(row);
	}
	/** 
	  * TrnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TrnTypCols.viewCols(), down, info);
	}

	/** 
	  * TrnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTrnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TrnTypCols.sortPolicy());
	}


	/** 
	  * IoActTyp:受払区分 メインメソッド<p>
	  * 受払区分を表す定数を取得する<br>
受払区分：受払の種類を表す 
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoActTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoActTyp_GetList(row, info);//リストの取得
		getIoActTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoActTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoActTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoActTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IO_ACT_TYP.list(row);
	}
	/** 
	  * IoActTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoActTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoActTypCols.viewCols(), down, info);
	}

	/** 
	  * IoActTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoActTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoActTypCols.sortPolicy());
	}


	/** 
	  * FixNoTyp:確定ＮＯ区分 メインメソッド<p>
	  * 確定ＮＯ区分を表す定数を取得する<br>
確定ＮＯ区分：確定ＮＯの種類を表す<br>
※後続の入出庫取引が限定された在庫に対して特定NOを割り当てる
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getFixNoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getFixNoTyp_GetList(row, info);//リストの取得
		getFixNoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getFixNoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * FixNoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getFixNoTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_FIX_NO_TYP.list(row);
	}
	/** 
	  * FixNoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFixNoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(FixNoTypCols.viewCols(), down, info);
	}

	/** 
	  * FixNoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFixNoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(FixNoTypCols.sortPolicy());
	}


	/** 
	  * StkInspTyp:在庫検査区分 メインメソッド<p>
	  * 在庫検査区分を表す定数を取得する<br>
在庫検査区分：在庫の検査状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkInspTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkInspTyp_GetList(row, info);//リストの取得
		getStkInspTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkInspTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkInspTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkInspTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_STK_INSP_TYP.list(row);
	}
	/** 
	  * StkInspTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkInspTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkInspTypCols.viewCols(), down, info);
	}

	/** 
	  * StkInspTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkInspTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkInspTypCols.sortPolicy());
	}


	/** 
	  * InToIdTyp:納入先識別区分 メインメソッド<p>
	  * 納入先識別区分を表す定数を取得する<br>
納入先識別区分：納入先の住所情報などの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInToIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInToIdTyp_GetList(row, info);//リストの取得
		getInToIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInToIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InToIdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInToIdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IN_TO_ID_TYP.list(row);
	}
	/** 
	  * InToIdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInToIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InToIdTypCols.viewCols(), down, info);
	}

	/** 
	  * InToIdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInToIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InToIdTypCols.sortPolicy());
	}


	/** 
	  * DlvIdTyp:納品先識別区分 メインメソッド<p>
	  * 納品先識別区分を表す定数を取得する<br>
納品先識別区分：送付先の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDlvIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDlvIdTyp_GetList(row, info);//リストの取得
		getDlvIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDlvIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DlvIdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDlvIdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_DLV_ID_TYP.list(row);
	}
	/** 
	  * DlvIdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlvIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DlvIdTypCols.viewCols(), down, info);
	}

	/** 
	  * DlvIdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlvIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DlvIdTypCols.sortPolicy());
	}


	/** 
	  * ShipToIdTyp:送付先識別区分 メインメソッド<p>
	  * 送付先識別区分を表す定数を取得する<br>
送付先識別区分：送付先の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipToIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipToIdTyp_GetList(row, info);//リストの取得
		getShipToIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipToIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipToIdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipToIdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SHIP_TO_ID_TYP.list(row);
	}
	/** 
	  * ShipToIdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipToIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipToIdTypCols.viewCols(), down, info);
	}

	/** 
	  * ShipToIdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipToIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipToIdTypCols.sortPolicy());
	}


	/** 
	  * ShipRqstIdTyp:出荷依頼先識別区分 メインメソッド<p>
	  * 出荷依頼先識別区分を表す定数を取得する<br>
出荷依頼先識別区分：インボイスによる出荷依頼先の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipRqstIdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipRqstIdTyp_GetList(row, info);//リストの取得
		getShipRqstIdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipRqstIdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipRqstIdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipRqstIdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SHIP_RQST_ID_TYP.list(row);
	}
	/** 
	  * ShipRqstIdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipRqstIdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipRqstIdTypCols.viewCols(), down, info);
	}

	/** 
	  * ShipRqstIdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipRqstIdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipRqstIdTypCols.sortPolicy());
	}


	/** 
	  * ShipAssortTyp:出荷品揃区分 メインメソッド<p>
	  * 出荷品揃区分を表す定数を取得する<br>
出荷品揃区分：品揃区分を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipAssortTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipAssortTyp_GetList(row, info);//リストの取得
		getShipAssortTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipAssortTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipAssortTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipAssortTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SHIP_ASSORT_TYP.list(row);
	}
	/** 
	  * ShipAssortTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipAssortTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipAssortTypCols.viewCols(), down, info);
	}

	/** 
	  * ShipAssortTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipAssortTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipAssortTypCols.sortPolicy());
	}


	/** 
	  * AdvShipCtrlTyp:前受金出荷制御区分 メインメソッド<p>
	  * 前受金出荷制御区分を表す定数を取得する<br>
前受金出荷制御区分：前受金が入金されるまで、出荷できる・できないを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAdvShipCtrlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAdvShipCtrlTyp_GetList(row, info);//リストの取得
		getAdvShipCtrlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAdvShipCtrlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AdvShipCtrlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAdvShipCtrlTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ADV_SHIP_CTRL_TYP.list(row);
	}
	/** 
	  * AdvShipCtrlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdvShipCtrlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AdvShipCtrlTypCols.viewCols(), down, info);
	}

	/** 
	  * AdvShipCtrlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdvShipCtrlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AdvShipCtrlTypCols.sortPolicy());
	}


	/** 
	  * SlsSchdSrcTyp:売上予定作成元区分 メインメソッド<p>
	  * 売上予定作成元区分を表す定数を取得する<br>
売上予定作成元区分：売上予定を作成元となったデータを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsSchdSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsSchdSrcTyp_GetList(row, info);//リストの取得
		getSlsSchdSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsSchdSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsSchdSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsSchdSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLS_SCHD_SRC_TYP.list(row);
	}
	/** 
	  * SlsSchdSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsSchdSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsSchdSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsSchdSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsSchdSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsSchdSrcTypCols.sortPolicy());
	}


	/** 
	  * SretSchdStsTyp:売上返品予定状況区分 メインメソッド<p>
	  * 売上返品予定状況区分を表す定数を取得する<br>
売上返品予定状況区分：売上返品予定の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSretSchdStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSretSchdStsTyp_GetList(row, info);//リストの取得
		getSretSchdStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSretSchdStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SretSchdStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSretSchdStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SRET_SCHD_STS_TYP.list(row);
	}
	/** 
	  * SretSchdStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSretSchdStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SretSchdStsTypCols.viewCols(), down, info);
	}

	/** 
	  * SretSchdStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSretSchdStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SretSchdStsTypCols.sortPolicy());
	}


	/** 
	  * AccptStsTyp:検収状況区分 メインメソッド<p>
	  * 検収状況区分を表す定数を取得する<br>
検収状況区分：検収売上の検収状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAccptStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAccptStsTyp_GetList(row, info);//リストの取得
		getAccptStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAccptStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AccptStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAccptStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ACCPT_STS_TYP.list(row);
	}
	/** 
	  * AccptStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAccptStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AccptStsTypCols.viewCols(), down, info);
	}

	/** 
	  * AccptStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAccptStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AccptStsTypCols.sortPolicy());
	}


	/** 
	  * SlsTgtTyp:売上対象区分 メインメソッド<p>
	  * 売上対象区分を表す定数を取得する<br>
売上対象区分：売上対象を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsTgtTyp_GetList(row, info);//リストの取得
		getSlsTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLS_TGT_TYP.list(row);
	}
	/** 
	  * SlsTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsTgtTypCols.sortPolicy());
	}


	/** 
	  * AllocStsTyp:引当状況区分 メインメソッド<p>
	  * 引当状況区分を表す定数を取得する<br>
引当状況区分：引当の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAllocStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAllocStsTyp_GetList(row, info);//リストの取得
		getAllocStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAllocStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AllocStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAllocStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ALLOC_STS_TYP.list(row);
	}
	/** 
	  * AllocStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AllocStsTypCols.viewCols(), down, info);
	}

	/** 
	  * AllocStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAllocStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AllocStsTypCols.sortPolicy());
	}


	/** 
	  * PrStsTyp:進捗状況区分 メインメソッド<p>
	  * 進捗状況区分を表す定数を取得する<br>
進捗状況区分：在庫物流管理の進捗状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPrStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPrStsTyp_GetList(row, info);//リストの取得
		getPrStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPrStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PrStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPrStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PR_STS_TYP.list(row);
	}
	/** 
	  * PrStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPrStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PrStsTypCols.viewCols(), down, info);
	}

	/** 
	  * PrStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPrStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PrStsTypCols.sortPolicy());
	}


	/** 
	  * SlsStsTyp:販売状況区分 メインメソッド<p>
	  * 販売状況区分を表す定数を取得する<br>
販売状況区分：販売の進捗を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsStsTyp_GetList(row, info);//リストの取得
		getSlsStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLS_STS_TYP.list(row);
	}
	/** 
	  * SlsStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsStsTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsStsTypCols.sortPolicy());
	}


	/** 
	  * SlsSrchTgtTyp:販売検索対象区分 メインメソッド<p>
	  * 販売検索対象区分を表す定数を取得する<br>
販売検索対象区分：販売管理サブモジュールの検索対象区分で指定できるＮＯを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsSrchTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsSrchTgtTyp_GetList(row, info);//リストの取得
		getSlsSrchTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsSrchTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsSrchTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsSrchTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLS_SRCH_TGT_TYP.list(row);
	}
	/** 
	  * SlsSrchTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsSrchTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsSrchTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsSrchTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsSrchTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsSrchTgtTypCols.sortPolicy());
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
	  * ProdSrchTgtTyp:生産検索対象区分 メインメソッド<p>
	  * 生産検索対象区分を表す定数を取得する<br>
生産検索対象区分：生産管理サブモジュールで検索対象区分で指定できるＮＯを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProdSrchTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProdSrchTgtTyp_GetList(row, info);//リストの取得
		getProdSrchTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProdSrchTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProdSrchTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProdSrchTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PROD_SRCH_TGT_TYP.list(row);
	}
	/** 
	  * ProdSrchTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdSrchTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProdSrchTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * ProdSrchTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdSrchTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProdSrchTgtTypCols.sortPolicy());
	}


	/** 
	  * StkSrchTgtTyp:在庫物流検索対象区分 メインメソッド<p>
	  * 在庫物流検索対象区分を表す定数を取得する<br>
在庫物流検索対象区分：在庫物流サブモジュールの検索対象区分で指定できるＮＯを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkSrchTgtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkSrchTgtTyp_GetList(row, info);//リストの取得
		getStkSrchTgtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkSrchTgtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkSrchTgtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkSrchTgtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_STK_SRCH_TGT_TYP.list(row);
	}
	/** 
	  * StkSrchTgtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkSrchTgtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkSrchTgtTypCols.viewCols(), down, info);
	}

	/** 
	  * StkSrchTgtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkSrchTgtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkSrchTgtTypCols.sortPolicy());
	}


	/** 
	  * PoSchdSrcTyp:発注予定作成元区分 メインメソッド<p>
	  * 発注予定作成元区分を表す定数を取得する<br>
発注予定作成元区分：発注予定の元となった業務を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPoSchdSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPoSchdSrcTyp_GetList(row, info);//リストの取得
		getPoSchdSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPoSchdSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PoSchdSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPoSchdSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PO_SCHD_SRC_TYP.list(row);
	}
	/** 
	  * PoSchdSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoSchdSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PoSchdSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * PoSchdSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoSchdSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PoSchdSrcTypCols.sortPolicy());
	}


	/** 
	  * PurcSrcTyp:仕入作成元区分 メインメソッド<p>
	  * 仕入作成元区分を表す定数を取得する<br>
仕入作成元区分：VMIの仕入実績の作成元を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcSrcTyp_GetList(row, info);//リストの取得
		getPurcSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PURC_SRC_TYP.list(row);
	}
	/** 
	  * PurcSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcSrcTypCols.sortPolicy());
	}


	/** 
	  * PoSchdChgTyp:発注予定変更区分 メインメソッド<p>
	  * 発注予定変更区分を表す定数を取得する<br>
発注予定変更区分：発注予定の変更の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPoSchdChgTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPoSchdChgTyp_GetList(row, info);//リストの取得
		getPoSchdChgTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPoSchdChgTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PoSchdChgTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPoSchdChgTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PO_SCHD_CHG_TYP.list(row);
	}
	/** 
	  * PoSchdChgTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoSchdChgTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PoSchdChgTypCols.viewCols(), down, info);
	}

	/** 
	  * PoSchdChgTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoSchdChgTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PoSchdChgTypCols.sortPolicy());
	}


	/** 
	  * UpriModTyp:単価訂正理由区分 メインメソッド<p>
	  * 単価訂正理由区分を表す定数を取得する<br>
単価訂正理由区分：下請法対象業者の注文の単価（仮単価の場合）を訂正する場合の理由を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getUpriModTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getUpriModTyp_GetList(row, info);//リストの取得
		getUpriModTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getUpriModTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * UpriModTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getUpriModTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_UPRI_MOD_TYP.list(row);
	}
	/** 
	  * UpriModTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUpriModTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(UpriModTypCols.viewCols(), down, info);
	}

	/** 
	  * UpriModTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getUpriModTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(UpriModTypCols.sortPolicy());
	}


	/** 
	  * PoSchdStsTyp:発注予定状況区分 メインメソッド<p>
	  * 発注予定状況区分を表す定数を取得する<br>
発注予定状況区分：発注予定状況のステータスを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPoSchdStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPoSchdStsTyp_GetList(row, info);//リストの取得
		getPoSchdStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPoSchdStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PoSchdStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPoSchdStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PO_SCHD_STS_TYP.list(row);
	}
	/** 
	  * PoSchdStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoSchdStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PoSchdStsTypCols.viewCols(), down, info);
	}

	/** 
	  * PoSchdStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoSchdStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PoSchdStsTypCols.sortPolicy());
	}


	/** 
	  * PurcStsTyp: メインメソッド<p>
	  * 購買状況区分を表す定数を取得する<br>
購買状況区分：購買の進捗を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcStsTyp_GetList(row, info);//リストの取得
		getPurcStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PURC_STS_TYP.list(row);
	}
	/** 
	  * PurcStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcStsTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcStsTypCols.sortPolicy());
	}


	/** 
	  * DrctDlvTyp:直納区分 メインメソッド<p>
	  * 直納区分を表す定数を取得する<br>
直納区分：直送の取引かどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDrctDlvTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDrctDlvTyp_GetList(row, info);//リストの取得
		getDrctDlvTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDrctDlvTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DrctDlvTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDrctDlvTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_DRCT_DLV_TYP.list(row);
	}
	/** 
	  * DrctDlvTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDrctDlvTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DrctDlvTypCols.viewCols(), down, info);
	}

	/** 
	  * DrctDlvTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDrctDlvTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DrctDlvTypCols.sortPolicy());
	}


	/** 
	  * PurcUnfixStr:仕入未確定文字列 メインメソッド<p>
	  * 仕入未確定文字列を表す定数を取得する<br>
仕入未確定文字列：仕入時にロット、サブロット、格付CDが未確定の場合に使用する固定値を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcUnfixStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcUnfixStr_GetList(row, info);//リストの取得
		getPurcUnfixStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcUnfixStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcUnfixStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcUnfixStr_GetList(MCRow row, MCEventInfo info){
		return MSC_PURC_UNFIX_STR.list(row);
	}
	/** 
	  * PurcUnfixStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcUnfixStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcUnfixStrCols.viewCols(), down, info);
	}

	/** 
	  * PurcUnfixStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcUnfixStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcUnfixStrCols.sortPolicy());
	}


	/** 
	  * OpRplMtdTyp:発注点在庫補充方法区分 メインメソッド<p>
	  * 発注点在庫補充方法区分を表す定数を取得する<br>
発注点在庫補充方法区分：発注点在庫補充における補充方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOpRplMtdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOpRplMtdTyp_GetList(row, info);//リストの取得
		getOpRplMtdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOpRplMtdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * OpRplMtdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOpRplMtdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_OP_RPL_MTD_TYP.list(row);
	}
	/** 
	  * OpRplMtdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOpRplMtdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OpRplMtdTypCols.viewCols(), down, info);
	}

	/** 
	  * OpRplMtdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOpRplMtdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OpRplMtdTypCols.sortPolicy());
	}


	/** 
	  * WrkMngTyp:案件管理区分 メインメソッド<p>
	  * 案件管理区分を表す定数を取得する<br>
案件管理区分：案件管理の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWrkMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWrkMngTyp_GetList(row, info);//リストの取得
		getWrkMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWrkMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WrkMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWrkMngTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_WRK_MNG_TYP.list(row);
	}
	/** 
	  * WrkMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WrkMngTypCols.viewCols(), down, info);
	}

	/** 
	  * WrkMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WrkMngTypCols.sortPolicy());
	}


	/** 
	  * QtnTyp:見積区分 メインメソッド<p>
	  * 見積区分を表す定数を取得する<br>
見積区分：見積の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQtnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQtnTyp_GetList(row, info);//リストの取得
		getQtnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQtnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QtnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQtnTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_QTN_TYP.list(row);
	}
	/** 
	  * QtnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QtnTypCols.viewCols(), down, info);
	}

	/** 
	  * QtnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QtnTypCols.sortPolicy());
	}


	/** 
	  * IoSchdTyp:受払予定区分 メインメソッド<p>
	  * 受払予定区分を表す定数を取得する<br>
受払予定区分：受払予定の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoSchdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoSchdTyp_GetList(row, info);//リストの取得
		getIoSchdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoSchdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoSchdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoSchdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IO_SCHD_TYP.list(row);
	}
	/** 
	  * IoSchdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSchdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoSchdTypCols.viewCols(), down, info);
	}

	/** 
	  * IoSchdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSchdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoSchdTypCols.sortPolicy());
	}


	/** 
	  * IoSchdStsTyp:受払予定状況区分 メインメソッド<p>
	  * 受払予定状況区分を表す定数を取得する<br>
受払予定状況区分：受払予定区分に対する進捗状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoSchdStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoSchdStsTyp_GetList(row, info);//リストの取得
		getIoSchdStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoSchdStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoSchdStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoSchdStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IO_SCHD_STS_TYP.list(row);
	}
	/** 
	  * IoSchdStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSchdStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoSchdStsTypCols.viewCols(), down, info);
	}

	/** 
	  * IoSchdStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSchdStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoSchdStsTypCols.sortPolicy());
	}


	/** 
	  * IoSchdSubTyp:受払予定予備区分 メインメソッド<p>
	  * 受払予定予備区分を表す定数を取得する<br>
受払予定予備区分：受払予定予備NOに入る値の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoSchdSubTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoSchdSubTyp_GetList(row, info);//リストの取得
		getIoSchdSubTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoSchdSubTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoSchdSubTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoSchdSubTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IO_SCHD_SUB_TYP.list(row);
	}
	/** 
	  * IoSchdSubTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSchdSubTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoSchdSubTypCols.viewCols(), down, info);
	}

	/** 
	  * IoSchdSubTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoSchdSubTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoSchdSubTypCols.sortPolicy());
	}


	/** 
	  * ShortOpeTyp:不足時処理区分 メインメソッド<p>
	  * 不足時処理区分を表す定数を取得する<br>
不足時処理区分：提案行に対して数量を満たす在庫が存在しない場合、以降のロット提案処理を継続するかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShortOpeTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShortOpeTyp_GetList(row, info);//リストの取得
		getShortOpeTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShortOpeTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShortOpeTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShortOpeTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SHORT_OPE_TYP.list(row);
	}
	/** 
	  * ShortOpeTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShortOpeTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShortOpeTypCols.viewCols(), down, info);
	}

	/** 
	  * ShortOpeTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShortOpeTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShortOpeTypCols.sortPolicy());
	}


	/** 
	  * SchdStkTyp:予定在庫区分 メインメソッド<p>
	  * 予定在庫区分を表す定数を取得する<br>
予定在庫区分：引当処理の結果に返す予定在庫の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSchdStkTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSchdStkTyp_GetList(row, info);//リストの取得
		getSchdStkTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSchdStkTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SchdStkTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSchdStkTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SCHD_STK_TYP.list(row);
	}
	/** 
	  * SchdStkTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSchdStkTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SchdStkTypCols.viewCols(), down, info);
	}

	/** 
	  * SchdStkTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSchdStkTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SchdStkTypCols.sortPolicy());
	}


	/** 
	  * OrdGnrtTyp:オーダ生成区分 メインメソッド<p>
	  * オーダ生成区分を表す定数を取得する<br>
オーダ生成区分：品目オーダの生成元を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOrdGnrtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOrdGnrtTyp_GetList(row, info);//リストの取得
		getOrdGnrtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOrdGnrtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * OrdGnrtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOrdGnrtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ORD_GNRT_TYP.list(row);
	}
	/** 
	  * OrdGnrtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOrdGnrtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OrdGnrtTypCols.viewCols(), down, info);
	}

	/** 
	  * OrdGnrtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOrdGnrtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OrdGnrtTypCols.sortPolicy());
	}


	/** 
	  * RqmtGnrtTyp:日次生産依頼生成区分 メインメソッド<p>
	  * 日次生産依頼生成区分を表す定数を取得する<br>
日次生産依頼生成区分：日次生産依頼の生成元を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRqmtGnrtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRqmtGnrtTyp_GetList(row, info);//リストの取得
		getRqmtGnrtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRqmtGnrtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RqmtGnrtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRqmtGnrtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_RQMT_GNRT_TYP.list(row);
	}
	/** 
	  * RqmtGnrtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRqmtGnrtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RqmtGnrtTypCols.viewCols(), down, info);
	}

	/** 
	  * RqmtGnrtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRqmtGnrtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RqmtGnrtTypCols.sortPolicy());
	}


	/** 
	  * ItmOrdTyp:品目オーダ区分 メインメソッド<p>
	  * 品目オーダ区分を表す定数を取得する<br>
品目オーダ区分：品目オーダの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmOrdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmOrdTyp_GetList(row, info);//リストの取得
		getItmOrdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmOrdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmOrdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmOrdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ITM_ORD_TYP.list(row);
	}
	/** 
	  * ItmOrdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOrdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmOrdTypCols.viewCols(), down, info);
	}

	/** 
	  * ItmOrdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOrdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmOrdTypCols.sortPolicy());
	}


	/** 
	  * ItmOrdStsTyp:品目オーダ状況区分 メインメソッド<p>
	  * 品目オーダ状況区分を表す定数を取得する<br>
品目オーダ状況区分：品目オーダの状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmOrdStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmOrdStsTyp_GetList(row, info);//リストの取得
		getItmOrdStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmOrdStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmOrdStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmOrdStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ITM_ORD_STS_TYP.list(row);
	}
	/** 
	  * ItmOrdStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOrdStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmOrdStsTypCols.viewCols(), down, info);
	}

	/** 
	  * ItmOrdStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOrdStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmOrdStsTypCols.sortPolicy());
	}


	/** 
	  * MrpRqmtTyp:ＭＲＰ所要区分 メインメソッド<p>
	  * ＭＲＰ所要区分を表す定数を取得する<br>
ＭＲＰ所要区分：ＭＲＰ所要の生成元を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrpRqmtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrpRqmtTyp_GetList(row, info);//リストの取得
		getMrpRqmtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrpRqmtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrpRqmtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrpRqmtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MRP_RQMT_TYP.list(row);
	}
	/** 
	  * MrpRqmtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpRqmtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrpRqmtTypCols.viewCols(), down, info);
	}

	/** 
	  * MrpRqmtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpRqmtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrpRqmtTypCols.sortPolicy());
	}


	/** 
	  * OperOrdStsTyp:工程オーダ状況区分 メインメソッド<p>
	  * 工程オーダ状況区分を表す定数を取得する<br>
工程オーダ状況区分：工程オーダの状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getOperOrdStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getOperOrdStsTyp_GetList(row, info);//リストの取得
		getOperOrdStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getOperOrdStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * OperOrdStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getOperOrdStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_OPER_ORD_STS_TYP.list(row);
	}
	/** 
	  * OperOrdStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOperOrdStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(OperOrdStsTypCols.viewCols(), down, info);
	}

	/** 
	  * OperOrdStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getOperOrdStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(OperOrdStsTypCols.sortPolicy());
	}


	/** 
	  * MrpCntrTyp:ＭＲＰカウンタ区分 メインメソッド<p>
	  * ＭＲＰカウンタ区分を表す定数を取得する<br>
ＭＲＰカウンタ区分：ＭＲＰで発番するカウンタの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrpCntrTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrpCntrTyp_GetList(row, info);//リストの取得
		getMrpCntrTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrpCntrTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrpCntrTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrpCntrTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MRP_CNTR_TYP.list(row);
	}
	/** 
	  * MrpCntrTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpCntrTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrpCntrTypCols.viewCols(), down, info);
	}

	/** 
	  * MrpCntrTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpCntrTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrpCntrTypCols.sortPolicy());
	}


	/** 
	  * SimMrpTyp:シミュレーションＭＲＰ区分 メインメソッド<p>
	  * シミュレーションＭＲＰ区分を表す定数を取得する<br>
シミュレーションＭＲＰ区分：シミュレーションＭＲＰの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSimMrpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSimMrpTyp_GetList(row, info);//リストの取得
		getSimMrpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSimMrpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SimMrpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSimMrpTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SIM_MRP_TYP.list(row);
	}
	/** 
	  * SimMrpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSimMrpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SimMrpTypCols.viewCols(), down, info);
	}

	/** 
	  * SimMrpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSimMrpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SimMrpTypCols.sortPolicy());
	}


	/** 
	  * MrpTyp:ＭＲＰ区分 メインメソッド<p>
	  * ＭＲＰ区分を表す定数を取得する<br>
ＭＲＰ区分：ＭＲＰの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrpTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrpTyp_GetList(row, info);//リストの取得
		getMrpTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrpTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrpTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrpTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MRP_TYP.list(row);
	}
	/** 
	  * MrpTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrpTypCols.viewCols(), down, info);
	}

	/** 
	  * MrpTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrpTypCols.sortPolicy());
	}


	/** 
	  * MrpDataTyp:ＭＲＰ用データ区分 メインメソッド<p>
	  * ＭＲＰ用データ区分を表す定数を取得する<br>
ＭＲＰ用データ区分：ＭＲＰの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrpDataTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrpDataTyp_GetList(row, info);//リストの取得
		getMrpDataTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrpDataTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrpDataTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrpDataTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MRP_DATA_TYP.list(row);
	}
	/** 
	  * MrpDataTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpDataTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrpDataTypCols.viewCols(), down, info);
	}

	/** 
	  * MrpDataTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrpDataTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrpDataTypCols.sortPolicy());
	}


	/** 
	  * MfgSoAprvTyp:製造所出荷承認結果区分 メインメソッド<p>
	  * 製造所出荷承認結果区分を表す定数を取得する<br>
製造所出荷承認結果区分：製造所からの出荷承認の結果を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgSoAprvTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgSoAprvTyp_GetList(row, info);//リストの取得
		getMfgSoAprvTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgSoAprvTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgSoAprvTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgSoAprvTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MFG_SO_APRV_TYP.list(row);
	}
	/** 
	  * MfgSoAprvTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgSoAprvTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgSoAprvTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgSoAprvTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgSoAprvTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgSoAprvTypCols.sortPolicy());
	}


	/** 
	  * QualityMngTyp:品質管理結果区分 メインメソッド<p>
	  * 品質管理結果区分を表す定数を取得する<br>
品質管理結果区分：品質管理の結果を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQualityMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQualityMngTyp_GetList(row, info);//リストの取得
		getQualityMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQualityMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QualityMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQualityMngTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_QUALITY_MNG_TYP.list(row);
	}
	/** 
	  * QualityMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQualityMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QualityMngTypCols.viewCols(), down, info);
	}

	/** 
	  * QualityMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQualityMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QualityMngTypCols.sortPolicy());
	}


	/** 
	  * MfgMngTyp:製造管理結果区分 メインメソッド<p>
	  * 製造管理結果区分を表す定数を取得する<br>
製造管理結果区分：製造管理の結果を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgMngTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgMngTyp_GetList(row, info);//リストの取得
		getMfgMngTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgMngTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgMngTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgMngTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MFG_MNG_TYP.list(row);
	}
	/** 
	  * MfgMngTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgMngTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgMngTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgMngTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgMngTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgMngTypCols.sortPolicy());
	}


	/** 
	  * DeviantTyp:逸脱区分 メインメソッド<p>
	  * 逸脱区分を表す定数を取得する<br>
逸脱区分：逸脱の有無を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDeviantTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDeviantTyp_GetList(row, info);//リストの取得
		getDeviantTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDeviantTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DeviantTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDeviantTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_DEVIANT_TYP.list(row);
	}
	/** 
	  * DeviantTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDeviantTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DeviantTypCols.viewCols(), down, info);
	}

	/** 
	  * DeviantTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDeviantTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DeviantTypCols.sortPolicy());
	}


	/** 
	  * DeviantMsrTyp:逸脱措置区分 メインメソッド<p>
	  * 逸脱措置区分を表す定数を取得する<br>
逸脱措置区分：逸脱に対する措置を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDeviantMsrTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDeviantMsrTyp_GetList(row, info);//リストの取得
		getDeviantMsrTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDeviantMsrTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DeviantMsrTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDeviantMsrTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_DEVIANT_MSR_TYP.list(row);
	}
	/** 
	  * DeviantMsrTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDeviantMsrTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DeviantMsrTypCols.viewCols(), down, info);
	}

	/** 
	  * DeviantMsrTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDeviantMsrTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DeviantMsrTypCols.sortPolicy());
	}


	/** 
	  * ProdItmInfoTyp:製品品質情報区分 メインメソッド<p>
	  * 製品品質情報区分を表す定数を取得する<br>
製品品質情報区分：製品の品質・有効性・安全性に関する情報の有無を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProdItmInfoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProdItmInfoTyp_GetList(row, info);//リストの取得
		getProdItmInfoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProdItmInfoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProdItmInfoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProdItmInfoTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PROD_ITM_INFO_TYP.list(row);
	}
	/** 
	  * ProdItmInfoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdItmInfoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProdItmInfoTypCols.viewCols(), down, info);
	}

	/** 
	  * ProdItmInfoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProdItmInfoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProdItmInfoTypCols.sortPolicy());
	}


	/** 
	  * ChdItmInfoTyp:原材料品質情報区分 メインメソッド<p>
	  * 原材料品質情報区分を表す定数を取得する<br>
原材料品質情報区分：原材料の品質・有効性・安全性に関する情報の有無を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getChdItmInfoTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getChdItmInfoTyp_GetList(row, info);//リストの取得
		getChdItmInfoTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getChdItmInfoTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ChdItmInfoTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getChdItmInfoTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_CHD_ITM_INFO_TYP.list(row);
	}
	/** 
	  * ChdItmInfoTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getChdItmInfoTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ChdItmInfoTypCols.viewCols(), down, info);
	}

	/** 
	  * ChdItmInfoTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getChdItmInfoTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ChdItmInfoTypCols.sortPolicy());
	}


	/** 
	  * NumSysTyp:発番システム区分 メインメソッド<p>
	  * 発番システム区分を表す定数を取得する<br>
発番システム区分：システムが使用するオラクルシーケンスを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getNumSysTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getNumSysTyp_GetList(row, info);//リストの取得
		getNumSysTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getNumSysTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * NumSysTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getNumSysTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_NUM_SYS_TYP.list(row);
	}
	/** 
	  * NumSysTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNumSysTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(NumSysTypCols.viewCols(), down, info);
	}

	/** 
	  * NumSysTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getNumSysTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(NumSysTypCols.sortPolicy());
	}


	/** 
	  * SloStsTyp:受注状況区分 メインメソッド<p>
	  * 受注状況区分を表す定数を取得する<br>
受注状況区分：受注明細ごとの履歴を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloStsTyp_GetList(row, info);//リストの取得
		getSloStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLO_STS_TYP.list(row);
	}
	/** 
	  * SloStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloStsTypCols.viewCols(), down, info);
	}

	/** 
	  * SloStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloStsTypCols.sortPolicy());
	}


	/** 
	  * QtnStsTyp:見積状況区分 メインメソッド<p>
	  * 見積状況区分を表す定数を取得する<br>
見積状況区分：見積が、受注または出荷実績にどれだけ引き継がれたかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQtnStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQtnStsTyp_GetList(row, info);//リストの取得
		getQtnStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQtnStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QtnStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQtnStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_QTN_STS_TYP.list(row);
	}
	/** 
	  * QtnStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QtnStsTypCols.viewCols(), down, info);
	}

	/** 
	  * QtnStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtnStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QtnStsTypCols.sortPolicy());
	}


	/** 
	  * ArOpeTyp:債権更新処理区分 メインメソッド<p>
	  * 債権更新処理区分を表す定数を取得する<br>
債権更新処理区分：債権共通の処理内容を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArOpeTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArOpeTyp_GetList(row, info);//リストの取得
		getArOpeTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArOpeTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArOpeTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArOpeTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_AR_OPE_TYP.list(row);
	}
	/** 
	  * ArOpeTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArOpeTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArOpeTypCols.viewCols(), down, info);
	}

	/** 
	  * ArOpeTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArOpeTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArOpeTypCols.sortPolicy());
	}


	/** 
	  * BillClStsTyp:請求締状況区分 メインメソッド<p>
	  * 請求締状況区分を表す定数を取得する<br>
請求締状況区分：請求締の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillClStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillClStsTyp_GetList(row, info);//リストの取得
		getBillClStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillClStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillClStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillClStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_BILL_CL_STS_TYP.list(row);
	}
	/** 
	  * BillClStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillClStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillClStsTypCols.viewCols(), down, info);
	}

	/** 
	  * BillClStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillClStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillClStsTypCols.sortPolicy());
	}


	/** 
	  * BillTaxCalcTyp:請求税計算区分 メインメソッド<p>
	  * 請求税計算区分を表す定数を取得する<br>
請求税計算区分：請求書単位で税計算したかを表す（請求トランに設定）
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillTaxCalcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillTaxCalcTyp_GetList(row, info);//リストの取得
		getBillTaxCalcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillTaxCalcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillTaxCalcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillTaxCalcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_BILL_TAX_CALC_TYP.list(row);
	}
	/** 
	  * BillTaxCalcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillTaxCalcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillTaxCalcTypCols.viewCols(), down, info);
	}

	/** 
	  * BillTaxCalcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillTaxCalcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillTaxCalcTypCols.sortPolicy());
	}


	/** 
	  * BillDTyp:請求明細区分 メインメソッド<p>
	  * 請求明細区分を表す定数を取得する<br>
請求明細区分：売上、入金のどちらから請求明細が作成されたかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillDTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillDTyp_GetList(row, info);//リストの取得
		getBillDTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillDTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillDTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillDTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_BILL_D_TYP.list(row);
	}
	/** 
	  * BillDTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillDTypCols.viewCols(), down, info);
	}

	/** 
	  * BillDTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillDTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillDTypCols.sortPolicy());
	}


	/** 
	  * RcvDatTyp:入金情報区分 メインメソッド<p>
	  * 入金情報区分を表す定数を取得する<br>
入金情報区分：入金の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRcvDatTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRcvDatTyp_GetList(row, info);//リストの取得
		getRcvDatTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRcvDatTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RcvDatTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRcvDatTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_RCV_DAT_TYP.list(row);
	}
	/** 
	  * RcvDatTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRcvDatTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RcvDatTypCols.viewCols(), down, info);
	}

	/** 
	  * RcvDatTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRcvDatTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RcvDatTypCols.sortPolicy());
	}


	/** 
	  * SloTyp:受注区分 メインメソッド<p>
	  * 受注区分を表す定数を取得する<br>
受注区分：受注の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSloTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSloTyp_GetList(row, info);//リストの取得
		getSloTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSloTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SloTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSloTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLO_TYP.list(row);
	}
	/** 
	  * SloTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SloTypCols.viewCols(), down, info);
	}

	/** 
	  * SloTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSloTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SloTypCols.sortPolicy());
	}


	/** 
	  * WrkOpeTyp:案件処理区分 メインメソッド<p>
	  * 案件処理区分を表す定数を取得する<br>
案件処理区分：債権残高振替における振替の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWrkOpeTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWrkOpeTyp_GetList(row, info);//リストの取得
		getWrkOpeTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWrkOpeTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WrkOpeTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWrkOpeTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_WRK_OPE_TYP.list(row);
	}
	/** 
	  * WrkOpeTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkOpeTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WrkOpeTypCols.viewCols(), down, info);
	}

	/** 
	  * WrkOpeTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWrkOpeTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WrkOpeTypCols.sortPolicy());
	}


	/** 
	  * ApWrkOpeTyp:債務案件処理区分 メインメソッド<p>
	  * 債務案件処理区分を表す定数を取得する<br>
債務案件処理区分：債務残高振替における振替の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getApWrkOpeTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getApWrkOpeTyp_GetList(row, info);//リストの取得
		getApWrkOpeTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getApWrkOpeTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ApWrkOpeTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getApWrkOpeTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_AP_WRK_OPE_TYP.list(row);
	}
	/** 
	  * ApWrkOpeTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApWrkOpeTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ApWrkOpeTypCols.viewCols(), down, info);
	}

	/** 
	  * ApWrkOpeTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getApWrkOpeTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ApWrkOpeTypCols.sortPolicy());
	}


	/** 
	  * MfgStsTyp:製造状況区分 メインメソッド<p>
	  * 製造状況区分を表す定数を取得する<br>
製造状況区分：製造の進捗を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgStsTyp_GetList(row, info);//リストの取得
		getMfgStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MFG_STS_TYP.list(row);
	}
	/** 
	  * MfgStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgStsTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgStsTypCols.sortPolicy());
	}


	/** 
	  * MfgMtdTyp:生産方法区分 メインメソッド<p>
	  * 生産方法区分を表す定数を取得する<br>
生産方法区分：内製／外注を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgMtdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgMtdTyp_GetList(row, info);//リストの取得
		getMfgMtdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgMtdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgMtdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgMtdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MFG_MTD_TYP.list(row);
	}
	/** 
	  * MfgMtdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgMtdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgMtdTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgMtdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgMtdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgMtdTypCols.sortPolicy());
	}


	/** 
	  * MiPrntStr:製造指図書文字列 メインメソッド<p>
	  * 製造指図書文字列を表す定数を取得する<br>
製造指図書文字列：製造指図書で使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMiPrntStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMiPrntStr_GetList(row, info);//リストの取得
		getMiPrntStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMiPrntStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MiPrntStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMiPrntStr_GetList(MCRow row, MCEventInfo info){
		return MSC_MI_PRNT_STR.list(row);
	}
	/** 
	  * MiPrntStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMiPrntStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MiPrntStrCols.viewCols(), down, info);
	}

	/** 
	  * MiPrntStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMiPrntStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MiPrntStrCols.sortPolicy());
	}


	/** 
	  * MrPrntStr:製造記録書文字列 メインメソッド<p>
	  * 製造記録書文字列を表す定数を取得する<br>
製造記録書文字列：製造記録書で使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrPrntStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrPrntStr_GetList(row, info);//リストの取得
		getMrPrntStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrPrntStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrPrntStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrPrntStr_GetList(MCRow row, MCEventInfo info){
		return MSC_MR_PRNT_STR.list(row);
	}
	/** 
	  * MrPrntStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrPrntStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrPrntStrCols.viewCols(), down, info);
	}

	/** 
	  * MrPrntStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrPrntStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrPrntStrCols.sortPolicy());
	}


	/** 
	  * VerChgStsTyp:版切替状況区分 メインメソッド<p>
	  * 版切替状況区分を表す定数を取得する<br>
版切替状況区分：版切替の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getVerChgStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getVerChgStsTyp_GetList(row, info);//リストの取得
		getVerChgStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getVerChgStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * VerChgStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getVerChgStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_VER_CHG_STS_TYP.list(row);
	}
	/** 
	  * VerChgStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getVerChgStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(VerChgStsTypCols.viewCols(), down, info);
	}

	/** 
	  * VerChgStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getVerChgStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(VerChgStsTypCols.sortPolicy());
	}


	/** 
	  * ReExtTyp:指図再展開区分 メインメソッド<p>
	  * 指図再展開区分を表す定数を取得する<br>
指図再展開区分：設計変更による指図再展開の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getReExtTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getReExtTyp_GetList(row, info);//リストの取得
		getReExtTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getReExtTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ReExtTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getReExtTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_RE_EXT_TYP.list(row);
	}
	/** 
	  * ReExtTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getReExtTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ReExtTypCols.viewCols(), down, info);
	}

	/** 
	  * ReExtTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getReExtTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ReExtTypCols.sortPolicy());
	}


	/** 
	  * SlipSplitTyp:伝票分割区分 メインメソッド<p>
	  * 伝票分割区分を表す定数を取得する<br>
伝票分割区分：伝票分割処理での分割方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlipSplitTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlipSplitTyp_GetList(row, info);//リストの取得
		getSlipSplitTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlipSplitTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlipSplitTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlipSplitTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLIP_SPLIT_TYP.list(row);
	}
	/** 
	  * SlipSplitTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipSplitTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlipSplitTypCols.viewCols(), down, info);
	}

	/** 
	  * SlipSplitTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlipSplitTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlipSplitTypCols.sortPolicy());
	}


	/** 
	  * MfgAprvStsTyp:製造承認状況区分 メインメソッド<p>
	  * 製造承認状況区分を表す定数を取得する<br>
製造承認状況区分：製造承認の進捗を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgAprvStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgAprvStsTyp_GetList(row, info);//リストの取得
		getMfgAprvStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgAprvStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgAprvStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgAprvStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MFG_APRV_STS_TYP.list(row);
	}
	/** 
	  * MfgAprvStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgAprvStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgAprvStsTypCols.viewCols(), down, info);
	}

	/** 
	  * MfgAprvStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgAprvStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgAprvStsTypCols.sortPolicy());
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
		return MSC_WG_RQST_TYP.list(row);
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
	  * WgRqstStsTyp:ＷＧ間依頼状況区分 メインメソッド<p>
	  * ＷＧ間依頼状況区分を表す定数を取得する<br>
ＷＧ間依頼状況区分：ＷＧ間依頼の進捗を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWgRqstStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWgRqstStsTyp_GetList(row, info);//リストの取得
		getWgRqstStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWgRqstStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WgRqstStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWgRqstStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_WG_RQST_STS_TYP.list(row);
	}
	/** 
	  * WgRqstStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WgRqstStsTypCols.viewCols(), down, info);
	}

	/** 
	  * WgRqstStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WgRqstStsTypCols.sortPolicy());
	}


	/** 
	  * WgRqstSrcTyp:ＷＧ間依頼作成元区分 メインメソッド<p>
	  * ＷＧ間依頼作成元区分を表す定数を取得する<br>
ＷＧ間依頼作成元区分：ＷＧ間依頼データ作成元の機能を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWgRqstSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWgRqstSrcTyp_GetList(row, info);//リストの取得
		getWgRqstSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWgRqstSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WgRqstSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWgRqstSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_WG_RQST_SRC_TYP.list(row);
	}
	/** 
	  * WgRqstSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WgRqstSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * WgRqstSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WgRqstSrcTypCols.sortPolicy());
	}


	/** 
	  * WgRqstNtcDayTyp:ＷＧ間依頼通知日区分 メインメソッド<p>
	  * ＷＧ間依頼通知日区分を表す定数を取得する<br>
ＷＧ間依頼通知日区分：ＷＧ間依頼データを通知する際の日付を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getWgRqstNtcDayTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getWgRqstNtcDayTyp_GetList(row, info);//リストの取得
		getWgRqstNtcDayTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getWgRqstNtcDayTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * WgRqstNtcDayTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getWgRqstNtcDayTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_WG_RQST_NTC_DAY_TYP.list(row);
	}
	/** 
	  * WgRqstNtcDayTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstNtcDayTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(WgRqstNtcDayTypCols.viewCols(), down, info);
	}

	/** 
	  * WgRqstNtcDayTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getWgRqstNtcDayTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(WgRqstNtcDayTypCols.sortPolicy());
	}


	/** 
	  * ProvSrcSchdTyp:支給元予定区分 メインメソッド<p>
	  * 支給元予定区分を表す定数を取得する<br>
支給元予定区分：支給予定の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProvSrcSchdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProvSrcSchdTyp_GetList(row, info);//リストの取得
		getProvSrcSchdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProvSrcSchdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProvSrcSchdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProvSrcSchdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PROV_SRC_SCHD_TYP.list(row);
	}
	/** 
	  * ProvSrcSchdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvSrcSchdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProvSrcSchdTypCols.viewCols(), down, info);
	}

	/** 
	  * ProvSrcSchdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvSrcSchdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProvSrcSchdTypCols.sortPolicy());
	}


	/** 
	  * ProvSrcActTyp:支給元実績区分 メインメソッド<p>
	  * 支給元実績区分を表す定数を取得する<br>
支給元実績区分：支給実績の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getProvSrcActTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getProvSrcActTyp_GetList(row, info);//リストの取得
		getProvSrcActTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getProvSrcActTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ProvSrcActTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getProvSrcActTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PROV_SRC_ACT_TYP.list(row);
	}
	/** 
	  * ProvSrcActTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvSrcActTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ProvSrcActTypCols.viewCols(), down, info);
	}

	/** 
	  * ProvSrcActTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getProvSrcActTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ProvSrcActTypCols.sortPolicy());
	}


	/** 
	  * XfrSrcTyp:移動・移送元区分 メインメソッド<p>
	  * 移動・移送元区分を表す定数を取得する<br>
移動・移送元区分：移動・移送予定の作成元を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getXfrSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getXfrSrcTyp_GetList(row, info);//リストの取得
		getXfrSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getXfrSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * XfrSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getXfrSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_XFR_SRC_TYP.list(row);
	}
	/** 
	  * XfrSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXfrSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(XfrSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * XfrSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getXfrSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(XfrSrcTypCols.sortPolicy());
	}


	/** 
	  * StktkTyp:棚卸種別区分 メインメソッド<p>
	  * 棚卸種別区分を表す定数を取得する<br>
棚卸種別区分：棚卸の方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStktkTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStktkTyp_GetList(row, info);//リストの取得
		getStktkTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStktkTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StktkTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStktkTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_STKTK_TYP.list(row);
	}
	/** 
	  * StktkTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StktkTypCols.viewCols(), down, info);
	}

	/** 
	  * StktkTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StktkTypCols.sortPolicy());
	}


	/** 
	  * SplnDtlTyp:販売計画明細区分 メインメソッド<p>
	  * 販売計画明細区分を表す定数を取得する<br>
販売計画明細区分：販売計画の明細行のデータの意味を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSplnDtlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSplnDtlTyp_GetList(row, info);//リストの取得
		getSplnDtlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSplnDtlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SplnDtlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSplnDtlTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SPLN_DTL_TYP.list(row);
	}
	/** 
	  * SplnDtlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnDtlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SplnDtlTypCols.viewCols(), down, info);
	}

	/** 
	  * SplnDtlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSplnDtlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SplnDtlTypCols.sortPolicy());
	}


	/** 
	  * PfDtlTyp:購買内示明細区分 メインメソッド<p>
	  * 購買内示明細区分を表す定数を取得する<br>
購買内示明細区分：購買内示の明細行を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPfDtlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPfDtlTyp_GetList(row, info);//リストの取得
		getPfDtlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPfDtlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PfDtlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPfDtlTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PF_DTL_TYP.list(row);
	}
	/** 
	  * PfDtlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPfDtlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PfDtlTypCols.viewCols(), down, info);
	}

	/** 
	  * PfDtlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPfDtlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PfDtlTypCols.sortPolicy());
	}


	/** 
	  * InspPrntStr:検査帳票文字列 メインメソッド<p>
	  * 検査帳票文字列を表す定数を取得する<br>
検査帳票文字列：検査関連の帳票上でのラベルを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspPrntStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspPrntStr_GetList(row, info);//リストの取得
		getInspPrntStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspPrntStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspPrntStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspPrntStr_GetList(MCRow row, MCEventInfo info){
		return MSC_INSP_PRNT_STR.list(row);
	}
	/** 
	  * InspPrntStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspPrntStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspPrntStrCols.viewCols(), down, info);
	}

	/** 
	  * InspPrntStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspPrntStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspPrntStrCols.sortPolicy());
	}


	/** 
	  * InspTyp:検査種類区分 メインメソッド<p>
	  * 検査種類区分を表す定数を取得する<br>
検査種類区分：検査の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspTyp_GetList(row, info);//リストの取得
		getInspTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_INSP_TYP.list(row);
	}
	/** 
	  * InspTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspTypCols.viewCols(), down, info);
	}

	/** 
	  * InspTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspTypCols.sortPolicy());
	}


	/** 
	  * InspStsTyp:検査状況区分 メインメソッド<p>
	  * 検査状況区分を表す定数を取得する<br>
検査状況区分：検査指図の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspStsTyp_GetList(row, info);//リストの取得
		getInspStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_INSP_STS_TYP.list(row);
	}
	/** 
	  * InspStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspStsTypCols.viewCols(), down, info);
	}

	/** 
	  * InspStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspStsTypCols.sortPolicy());
	}


	/** 
	  * InspAprvStsTyp:検査承認状況区分 メインメソッド<p>
	  * 検査承認状況区分を表す定数を取得する<br>
検査承認状況区分：検査指図の進捗を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspAprvStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspAprvStsTyp_GetList(row, info);//リストの取得
		getInspAprvStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspAprvStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspAprvStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspAprvStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_INSP_APRV_STS_TYP.list(row);
	}
	/** 
	  * InspAprvStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspAprvStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspAprvStsTypCols.viewCols(), down, info);
	}

	/** 
	  * InspAprvStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspAprvStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspAprvStsTypCols.sortPolicy());
	}


	/** 
	  * StdInspRsltTyp:規格検査結果区分 メインメソッド<p>
	  * 規格検査結果区分を表す定数を取得する<br>
規格検査結果区分：規格検査判定結果の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStdInspRsltTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStdInspRsltTyp_GetList(row, info);//リストの取得
		getStdInspRsltTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStdInspRsltTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StdInspRsltTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStdInspRsltTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_STD_INSP_RSLT_TYP.list(row);
	}
	/** 
	  * StdInspRsltTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStdInspRsltTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StdInspRsltTypCols.viewCols(), down, info);
	}

	/** 
	  * StdInspRsltTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStdInspRsltTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StdInspRsltTypCols.sortPolicy());
	}


	/** 
	  * InspJudgRsltTyp:検査判定結果区分 メインメソッド<p>
	  * 検査判定結果区分を表す定数を取得する<br>
検査判定結果区分：検査判定結果の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInspJudgRsltTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInspJudgRsltTyp_GetList(row, info);//リストの取得
		getInspJudgRsltTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInspJudgRsltTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InspJudgRsltTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInspJudgRsltTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_INSP_JUDG_RSLT_TYP.list(row);
	}
	/** 
	  * InspJudgRsltTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspJudgRsltTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InspJudgRsltTypCols.viewCols(), down, info);
	}

	/** 
	  * InspJudgRsltTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInspJudgRsltTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InspJudgRsltTypCols.sortPolicy());
	}


	/** 
	  * PlntAprvStsTyp:工場出荷承認状況区分 メインメソッド<p>
	  * 工場出荷承認状況区分を表す定数を取得する<br>
工場出荷承認状況区分：工場出荷承認の区分を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPlntAprvStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPlntAprvStsTyp_GetList(row, info);//リストの取得
		getPlntAprvStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPlntAprvStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PlntAprvStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPlntAprvStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PLNT_APRV_STS_TYP.list(row);
	}
	/** 
	  * PlntAprvStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPlntAprvStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PlntAprvStsTypCols.viewCols(), down, info);
	}

	/** 
	  * PlntAprvStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPlntAprvStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PlntAprvStsTypCols.sortPolicy());
	}


	/** 
	  * MrktJudgStsTyp:市場出荷判定状況区分 メインメソッド<p>
	  * 市場出荷判定状況区分を表す定数を取得する<br>
市場出荷判定状況区分：市場出荷判定状況の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrktJudgStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrktJudgStsTyp_GetList(row, info);//リストの取得
		getMrktJudgStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrktJudgStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrktJudgStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrktJudgStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MRKT_JUDG_STS_TYP.list(row);
	}
	/** 
	  * MrktJudgStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrktJudgStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrktJudgStsTypCols.viewCols(), down, info);
	}

	/** 
	  * MrktJudgStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrktJudgStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrktJudgStsTypCols.sortPolicy());
	}


	/** 
	  * MrktJudgSrcTyp:市場出荷判定作成元区分 メインメソッド<p>
	  * 市場出荷判定作成元区分を表す定数を取得する<br>
市場出荷判定作成元区分：市場出荷判定作成元の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMrktJudgSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMrktJudgSrcTyp_GetList(row, info);//リストの取得
		getMrktJudgSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMrktJudgSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MrktJudgSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMrktJudgSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_MRKT_JUDG_SRC_TYP.list(row);
	}
	/** 
	  * MrktJudgSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrktJudgSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MrktJudgSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * MrktJudgSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMrktJudgSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MrktJudgSrcTypCols.sortPolicy());
	}


	/** 
	  * SchdActTyp:予定実績区分 メインメソッド<p>
	  * 予定実績区分を表す定数を取得する<br>
予定実績区分：ロットトレースのデータが予定か実績かを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSchdActTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSchdActTyp_GetList(row, info);//リストの取得
		getSchdActTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSchdActTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SchdActTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSchdActTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SCHD_ACT_TYP.list(row);
	}
	/** 
	  * SchdActTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSchdActTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SchdActTypCols.viewCols(), down, info);
	}

	/** 
	  * SchdActTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSchdActTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SchdActTypCols.sortPolicy());
	}


	/** 
	  * CompItmInspTyp:構成品検査区分 メインメソッド<p>
	  * 構成品検査区分を表す定数を取得する<br>
構成品検査区分：構成品の検査が全て完了しているかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCompItmInspTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCompItmInspTyp_GetList(row, info);//リストの取得
		getCompItmInspTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCompItmInspTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CompItmInspTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCompItmInspTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_COMP_ITM_INSP_TYP.list(row);
	}
	/** 
	  * CompItmInspTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompItmInspTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CompItmInspTypCols.viewCols(), down, info);
	}

	/** 
	  * CompItmInspTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompItmInspTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CompItmInspTypCols.sortPolicy());
	}


	/** 
	  * CompItmQualityTyp:構成品良品区分 メインメソッド<p>
	  * 構成品良品区分を表す定数を取得する<br>
構成品良品区分：構成品の良品区分が全て良品かどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCompItmQualityTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCompItmQualityTyp_GetList(row, info);//リストの取得
		getCompItmQualityTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCompItmQualityTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CompItmQualityTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCompItmQualityTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_COMP_ITM_QUALITY_TYP.list(row);
	}
	/** 
	  * CompItmQualityTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompItmQualityTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CompItmQualityTypCols.viewCols(), down, info);
	}

	/** 
	  * CompItmQualityTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompItmQualityTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CompItmQualityTypCols.sortPolicy());
	}


	/** 
	  * CompItmMfgAprvTyp:構成品製造承認区分 メインメソッド<p>
	  * 構成品製造承認区分を表す定数を取得する<br>
構成品製造承認区分：構成品の製造承認が全て承認済であるかどうかを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCompItmMfgAprvTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCompItmMfgAprvTyp_GetList(row, info);//リストの取得
		getCompItmMfgAprvTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCompItmMfgAprvTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CompItmMfgAprvTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCompItmMfgAprvTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_COMP_ITM_MFG_APRV_TYP.list(row);
	}
	/** 
	  * CompItmMfgAprvTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompItmMfgAprvTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CompItmMfgAprvTypCols.viewCols(), down, info);
	}

	/** 
	  * CompItmMfgAprvTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCompItmMfgAprvTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CompItmMfgAprvTypCols.sortPolicy());
	}


	/** 
	  * PurcPrntTyp:購買帳票発行区分 メインメソッド<p>
	  * 購買帳票発行区分を表す定数を取得する<br>
購買帳票発行区分：注文書、返品票の発行パタンを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcPrntTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcPrntTyp_GetList(row, info);//リストの取得
		getPurcPrntTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcPrntTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcPrntTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcPrntTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PURC_PRNT_TYP.list(row);
	}
	/** 
	  * PurcPrntTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcPrntTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcPrntTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcPrntTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcPrntTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcPrntTypCols.sortPolicy());
	}


	/** 
	  * BillMtdTyp:請求方式区分 メインメソッド<p>
	  * 請求方式区分を表す定数を取得する<br>
請求方式区分：請求の方式を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillMtdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillMtdTyp_GetList(row, info);//リストの取得
		getBillMtdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillMtdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillMtdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillMtdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_BILL_MTD_TYP.list(row);
	}
	/** 
	  * BillMtdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillMtdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillMtdTypCols.viewCols(), down, info);
	}

	/** 
	  * BillMtdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillMtdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillMtdTypCols.sortPolicy());
	}


	/** 
	  * ArSlipPrntTyp:債権伝票帳票区分 メインメソッド<p>
	  * 債権伝票帳票区分を表す定数を取得する<br>
債権伝票帳票区分：債権伝票の帳票を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArSlipPrntTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArSlipPrntTyp_GetList(row, info);//リストの取得
		getArSlipPrntTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArSlipPrntTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArSlipPrntTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArSlipPrntTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_AR_SLIP_PRNT_TYP.list(row);
	}
	/** 
	  * ArSlipPrntTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSlipPrntTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArSlipPrntTypCols.viewCols(), down, info);
	}

	/** 
	  * ArSlipPrntTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArSlipPrntTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArSlipPrntTypCols.sortPolicy());
	}


	/** 
	  * CredUpdTyp:与信更新区分 メインメソッド<p>
	  * 与信更新区分を表す定数を取得する<br>
与信更新区分：与信更新処理の処理内容を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCredUpdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCredUpdTyp_GetList(row, info);//リストの取得
		getCredUpdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCredUpdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CredUpdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCredUpdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_CRED_UPD_TYP.list(row);
	}
	/** 
	  * CredUpdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCredUpdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CredUpdTypCols.viewCols(), down, info);
	}

	/** 
	  * CredUpdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCredUpdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CredUpdTypCols.sortPolicy());
	}


	/** 
	  * InstTyp:指図区分 メインメソッド<p>
	  * 指図区分を表す定数を取得する<br>
指図区分：指図の有無を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInstTyp_GetList(row, info);//リストの取得
		getInstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInstTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_INST_TYP.list(row);
	}
	/** 
	  * InstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InstTypCols.viewCols(), down, info);
	}

	/** 
	  * InstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InstTypCols.sortPolicy());
	}


	/** 
	  * AutoApplStsTyp:自動消込状況区分 メインメソッド<p>
	  * 自動消込状況区分を表す定数を取得する<br>
自動消込状況区分：入金自動消込の結果を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAutoApplStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAutoApplStsTyp_GetList(row, info);//リストの取得
		getAutoApplStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAutoApplStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AutoApplStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAutoApplStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_AUTO_APPL_STS_TYP.list(row);
	}
	/** 
	  * AutoApplStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAutoApplStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AutoApplStsTypCols.viewCols(), down, info);
	}

	/** 
	  * AutoApplStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAutoApplStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AutoApplStsTypCols.sortPolicy());
	}


	/** 
	  * StktkStsTyp:棚卸状況区分 メインメソッド<p>
	  * 棚卸状況区分を表す定数を取得する<br>
棚卸状況区分：棚卸の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStktkStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStktkStsTyp_GetList(row, info);//リストの取得
		getStktkStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStktkStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StktkStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStktkStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_STKTK_STS_TYP.list(row);
	}
	/** 
	  * StktkStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StktkStsTypCols.viewCols(), down, info);
	}

	/** 
	  * StktkStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StktkStsTypCols.sortPolicy());
	}


	/** 
	  * ArrPtnTyp:入荷パタン区分 メインメソッド<p>
	  * 入荷パタン区分を表す定数を取得する<br>
入荷パタン区分：入荷の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getArrPtnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getArrPtnTyp_GetList(row, info);//リストの取得
		getArrPtnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getArrPtnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ArrPtnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getArrPtnTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ARR_PTN_TYP.list(row);
	}
	/** 
	  * ArrPtnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArrPtnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ArrPtnTypCols.viewCols(), down, info);
	}

	/** 
	  * ArrPtnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getArrPtnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ArrPtnTypCols.sortPolicy());
	}


	/** 
	  * SlsAdjstTyp:売上調整区分 メインメソッド<p>
	  * 売上調整区分を表す定数を取得する<br>
売上調整区分：売上調整の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsAdjstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsAdjstTyp_GetList(row, info);//リストの取得
		getSlsAdjstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsAdjstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsAdjstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsAdjstTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLS_ADJST_TYP.list(row);
	}
	/** 
	  * SlsAdjstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAdjstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsAdjstTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsAdjstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsAdjstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsAdjstTypCols.sortPolicy());
	}


	/** 
	  * AdjstMtdTyp:調整方法区分 メインメソッド<p>
	  * 調整方法区分を表す定数を取得する<br>
調整方法区分：調整の方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAdjstMtdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAdjstMtdTyp_GetList(row, info);//リストの取得
		getAdjstMtdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAdjstMtdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AdjstMtdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAdjstMtdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_ADJST_MTD_TYP.list(row);
	}
	/** 
	  * AdjstMtdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdjstMtdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AdjstMtdTypCols.viewCols(), down, info);
	}

	/** 
	  * AdjstMtdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdjstMtdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AdjstMtdTypCols.sortPolicy());
	}


	/** 
	  * CstSlctTyp:得意先抽出区分 メインメソッド<p>
	  * 得意先抽出区分を表す定数を取得する<br>
得意先抽出区分：在庫一括引当画面での得意先の抽出方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCstSlctTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCstSlctTyp_GetList(row, info);//リストの取得
		getCstSlctTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCstSlctTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CstSlctTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCstSlctTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_CST_SLCT_TYP.list(row);
	}
	/** 
	  * CstSlctTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCstSlctTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CstSlctTypCols.viewCols(), down, info);
	}

	/** 
	  * CstSlctTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCstSlctTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CstSlctTypCols.sortPolicy());
	}


	/** 
	  * EiajDlvSlipStr:ＥＩＡＪ納品書用文字列 メインメソッド<p>
	  * ＥＩＡＪ納品書用文字列を表す定数を取得する<br>
ＥＩＡＪ納品書用文字列：ＥＩＡＪ納品書で使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getEiajDlvSlipStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getEiajDlvSlipStr_GetList(row, info);//リストの取得
		getEiajDlvSlipStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getEiajDlvSlipStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * EiajDlvSlipStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getEiajDlvSlipStr_GetList(MCRow row, MCEventInfo info){
		return MSC_EIAJ_DLV_SLIP_STR.list(row);
	}
	/** 
	  * EiajDlvSlipStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEiajDlvSlipStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(EiajDlvSlipStrCols.viewCols(), down, info);
	}

	/** 
	  * EiajDlvSlipStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getEiajDlvSlipStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(EiajDlvSlipStrCols.sortPolicy());
	}


	/** 
	  * PoStr:注文書用文字列 メインメソッド<p>
	  * 注文書用文字列を表す定数を取得する<br>
注文書用文字列：注文書で使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPoStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPoStr_GetList(row, info);//リストの取得
		getPoStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPoStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PoStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPoStr_GetList(MCRow row, MCEventInfo info){
		return MSC_PO_STR.list(row);
	}
	/** 
	  * PoStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PoStrCols.viewCols(), down, info);
	}

	/** 
	  * PoStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPoStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PoStrCols.sortPolicy());
	}


	/** 
	  * PurcAdjstTyp:仕入調整区分 メインメソッド<p>
	  * 仕入調整区分を表す定数を取得する<br>
仕入調整区分：仕入調整の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPurcAdjstTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPurcAdjstTyp_GetList(row, info);//リストの取得
		getPurcAdjstTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPurcAdjstTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PurcAdjstTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPurcAdjstTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PURC_ADJST_TYP.list(row);
	}
	/** 
	  * PurcAdjstTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcAdjstTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PurcAdjstTypCols.viewCols(), down, info);
	}

	/** 
	  * PurcAdjstTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPurcAdjstTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PurcAdjstTypCols.sortPolicy());
	}


	/** 
	  * PlPrntStr:パッキングリスト文字列 メインメソッド<p>
	  * パッキングリスト文字列を表す定数を取得する<br>
パッキングリスト文字列：パッキングリストに固定で表示する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPlPrntStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPlPrntStr_GetList(row, info);//リストの取得
		getPlPrntStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPlPrntStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PlPrntStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPlPrntStr_GetList(MCRow row, MCEventInfo info){
		return MSC_PL_PRNT_STR.list(row);
	}
	/** 
	  * PlPrntStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPlPrntStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PlPrntStrCols.viewCols(), down, info);
	}

	/** 
	  * PlPrntStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPlPrntStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PlPrntStrCols.sortPolicy());
	}


	/** 
	  * IvPrntStr:インボイス文字列 メインメソッド<p>
	  * インボイス文字列を表す定数を取得する<br>
インボイス文字列：インボイスに固定で表示する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIvPrntStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIvPrntStr_GetList(row, info);//リストの取得
		getIvPrntStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIvPrntStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IvPrntStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIvPrntStr_GetList(MCRow row, MCEventInfo info){
		return MSC_IV_PRNT_STR.list(row);
	}
	/** 
	  * IvPrntStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIvPrntStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IvPrntStrCols.viewCols(), down, info);
	}

	/** 
	  * IvPrntStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIvPrntStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IvPrntStrCols.sortPolicy());
	}


	/** 
	  * PretSchdStsTyp:仕入返品予定状況区分 メインメソッド<p>
	  * 仕入返品予定状況区分を表す定数を取得する<br>
仕入返品予定状況区分：仕入返品予定の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPretSchdStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPretSchdStsTyp_GetList(row, info);//リストの取得
		getPretSchdStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPretSchdStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PretSchdStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPretSchdStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PRET_SCHD_STS_TYP.list(row);
	}
	/** 
	  * PretSchdStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPretSchdStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PretSchdStsTypCols.viewCols(), down, info);
	}

	/** 
	  * PretSchdStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPretSchdStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PretSchdStsTypCols.sortPolicy());
	}


	/** 
	  * ShipInstStr:出荷指図書用文字列 メインメソッド<p>
	  * 出荷指図書用文字列を表す定数を取得する<br>
出荷指図書用文字列：出荷指図書書で使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipInstStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipInstStr_GetList(row, info);//リストの取得
		getShipInstStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipInstStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipInstStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipInstStr_GetList(MCRow row, MCEventInfo info){
		return MSC_SHIP_INST_STR.list(row);
	}
	/** 
	  * ShipInstStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipInstStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipInstStrCols.viewCols(), down, info);
	}

	/** 
	  * ShipInstStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipInstStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipInstStrCols.sortPolicy());
	}


	/** 
	  * PickListStr:ピッキングリスト用文字列 メインメソッド<p>
	  * ピッキングリスト用文字列を表す定数を取得する<br>
ピッキングリスト用文字列：ピッキングリストで使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPickListStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPickListStr_GetList(row, info);//リストの取得
		getPickListStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPickListStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PickListStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPickListStr_GetList(MCRow row, MCEventInfo info){
		return MSC_PICK_LIST_STR.list(row);
	}
	/** 
	  * PickListStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPickListStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PickListStrCols.viewCols(), down, info);
	}

	/** 
	  * PickListStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPickListStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PickListStrCols.sortPolicy());
	}


	/** 
	  * BillPrntStr:請求書文字列 メインメソッド<p>
	  * 請求書文字列を表す定数を取得する<br>
請求書文字列：請求書に固定で表示する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBillPrntStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBillPrntStr_GetList(row, info);//リストの取得
		getBillPrntStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBillPrntStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BillPrntStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBillPrntStr_GetList(MCRow row, MCEventInfo info){
		return MSC_BILL_PRNT_STR.list(row);
	}
	/** 
	  * BillPrntStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillPrntStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BillPrntStrCols.viewCols(), down, info);
	}

	/** 
	  * BillPrntStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBillPrntStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BillPrntStrCols.sortPolicy());
	}


	/** 
	  * PrntNum:帳票設定値 メインメソッド<p>
	  * 帳票設定値を表す定数を取得する<br>
帳票設定値：帳票発行時のパラメータを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPrntNum(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPrntNum_GetList(row, info);//リストの取得
		getPrntNum_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPrntNum_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PrntNum:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPrntNum_GetList(MCRow row, MCEventInfo info){
		return MSC_PRNT_NUM.list(row);
	}
	/** 
	  * PrntNum:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPrntNum_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PrntNumCols.viewCols(), down, info);
	}

	/** 
	  * PrntNum:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPrntNum_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PrntNumCols.sortPolicy());
	}


	/** 
	  * DlyMrk:遅延マーク メインメソッド<p>
	  * 遅延マークを表す定数を取得する<br>
遅延マーク：帳票発行時のパラメータを表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDlyMrk(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDlyMrk_GetList(row, info);//リストの取得
		getDlyMrk_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDlyMrk_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DlyMrk:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDlyMrk_GetList(MCRow row, MCEventInfo info){
		return MSC_DLY_MRK.list(row);
	}
	/** 
	  * DlyMrk:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlyMrk_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DlyMrkCols.viewCols(), down, info);
	}

	/** 
	  * DlyMrk:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlyMrk_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DlyMrkCols.sortPolicy());
	}


	/** 
	  * StktkListStr:棚卸帳票用文字列 メインメソッド<p>
	  * 棚卸帳票用文字列を表す定数を取得する<br>
棚卸帳票用文字列：棚卸帳票で使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStktkListStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStktkListStr_GetList(row, info);//リストの取得
		getStktkListStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStktkListStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StktkListStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStktkListStr_GetList(MCRow row, MCEventInfo info){
		return MSC_STKTK_LIST_STR.list(row);
	}
	/** 
	  * StktkListStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkListStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StktkListStrCols.viewCols(), down, info);
	}

	/** 
	  * StktkListStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStktkListStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StktkListStrCols.sortPolicy());
	}


	/** 
	  * DlvSlipStr:納品書用文字列 メインメソッド<p>
	  * 納品書用文字列を表す定数を取得する<br>
納品書用文字列：納品書で使用する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDlvSlipStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDlvSlipStr_GetList(row, info);//リストの取得
		getDlvSlipStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDlvSlipStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DlvSlipStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDlvSlipStr_GetList(MCRow row, MCEventInfo info){
		return MSC_DLV_SLIP_STR.list(row);
	}
	/** 
	  * DlvSlipStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlvSlipStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DlvSlipStrCols.viewCols(), down, info);
	}

	/** 
	  * DlvSlipStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlvSlipStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DlvSlipStrCols.sortPolicy());
	}


	/** 
	  * PayMtdTyp:支払方式区分 メインメソッド<p>
	  * 支払方式区分を表す定数を取得する<br>
支払方式区分：支払の方式を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayMtdTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayMtdTyp_GetList(row, info);//リストの取得
		getPayMtdTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayMtdTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayMtdTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayMtdTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PAY_MTD_TYP.list(row);
	}
	/** 
	  * PayMtdTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayMtdTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayMtdTypCols.viewCols(), down, info);
	}

	/** 
	  * PayMtdTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayMtdTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayMtdTypCols.sortPolicy());
	}


	/** 
	  * PayStsTyp:支払状況区分 メインメソッド<p>
	  * 支払状況区分を表す定数を取得する<br>
支払状況区分：支払の状況を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayStsTyp_GetList(row, info);//リストの取得
		getPayStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_PAY_STS_TYP.list(row);
	}
	/** 
	  * PayStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayStsTypCols.viewCols(), down, info);
	}

	/** 
	  * PayStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayStsTypCols.sortPolicy());
	}


	/** 
	  * PayNtcPrntStr:支払通知書文字列 メインメソッド<p>
	  * 支払通知書文字列を表す定数を取得する<br>
支払通知書文字列：支払通知書に固定で表示する文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPayNtcPrntStr(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPayNtcPrntStr_GetList(row, info);//リストの取得
		getPayNtcPrntStr_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPayNtcPrntStr_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PayNtcPrntStr:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPayNtcPrntStr_GetList(MCRow row, MCEventInfo info){
		return MSC_PAY_NTC_PRNT_STR.list(row);
	}
	/** 
	  * PayNtcPrntStr:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcPrntStr_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PayNtcPrntStrCols.viewCols(), down, info);
	}

	/** 
	  * PayNtcPrntStr:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPayNtcPrntStr_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PayNtcPrntStrCols.sortPolicy());
	}


	/** 
	  * IvPrStsTyp:インボイス進捗状況区分 メインメソッド<p>
	  * インボイス進捗状況区分を表す定数を取得する<br>
インボイス進捗状況区分：インボイスの進捗状況の区分を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIvPrStsTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIvPrStsTyp_GetList(row, info);//リストの取得
		getIvPrStsTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIvPrStsTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IvPrStsTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIvPrStsTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_IV_PR_STS_TYP.list(row);
	}
	/** 
	  * IvPrStsTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIvPrStsTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IvPrStsTypCols.viewCols(), down, info);
	}

	/** 
	  * IvPrStsTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIvPrStsTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IvPrStsTypCols.sortPolicy());
	}


	/** 
	  * SlsCondTyp:売上条件区分 メインメソッド<p>
	  * 売上条件区分を表す定数を取得する<br>
売上条件区分：売上条件を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSlsCondTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSlsCondTyp_GetList(row, info);//リストの取得
		getSlsCondTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSlsCondTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SlsCondTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSlsCondTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_SLS_COND_TYP.list(row);
	}
	/** 
	  * SlsCondTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsCondTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SlsCondTypCols.viewCols(), down, info);
	}

	/** 
	  * SlsCondTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSlsCondTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SlsCondTypCols.sortPolicy());
	}


	/** 
	  * FreeRsnTyp:無償理由区分 メインメソッド<p>
	  * 無償理由区分を表す定数を取得する<br>
無償理由区分：無償理由を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getFreeRsnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getFreeRsnTyp_GetList(row, info);//リストの取得
		getFreeRsnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getFreeRsnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * FreeRsnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getFreeRsnTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_FREE_RSN_TYP.list(row);
	}
	/** 
	  * FreeRsnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFreeRsnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(FreeRsnTypCols.viewCols(), down, info);
	}

	/** 
	  * FreeRsnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getFreeRsnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(FreeRsnTypCols.sortPolicy());
	}


	/** 
	  * CstItm:得意先品目 メインメソッド<p>
	  * 取引先品目マスタから、得意先品目情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCstItm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCstItm_GetList(row, info);//リストの取得
		getCstItm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCstItm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CstItm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCstItm_GetList(MCRow row, MCEventInfo info){
		return getList("getCstItm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CstItm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCstItm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CstItmCols.viewCols(), down, info);
	}

	/** 
	  * CstItm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCstItm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CstItmCols.sortPolicy());
	}

}
