package mcframe.clientMSUA.MSUAP0020;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0020.MSUAC_List.*;


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
		return "mcframe.serverMSUA.MSUAL0020.MSUAL_List";
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

}
