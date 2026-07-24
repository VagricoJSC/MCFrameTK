package mcframe.clientMSUA.MSUAP0060;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.*;


//CLIENT_SETTING_IMPORT (START)
import mcframe.commonMA.constant.*;
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
		return "mcframe.serverMSUA.MSUAL0060.MSUAL_List";
	}
	/** 
	  * InToId:納品先 メインメソッド<p>
	  * 納入先識別ビューから納入先情報を取得する<br>
納入先識別ビュー：取引先マスタや場所マスタから、納入先となりうる納品先や場所を抽出したビュー
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getInToId(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getInToId_GetList(row, info);//リストの取得
		getInToId_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getInToId_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * InToId:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getInToId_GetList(MCRow row, MCEventInfo info){
		return getList("getInToId", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * InToId:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInToId_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(InToIdCols.viewCols(), down, info);
	}

	/** 
	  * InToId:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getInToId_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(InToIdCols.sortPolicy());
	}


	/** 
	  * StkBp:在庫取引先 メインメソッド<p>
	  * 引数の在庫識別区分に応じた取引先情報を、取引先マスタから取得する<br>
在庫識別区分に対応する取引先入力補助検索区分を使用して取得する<br>
・得意先を取得する場合は、stk_id_typに以下のいずれかの在庫識別区分を指定する<br>
　　「2：返品検収前」<br>
　　「3：預り」<br>
・発注先を取得する場合は、stk_id_typに以下のいずれかの在庫識別区分を指定する<br>
　　「4：VMI」<br>
　　「5：仕入検収前」<br>
　　「6：検収不良」<br>
　　「7：無償受給」<br>
　　「8：有償支給」<br>
・NULL文字を使用する場合は、mode_nullval_flgに「true」を設定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getStkBp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getStkBp_GetList(row, info);//リストの取得
		getStkBp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getStkBp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * StkBp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getStkBp_GetList(MCRow row, MCEventInfo info){
		return getList("getStkBp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * StkBp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkBp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(StkBpCols.viewCols(), down, info);
	}

	/** 
	  * StkBp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getStkBp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(StkBpCols.sortPolicy());
	}


	/** 
	  * StkIdTyp:在庫識別区分 メインメソッド<p>
	  * 在庫識別区分を表す定数を取得する<br>
在庫識別区分：他社資産在庫の在庫の用途を表す<br>
以下の引数に応じた、入出庫に関する在庫識別区分を返す<br>
　出庫発注先、入庫発注先、インボイス取引フラグ、移動実績フラグ、出荷実績フラグ
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
	  * ProvTyp:支給区分 メインメソッド<p>
	  * 支給区分を表す定数を取得する<br>
支給区分：支給の種類を表す<br>
「1：無償支給」を取得する<br>
「2：有償支給」も取得対象にできる<br>
・「2：有償支給」を取得する場合は、onr_prsppl_flgに「true」を指定し、asset_mng_typに「1：資産管理する」を指定する
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
	  * RcptIvSrcTyp:受領インボイス作成元区分 メインメソッド<p>
	  * 受領インボイス作成元区分を表す定数を取得する<br>
受領インボイス作成元区分：受領インボイスの作成元となったトランザクションを表す。
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getRcptIvSrcTyp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getRcptIvSrcTyp_GetList(row, info);//リストの取得
		getRcptIvSrcTyp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getRcptIvSrcTyp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * RcptIvSrcTyp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getRcptIvSrcTyp_GetList(MCRow row, MCEventInfo info){
		return MSC_RCPT_IV_SRC_TYP.list(row);
	}
	/** 
	  * RcptIvSrcTyp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRcptIvSrcTyp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(RcptIvSrcTypCols.viewCols(), down, info);
	}

	/** 
	  * RcptIvSrcTyp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getRcptIvSrcTyp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(RcptIvSrcTypCols.sortPolicy());
	}


	/** 
	  * ShipToId:送付先 メインメソッド<p>
	  * 送付先識別ビューから送付先情報を取得する<br>
送付先識別ビュー：取引先マスタや場所マスタから、送付先となりうる納品先、配送先、場所を抽出したビュー
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipToId(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipToId_GetList(row, info);//リストの取得
		getShipToId_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipToId_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipToId:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipToId_GetList(MCRow row, MCEventInfo info){
		return getList("getShipToId", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ShipToId:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipToId_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipToIdCols.viewCols(), down, info);
	}

	/** 
	  * ShipToId:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipToId_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipToIdCols.sortPolicy());
	}


	/** 
	  * DlvId:納品先 メインメソッド<p>
	  * 納品先識別ビューから納品先情報を取得する<br>
納品先識別ビュー：取引先マスタや場所マスタから、納品先となりうる納品先や場所を抽出したビュー
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDlvId(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDlvId_GetList(row, info);//リストの取得
		getDlvId_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDlvId_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DlvId:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDlvId_GetList(MCRow row, MCEventInfo info){
		return getList("getDlvId", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DlvId:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlvId_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DlvIdCols.viewCols(), down, info);
	}

	/** 
	  * DlvId:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDlvId_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DlvIdCols.sortPolicy());
	}


	/** 
	  * ShipRqstId:出荷依頼先 メインメソッド<p>
	  * 出荷依頼先識別ビューから出荷依頼先情報を取得する<br>
出荷依頼先識別ビュー：取引先マスタや場所マスタから、出荷依頼先となりうる得意先、発注先、場所を抽出したビュー
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getShipRqstId(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getShipRqstId_GetList(row, info);//リストの取得
		getShipRqstId_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getShipRqstId_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ShipRqstId:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getShipRqstId_GetList(MCRow row, MCEventInfo info){
		return getList("getShipRqstId", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ShipRqstId:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipRqstId_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ShipRqstIdCols.viewCols(), down, info);
	}

	/** 
	  * ShipRqstId:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getShipRqstId_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ShipRqstIdCols.sortPolicy());
	}

}
