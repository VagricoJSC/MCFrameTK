package mcframe.clientMBUA.MBUAP0010;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;


//CLIENT_SETTING_IMPORT (START)
import mcframe.commonMB.constant.*;
import mcframe.clientCore.resource.MCConfig;
import mcframe.commonFS.constant.FSC_MODULE_ID;
//CLIENT_SETTING_IMPORT (END)
/** 
 *  リストロジッククラスです。
 *  自動生成されるクラスです。カスタマイズできません。
 */

@SuppressWarnings("all")
abstract public class MBUAP_List_MC_A extends mcframe.clientFXBA.FXBAP0020.FXBAP_ListLogicBase {
	/**
	 * サーバ側のコンボボックス共通クラス名を取得する。
	 *
	 * @return サーバ側のコンボボックス共通クラス名（パッケージも含む)
	 */
	@Override
	protected String getControlClassName() {
		return "mcframe.serverMBUA.MBUAL0010.MBUAL_List";
	}
	/** 
	  * JnlGrpNo:仕訳グループＮＯ メインメソッド<p>
	  * 自動仕訳履歴テーブルから仕訳グループＮＯを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getJnlGrpNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getJnlGrpNo_GetList(row, info);//リストの取得
		getJnlGrpNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getJnlGrpNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * JnlGrpNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getJnlGrpNo_GetList(MCRow row, MCEventInfo info){
		return getList("getJnlGrpNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * JnlGrpNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlGrpNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(JnlGrpNoCols.viewCols(), down, info);
	}

	/** 
	  * JnlGrpNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getJnlGrpNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(JnlGrpNoCols.sortPolicy());
	}


	/** 
	  * BizDatID:業務データＩＤ メインメソッド<p>
	  * 業務データダウンロード管理テーブルから業務データＩＤを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBizDatID(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBizDatID_GetList(row, info);//リストの取得
		getBizDatID_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBizDatID_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BizDatID:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBizDatID_GetList(MCRow row, MCEventInfo info){
		return getList("getBizDatID", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BizDatID:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizDatID_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BizDatIDCols.viewCols(), down, info);
	}

	/** 
	  * BizDatID:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBizDatID_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BizDatIDCols.sortPolicy());
	}


	/** 
	  * BulkImpCtg:まとめ登録テーブルカテゴリ メインメソッド<p>
	  * まとめ登録テーブルカテゴリテーブルからテーブルカテゴリの情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBulkImpCtg(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBulkImpCtg_GetList(row, info);//リストの取得
		getBulkImpCtg_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBulkImpCtg_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BulkImpCtg:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBulkImpCtg_GetList(MCRow row, MCEventInfo info){
		return getList("getBulkImpCtg", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BulkImpCtg:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBulkImpCtg_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BulkImpCtgCols.viewCols(), down, info);
	}

	/** 
	  * BulkImpCtg:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBulkImpCtg_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BulkImpCtgCols.sortPolicy());
	}


	/** 
	  * BulkImpCtl:まとめ登録テーブルＩＤ メインメソッド<p>
	  * まとめ登録実行管理テーブルからテーブルＩＤの情報を取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getBulkImpCtl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getBulkImpCtl_GetList(row, info);//リストの取得
		getBulkImpCtl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getBulkImpCtl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * BulkImpCtl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getBulkImpCtl_GetList(MCRow row, MCEventInfo info){
		return getList("getBulkImpCtl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * BulkImpCtl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBulkImpCtl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(BulkImpCtlCols.viewCols(), down, info);
	}

	/** 
	  * BulkImpCtl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getBulkImpCtl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(BulkImpCtlCols.sortPolicy());
	}

}
