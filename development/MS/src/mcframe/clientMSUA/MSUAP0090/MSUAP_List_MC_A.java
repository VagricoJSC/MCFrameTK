package mcframe.clientMSUA.MSUAP0090;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0090.MSUAC_List.*;


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
		return "mcframe.serverMSUA.MSUAL0090.MSUAL_List";
	}
	/** 
	  * Bsppl_PaySchdClDay:支払予定管理先支払締日 メインメソッド<p>
	  * 引数の支払予定管理先に対応する支払締日１－５を、取引先マスタから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBsppl_PaySchdClDay(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBsppl_PaySchdClDay_GetList(row, info);//リストの取得
		getBsppl_PaySchdClDay_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBsppl_PaySchdClDay_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Bsppl_PaySchdClDay:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBsppl_PaySchdClDay_GetList(MCRow row, MCEventInfo info){
		return getList("getBsppl_PaySchdClDay", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * Bsppl_PaySchdClDay:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBsppl_PaySchdClDay_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(Bsppl_PaySchdClDayCols.viewCols(), down, info);
	}

	/** 
	  * Bsppl_PaySchdClDay:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBsppl_PaySchdClDay_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(Bsppl_PaySchdClDayCols.sortPolicy());
	}


	/** 
	  * AdvPay:前渡金 メインメソッド<p>
	  * 前渡金実績テーブルと支払手形テーブルから、前渡金情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAdvPay(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAdvPay_GetList(row, info);//リストの取得
		getAdvPay_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAdvPay_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AdvPay:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAdvPay_GetList(MCRow row, MCEventInfo info){
		return getList("getAdvPay", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * AdvPay:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdvPay_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AdvPayCols.viewCols(), down, info);
	}

	/** 
	  * AdvPay:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAdvPay_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AdvPayCols.sortPolicy());
	}

}
