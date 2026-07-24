package mcframe.clientMSUA.MSUAP1060;

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

import mcframe.clientFXBA.FXBAP0130.*;

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
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.ShipToIdCols;
import java.util.LinkedHashMap;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUAP_ShipToId"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUAP_ShipToId_MC extends MSUAP_ShipToId_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected RsltHdrR _tmpRsltHdrR = RsltHdrR.create();
	protected LinkedHashMap<String,String> _mapForClmNm = new LinkedHashMap<>();
	protected final double _default_proportion = 0.56;
	protected final int _after_srch_location = 378;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUAP_ShipToId_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START
		createClmNameMap();
		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSUAP_ShipToId_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), true);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for (RsltR row : RsltTable.getViewRows()) {
			setValueEx(columnRslt_check, row.getGUIIndex(), false);
		}
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		doAccept();
	}
	
	@Override
	public MCList getAcceptList(MCLinkBeans target, boolean isDCEvent) {
		setEditingContents();
		return super.getAcceptList(target, isDCEvent);
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				ShipToIdCols.$i_ship_to_id_typ, ShipToIdCols.$i_ship_to_id_typ_nm, ShipToIdCols.$i_base_dt,
				ShipToIdCols.$i_house_flg, ShipToIdCols.$i_outside_flg
		};
	}

	@Override
	protected void saveInitValue(MCRow row) {
		if (!isNull(row.getStringNE(ShipToIdCols.$i_ship_to_id_typ))) {
			row.addStringColumn(ShipToIdCols.$i_ship_to_id_typ_nm);
			MSC_SHIP_TO_ID_TYP.putNameNE(row, ShipToIdCols.$i_ship_to_id_typ, ShipToIdCols.$i_ship_to_id_typ_nm);
		}

		super.saveInitValue(row);
	}

	@Override
	public void setCondition(MCRow row, String mode) {
		super.setCondition(row, mode);
		if (row != null) {
			if(GET_LIST == mode){
				getCndR().ship_to_id_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().ship_to_id_cd(row.getStringNE($INPUT_VAL));
			}
		}
		setCndMode();
	}
	
	@Override
	protected MCCaller createLLCaller(FXBAP_PanelBase panel, MCParam p, MCRow bind) {
		return new MS_MSUAP1060_ISLLSearcher((MSUAP_ShipToId) panel, createLLCallerBridge(p, bind));
	}

	public class MS_MSUAP1060_ISLLSearcher<P extends MSUAP_ShipToId, O extends FXBAP_ISLLCallerPanelBridge>
		extends MAUDP_ISLLSearcher<P, O> {

		protected MS_MSUAP1060_ISLLSearcher(P panel, O b) {
			super(panel, b);
		}
		
		@Override
		protected void show() {
			super.show();
			
			clearRsltHdrContents();
			adjustRsltHdrSplitPane(_after_srch_location);
			
			if (_tmpRsltHdrR.isEmpty()) {
				return;
			}
			MCRow.copyvalue(getRsltHdrR(), _tmpRsltHdrR);
			_tmpRsltHdrR.clear();
		}
	}
	
	@Override
	public void valueInit() {
		super.valueInit();
		setCndMode();
	}
	
	@Override
	public void doRslt_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doRslt_NC(info);
		
		setEditingContents();
		changeRsltHdr();
		setRsltHdrMode();
	}
	
	@Override
	public void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		
		if (isSame(openTyp, T1)) {
			if (bind.getBooleanNE("ship_to_sundry_flg")) {
				valueInit();
				if (!isNull(bind.getStringNE($INPUT_VAL))) {
					addDoBehind(Ctrl_ctrl_PPanel.Ope_srch);
				}
				saveRsltHdrBindValue(bind);
			}
		}
		else {
			throw new MCAppException(msgUnknownOpenParam());
		}
	}
	
	protected void setCndMode() {
		if (isNull(getCndR().getDateNE(ShipToIdCols.$i_base_dt))) {
			Cnd_base_dt.setMode(MCMode.ENABLE);
		}
		else {
			setDefaultMode(Cnd_base_dt);
		}
	}
	
	// ///////////////////////////////////////////////
	// 諸口関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 諸口取引先の場合に、呼出元画面の値を入力補助画面のインスタンス変数に保存します
	 */
	protected void saveRsltHdrBindValue(MCRow bind) {
		_tmpRsltHdrR.ship_to_id_cd(bind.getStringNE($INPUT_VAL));
		_tmpRsltHdrR.ship_to_id_nm(bind.getStringNE(RsltHdrR.$ship_to_id_nm));
		_tmpRsltHdrR.pri_prnt_flg(bind.getBooleanNE(RsltHdrR.$pri_prnt_flg));
		_tmpRsltHdrR.zip_cd(bind.getStringNE(RsltHdrR.$zip_cd));
		_tmpRsltHdrR.addr1(bind.getStringNE(RsltHdrR.$addr1));
		_tmpRsltHdrR.addr2(bind.getStringNE(RsltHdrR.$addr2));
		_tmpRsltHdrR.addr3(bind.getStringNE(RsltHdrR.$addr3));
		_tmpRsltHdrR.addr4(bind.getStringNE(RsltHdrR.$addr4));
		_tmpRsltHdrR.cntry_cd(bind.getStringNE(RsltHdrR.$cntry_cd));
		_tmpRsltHdrR.cntry_nm(bind.getStringNE(RsltHdrR.$cntry_nm));
		_tmpRsltHdrR.tel(bind.getStringNE(RsltHdrR.$tel));
		_tmpRsltHdrR.fax(bind.getStringNE(RsltHdrR.$fax));
		_tmpRsltHdrR.ship_to_sundry_flg(bind.getBooleanNE(RsltHdrR.$ship_to_sundry_flg));
		_tmpRsltHdrR.ship_to_cntct_dpt(bind.getStringNE(RsltHdrR.$ship_to_cntct_dpt));
		_tmpRsltHdrR.ship_to_cntct_psn(bind.getStringNE(RsltHdrR.$ship_to_cntct_psn));
	}
	
	/**
	 * RsltブロックのカラムとRsltHdrのブロックのカラム間に関するマッピングを作成します
	 */
	protected void createClmNameMap() {
		_mapForClmNm.put(RsltR.$ship_to_id_cd, RsltHdrR.$ship_to_id_cd);
		_mapForClmNm.put(RsltR.$ship_to_id_nm, RsltHdrR.$ship_to_id_nm);
		_mapForClmNm.put(RsltR.$ship_to_sundry_flg, RsltHdrR.$ship_to_sundry_flg);
		_mapForClmNm.put(RsltR.$zip_cd, RsltHdrR.$zip_cd);
		_mapForClmNm.put(RsltR.$pri_prnt_flg, RsltHdrR.$pri_prnt_flg);
		_mapForClmNm.put(RsltR.$addr1, RsltHdrR.$addr1);
		_mapForClmNm.put(RsltR.$addr2, RsltHdrR.$addr2);
		_mapForClmNm.put(RsltR.$addr3, RsltHdrR.$addr3);
		_mapForClmNm.put(RsltR.$addr4, RsltHdrR.$addr4);
		_mapForClmNm.put(RsltR.$cntry_cd, RsltHdrR.$cntry_cd);
		_mapForClmNm.put(RsltR.$cntry_nm, RsltHdrR.$cntry_nm);
		_mapForClmNm.put(RsltR.$tel, RsltHdrR.$tel);
		_mapForClmNm.put(RsltR.$fax, RsltHdrR.$fax);
		_mapForClmNm.put(RsltR.$ship_to_cntct_dpt, RsltHdrR.$ship_to_cntct_dpt);
		_mapForClmNm.put(RsltR.$ship_to_cntct_psn, RsltHdrR.$ship_to_cntct_psn);
	}
	
	/**
	 * Rsltブロックで選択した行に応じて、RsltHdrブロックの内容を変化させます
	 */
	protected void changeRsltHdr() {
		if (isNull(RsltTable.getSelectedMCRow())) {
			getRsltHdrR().clear();
		}
		else if (!isSame(RsltTable.getSelectedMCRow().ship_to_id_cd(), RsltHdr_ship_to_id_cd.getValue())) {
			getRsltHdrR().setValuesNE(_mapForClmNm, RsltTable.getSelectedMCRow());
		}
	}

	/**
	 * RsltHdrブロックのフィールドに対して編集可・不可を設定します
	 */
	protected void setRsltHdrMode() {
		boolean shipTo = false;
		if (!isNull(RsltTable.getSelectedMCRow())) {
			shipTo = RsltTable.getSelectedMCRow().ship_to_sundry_flg();
		}
		
		if (!(shipTo)) {
			setDefaultMode(RsltHdr_ship_to_id_nm);
			setDefaultMode(RsltHdr_pri_prnt_flg);
			setDefaultMode(RsltHdr_zip_cd);
			setDefaultMode(RsltHdr_addr1);
			setDefaultMode(RsltHdr_addr2);
			setDefaultMode(RsltHdr_addr3);
			setDefaultMode(RsltHdr_addr4);
			setDefaultMode(RsltHdr_tel);
			setDefaultMode(RsltHdr_fax);
			setDefaultMode(RsltHdr_ship_to_cntct_dpt);
			setDefaultMode(RsltHdr_ship_to_cntct_psn);
		}
		else {
			RsltHdr_ship_to_id_nm.setMode(MCMode.ENABLE);
			RsltHdr_pri_prnt_flg.setMode(MCMode.ENABLE);
			RsltHdr_zip_cd.setMode(MCMode.ENABLE);
			RsltHdr_addr1.setMode(MCMode.ENABLE);
			RsltHdr_addr2.setMode(MCMode.ENABLE);
			RsltHdr_addr3.setMode(MCMode.ENABLE);
			RsltHdr_addr4.setMode(MCMode.ENABLE);
			RsltHdr_tel.setMode(MCMode.ENABLE);
			RsltHdr_fax.setMode(MCMode.ENABLE);
			RsltHdr_ship_to_cntct_dpt.setMode(MCMode.ENABLE);
			RsltHdr_ship_to_cntct_psn.setMode(MCMode.ENABLE);
		}
	}
	
	/**
	 * RsltHdrブロックの送付先識別ＣＤと同じ値を持つRsltブロックの行を返します。
	 * 該当する行がない場合は、空のRowを返します。
	 */
	protected RsltR getRsltRowOnRsltHdr() {
		for (RsltR r : RsltTable.getViewRows()) {
			if (isSame(r.ship_to_id_cd(), getRsltHdrR().ship_to_id_cd())) {
				return r;
			}
		}
		return RsltR.create();
	}
	
	/**
	 * RsltHdrブロックの内容を、同じ送付先識別ＣＤを持つRsltブロックの行に設定します
	 */
	protected void setEditingContents() {
		if (isNull(RsltHdr_ship_to_id_cd.getValue())) {
			return;
		}
		if (!RsltHdr_ship_to_sundry_flg.getValue()) {
			return;
		}
		getRsltRowOnRsltHdr().setValuesNE(_mapForClmNm, getRsltHdrR());
	}
	
	protected void clearRsltHdrContents() {
		getRsltHdrR().clear();
	}
	
	protected void adjustRsltHdrSplitPane(int location) {
		MCSplitPane sp = getClosestSplitPane(RsltHdrPanel);
		if (sp != null) {
			if (!sp.isShowing()) {
				// 画面起動時は比率でのみ位置を調整可能
				sp.setDividerLocation(_default_proportion);
				return;
			}
			sp.useProportionalLocation(false);
			sp.setDefault();
			sp.setDividerLocation(location);
		}
	}
	
	protected MCSplitPane getClosestSplitPane(Container p) {
		if (p == null) {
			return null;
		}
		if (p instanceof MCSplitPane) {
			return (MCSplitPane) p;
		}
		return getClosestSplitPane(p.getParent());
	}
	
	// ///////////////////////////////////////////////
	// 諸口関連（ここまで）
	// ///////////////////////////////////////////////

}