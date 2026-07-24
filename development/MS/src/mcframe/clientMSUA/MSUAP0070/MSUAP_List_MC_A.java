package mcframe.clientMSUA.MSUAP0070;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0070.MSUAC_List.*;


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
		return "mcframe.serverMSUA.MSUAL0070.MSUAL_List";
	}
	/** 
	  * SublotNo:サブロットＮＯ メインメソッド<p>
	  * 以下の引数に対応するロット管理情報を取得する<br>
　品目、枝番１－３、ロットＮＯ<br>
存在チェックの用途では使用できない
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getSublotNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getSublotNo_GetList(row, info);//リストの取得
		getSublotNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getSublotNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * SublotNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getSublotNo_GetList(MCRow row, MCEventInfo info){
		return getList("getSublotNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * SublotNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSublotNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(SublotNoCols.viewCols(), down, info);
	}

	/** 
	  * SublotNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getSublotNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(SublotNoCols.sortPolicy());
	}


	/** 
	  * LotNo:ロットＮＯ メインメソッド<p>
	  * ロット・サブロットリストビューからロット管理情報を取得する<br>
ロット・サブロットリストビュー：以下のすべての条件に合致する品目の場合でも、ロット管理情報を取得できるビュー<br>
・ロットＮＯ管理区分が「1：ロット管理しない」<br>
・サブロットＮＯ管理区分が「4：在庫のみサブロット管理する」
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getLotNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getLotNo_GetList(row, info);//リストの取得
		getLotNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getLotNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * LotNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getLotNo_GetList(MCRow row, MCEventInfo info){
		return getList("getLotNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * LotNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(LotNoCols.viewCols(), down, info);
	}

	/** 
	  * LotNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getLotNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(LotNoCols.sortPolicy());
	}

}
