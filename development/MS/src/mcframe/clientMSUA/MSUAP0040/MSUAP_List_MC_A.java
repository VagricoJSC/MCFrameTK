package mcframe.clientMSUA.MSUAP0040;
import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;

import mcframe.clientCore.event.MCEventInfo;
import static mcframe.commonMSUA.MSUAC0040.MSUAC_List.*;


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
		return "mcframe.serverMSUA.MSUAL0040.MSUAL_List";
	}
	/** 
	  * ItmDtlMfgLoc:計画製造場所 メインメソッド<p>
	  * 以下の引数に対尾する製造場所を、品目詳細マスタから取得する<br>
　品目、枝番１－３<br>
発注先、メーカ、依頼先場所が、ＮＵＬＬ文字のものを取得する<br>
・ワーキングループで絞り込む場合は、wg_cdにワーキングループを指定する<br>
・更新権限を持つ場所のみを取得する場合は、wr_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlMfgLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlMfgLoc_GetList(row, info);//リストの取得
		getItmDtlMfgLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlMfgLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlMfgLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlMfgLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlMfgLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlMfgLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlMfgLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlMfgLocCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlMfgLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlMfgLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlMfgLocCols.sortPolicy());
	}


	/** 
	  * ItmDtlBomPtn:計画製造構成パタン メインメソッド<p>
	  * 以下の引数に対応する構成パタンを、品目詳細マスタから取得する<br>
　適用日、品目、枝番１－３、ワーキンググループ、製造場所<br>
発注先、メーカ、依頼先場所が、ＮＵＬＬ文字のものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlBomPtn(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlBomPtn_GetList(row, info);//リストの取得
		getItmDtlBomPtn_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlBomPtn_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlBomPtn:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlBomPtn_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlBomPtn", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlBomPtn:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlBomPtn_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlBomPtnCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlBomPtn:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlBomPtn_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlBomPtnCols.sortPolicy());
	}


	/** 
	  * ItmDtlRqstLoc:依頼先場所 メインメソッド<p>
	  * 依頼先場所を取得する<br>
・ワーキンググループ内の依頼先場所を取得する（場所マスタから取得する）場合は、以下の値を指定する<br>
　　itm_ord_typに「4：移送」を指定する<br>
　　strg_loc_cdに格納場所を指定する<br>
　　適用日で絞り込む場合は、master_dtに適用日を指定する<br>
・ワーキングループ間の依頼先場所を取得する（品目詳細マスタ（ＷＧ間依頼）ビューから取得する）場合は、以下の値を指定する<br>
　　itm_ord_typに「5：ＷＧ間移送」を指定する<br>
　　itm_cd、itm_sub1－3に、品目、枝番１－３を指定する<br>
　　wg_cdにワーキンググループを指定する<br>
　　strg_loc_cdに格納場所を指定する<br>
　　※製造場所、構成パタン、発注先、メーカが、ＮＵＬＬ文字のものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlRqstLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlRqstLoc_GetList(row, info);//リストの取得
		getItmDtlRqstLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlRqstLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlRqstLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlRqstLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlRqstLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlRqstLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlRqstLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlRqstLocCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlRqstLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlRqstLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlRqstLocCols.sortPolicy());
	}


	/** 
	  * DivSeq:製造指図ＮＯ分割枝番 メインメソッド<p>
	  * 製造指図・実績ビューから、引数の製造指図ＮＯに対応する分割連番などの情報を取得する<br>
製造指図・実績ビュー：品目製造指図、製造指図、製造指図進捗（＝分割連番が0の製造実績残）、製造実績の４つのビューを結合したビュー
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getDivSeq(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getDivSeq_GetList(row, info);//リストの取得
		getDivSeq_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getDivSeq_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * DivSeq:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getDivSeq_GetList(MCRow row, MCEventInfo info){
		return getList("getDivSeq", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * DivSeq:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDivSeq_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(DivSeqCols.viewCols(), down, info);
	}

	/** 
	  * DivSeq:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getDivSeq_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(DivSeqCols.sortPolicy());
	}


	/** 
	  * MpsItmGrp:ＭＰＳ品目グループ メインメソッド<p>
	  * 以下の引数に対応するＭＰＳグループ情報を、ＭＰＳ品目マスタから取得する<br>
　品目、枝番１－３、ワーキンググループ
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMpsItmGrp(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMpsItmGrp_GetList(row, info);//リストの取得
		getMpsItmGrp_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMpsItmGrp_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MpsItmGrp:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMpsItmGrp_GetList(MCRow row, MCEventInfo info){
		return getList("getMpsItmGrp", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * MpsItmGrp:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMpsItmGrp_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MpsItmGrpCols.viewCols(), down, info);
	}

	/** 
	  * MpsItmGrp:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMpsItmGrp_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MpsItmGrpCols.sortPolicy());
	}


	/** 
	  * ItmOperLoc:品目工程場所 メインメソッド<p>
	  * 以下の引数に対応する場所を、品目工程マスタから取得する<br>
　品目、枝番１－３、工程パタン、工程、工程連番、適用日
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmOperLoc(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmOperLoc_GetList(row, info);//リストの取得
		getItmOperLoc_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmOperLoc_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmOperLoc:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmOperLoc_GetList(MCRow row, MCEventInfo info){
		return getList("getItmOperLoc", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmOperLoc:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOperLoc_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmOperLocCols.viewCols(), down, info);
	}

	/** 
	  * ItmOperLoc:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmOperLoc_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmOperLocCols.sortPolicy());
	}


	/** 
	  * ItmDtlSub1WithSpplMaker:品目詳細（枝番１、発注先、メーカ） メインメソッド<p>
	  * 品目詳細マスタから、枝番１と品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlSub1WithSpplMaker(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlSub1WithSpplMaker_GetList(row, info);//リストの取得
		getItmDtlSub1WithSpplMaker_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlSub1WithSpplMaker_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlSub1WithSpplMaker:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlSub1WithSpplMaker_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlSub1WithSpplMaker", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlSub1WithSpplMaker:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub1WithSpplMaker_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlSub1WithSpplMakerCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlSub1WithSpplMaker:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub1WithSpplMaker_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlSub1WithSpplMakerCols.sortPolicy());
	}


	/** 
	  * ItmDtlSub2WithSpplMaker:品目詳細（枝番２、発注先、メーカ） メインメソッド<p>
	  * 品目詳細マスタから、枝番２と品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlSub2WithSpplMaker(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlSub2WithSpplMaker_GetList(row, info);//リストの取得
		getItmDtlSub2WithSpplMaker_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlSub2WithSpplMaker_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlSub2WithSpplMaker:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlSub2WithSpplMaker_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlSub2WithSpplMaker", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlSub2WithSpplMaker:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub2WithSpplMaker_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlSub2WithSpplMakerCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlSub2WithSpplMaker:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub2WithSpplMaker_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlSub2WithSpplMakerCols.sortPolicy());
	}


	/** 
	  * ItmDtlSub3WithSpplMaker:品目詳細（枝番３、発注先、メーカ） メインメソッド<p>
	  * 品目詳細マスタから、枝番３と品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlSub3WithSpplMaker(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlSub3WithSpplMaker_GetList(row, info);//リストの取得
		getItmDtlSub3WithSpplMaker_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlSub3WithSpplMaker_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlSub3WithSpplMaker:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlSub3WithSpplMaker_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlSub3WithSpplMaker", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlSub3WithSpplMaker:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub3WithSpplMaker_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlSub3WithSpplMakerCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlSub3WithSpplMaker:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSub3WithSpplMaker_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlSub3WithSpplMakerCols.sortPolicy());
	}


	/** 
	  * MfgInstNo:製造指図ＮＯ メインメソッド<p>
	  * 製造指図ＮＯに関連した情報を、製造指図・実績ビューから取得する<br>
製造指図・実績ビュー：品目製造指図、製造指図、製造指図進捗（＝分割連番が0の製造実績残）、製造実績の４つのビューを結合したビュー<br>
以下の引数の全てを指定しない場合は空のリストを返す<br>
　指図保存、指図済、着手中、完了
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getMfgInstNo(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getMfgInstNo_GetList(row, info);//リストの取得
		getMfgInstNo_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getMfgInstNo_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * MfgInstNo:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getMfgInstNo_GetList(MCRow row, MCEventInfo info){
		return getList("getMfgInstNo", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * MfgInstNo:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgInstNo_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(MfgInstNoCols.viewCols(), down, info);
	}

	/** 
	  * MfgInstNo:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getMfgInstNo_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(MfgInstNoCols.sortPolicy());
	}


	/** 
	  * ItmDtlSppl:発注先（品目詳細） メインメソッド<p>
	  * 品目詳細マスタから発注先を取得する<br>
発注先に対応するもののうち、製造場所、構成パタン、依頼先場所が、ＮＵＬＬ文字のものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlSppl(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlSppl_GetList(row, info);//リストの取得
		getItmDtlSppl_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlSppl_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlSppl:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlSppl_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlSppl", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlSppl:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSppl_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlSpplCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlSppl:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlSppl_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlSpplCols.sortPolicy());
	}


	/** 
	  * ItmDtlMaker:メーカ（品目詳細） メインメソッド<p>
	  * 引数の発注先に対応するメーカを、品目詳細マスタから取得する<br>
　製造場所、構成パタン、依頼先場所が、ＮＵＬＬ文字のものを取得する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlMaker(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlMaker_GetList(row, info);//リストの取得
		getItmDtlMaker_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlMaker_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlMaker:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlMaker_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlMaker", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlMaker:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlMaker_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlMakerCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlMaker:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlMaker_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlMakerCols.sortPolicy());
	}


	/** 
	  * ItmDtlWithSpplMaker:品目詳細（発注先、メーカ） メインメソッド<p>
	  * 品目詳細マスタから品目詳細情報を取得する<br>
・品目詳細情報をリストロジック「発注先（品目詳細）」から取得する場合は、get_sppl_flgに「true」を指定する<br>
・品目詳細情報をリストロジック「メーカ（品目詳細）」から取得する場合は、get_maker_flgに「true」を指定する
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	public MCList<MCRow> getItmDtlWithSpplMaker(MCRow row, MCEventInfo info) {
		MCList<MCRow> down = getItmDtlWithSpplMaker_GetList(row, info);//リストの取得
		getItmDtlWithSpplMaker_SetViewCols(down, info);//表示用カラムの追加
		if(down != null){
			getItmDtlWithSpplMaker_Sort(down, info);//ソート
		}
		return down;
	}
	/** 
	  * ItmDtlWithSpplMaker:リスト取得<p>
	  * リストの取得方法を変えたい場合にカスタマイズする場所
	  * @param row Rowコンテナ
	  * @param info イベント情報
	  */
	protected MCList<MCRow>  getItmDtlWithSpplMaker_GetList(MCRow row, MCEventInfo info){
		return getList("getItmDtlWithSpplMaker", row, info, getListCacheTyp(row, info));
	}
	/** 
	  * ItmDtlWithSpplMaker:表示用カラム作成<p>
	  * 表示カラムの作成方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlWithSpplMaker_SetViewCols(MCList<MCRow> down, MCEventInfo info){
		addDefDispColumn(ItmDtlWithSpplMakerCols.viewCols(), down, info);
	}

	/** 
	  * ItmDtlWithSpplMaker:リストソート<p>
	  * ソートの方法を変えたい場合にカスタマイズする場所
	  * @param down 検索結果を保持するListコンテナ
	  * @param info イベント情報
	  */
	protected void getItmDtlWithSpplMaker_Sort(MCList<MCRow> down, MCEventInfo info){
		down.sort(ItmDtlWithSpplMakerCols.sortPolicy());
	}

}
