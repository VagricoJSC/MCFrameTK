package mcframe.clientMABC.MABCP0800;

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
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Map;
import java.util.HashMap;

import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.NumPtnCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_SeqReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_SeqReg_MC extends MABCP_SeqReg_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SeqReg_MC() {
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
	public MABCP_SeqReg_MC(String name) {
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
		callMA_MABCL0800_Srch01();
	}
	/**
	 * [MA_MABCL0800_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0800_Srch01Caller<P extends MABCP_SeqReg, B extends MA_MABCL0800_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher<P, B> {

		protected MA_MABCL0800_Srch01Caller(P p, B b) {
			super(p, b);
		}
	
		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRowR());
		}
		
		@Override
		protected boolean isDownBlockChanged() {
			
			if(panel.isDtlChanged()){
				return true;
			}
			return super.isDownBlockChanged();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			Ctrl_ctrl_PPanel.expand(false);
		}
	}

	@Override
	public boolean isChanged() {
		
		if(isDtlChanged()){
			return true;
		}
		return super.isChanged();
	}
	
	protected boolean isDtlChanged(){
		return UPD == getStatus() && !getDtlL().isStatusNone();	
	}

	/**
	 * [MA_MABCL0800_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0800_Upd01Caller<P extends MABCP_SeqReg, B extends MA_MABCL0800_Upd01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLUpdater<P, B> {

		protected MA_MABCL0800_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(getRowR()));
		}
	}

	/**
	 * [MA_MABCL0800_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0800_Del01Caller<P extends MABCP_SeqReg, B extends MA_MABCL0800_Del01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter<P, B> {

		protected MA_MABCL0800_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable);
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
		deleteRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMA_MABCL0800_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMA_MABCL0800_Del01();
	}

	@Override
	public <E extends MCConstRow> E copyRowSub(E row) {
		
		E newRow = super.copyRowSub(row);
		if (newRow == null) return null;
		// コピー対象外
		newRow.setStringNE("seq_typ_old", null);
		return newRow;
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		for(MCRowBeans b:getRowColMap().keySet()){
			((MCNCBeans)b).addNCListener(this);
		}
		Cnd_num_biz_typ.addNCListener(this);
		Row_num_biz_typ.addNCListener(this);
	}
	
	@Override
	public void doRow_seq_typ_NC(MCEventInfo info) {
		super.doRow_seq_typ_NC(info);
		
		String s = getRowR().seq_typ();
		String o = DtlTable.getSelectedMCRow().seq_typ_old();

		if((MAC_SEQ_TYP.is_tbl_seq(o) && !MAC_SEQ_TYP.is_tbl_seq(s)) 
		|| (!MAC_SEQ_TYP.is_tbl_seq(o) && MAC_SEQ_TYP.is_tbl_seq(s))
		|| o == null){
			setValueEx(Row_num_upd_flg, true);
			Row_num_upd_flg.setMode(MCMode.READ_ONLY);
		}
		else{
			setDefaultMode(Row_num_upd_flg);
		}
	}

	@Override
	public void doRow_num_upd_flg_NC(MCEventInfo info) {
		super.doRow_num_upd_flg_NC(info);

		if(!getRowR().num_upd_flg()){
			
			MCModeBeans[] mbs = getNumUpdChangedActionBeans();
			for(int i=0;  i<mbs.length; i++){
				MCModeBeans b = mbs[i];
				b.setMode(MCMode.READ_ONLY);

				MCRowBeans rb = (MCRowBeans)b;
				MCColumnConfig c = getNumUpdChangedDtlBeans()[i];
				
				if (DtlTable.getMCSelectedRow() >= 0) {
					setValueEx(rb, c.getValue(DtlTable.getMCSelectedRow()));
				}
			}
		}
		else {
			for(MCModeBeans b : getNumUpdChangedActionBeans()){
				setDefaultMode(b);
			}	
		}
		
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getRowR().clear();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setRowMode();
	}

	/**選択行変更時のイベント*/
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setRow();
	}
	
	/**
	 * NCイベント時のイベント処理です。
	 */
	@Override
	public void doNCEvent(MCNCBeans compo, MCEventInfo info) {
		super.doNCEvent(compo, info);
		if (compo == Cnd_num_biz_typ) {doCnd_num_biz_typ_NC(info);}
		if (compo == Row_num_biz_typ) {doRow_num_biz_typ_NC(info);}
		doRow_rowBeans_NC(compo, info);
	}
	
	public void doCnd_num_biz_typ_NC(MCEventInfo info) {
		setValueEx(Cnd_num_ptn_cd, null);
	}
	
	public void doRow_num_biz_typ_NC(MCEventInfo info) {
		setValueEx(Row_num_ptn_cd, null);
	}
	
	protected void setRow(){
		getRowR().clear();
		DtlR r = DtlTable.getSelectedMCRow();
		if(r != null){
			valueCopy(getRowR(), r);
			getRowR().setRefTime(r.getRefTime());
		}
		setRowMode();
	}
	
	protected void setRowMode(){
		DtlR r = DtlTable.getSelectedMCRow();
		if(FIX.equals(getStatus()) || r == null ||r.isStatusDelete()){
			setFix(RowPanel);
		}
		else{
			setDefaultMode(RowPanel);

			if(!isNull(r.num_biz_typ()) && !r.isStatusCreate()){
				Row_num_biz_typ.setMode(MCMode.READ_ONLY);
				Row_num_ptn_cd.setMode(MCMode.READ_ONLY);
				Row_key_elm.setMode(MCMode.READ_ONLY);
			}
			if(!r.num_upd_flg()){
				for(MCModeBeans b : getNumUpdChangedActionBeans()){
					b.setMode(MCMode.READ_ONLY);
				}
			}
		}
	}

	/**
	 * Rowの値をDtlに移す処理を行います。
	 * @param compo 
	 * @param info
	 */
	public void doRow_rowBeans_NC(MCNCBeans compo, MCEventInfo info) {
		Map<MCRowBeans, MCColumnConfig> m = getRowColMap();
		if (m.containsKey(compo)) {
			
			int i = DtlTable.getMCSelectedRow();
			
			if(i != -1 ){
				MCColumnConfig c = m.get(compo);
				setValueEx(c, i, info.getNewValue());
			}
		}
	}
	
	protected Map<MCRowBeans, MCColumnConfig> _RowColBeansMap;
	
	/**
	 * RowブロックのMCRowBeansとDtlブロックのMCColumnConfigの関係マップを返します。<p>
	 * @return
	 */
	protected Map<MCRowBeans, MCColumnConfig> getRowColMap(){
		if(_RowColBeansMap == null){
			_RowColBeansMap = new HashMap<MCRowBeans, MCColumnConfig>();
			_RowColBeansMap.put(Row_num_biz_typ,columnDtl_num_biz_typ);
			_RowColBeansMap.put(Row_num_biz_typ_nm,columnDtl_num_biz_typ_nm);
			_RowColBeansMap.put(Row_num_ptn_cd,columnDtl_num_ptn_cd);
			_RowColBeansMap.put(Row_num_ptn_nm,columnDtl_num_ptn_nm);
			_RowColBeansMap.put(Row_key_elm,columnDtl_key_elm);
			_RowColBeansMap.put(Row_seq_typ,columnDtl_seq_typ);
			_RowColBeansMap.put(Row_seq_typ_nm,columnDtl_seq_typ_nm);
			_RowColBeansMap.put(Row_ora_seq_nm,columnDtl_ora_seq_nm);
			_RowColBeansMap.put(Row_num_upd_flg,columnDtl_num_upd_flg);
			_RowColBeansMap.put(Row_min_val,columnDtl_min_val);
			_RowColBeansMap.put(Row_last_val,columnDtl_last_val);
			_RowColBeansMap.put(Row_max_val,columnDtl_max_val);
			_RowColBeansMap.put(Row_increment_by,columnDtl_increment_by);
			_RowColBeansMap.put(Row_cycl_flg,columnDtl_cycl_flg);
		}
		return _RowColBeansMap;
	}

	public void valueCopy(RowR dest, DtlR src){
		dest.num_biz_typ(src.num_biz_typ());
		dest.num_biz_typ_nm(src.num_biz_typ_nm());
		dest.num_ptn_cd(src.num_ptn_cd());
		dest.num_ptn_nm(src.num_ptn_nm());
		dest.key_elm(src.key_elm());
		dest.seq_typ(src.seq_typ());
		dest.seq_typ_nm(src.seq_typ_nm());
		dest.ora_seq_nm(src.ora_seq_nm());
		dest.setBoolean("num_upd_flg", src.num_upd_flg());
		dest.min_val(src.min_val());
		dest.last_val(src.last_val());
		dest.max_val(src.max_val());
		dest.increment_by(src.increment_by());
		dest.cycl_flg(src.cycl_flg());
	}
	protected MCModeBeans[] getNumUpdChangedActionBeans(){
		
		if (_numUpdChangedActionBeans == null) {
			_numUpdChangedActionBeans = new MCModeBeans[]{
					Row_max_val,
					Row_min_val,
					Row_cycl_flg,
					Row_increment_by,
					Row_last_val
			};
		}
		return _numUpdChangedActionBeans;
	}
	
	/**Beansの順番は、_numUpdChangedDtlBeansと同じであることが必須*/
	protected MCModeBeans[] _numUpdChangedActionBeans = null;
	
	protected MCColumnConfig[] getNumUpdChangedDtlBeans(){
		
		if (_numUpdChangedDtlBeans == null) {
			_numUpdChangedDtlBeans = new MCColumnConfig[]{
					columnDtl_max_val,
					columnDtl_min_val,
					columnDtl_cycl_flg,
					columnDtl_increment_by,
					columnDtl_last_val
			};
		}
		return _numUpdChangedDtlBeans;
	}

	/**Beansの順番は、_numUpdChangedDtlBeansと同じであることが必須*/
	protected MCColumnConfig[] _numUpdChangedDtlBeans = null;

}