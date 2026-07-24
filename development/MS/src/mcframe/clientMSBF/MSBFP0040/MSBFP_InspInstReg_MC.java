package mcframe.clientMSBF.MSBFP0040;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5350.*;
import mcframe.clientMSUB.MSUBP0030.*;

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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientCore.container.MCRowListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowEvent;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_InspInstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_InspInstReg_MC extends MSBFP_InspInstReg_MC_A implements IfOpePanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_InspInstReg_MC() {
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
	public MSBFP_InspInstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch01Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0040_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			if (!isSrchMultiSchd()) {
				//T3で遷移してきた初回の検索でない場合は、検査予定ＮＯの
				//必須チェックを行うためにaddUpContainerする。
				addUpContainer(getCndR());
			}
		}

		@Override
		protected void call() {
			super.call();
			//検索し終わった後に必ずCndSchdLをクリアしたいので
			//(CndSchdLがemptyかどうかでT3で起動された時の初回検索かどうかを判断しているため)
			//callをオーバライド
			//※afterCallは検索結果が存在しないと呼ばれないためafterCallではなくcallで行っている。
			getCndSchdL().clear();
		}
		
		@Override
		protected void handleMCEx(MCException ex) {
			//通信処理でexceptionが生じた場合、callの後にCndSchdLを
			//クリアするだけでは不十分なためオーバライド。
			getCndSchdL().clear();
			super.handleMCEx(ex);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			setCndSchd();
		}

		/**
		 * 上り電文コンテナに検索枠の検査予定ＮＯを設定する。
		 */
		protected void setCndSchd() {
			if (!isSrchMultiSchd()) {
				//T3で遷移してきた初回の検索でない場合は、検索枠の検査予定ＮＯをbridgeに設定。
				CndSchdR r = CndSchdR.create();
				r.srch_tgt_no(getCndR().srch_tgt_no());
				bridge.up0().add(r);
			}
		}

		@Override
		protected void show() {
			super.show();
			editMasterData(getHdrR());
			MCList<DtlStdR> d = getDtlStdL();
			d.setStatus(MCRow.CREATE);
			setValueEx(Hdr_inst_dt, getToday());
			getHdrR().setStatus(Status.NONE);
			if (canEditPlntAprv()) {
				setValueEx(Hdr_plnt_aprv_flg, isMasterPlntAprv());
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			setHdrMode();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			HdrPanel.focusFirstComponent();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			setFIX_IStatus();
		}

		/**
		 * T3で遷移してきた初回の検索かどうかを返す。
		 * @return
		 */
		protected boolean isSrchMultiSchd() {
			//getCndSchdLがemptyか否かで判断する。
			return !getCndSchdL().isEmpty();
		}
	}

	/**
	 * [MS_MSBFL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch02Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0040_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
			setHdrMode();
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			HdrPanel.focusFirstComponent();
		}
	}

	/**
	 * [MS_MSBFL0040_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch03Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0040_Srch03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			//何もしない
		}
		
		@Override
		protected void show() {
			//ヘッダをクリアしないようにするためにshowMergeする。
			showMerge();
			editMasterData(getHdrR());
			//showMergeなのでソートが必要。
			DtlStdTable.sort();
			getDtlStdL().setStatus(MCRow.CREATE);
			setSmplInstQty();
			if (canEditPlntAprv()) {
				setValueEx(Hdr_plnt_aprv_flg, isMasterPlntAprv());
			}
		}
		
		@Override
		protected void setMode(){
			//フォーカスを飛ばしたくないのでsuperを呼ばない。
			setRefStatus();
		}
		
		@Override
		protected boolean isDownParamEmpty() {
			// 下り電文の値が空の場合でもそのまま上書きする
			return false;
		}
		
		@Override
		protected void showMsg(){
			//ボタン実行ではないのでメッセージは出さない
		}
	}

	/**
	 * [MS_MSBFL0040_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch04Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Srch04Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0040_Srch04Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			keepAttributes(true);
		}
		
		@Override
		protected void show() {
			//ヘッダをクリアしないようにするためにshowMergeする。
			showMerge();
			editMasterData(getHdrR());
			//showMergeなのでソートが必要。
			DtlStdTable.sort();
			getDtlStdL().setStatus(MCRow.CREATE);
			setSmplInstQty();
			if (canEditPlntAprv()) {
				setValueEx(Hdr_plnt_aprv_flg, isMasterPlntAprv());
			}
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			//何もしない
		}
		
		@Override
		protected void setMode(){
			//フォーカスを飛ばしたくないのでsuperを呼ばない。
			setRefStatus();
		}
		
		@Override
		protected boolean isDownParamEmpty() {
			// 下り電文の値が空の場合でもそのまま上書きする
			return false;
		}
		
		@Override
		protected void showMsg(){
			//ボタン実行ではないのでメッセージは出さない
		}
	}

	/**
	 * [MS_MSBFL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Ins01Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0040_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			bridge.up0().prnt_flg(getBtnR().prnt_flg());
		}

		@Override
		protected void show() {
			super.show();
			getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_NO.name());
			getCndR().srch_tgt_no(getHdrR().insp_no());
		}
	}

	/**
	 * [MS_MSBFL0040_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Upd01Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0040_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();

			setPrint(true);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();

			bridge.up0().prnt_flg(getBtnR().prnt_flg());
		}
	}

	/**
	 * [MS_MSBFL0040_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Upd02Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0040_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().aprv_tm(MCDate.now());
		}

		@Override
		protected boolean isUpBlockStatusNone() {
			return false;
		}

		@Override
		protected void setMode() {
			super.setMode();

			setFIX_U_AStatus();
		}
	}

	/**
	 * [MS_MSBFL0040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Del01Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0040_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0040_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Del02Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0040_Del02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBFL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Prnt01Caller<P extends MSBFP_InspInstReg, B extends MS_MSBFL0040_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0040_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}
	
	/**
	 * サーバロジックで取得されたマスタデータを編集する。
	 * @param hdr
	 */
	protected void editMasterData(HdrR hdr) {
		if (!canEditPlntAprv()) {
			hdr.plnt_aprv_flg(false);
		}
		if (!canEditSpec()) {
			hdr.std_req_flg(false);
			hdr.std_cnf_req_flg(false);
		}
	}
	
	/**
	 * 工場出荷承認対象を変更可能かどうかを返す。
	 * 
	 * @return
	 */
	protected boolean canEditPlntAprv() {
		HdrR hdr = getHdrR();
		if (MSC_INSP_TYP.isPRCD(hdr.insp_typ())) {
			return false;
		}
		if (MSC_INSP_TYP.isLOT(hdr.insp_typ()) && hdr.lmt_up_flg()) {
			return false;
		}

		return true;
	}
	
	/**
	 * 抜取規格検査関連の項目を編集可能かどうかを返す。
	 * @return
	 */
	protected boolean canEditSpec() {
		return MAC_INSP_MTD_TYP.isSPEC(getHdrR().insp_mtd_typ());
	}
	
	/**
	 * 品目品管マスタが工場出荷承認対象となっているかを返す
	 * @return
	 */
	protected boolean isMasterPlntAprv() {
		return getHdrR().master_plnt_aprv_flg();
	}

	/**
	 * Panel[Cnd]のボタン[srch_schd]の押下時の処理
	 */
	@Override
	public void doCnd_srch_schd(MCEventInfo info) {
		callMS_MSBFL0040_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_inst]の押下時の処理
	 */
	@Override
	public void doCnd_srch_inst(MCEventInfo info) {
		callMS_MSBFL0040_Srch02();
	}
	/**
	 * Panel[Hdr]のボタン[srch_mst]の押下時の処理
	 */
	@Override
	public void doHdr_srch_mst(MCEventInfo info) {
		callMS_MSBFL0040_Srch03();
	}
	/**
	 * Panel[Hdr]のボタン[srch_std]の押下時の処理
	 */
	@Override
	public void doHdr_srch_std(MCEventInfo info) {
		callMS_MSBFL0040_Srch04();
	}
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBFL0040_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		DtlStdR r = DtlStdR.create();
		r.add_point_flg(true);
		insertRow(DtlStdTable, r);
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlStdTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		DtlStdR r = copyRow(DtlStdTable);
		clearNotCopyCol(r);
	}
	protected void clearNotCopyCol(DtlStdR r) {
		if (r.isEmpty()) {
			return;
		}
		r.add_point_flg(true);
		r.std_insp_inst_no(null);

		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBFL0040_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBFL0040_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[upd_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv(MCEventInfo info) {
		callMS_MSBFL0040_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBFL0040_Del01();
	}
	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBFL0040_Del02();
	}

	@Override
	protected void opePanelFillSpace() {
		// マスタを再展開するのが通常の登録方法なため、fillSpaceは行わない
		return;
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		if (isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			clearContainers(getDtlStdL(), getDtlSchdL());
			setFIX_IStatus();
		}
		else if (isSame(afOpe, Cnd_ope_REF.getActionCommand())) {
			setSRCHStatus();
		}
		clearCnd();
	}

	@Override
	protected MCPanel getOpeHdrPanel() {
		return HdrTabPanel;
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setLimsMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setHdrMode();
		setBtnMode();
		setLimsMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setHdrMode();
		setBtnMode();
		setLimsMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setLimsMode();
	}

	@Override
	public void setUPD_APRVStatus() {
		super.setUPD_APRVStatus();

		// 承認者と承認部門はログインユーザの主部門ＣＤ及びユーザＩＤで固定する
		setAprvDptUsrDftVal();

		// 承認者と承認部門は入力不可とする。
		setAprvDptUsrMode();

		// 承認理由クリア
		clearAprvRsn();
		
		setLimsMode();
	}

	@Override
	public void setFIX_U_AStatus() {
		super.setFIX_U_AStatus();
		setLimsMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setLimsMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setLimsMode();
	}

	@Override
	public void setDEL_APRVStatus() {
		super.setDEL_APRVStatus();

		// 承認理由クリア
		clearAprvRsn();
		
		setLimsMode();

		AprvPanel.focusFirstComponent();
	}
	
	@Override
	public void setFIX_D_AStatus() {
		super.setFIX_D_AStatus();
		setLimsMode();
	}

	/**
	 * 承認理由をクリアする
	 */
	protected void clearAprvRsn() {
		if (!isNull(getHdrR().aprv_rsn()) && isEditable(Hdr_aprv_rsn)) {
			getHdrR().aprv_rsn(null);
		}
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setBtnMode();
		setLimsMode();
	}

	/**
	 * 検査承認者、検査承認部門の初期値を設定する。
	 */
	protected void setAprvDptUsrDftVal() {
		Hdr_aprv_dt.setValue(getToday());
		if (isNull(getHdrR().aprv_usr_cd())) {
			setValueEx(Hdr_aprv_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
		}
		AprvPanel.focusFirstComponent();
	}

	/**
	 * 検査承認者、検査承認部門を制御する。
	 */
	protected void setAprvDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			Hdr_aprv_dt.setMode(MCMode.READ_ONLY);
			Hdr_aprv_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 検索後モード設定
	 */
	protected void setRefStatus() {
		HdrR r = getHdrR();
		// 検索後ステータス
		if (isSelectedIns()) {
			if (MSC_INSP_STS_TYP.isYET(r.insp_sts_typ())) {
				setINSStatus();
			}
			else {
				setFIX_IStatus();
			}
		}
		else if (isSelectedUpd()) {
			if (!MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())
					|| (r.insp_aprv_flg() && !MSC_INSP_APRV_STS_TYP.isINST_OPN(r.insp_aprv_sts_typ()))) {
				setFIX_UStatus();
			}
			else {
				setUPDStatus();
			}
		}
		else if (isSelectedAprv()) {
			if (MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())
					&& r.insp_aprv_flg() && MSC_INSP_APRV_STS_TYP.isINST_OPN(r.insp_aprv_sts_typ())) {
				setUPD_APRVStatus();
			}
			else {
				setFIX_U_AStatus();
			}
		}
		else if (isSelectedDel()) {
			if (MSC_INSP_STS_TYP.isORD(r.insp_sts_typ())) {
				if (r.insp_aprv_flg()) {
					if (MSC_INSP_APRV_STS_TYP.isINST_ACPT(r.insp_aprv_sts_typ())) {
						setDEL_APRVStatus();
					}
					else if (MSC_INSP_APRV_STS_TYP.isINST_OPN(r.insp_aprv_sts_typ())) {
						setDELStatus();
					}
					else {
						setFIX_D_AStatus();
					}
				}
				else {
					setDELStatus();
				}
			}
			else {
				if (r.insp_aprv_flg()) {
					setFIX_D_AStatus();
				}
				else {
					setFIX_DStatus();
				}
			}
		}
		else if (isSelectedRef()) {
			setREFStatus();
		}
	}
	/**
	 * 操作種別により、画面表示項目の初期値を設定する。
	 */
	protected void clearCnd() {
		if (isSelectedIns()) {
			getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.name());
			getCndR().srch_tgt_no(null);
		}
		else {
			if (MSC_INSP_SRCH_TGT_TYP.isINSP_SCHD_NO(getCndR().srch_tgt_typ())) {
				getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_NO.value());
				getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_NO.name());
				getCndR().srch_tgt_no(null);
			}
		}
		if (!isSelectedIns() || !isSelectedUpd()) {
			Btn_prnt_flg.setValue(false);
		}
	}

	@Override
	public void doHdr_master_dt_NC(MCEventInfo info) {
		super.doHdr_master_dt_NC(info);

		if (!isNull(getHdrR().master_dt()) && isEditable(Hdr_insp_ptn_cd)) {
			DtlStdTable.clear();
			callMS_MSBFL0040_Srch03();
		}
	}

	@Override
	public void doHdr_insp_ptn_cd_NC(MCEventInfo info) {
		super.doHdr_insp_ptn_cd_NC(info);

		if (!isNull(getHdrR().insp_ptn_cd())) {
			if (!isNull(getHdrR().master_dt())) {
				DtlStdTable.clear();
				callMS_MSBFL0040_Srch04();
			}
		}
		else {
			getHdrR().insp_mtd_typ(null);
			getHdrR().insp_mtd_typ_nm(null);
			getHdrR().insp_std_no(null);
			getHdrR().insp_bind_typ(null);
			getHdrR().std_req_flg(false);
			getHdrR().std_cnf_req_flg(false);
			getHdrR().plnt_aprv_flg(false);
			getHdrR().insp_aprv_flg(false);
		}
	}

	@Override
	public void doHdr_insp_mtd_typ_NC(MCEventInfo info) {
		super.doHdr_insp_mtd_typ_NC(info);
		setBtnMode();

		if (!MAC_INSP_MTD_TYP.isSPEC(getHdrR().insp_mtd_typ())) {
			getDtlStdL().clear();
		}
	}

	/**
	 * 検査予定の全行にマスタから取得した抜取指図数を設定する。
	 */
	protected void setSmplInstQty() {
		for (DtlSchdR r : getDtlSchdL()) {
			if (!isNull(r.insp_schd_no())) {
				r.smpl_inst_qty(getHdrR().spl_qty());
			}
		}
	}

	@Override
	public void doDtlStd_insp_point_cd_NC(MCEventInfo info) {
		super.doDtlStd_insp_point_cd_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}
	}

	@Override
	public void doDtlStd_insp_qlqn_typ_NC(MCEventInfo info) {
		super.doDtlStd_insp_qlqn_typ_NC(info);

		int index = info.getEventIndex();
		if (index < 0) {
			return;
		}

		setValueEx(columnDtlStd_ql_std_val, index, null);
		setValueEx(columnDtlStd_trd_unit_cd, index, null);
		setValueEx(columnDtlStd_qn_int_digit, index, null);
		setValueEx(columnDtlStd_qn_int_frac, index, null);
		setValueEx(columnDtlStd_qn_out_min, index, null);
		setValueEx(columnDtlStd_sign_out_min_typ, index, null);
		setValueEx(columnDtlStd_qn_in_min, index, null);
		setValueEx(columnDtlStd_sign_in_min_typ, index, null);
		setValueEx(columnDtlStd_sign_in_max_typ, index, null);
		setValueEx(columnDtlStd_qn_in_max, index, null);
		setValueEx(columnDtlStd_sign_out_max_typ, index, null);
		setValueEx(columnDtlStd_qn_out_max, index, null);
	}

	@Override
	public void doDtlStd_NC(MCEventInfo info) {
		super.doDtlStd_NC(info);

		setBtnMode();
	}
	
	@Override
	public void doDtlStd_sign_in_min_typ_LC(MCEventInfo info) {
		super.doDtlStd_sign_in_min_typ_LC(info);
		signTypChanged(info, columnDtlStd_sign_in_max_typ, columnDtlStd_qn_in_max);
	}

	@Override
	public void doDtlStd_sign_in_max_typ_LC(MCEventInfo info) {
		super.doDtlStd_sign_in_max_typ_LC(info);
		signTypChanged(info, columnDtlStd_sign_in_min_typ, columnDtlStd_qn_in_min);
	}

	@Override
	public void doDtlStd_sign_out_min_typ_LC(MCEventInfo info) {
		super.doDtlStd_sign_out_min_typ_LC(info);
		signTypChanged(info, columnDtlStd_sign_out_max_typ, columnDtlStd_qn_out_max);
	}

	@Override
	public void doDtlStd_sign_out_max_typ_LC(MCEventInfo info) {
		super.doDtlStd_sign_out_max_typ_LC(info);
		signTypChanged(info, columnDtlStd_sign_out_min_typ, columnDtlStd_qn_out_min);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		
		// 抜取指図数が部品であるため、値が変更されたときの処理をMC側で実装する
		if (nc == columnDtlSchd_smpl_inst_qty) {
			doDtlSchd_smpl_inst_qty_NC(info);
		}
	}

	protected void doDtlSchd_smpl_inst_qty_NC(MCEventInfo info) {
		// 抜取指図数が変更された場合、他の行の抜取指図数も同じ値を設定する
		int index = info.getEventIndex();
		DtlSchdR dtlR = getDtlSchdL().get(index);
		
		for (DtlSchdR r : getDtlSchdL()) {
			r.smpl_inst_qty_p(dtlR.smpl_inst_qty_p());
		}
		
	}

	@Override	
	protected void listenerInit() {	
		super.listenerInit();
		setListListener(DtlSchdTable, createDtlRowListener());
		columnDtlSchd_smpl_inst_qty.addNCListener(this);
	}	

	protected DtlRowListener createDtlRowListener() {	
		return new DtlRowListener();
	}	

	protected class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
		}

	}

	/**
	 * 符号区分が変更されたときに実行される。<br>
	 * <br>
	 * 変更後の符号区分が「＝」または「≠」の場合は、
	 * 指定されたテーブルカラムの画面イベント対象行の値をクリアする。
	 * 
	 * @param info イベント情報
	 * @param columns テーブルカラム
	 */
	protected void signTypChanged(MCEventInfo info, MCColumnConfig... columns) {
		int idx = info.getEventIndex();
		String sign = (String)info.getNewValue();
		if (MAC_SIGN_TYP.isEQ(sign) || MAC_SIGN_TYP.isNE(sign)) {
			for (MCColumnConfig column : columns) {
				setValueEx(column, idx, null);
			}
		}
	}

	/**
	 * ヘッダ項目を制御する。
	 */
	protected void setHdrMode() {
		HdrR r = getHdrR();
		if (r.is_invalid_insp_ptn_flg()) {
			Hdr_insp_ptn_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_insp_ptn_cd);
		}
		if (!r.is_invalid_insp_ptn_flg() || MSC_INSP_TYP.isPRCD(r.insp_typ())) {
			Hdr_insp_mtd_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_insp_mtd_typ);
		}
		if (!canEditPlntAprv() || isMasterPlntAprv()) {
			Hdr_plnt_aprv_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_plnt_aprv_flg);
		}
	}

	/**
	 * ボタン制御を設定する。
	 */
	protected void setBtnMode() {
		DtlStdR r = DtlStdTable.getSelectedMCRow();
		
		// 行削除、行コピーボタン
		if (isRegStatus()) {
			// 抜取規格検査以外の場合
			if (!MAC_INSP_MTD_TYP.isSPEC(getHdrR().insp_mtd_typ())) {
				Btn_radd.setMode(MCMode.DISABLE);
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				if (r == null) {
					// テーブル操作ボタン
					setDefaultMode(Btn_radd);
					Btn_rdel.setMode(MCMode.DISABLE);
					Btn_rcopy.setMode(MCMode.DISABLE);
				}
				else {
					// 登録訂正ステータスでは、新規追加行、空行のみ、行削除できる
					if (r.add_point_flg()) {
						setDefaultMode(Btn_rdel);
					}
					else {
						Btn_rdel.setMode(MCMode.DISABLE);
					}
					setDefaultMode(Btn_rcopy);
				}
			}
		}
		if (isSelectedRef()) {
			if (!MAC_INSP_MTD_TYP.isSPEC(getHdrR().insp_mtd_typ())) {
				Btn_prnt.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_prnt);
			}
		}
	}
	
	protected void setLimsMode() {
		HdrR r = getHdrR();
		if (r.insp_aprv_flg()) {
			Hdr_lims_flg.setMode(MCMode.INVISIBLE);
			Hdr_last_lims_flg.setMode(MCMode.INVISIBLE);
			if (!r.aprv_lims_flg() && isAprvStatus()) {
				Hdr_aprv_lims_flg.setMode(MCMode.READ_ONLY);
			}
		}
		else {
			Hdr_aprv_lims_flg.setMode(MCMode.INVISIBLE);
			Hdr_last_aprv_lims_flg.setMode(MCMode.INVISIBLE);
			if (!r.lims_flg() && !isAprvStatus()) {
				Hdr_lims_flg.setMode(MCMode.READ_ONLY);
			}
		}
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}
	
	protected boolean isUpdAprvStatus() {
		return isSame(getStatus(), UPD_APRV);
	}
	
	protected boolean isFixUpdAprvStatus() {
		return isSame(getStatus(), FIX_U_A);
	}

	protected boolean isDelAprvStatus() {
		return isSame(getStatus(), DEL_APRV);
	}
	
	protected boolean isFixDelAprvStatus() {
		return isSame(getStatus(), FIX_D_A);
	}

	protected boolean isRegStatus() {
		return isUpdStatus() || isInsStatus();
	}
	
	protected boolean isAprvStatus() {
		return isUpdAprvStatus() || isFixUpdAprvStatus() || isDelAprvStatus() || isFixDelAprvStatus();
	}
	
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getHdrR());
		ret.add(getDtlStdL());
		ret.add(getDtlSchdL());

		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();

		ret.add(getCndR());

		return ret;
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setSrchTgtTyp();
	}
	
	protected void setSrchTgtTyp() {
		if (isSelectedIns()) {
			getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.name());
		}
		else {
			getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_NO.name());
		}
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
	}

	/**
	 * 非表示承認情報を設定する。
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_ope_APRV, AprvPanel}
				, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, AprvPanel));
	}

	// -----------------------------------------------
	// init
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {
			initByScreenParamT1(bind, args);
		}
		else if (T2 == openTyp) {
			initByScreenParamT2(bind, args);
		}
		else if (T3 == openTyp) {
			initByScreenParamT3(bind, args);
			
		}
		else {
			throw new MCAppException(msgUnknownOpenParam());
		}
	}

	protected void initByScreenParamT1(MCRow bind, Object... args) {

		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.value());
		getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.name());
		// バインド値
		setValueEx(Cnd_srch_tgt_no, bind.getStringNE("insp_schd_no"));
		// 検索
		addDoBehind(Cnd_srch_schd);
	}

	protected void initByScreenParamT2(MCRow bind, Object... args) {

		setValueEx(Cnd_ope_Group, Cnd_ope_REF.getActionCommand());
		getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_NO.value());
		getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_NO.name());
		// バインド値
		setValueEx(Cnd_srch_tgt_no, bind.getStringNE("insp_no"));
		// 検索
		addDoBehind(Cnd_srch_inst);
	}

	protected void initByScreenParamT3(MCRow bind, Object... args) {

		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		getCndR().srch_tgt_typ(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.value());
		getCndR().srch_tgt_typ_nm(MSC_INSP_SRCH_TGT_TYP.INSP_SCHD_NO.name());
		// バインド値
		setValueEx(Cnd_srch_tgt_no, null);
		if (args[0] instanceof String[]) {
			getCndSchdL().clear();
			
			String[] arr = (String[])args[0];
			for (int i=0; i < arr.length; i++) {
				CndSchdR r = CndSchdR.create();
				r.srch_tgt_no(arr[i]);
				getCndSchdL().add(r);
			}
			addDoBehind(Cnd_srch_schd);
		}
		else {
			throw new MCAppException(msgUnknownClass(args[0]));
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Hdr_inst_usr_cd_p_PPanel.setRelateBeans(Hdr_inst_dt);
		Hdr_aprv_usr_cd_p_PPanel.setRelateBeans(Hdr_aprv_dt);
		Hdr_base_unit_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_dec_place);

		DtlSchd_pack_unit_qty_p_PPanel.setRelateBeans(columnDtlSchd_pack_unit_cd, columnDtlSchd_pack_dec_place);
		DtlSchd_base_unit_qty_p_PPanel.setRelateBeans(columnDtlSchd_base_unit_cd, columnDtlSchd_base_dec_place);
		DtlSchd_smpl_schd_qty_p_PPanel.setRelateBeans(columnDtlSchd_base_unit_cd, columnDtlSchd_base_dec_place);
		DtlSchd_smpl_inst_qty_p_PPanel.setRelateBeans(columnDtlSchd_base_unit_cd, columnDtlSchd_base_dec_place);
		
		DtlStd_qn_out_min_p_PPanel.setRelateBeans(columnDtlStd_trd_unit_cd, columnDtlStd_qn_int_frac);
		DtlStd_qn_in_min_p_PPanel.setRelateBeans(columnDtlStd_trd_unit_cd, columnDtlStd_qn_int_frac);
		DtlStd_qn_in_max_p_PPanel.setRelateBeans(columnDtlStd_trd_unit_cd, columnDtlStd_qn_int_frac);
		DtlStd_qn_out_max_p_PPanel.setRelateBeans(columnDtlStd_trd_unit_cd, columnDtlStd_qn_int_frac);
	}

	/**
	 * 操作種別の登録を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedIns() {
		return Cnd_ope_INS.isSelected();
	}

	/**
	 * 操作種別の訂正を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedUpd(){
		return Cnd_ope_UPD.isSelected();
	}

	/**
	 * 操作種別の承認を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedAprv(){
		return Cnd_ope_APRV.isSelected();
	}

	/**
	 * 操作種別の取消を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedDel(){
		return Cnd_ope_DEL.isSelected();
	}

	/**
	 * 操作種別の参照を選択しているかどうか
	 * @return 
	 */
	protected boolean isSelectedRef(){
		return Cnd_ope_REF.isSelected();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		DtlStdTable.setCellConfig(createDtlStdTableCellConfig());
		DtlSchdTable.setCellConfig(createDtlSchdCellConfig());
	}

	/**
	 * DtlStdTable用のセルコンフィグ
	 */
	protected MCCellConfig createDtlStdTableCellConfig() {
		return new DtlStdTableCellConfig();
	}

	/**
	 * DtlSchdTable用のセルコンフィグ
	 */
	protected MAUDP_CellConfig createDtlSchdCellConfig(){
		return new DtlSchdTableCellConfig();
	}
	
	/**
	 * DtlTable用のセルコンフィグ
	 */
	public class DtlStdTableCellConfig extends MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlStdR dtlStdR = (DtlStdR) table.getBaseTable().getRow(index);

			if (isEditableMode(column)) {
				if (!dtlStdR.add_point_flg() && !isEditableColWhenAddFlgFalse(column)) {
					return MCMode.READ_ONLY;
				}
			}
			if(column == columnDtlStd_trd_unit_cd){
				if(!MAC_INSP_QLQN_TYP.isQNTV(dtlStdR.insp_qlqn_typ())){
					return MCMode.READ_ONLY;
				}	
			}

			if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
				if (isNull(dtlStdR.insp_qlqn_typ())) {
					if (isQlCols(column) || isQnCols(column)) {
						return MCMode.READ_ONLY;
					}
				}
				// 定性検査
				else if (MAC_INSP_QLQN_TYP.isQLTV(dtlStdR.insp_qlqn_typ())) {
					if (isQnCols(column)) {
						return MCMode.READ_ONLY;
					}
				}
				// 定量検査
				else if (MAC_INSP_QLQN_TYP.isQNTV(dtlStdR.insp_qlqn_typ())) {
					if (isQlCols(column)) {
						return MCMode.READ_ONLY;
					}

					if (column == columnDtlStd_qn_out_min || 
							column == columnDtlStd_sign_out_min_typ) {
						String sign = dtlStdR.sign_out_max_typ();
						if (isNullOr(dtlStdR.qn_int_digit(), dtlStdR.qn_int_frac())) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_SIGN_TYP.isEQ(sign) || MAC_SIGN_TYP.isNE(sign)) {
							return MCMode.READ_ONLY;
						}
						else if (!isNullAnd(dtlStdR.qn_out_min(), dtlStdR.sign_out_min_typ())) {
							return MCMode.REQUIRED;
						}
					}
					else if (column == columnDtlStd_qn_in_min || 
							column == columnDtlStd_sign_in_min_typ) {
						String sign = dtlStdR.sign_in_max_typ();
						if (isNullOr(dtlStdR.qn_int_digit(), dtlStdR.qn_int_frac())) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_SIGN_TYP.isEQ(sign) || MAC_SIGN_TYP.isNE(sign)) {
							return MCMode.READ_ONLY;
						}
						else if (!isNullAnd(dtlStdR.qn_in_min(), dtlStdR.sign_in_min_typ())) {
							return MCMode.REQUIRED;
						}
					}
					else if (column == columnDtlStd_qn_in_max || 
							column == columnDtlStd_sign_in_max_typ) {
						String sign = dtlStdR.sign_in_min_typ();
						if (isNullOr(dtlStdR.qn_int_digit(), dtlStdR.qn_int_frac())) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_SIGN_TYP.isEQ(sign) || MAC_SIGN_TYP.isNE(sign)) {
							return MCMode.READ_ONLY;
						}
						else if (!isNullAnd(dtlStdR.qn_in_max(), dtlStdR.sign_in_max_typ())) {
							return MCMode.REQUIRED;
						}
					}
					else if (column == columnDtlStd_qn_out_max || 
							column == columnDtlStd_sign_out_max_typ) {
						String sign = dtlStdR.sign_out_min_typ();
						if (isNullOr(dtlStdR.qn_int_digit(), dtlStdR.qn_int_frac())) {
							return MCMode.READ_ONLY;
						}
						else if (MAC_SIGN_TYP.isEQ(sign) || MAC_SIGN_TYP.isNE(sign)) {
							return MCMode.READ_ONLY;
						}
						else if (!isNullAnd(dtlStdR.qn_out_max(), dtlStdR.sign_out_max_typ())) {
							return MCMode.REQUIRED;
						}
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}

		@Override
		public int getPriorLength(int index, MCColumnConfig column, MCTable table) {
			DtlStdR r = DtlStdTable.getRow(index);
			if (isQnQtyColumns(column)) {
				MCNumber digit = r.qn_int_digit();
				MCNumber frac = r.qn_int_frac();
				if (!isNullOr(digit, frac)) {
					return frac.intValue() + digit.intValue();
				}
			}
			return super.getPriorLength(index, column, table);
		}

		@Override
		public int getPriorScale(int index, MCColumnConfig column, MCTable table) {
			DtlStdR r = DtlStdTable.getRow(index);
			if (isQnQtyColumns(column)) {
				MCNumber frac = r.qn_int_frac();
				if (frac != null) {
					return frac.intValue();
				}
			}
			return super.getPriorScale(index, column, table);
		}

		/**
		 * add_flgがfalseの場合にも入力可能なカラムかどうか
		 * @return
		 */
		protected boolean isEditableColWhenAddFlgFalse(MCColumnConfig column) {
			if (column == columnDtlStd_intr_rmrks
					|| column == columnDtlStd_sub_char1
					|| column == columnDtlStd_sub_char2
					|| column == columnDtlStd_sub_char3) {
				return true;
			}
			return false;
		}

		/**
		 * 定性項目か判定する。
		 * @param column
		 * @return
		 */
		protected boolean isQlCols(MCColumnConfig column) {
			if (column == columnDtlStd_ql_std_val) {
				return true;
			}
			return false;
		}

		/**
		 * 定量項目か判定する。
		 * @param column
		 * @return
		 */
		protected boolean isQnCols(MCColumnConfig column) {
			if (column == columnDtlStd_trd_unit_cd
					|| column == columnDtlStd_qn_int_digit
					|| column == columnDtlStd_qn_int_frac
					|| column == columnDtlStd_qn_out_min
					|| column == columnDtlStd_sign_out_min_typ
					|| column == columnDtlStd_qn_in_min
					|| column == columnDtlStd_sign_in_min_typ
					|| column == columnDtlStd_sign_in_max_typ
					|| column == columnDtlStd_qn_in_max
					|| column == columnDtlStd_sign_out_max_typ
					|| column == columnDtlStd_qn_out_max) {
				return true;
			}
			return false;
		}
	}

	/**フォーマット制御するカラムコンフィグ*/
	MCColumnConfig[] _qnQtyColumns = null;
	protected MCColumnConfig[] getQnQtyColumns() {
		if (_qnQtyColumns == null) {
			_qnQtyColumns = new MCColumnConfig[]{
					columnDtlStd_qn_out_min,
					columnDtlStd_qn_in_min,
					columnDtlStd_qn_out_max,
					columnDtlStd_qn_in_max};
		}
		return _qnQtyColumns;
	}

	protected boolean isQnQtyColumns(MCColumnConfig column) {
		return MCCollectionUtil.contains(column, getQnQtyColumns());
	}

	public class DtlSchdTableCellConfig extends MAUDP_CellConfig {
		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column,
				MCTable table) {
			
			if(column == columnDtlSchd_smpl_inst_qty){
				if(isEditableMode(column) && !canEditSmpl()){
					return MCMode.READ_ONLY;
				}
			}
			return super.getPriorMode(index, column, table);
		}	
	}
	/**
	 * 抜取関連の項目を編集可能かどうかを返す。
	 * @return
	 */
	protected boolean canEditSmpl() {
		HdrR hdr = getHdrR();
		return !isNull(hdr.insp_mtd_typ()) && !MAC_INSP_MTD_TYP.isTTL(hdr.insp_mtd_typ());
	}

	@Override
	public MCList getHdr_insp_mtd_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispInspMtdTyp());
		return super.getHdr_insp_mtd_typ(row, info);
	}

	public MAC_INSP_MTD_TYP[] getDispInspMtdTyp() {
		HdrR r = getHdrR();
		if (MSC_INSP_TYP.isLOT(r.insp_typ()) && r.lmt_up_flg()) {
			return new MAC_INSP_MTD_TYP[] {
					MAC_INSP_MTD_TYP.SMPL, MAC_INSP_MTD_TYP.SPEC
			};
		}
		if (MSC_INSP_TYP.isPRCD(r.insp_typ())) {
			return new MAC_INSP_MTD_TYP[] {
					MAC_INSP_MTD_TYP.SPEC
			};
		}
		return new MAC_INSP_MTD_TYP[] {
				MAC_INSP_MTD_TYP.SMPL, MAC_INSP_MTD_TYP.SPEC,
				MAC_INSP_MTD_TYP.TTL
		};
	}

}