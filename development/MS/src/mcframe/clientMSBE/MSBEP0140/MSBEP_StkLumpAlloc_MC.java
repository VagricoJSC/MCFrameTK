package mcframe.clientMSBE.MSBEP0140;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0400.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_StkLumpAlloc"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StkLumpAlloc_MC extends MSBEP_StkLumpAlloc_MC_A implements IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	
	/** 
	 * 変更FLG(明細の項目が変更されたか) 
	 */
	protected boolean _isChanged;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkLumpAlloc_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_StkLumpAlloc_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL0140_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0140_Upd01Caller<P extends MSBEP_StkLumpAlloc, B extends MS_MSBEL0140_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		/** 通信対象のリスト */
		protected MCList<DtlR> _dtlForCall;
		
		protected MS_MSBEL0140_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			// 通信対象を絞る
			_dtlForCall = exceptDeleteAndEmpty(getDtlL());
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			// 上り電文を設定し直す
			bridge.up1().setAll(_dtlForCall);
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			// 優先得意先が0件の場合も登録する
			return true;
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			// 値の変更がない場合でも実行する
			// （何度でも繰り返し実行できるようにするため）
			return false;
		}

		@Override
		protected void setMode() {
			super.setMode();
			
			setUPDStatus();
			
			// 閉じ確認を表示させないためステータスをクリアする
			getCndR().setStatus(Status.NONE);
			_isChanged = false;
		}
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		getCnd_ship_loc_cd_ListPutter().putBind(LocCols.$i_wr_flg, true);
		getCnd_ship_loc_cd_ListPutter().putBind(LocCols.$m_wr_flg, MCMode.READ_ONLY.getName());
	}
	
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}
	
	@Override
	public boolean isStatusChange() {
		
		_isChanged = true;
		
		return false;
	}
	
	@Override
	public boolean isChanged(MCTable<?> tbl) {
		
		return _isChanged;
	}
	
	@Override
	public boolean sort(MCTable<?> table, MCColumnConfig column, SortType type) {
		boolean isSorted = super.sort(table, column, type);
		if (isSorted) {
			_isChanged = true;
		}
		return isSorted;
	}
	
	@Override
	public void screenClearBody() {
		super.screenClearBody();

		_isChanged = false;
	}
	
	@Override
	public void fillSpaceForOpen() {
		super.fillSpaceForOpen();
		
		DtlTable.fillSpace();
	}
	
	@Override
	public void doDtl_cst_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_cst_cd_LC(info);
		
		_isChanged = true;
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}
	
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		
		DtlR dtlR = deleteRow(DtlTable);
		
		// 入力された行を削除したときは変更FLGをONにする
		if (!isNull(dtlR) && dtlR.isStatusCreate()) {
			_isChanged = true;
		}
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL0140_Upd01();
	}

}