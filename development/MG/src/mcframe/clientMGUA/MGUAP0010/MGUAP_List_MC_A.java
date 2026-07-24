package mcframe.clientMGUA.MGUAP0010;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMGUA.MGUAC0010.MGUAC_List.*;


//CLIENT_SETTING_IMPORT (START)
import mcframe.commonMG.constant.*;
import mcframe.clientCore.resource.MCConfig;
import mcframe.commonFS.constant.FSC_MODULE_ID;
//CLIENT_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MGUAP_List_MC_A extends mcframe.clientMAUD.MAUDP0070.MAUDP_ListLogicBase {
	/**
	 * サーバ側のコンボボックス共通クラス名を取得する。
	 *
	 * @return サーバ側のコンボボックス共通クラス名（パッケージも含む)
	 */
	@Override
	protected String getControlClassName() {
		return "mcframe.serverMGUA.MGUAL0010.MGUAL_List";
	}
	/** 
	  * CalcMenu:原価計算メニュー メインメソッド<p>
	  * 引数の計算グループに対応する原価メニューのリストを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcMenu(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcMenu_GetList(row, info);//リストの取得
		getCalcMenu_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcMenu_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcMenu:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcMenu_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcMenu", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcMenu:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcMenu_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcMenuCols.viewCols(), down, info);
	}

	/** 
	  * CalcMenu:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcMenu_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcMenuCols.sortPolicy());
	}


	/** 
	  * ItmOperPtn:原価品目工程パタン メインメソッド<p>
	  * 以下の引数に対応する工程パタンを、原価品目工程情報テーブルから取得する<br>
　期、品目<br>
・原価品目工程情報のワーキンググループで絞り込む場合は、wg_cdにワーキンググループを指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmOperPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmOperPtn_GetList(row, info);//リストの取得
		getItmOperPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmOperPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmOperPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmOperPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getItmOperPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmOperPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOperPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmOperPtnCols.viewCols(), down, info);
	}

	/** 
	  * ItmOperPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOperPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmOperPtnCols.sortPolicy());
	}


	/** 
	  * BomPtn:原価構成パタン メインメソッド<p>
	  * 原価ＢＯＭ情報テーブルから構成パタンを取得する<br>
・品目に対応する構成パタンを取得する場合は、以下の指定をする<br>
　　親品目の場合：par_itm_flgに「true」を指定し、itm_cdに品目を指定する<br>
　　子品目の場合：chd_itm_flgに「true」を指定し、itm_cdに品目を指定する<br>
　　いずれの場合もitm_sub1－3に枝番１－３を指定できる
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
	  * CalcParm:原価計算パラメータ メインメソッド<p>
	  * 原価計算パラメータ情報テーブルから、ログイン中のロケールに対応するパラメータを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcParm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcParm_GetList(row, info);//リストの取得
		getCalcParm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcParm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcParm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcParm_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcParm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcParm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcParm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcParmCols.viewCols(), down, info);
	}

	/** 
	  * CalcParm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcParm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcParmCols.sortPolicy());
	}


	/** 
	  * BizGrp:原価業務分類 メインメソッド<p>
	  * 原価計算パラメータ概要テーブルから、ログイン中のロケールの業務分類を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBizGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBizGrp_GetList(row, info);//リストの取得
		getBizGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBizGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BizGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBizGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getBizGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BizGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BizGrpCols.viewCols(), down, info);
	}

	/** 
	  * BizGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BizGrpCols.sortPolicy());
	}


	/** 
	  * StkEvalWithUpriSetTypIsNotNull:在庫評価（単価設定） メインメソッド<p>
	  * 在庫評価マスタから、単価設定区分を設定している在庫評価ＣＤを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkEvalWithUpriSetTypIsNotNull(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkEvalWithUpriSetTypIsNotNull_GetList(row, info);//リストの取得
		getStkEvalWithUpriSetTypIsNotNull_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkEvalWithUpriSetTypIsNotNull_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkEvalWithUpriSetTypIsNotNull:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkEvalWithUpriSetTypIsNotNull_GetList(MCRow row, MCEventInfo info){
		return getList("getStkEvalWithUpriSetTypIsNotNull", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StkEvalWithUpriSetTypIsNotNull:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkEvalWithUpriSetTypIsNotNull_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkEvalWithUpriSetTypIsNotNullCols.viewCols(), down, info);
	}

	/** 
	  * StkEvalWithUpriSetTypIsNotNull:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkEvalWithUpriSetTypIsNotNull_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkEvalWithUpriSetTypIsNotNullCols.sortPolicy());
	}


	/** 
	  * StkEvalWithLumpRateFlgOff:在庫評価（一括指定しない） メインメソッド<p>
	  * 在庫評価マスタから、一括指定フラグがオフの在庫評価ＣＤを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkEvalWithLumpRateFlgOff(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkEvalWithLumpRateFlgOff_GetList(row, info);//リストの取得
		getStkEvalWithLumpRateFlgOff_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkEvalWithLumpRateFlgOff_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkEvalWithLumpRateFlgOff:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkEvalWithLumpRateFlgOff_GetList(MCRow row, MCEventInfo info){
		return getList("getStkEvalWithLumpRateFlgOff", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StkEvalWithLumpRateFlgOff:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkEvalWithLumpRateFlgOff_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkEvalWithLumpRateFlgOffCols.viewCols(), down, info);
	}

	/** 
	  * StkEvalWithLumpRateFlgOff:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkEvalWithLumpRateFlgOff_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkEvalWithLumpRateFlgOffCols.sortPolicy());
	}


	/** 
	  * PreAlcRateWithPtn:一次配賦基準 メインメソッド<p>
	  * 一次配賦基準マスタと一次配賦パタンマスタから、一次配賦基準に関する情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcRateWithPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcRateWithPtn_GetList(row, info);//リストの取得
		getPreAlcRateWithPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcRateWithPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcRateWithPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcRateWithPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcRateWithPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcRateWithPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateWithPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcRateWithPtnCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcRateWithPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateWithPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcRateWithPtnCols.sortPolicy());
	}


	/** 
	  * CalcArgYm:原価計計算年月 メインメソッド<p>
	  * 以下の引数に対応する原価計算設定情報テーブルの対象期間の、先頭年月から末尾年月までの年月を取得する<br>
　計算グループ、計算ＮＯ
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcArgYm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcArgYm_GetList(row, info);//リストの取得
		getCalcArgYm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcArgYm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcArgYm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcArgYm_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcArgYm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcArgYm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcArgYm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcArgYmCols.viewCols(), down, info);
	}

	/** 
	  * CalcArgYm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcArgYm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcArgYmCols.sortPolicy());
	}


	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:一次配賦基準（一次配賦基準カテゴリ登録済、一次配賦パタン取得） メインメソッド<p>
	  * 以下の引数に対応する一次配賦基準に関する情報を、一次配賦基準マスタと一次配賦パタンマスタから取得する<br>
　計算カテゴリ、ワーキンググループ、期<br>
・以下の全ての条件に合致する一次配賦基準マスタのみ対象とする場合は、term_flgに「true」を指定する<br>
　　計画月次比率が「false」<br>
　　実績月次比率が「false」<br>
　　計画基準が「false」<br>
・一次配賦基準マスタの月次比率フラグで絞り込む場合は、term_flgに「false」を指定したうえで、以下を指定する<br>
　　計画月次比率を指定する場合：pln_mly_flg_strを指定する<br>
　　実績月次比率を指定する場合：act_mly_flg_strを指定する<br>
　　
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcRateInPreAlcCtgWithPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcRateInPreAlcCtgWithPtn_GetList(row, info);//リストの取得
		getPreAlcRateInPreAlcCtgWithPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcRateInPreAlcCtgWithPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcRateInPreAlcCtgWithPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcRateInPreAlcCtgWithPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateInPreAlcCtgWithPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcRateInPreAlcCtgWithPtnCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcRateInPreAlcCtgWithPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateInPreAlcCtgWithPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcRateInPreAlcCtgWithPtnCols.sortPolicy());
	}


	/** 
	  * ItmJnlInRptKeyConf:品目仕訳（原価レポートキー構成登録） メインメソッド<p>
	  * 原価レポートキー構成マスタから、品目仕訳を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmJnlInRptKeyConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmJnlInRptKeyConf_GetList(row, info);//リストの取得
		getItmJnlInRptKeyConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmJnlInRptKeyConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmJnlInRptKeyConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmJnlInRptKeyConf_GetList(MCRow row, MCEventInfo info){
		return getList("getItmJnlInRptKeyConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmJnlInRptKeyConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmJnlInRptKeyConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmJnlInRptKeyConfCols.viewCols(), down, info);
	}

	/** 
	  * ItmJnlInRptKeyConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmJnlInRptKeyConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmJnlInRptKeyConfCols.sortPolicy());
	}


	/** 
	  * ItmGrpInRptKeyConf:品目分類（原価レポートキー構成登録） メインメソッド<p>
	  * 原価レポートキー構成マスタから、品目分類を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmGrpInRptKeyConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmGrpInRptKeyConf_GetList(row, info);//リストの取得
		getItmGrpInRptKeyConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmGrpInRptKeyConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmGrpInRptKeyConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmGrpInRptKeyConf_GetList(MCRow row, MCEventInfo info){
		return getList("getItmGrpInRptKeyConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmGrpInRptKeyConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrpInRptKeyConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmGrpInRptKeyConfCols.viewCols(), down, info);
	}

	/** 
	  * ItmGrpInRptKeyConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmGrpInRptKeyConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmGrpInRptKeyConfCols.sortPolicy());
	}


	/** 
	  * CostDptInRptKeyConf:原価部門（原価レポートキー構成登録） メインメソッド<p>
	  * 引数で指定した適用年月に対応する原価部門を、原価レポートキー構成マスタから取得する<br>
・適用年月の設定方法は以下の通り<br>
　　適用年月を指定する場合：ymに期を指定する（mode_this_month_flgは無効になる）<br>
　　運用年月を使用する場合：ymを未指定にし、mode_this_month_flgに「true」を指定する<br>
　※ymに「null」を指定した場合は「null」を返す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostDptInRptKeyConf(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostDptInRptKeyConf_GetList(row, info);//リストの取得
		getCostDptInRptKeyConf_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostDptInRptKeyConf_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostDptInRptKeyConf:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostDptInRptKeyConf_GetList(MCRow row, MCEventInfo info){
		return getList("getCostDptInRptKeyConf", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostDptInRptKeyConf:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostDptInRptKeyConf_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostDptInRptKeyConfCols.viewCols(), down, info);
	}

	/** 
	  * CostDptInRptKeyConf:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostDptInRptKeyConf_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostDptInRptKeyConfCols.sortPolicy());
	}


	/** 
	  * CostCmpPtn:比較パタン（原価計算） メインメソッド<p>
	  * 原価レポート比較マスタから、計算区分に「2：原価計算（在庫対象外）」または「3：原価計算（在庫計算）」が設定されている計算グループマスタに紐づく比較パタンを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostCmpPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostCmpPtn_GetList(row, info);//リストの取得
		getCostCmpPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostCmpPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostCmpPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostCmpPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getCostCmpPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CostCmpPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCmpPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostCmpPtnCols.viewCols(), down, info);
	}

	/** 
	  * CostCmpPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCmpPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostCmpPtnCols.sortPolicy());
	}


	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:一次配賦基準（一次配賦期間比率未登録） メインメソッド<p>
	  * 以下の引数に対応する一次配賦基準カテゴリマスタに存在する一次配賦基準のうち、一次配賦期間比率テーブルに存在しないものを取得する<br>
　計算カテゴリ、ワーキンググループ、期
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcRateWithPtnNotInPreRateTerm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcRateWithPtnNotInPreRateTerm_GetList(row, info);//リストの取得
		getPreAlcRateWithPtnNotInPreRateTerm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcRateWithPtnNotInPreRateTerm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcRateWithPtnNotInPreRateTerm_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcRateWithPtnNotInPreRateTerm", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateWithPtnNotInPreRateTerm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcRateWithPtnNotInPreRateTermCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcRateWithPtnNotInPreRateTerm:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateWithPtnNotInPreRateTerm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcRateWithPtnNotInPreRateTermCols.sortPolicy());
	}


	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:一次配賦基準（一次配賦月次比率未登録） メインメソッド<p>
	  * 以下の引数に対応する一次配賦基準カテゴリマスタに存在する一次配賦基準のうち、一次配賦月次比率テーブルに存在しないものを取得する<br>
　計算カテゴリ、ワーキンググループ、期
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPreAlcRateWithPtnNotInPreRateMly(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPreAlcRateWithPtnNotInPreRateMly_GetList(row, info);//リストの取得
		getPreAlcRateWithPtnNotInPreRateMly_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPreAlcRateWithPtnNotInPreRateMly_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPreAlcRateWithPtnNotInPreRateMly_GetList(MCRow row, MCEventInfo info){
		return getList("getPreAlcRateWithPtnNotInPreRateMly", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateWithPtnNotInPreRateMly_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PreAlcRateWithPtnNotInPreRateMlyCols.viewCols(), down, info);
	}

	/** 
	  * PreAlcRateWithPtnNotInPreRateMly:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPreAlcRateWithPtnNotInPreRateMly_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PreAlcRateWithPtnNotInPreRateMlyCols.sortPolicy());
	}


	/** 
	  * RecEvalTyp:個別評価区分 メインメソッド<p>
	  * 個別評価区分を表す定数を取得する<br>
個別評価区分：投入・入出庫・売上実績において指定する払出金額を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRecEvalTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRecEvalTyp_GetList(row, info);//リストの取得
		getRecEvalTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRecEvalTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RecEvalTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRecEvalTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_REC_EVAL_TYP.list(row);
	}
	/** 
	  * RecEvalTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRecEvalTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RecEvalTypCols.viewCols(), down, info);
	}

	/** 
	  * RecEvalTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRecEvalTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RecEvalTypCols.sortPolicy());
	}


	/** 
	  * Ym:年月 メインメソッド<p>
	  * 開始から終了の１月前までの年月のリストを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getYm(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getYm_GetList(row, info);//リストの取得
		getYm_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getYm_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * Ym:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getYm_GetList(MCRow row, MCEventInfo info){
		return null;
	}
	/** 
	  * Ym:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getYm_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(YmCols.viewCols(), down, info);
	}

	/** 
	  * Ym:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getYm_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(YmCols.sortPolicy());
	}


	/** 
	  * AmtDcsnTyp:金額判定区分 メインメソッド<p>
	  * 金額判定区分を表す定数を取得する<br>
金額判定区分：在庫金額の判定方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAmtDcsnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAmtDcsnTyp_GetList(row, info);//リストの取得
		getAmtDcsnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAmtDcsnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AmtDcsnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAmtDcsnTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_AMT_DCSN_TYP.list(row);
	}
	/** 
	  * AmtDcsnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtDcsnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AmtDcsnTypCols.viewCols(), down, info);
	}

	/** 
	  * AmtDcsnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAmtDcsnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AmtDcsnTypCols.sortPolicy());
	}


	/** 
	  * QtyDcsnTyp:数量判定区分 メインメソッド<p>
	  * 数量判定区分を表す定数を取得する<br>
数量判定区分：在庫数量の判定方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getQtyDcsnTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getQtyDcsnTyp_GetList(row, info);//リストの取得
		getQtyDcsnTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getQtyDcsnTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * QtyDcsnTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getQtyDcsnTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_QTY_DCSN_TYP.list(row);
	}
	/** 
	  * QtyDcsnTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtyDcsnTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(QtyDcsnTypCols.viewCols(), down, info);
	}

	/** 
	  * QtyDcsnTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getQtyDcsnTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(QtyDcsnTypCols.sortPolicy());
	}


	/** 
	  * CtDataTyp:共通データ種類区分 メインメソッド<p>
	  * 共通データ種類区分を表す定数を取得する<br>
共通データ種類区分：原価ＩＦデータ取込画面で取込対象となるデータの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCtDataTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCtDataTyp_GetList(row, info);//リストの取得
		getCtDataTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCtDataTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CtDataTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCtDataTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_CT_DATA_TYP.list(row);
	}
	/** 
	  * CtDataTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtDataTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CtDataTypCols.viewCols(), down, info);
	}

	/** 
	  * CtDataTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCtDataTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CtDataTypCols.sortPolicy());
	}


	/** 
	  * IfDtlTyp:ＩＦデータ詳細区分 メインメソッド<p>
	  * ＩＦデータ詳細区分を表す定数を取得する<br>
ＩＦデータ詳細区分：原価ＩＦデータ取込画面で取込先となるデータの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIfDtlTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIfDtlTyp_GetList(row, info);//リストの取得
		getIfDtlTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIfDtlTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IfDtlTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIfDtlTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_IF_DTL_TYP.list(row);
	}
	/** 
	  * IfDtlTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfDtlTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IfDtlTypCols.viewCols(), down, info);
	}

	/** 
	  * IfDtlTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfDtlTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IfDtlTypCols.sortPolicy());
	}


	/** 
	  * IfDataTyp:ＩＦデータ種類区分 メインメソッド<p>
	  * ＩＦデータ種類区分を表す定数を取得する<br>
ＩＦデータ種類区分：原価実績データ作成画面で作成する実績の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIfDataTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIfDataTyp_GetList(row, info);//リストの取得
		getIfDataTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIfDataTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IfDataTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIfDataTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_IF_DATA_TYP.list(row);
	}
	/** 
	  * IfDataTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfDataTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IfDataTypCols.viewCols(), down, info);
	}

	/** 
	  * IfDataTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIfDataTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IfDataTypCols.sortPolicy());
	}


	/** 
	  * CostActTyp:原価実績種類区分 メインメソッド<p>
	  * 原価実績種類区分を表す定数を取得する<br>
原価実績種類区分：原価実績データ作成画面で作成される実績の種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostActTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostActTyp_GetList(row, info);//リストの取得
		getCostActTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostActTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostActTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostActTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_COST_ACT_TYP.list(row);
	}
	/** 
	  * CostActTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostActTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostActTypCols.viewCols(), down, info);
	}

	/** 
	  * CostActTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostActTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostActTypCols.sortPolicy());
	}


	/** 
	  * AlcRecTyp:費用発生区分 メインメソッド<p>
	  * 費用発生区分を表す定数を取得する<br>
費用発生区分：配賦費用の発生元を表す（配賦元の費用データで使用）
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getAlcRecTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getAlcRecTyp_GetList(row, info);//リストの取得
		getAlcRecTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getAlcRecTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * AlcRecTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getAlcRecTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_ALC_REC_TYP.list(row);
	}
	/** 
	  * AlcRecTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRecTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(AlcRecTypCols.viewCols(), down, info);
	}

	/** 
	  * AlcRecTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getAlcRecTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(AlcRecTypCols.sortPolicy());
	}


	/** 
	  * InptAlcTyp:入力費用区分 メインメソッド<p>
	  * 入力費用区分を表す定数を取得する<br>
入力費用区分：費用の入力元を表す（配賦の計算結果データで使用）
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInptAlcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInptAlcTyp_GetList(row, info);//リストの取得
		getInptAlcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInptAlcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InptAlcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInptAlcTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_INPT_ALC_TYP.list(row);
	}
	/** 
	  * InptAlcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptAlcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InptAlcTypCols.viewCols(), down, info);
	}

	/** 
	  * InptAlcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInptAlcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InptAlcTypCols.sortPolicy());
	}


	/** 
	  * TabCtgTyp:テーブルカテゴリ区分 メインメソッド<p>
	  * テーブルカテゴリ区分を表す定数を取得する<br>
テーブルカテゴリ区分：原価データコピー画面で処理対象となるテーブルの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getTabCtgTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getTabCtgTyp_GetList(row, info);//リストの取得
		getTabCtgTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getTabCtgTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * TabCtgTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getTabCtgTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_TAB_CTG_TYP.list(row);
	}
	/** 
	  * TabCtgTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTabCtgTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(TabCtgTypCols.viewCols(), down, info);
	}

	/** 
	  * TabCtgTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getTabCtgTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(TabCtgTypCols.sortPolicy());
	}


	/** 
	  * CostCopyTyp:原価コピー対象区分 メインメソッド<p>
	  * 原価コピー対象区分を表す定数を取得する<br>
原価コピー対象区分：原価データコピー画面で処理対象となるテーブルを表す<br>
・テーブルカテゴリ区分で絞り込む場合は、tab_ctg_typにテーブルカテゴリ区分を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostCopyTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostCopyTyp_GetList(row, info);//リストの取得
		getCostCopyTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostCopyTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostCopyTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostCopyTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_COST_COPY_TYP.list(row);
	}
	/** 
	  * CostCopyTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCopyTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostCopyTypCols.viewCols(), down, info);
	}

	/** 
	  * CostCopyTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostCopyTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostCopyTypCols.sortPolicy());
	}


	/** 
	  * CalcRecTyp:計算レコード区分 メインメソッド<p>
	  * 計算レコード区分を表す定数を取得する<br>
計算レコード区分：計算結果のレコードの種類を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcRecTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcRecTyp_GetList(row, info);//リストの取得
		getCalcRecTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcRecTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcRecTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcRecTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_CALC_REC_TYP.list(row);
	}
	/** 
	  * CalcRecTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcRecTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcRecTypCols.viewCols(), down, info);
	}

	/** 
	  * CalcRecTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcRecTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcRecTypCols.sortPolicy());
	}


	/** 
	  * IoRecTyp:受払レコード区分 メインメソッド<p>
	  * 受払レコード区分を表す定数を取得する<br>
受払レコード区分：受払原価のレコードソート順と表示用文字列を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getIoRecTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getIoRecTyp_GetList(row, info);//リストの取得
		getIoRecTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getIoRecTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * IoRecTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getIoRecTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_IO_REC_TYP.list(row);
	}
	/** 
	  * IoRecTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoRecTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(IoRecTypCols.viewCols(), down, info);
	}

	/** 
	  * IoRecTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getIoRecTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(IoRecTypCols.sortPolicy());
	}


	/** 
	  * PtnSetTyp:構成/工程パタン設定区分 メインメソッド<p>
	  * 構成/工程パタン設定区分を表す定数を取得する<br>
構成/工程パタン設定区分：原価実績マスタコピー画面で構成パタン、工程パタンの設定方法を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getPtnSetTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getPtnSetTyp_GetList(row, info);//リストの取得
		getPtnSetTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getPtnSetTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * PtnSetTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getPtnSetTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_PTN_SET_TYP.list(row);
	}
	/** 
	  * PtnSetTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPtnSetTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(PtnSetTypCols.viewCols(), down, info);
	}

	/** 
	  * PtnSetTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getPtnSetTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(PtnSetTypCols.sortPolicy());
	}


	/** 
	  * BatchTyp:原価バッチ区分 メインメソッド<p>
	  * 原価バッチ区分を表す定数を取得する<br>
原価バッチ区分：原価計算結果を集計するなどのバッチ処理を表す
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBatchTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBatchTyp_GetList(row, info);//リストの取得
		getBatchTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBatchTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BatchTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBatchTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_BATCH_TYP.list(row);
	}
	/** 
	  * BatchTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBatchTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BatchTypCols.viewCols(), down, info);
	}

	/** 
	  * BatchTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBatchTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BatchTypCols.sortPolicy());
	}


	/** 
	  * RepurcObliTyp:買戻義務区分 メインメソッド<p>
	  * 買戻義務区分を表す定数を取得する<br>
買戻義務区分：買戻義務の判定方法を定義する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRepurcObliTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRepurcObliTyp_GetList(row, info);//リストの取得
		getRepurcObliTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRepurcObliTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RepurcObliTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRepurcObliTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_REPURC_OBLI_TYP.list(row);
	}
	/** 
	  * RepurcObliTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRepurcObliTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RepurcObliTypCols.viewCols(), down, info);
	}

	/** 
	  * RepurcObliTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRepurcObliTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RepurcObliTypCols.sortPolicy());
	}


	/** 
	  * CostIoActTyp:原価受払区分 メインメソッド<p>
	  * 原価受払区分を表す定数を取得する<br>
原価受払区分：受払実績受信ＩＦの種類を定義する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCostIoActTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCostIoActTyp_GetList(row, info);//リストの取得
		getCostIoActTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCostIoActTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CostIoActTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCostIoActTyp_GetList(MCRow row, MCEventInfo info){
		return MGC_COST_IO_ACT_TYP.list(row);
	}
	/** 
	  * CostIoActTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoActTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CostIoActTypCols.viewCols(), down, info);
	}

	/** 
	  * CostIoActTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCostIoActTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CostIoActTypCols.sortPolicy());
	}


	/** 
	  * CalcNo:原価計算ＮＯ メインメソッド<p>
	  * 引数の計算グループに対応する原価計算ＮＯを、原価計算設定情報テーブルから取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getCalcNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getCalcNo_GetList(row, info);//リストの取得
		getCalcNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getCalcNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * CalcNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getCalcNo_GetList(MCRow row, MCEventInfo info){
		return getList("getCalcNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * CalcNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(CalcNoCols.viewCols(), down, info);
	}

	/** 
	  * CalcNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getCalcNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(CalcNoCols.sortPolicy());
	}

}
