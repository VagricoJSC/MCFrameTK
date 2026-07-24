package mcframe.clientMSUA.MSUAP0080;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0080.MSUAC_List.*;


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
		return "mcframe.serverMSUA.MSUAL0080.MSUAL_List";
	}
	/** 
	  * SttlRcv:決済方法（入金） メインメソッド<p>
	  * 決済方法マスタから、債権決済区分が入金に関連するもの（「1：現金」または「2：振込」または「3：手形」）の決済方法情報を取得する<br>
・振込人名を取得する場合は、rcst_cdに入金先を指定する<br>
・振込人名に加え、複数の入金登録区分に対応する決済方法情報を取得する場合は、rcv_reg_typ1－3に入金登録区分を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSttlRcv(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSttlRcv_GetList(row, info);//リストの取得
		getSttlRcv_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSttlRcv_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SttlRcv:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSttlRcv_GetList(MCRow row, MCEventInfo info){
		return getList("getSttlRcv", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SttlRcv:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSttlRcv_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SttlRcvCols.viewCols(), down, info);
	}

	/** 
	  * SttlRcv:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSttlRcv_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SttlRcvCols.sortPolicy());
	}


	/** 
	  * Bcst_BillClDay:請求先請求締日 メインメソッド<p>
	  * 引数の請求先に対応する請求締日１－５を、取引先マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBcst_BillClDay(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBcst_BillClDay_GetList(row, info);//リストの取得
		getBcst_BillClDay_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBcst_BillClDay_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Bcst_BillClDay:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBcst_BillClDay_GetList(MCRow row, MCEventInfo info){
		return getList("getBcst_BillClDay", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Bcst_BillClDay:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBcst_BillClDay_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(Bcst_BillClDayCols.viewCols(), down, info);
	}

	/** 
	  * Bcst_BillClDay:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBcst_BillClDay_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(Bcst_BillClDayCols.sortPolicy());
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

}
