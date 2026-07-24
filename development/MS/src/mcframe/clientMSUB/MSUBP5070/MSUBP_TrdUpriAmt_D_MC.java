package mcframe.clientMSUB.MSUBP5070;

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
import static mcframe.clientMAUC.MAUCP1050.MAUCP_BeansUtil.*;
import mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil;
import mcframe.clientFXBA.FXBAP0010.FXBAP_Searcher;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSUBP_TrdUpriAmt_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSUBP_TrdUpriAmt_D_MC extends MSUBP_TrdUpriAmt_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSUBP_TrdUpriAmt_D_MC() {
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
	public MSUBP_TrdUpriAmt_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	// イベント処理

	protected MCBeans _curCd;
	protected MCBeans _bpCd;
	protected MCBeans _itmCd;
	protected MCBeans _itmSub1;
	protected MCBeans _itmSub2;
	protected MCBeans _itmSub3;
	protected MCBeans _trdUnitCd;
	protected MCBeans _qty;
	protected MCBeans _amtDecPlace;
	protected MCBeans _upriDecPlace;
	protected MCBeans _amtRndTyp;
	protected MCBeans _taxRndTyp;
	protected MCBeans _bpUpriChngFlg;
	protected MCBeans _itmUpriChngFlg;
	protected MCBeans _dscntItmFlg;
	protected boolean _amtToUpri;
	protected boolean _schd;

	protected MCBeans _schdNo;
	protected MCBeans _curTrdUnitConvBaseQty;
	protected MCBeans _curTrdUnitConvQty;
	protected MCBeans _orgTrdUnitConvBaseQty;
	protected MCBeans _orgTrdUnitConvQty;
	protected MCBeans _baseUnitDecPlace;
	protected MCBeans _baseUnitRndTyp;

	/**
	 * 埋め込み画面を初期化します。
	 * 
	 * @param curCd 取引通貨ＣＤのGUI部品
	 * @param bpCd 取引先ＣＤのGUI部品
	 * @param itmCd 品目ＣＤのGUI部品
	 * @param itmSub1 枝番１のGUI部品
	 * @param itmSub2 枝番２のGUI部品
	 * @param itmSub3 枝番３のGUI部品
	 * @param trdUnitCd 取引単位ＣＤのGUI部品
	 * @param qty 数量のGUI部品
	 * @param amtDecPlace 取引金額小数部有効桁数のGUI部品
	 * @param upriDecPlace 取引単価小数部有効桁数のGUI部品
	 * @param amtRndtyp 金額端数処理区分のGUI部品
	 * @param taxRndTyp 税端数処理区分のGUI部品
	 * @param bpUpriChngFlg 取引先の単価変更許可ＦＬＧのGUI部品
	 * @param itmUpriChngFlg 品目の単価変更許可ＦＬＧのGUI部品
	 * @param dscntItmFlg 値引品目ＦＬＧのGUI部品
	 */
	public void setRelateBeans(MCBeans curCd
			, MCBeans bpCd
			, MCBeans itmCd
			, MCBeans itmSub1
			, MCBeans itmSub2
			, MCBeans itmSub3
			, MCBeans trdUnitCd
			, MCBeans qty
			, MCBeans amtDecPlace
			, MCBeans upriDecPlace
			, MCBeans amtRndtyp
			, MCBeans taxRndTyp
			, MCBeans bpUpriChngFlg
			, MCBeans itmUpriChngFlg
			, MCBeans dscntItmFlg
	) {
		_curCd = curCd;
		_bpCd = bpCd;
		_itmCd = itmCd;
		_itmSub1 = itmSub1;
		_itmSub2 = itmSub2;
		_itmSub3 = itmSub3;
		_trdUnitCd = trdUnitCd;
		_qty = qty;
		_amtDecPlace = amtDecPlace;
		_upriDecPlace = upriDecPlace;
		_amtRndTyp = amtRndtyp;
		_taxRndTyp = taxRndTyp;
		_bpUpriChngFlg = bpUpriChngFlg;
		_itmUpriChngFlg = itmUpriChngFlg;
		_dscntItmFlg = dscntItmFlg;
	}
	/**
	 * 埋め込み画面を初期化します。<p>
	 * 予定時の単価をクリアしないようにするため、
	 * 予定ＮＯのGUI部品に値が設定されている場合、単価、金額をクリアしません。
	 * 
	 * @param curCd 取引通貨ＣＤのGUI部品
	 * @param bpCd 取引先ＣＤのGUI部品
	 * @param itmCd 品目ＣＤのGUI部品
	 * @param itmSub1 枝番１のGUI部品
	 * @param itmSub2 枝番２のGUI部品
	 * @param itmSub3 枝番３のGUI部品
	 * @param trdUnitCd 取引単位ＣＤのGUI部品
	 * @param qty 数量のGUI部品
	 * @param amtDecPlace 取引金額小数部有効桁数のGUI部品
	 * @param upriDecPlace 取引単価小数部有効桁数のGUI部品
	 * @param amtRndtyp 金額端数処理区分のGUI部品
	 * @param taxRndTyp 税端数処理区分のGUI部品
	 * @param bpUpriChngFlg 取引先の単価変更許可ＦＬＧのGUI部品
	 * @param itmUpriChngFlg 品目の単価変更許可ＦＬＧのGUI部品
	 * @param dscntItmFlg 値引品目ＦＬＧのGUI部品
	 * @param schdNo 予定ＮＯのGUI部品
	 * @param curTrdUnitConvBaseQty 取引単位換算基準数量
	 * @param curTrdUnitConvQty取引単位換算数量
	 * @param orgTrdUnitConvBaseQty予定時取引単位換算基準数量
	 * @param orgTrdUnitConvQty 予定時取引単位換算数量
	 * @param baseUnitDecPlace 基準単位小数部有効桁数
	 * @param baseUnitRndTyp 基準単位端数処理区分
	 */
	public void setRelateBeans(MCBeans curCd
			, MCBeans bpCd
			, MCBeans itmCd
			, MCBeans itmSub1
			, MCBeans itmSub2
			, MCBeans itmSub3
			, MCBeans trdUnitCd
			, MCBeans qty
			, MCBeans amtDecPlace
			, MCBeans upriDecPlace
			, MCBeans amtRndtyp
			, MCBeans taxRndTyp
			, MCBeans bpUpriChngFlg
			, MCBeans itmUpriChngFlg
			, MCBeans dscntItmFlg
			, MCBeans schdNo
			, MCBeans curTrdUnitConvBaseQty
			, MCBeans curTrdUnitConvQty
			, MCBeans orgTrdUnitConvBaseQty
			, MCBeans orgTrdUnitConvQty
			, MCBeans baseUnitDecPlace
			, MCBeans baseUnitRndTyp
	) {
		_curCd = curCd;
		_bpCd = bpCd;
		_itmCd = itmCd;
		_itmSub1 = itmSub1;
		_itmSub2 = itmSub2;
		_itmSub3 = itmSub3;
		_trdUnitCd = trdUnitCd;
		_qty = qty;
		_amtDecPlace = amtDecPlace;
		_upriDecPlace = upriDecPlace;
		_amtRndTyp = amtRndtyp;
		_taxRndTyp = taxRndTyp;
		_bpUpriChngFlg = bpUpriChngFlg;
		_itmUpriChngFlg = itmUpriChngFlg;
		_dscntItmFlg = dscntItmFlg;
		_schdNo = schdNo;
		_curTrdUnitConvBaseQty = curTrdUnitConvBaseQty;
		_curTrdUnitConvQty =     curTrdUnitConvQty;
		_orgTrdUnitConvBaseQty = orgTrdUnitConvBaseQty;
		_orgTrdUnitConvQty =     orgTrdUnitConvQty;
		_baseUnitDecPlace =      baseUnitDecPlace;
		_baseUnitRndTyp =        baseUnitRndTyp;

	}
	
	/**
	 * 予定ＮＯを保持するＧＵＩ部品を設定します。
	 * @param schd 予定ＮＯを保持するＧＵＩ部品
	 */
	public void setSchdNoBeans(MCBeans schd) {
		_schdNo = schd;
	}
	
	/**
	 * 金額入力時に単価を自動計算する場合はtrueを設定する。
	 * true の場合は、金額計算時に単価を再計算する場合は true を設定する。
	 * falseの場合は、金額、税込金額を入力不可とする。
	 * ※売上明細登録、仕入明細訂正登録、支給明細訂正登録のように、金額を直接入力する場合にtrueにする想定。
	 * 
	 * @param amtToUpri 金額入力時に単価を自動計算する場合はtrue
	 */
	public void setAmtToUpri(boolean amtToUpri) {
		_amtToUpri = amtToUpri;
	}

	/**
	 * 予定系画面で使用する場合はtrueを設定する。
	 * trueの場合は税指定ＦＬＧが入力可で、税ＣＤは税指定ＦＬＧがtrueの場合に入力可となる。
	 * falseの場合は税指定ＦＬＧは入力不可で、税ＣＤは常に入力可となる。
	 * 
	 * @param schd 予定系画面の場合true
	 */
	public void setSchd(boolean schd) {
		_schd = schd;
	}
	
	/**
	 * 単価取得対象外の場合にtrueを返す。
	 * 単価取得対象外がモードINVISIBLEの場合、単価取得対象外がオンの動きとする。
	 * @param i 行番号
	 * @return 単価取得対象外の場合にtrueを返す
	 */
	public boolean isUpriNotTgtFlg(int i) {
		if (columnTrdUpriAmt_upri_not_tgt_flg.getMode() == MCMode.INVISIBLE) {
			return true;
		}
		return (Boolean)getValueOf(columnTrdUpriAmt_upri_not_tgt_flg, i);
	}

	// イベント
	
	@Override
	protected void listenerInit() {
		super.listenerInit();

		((MCLCBeans) _curCd).addLCListener(this);
		((MCLCBeans) _bpCd).addLCListener(this);
		((MCLCBeans) _itmCd).addLCListener(this);
		((MCLCBeans) _itmSub1).addLCListener(this);
		((MCLCBeans) _itmSub2).addLCListener(this);
		((MCLCBeans) _itmSub3).addLCListener(this);
		((MCLCBeans) _trdUnitCd).addLCListener(this);
		((MCLCBeans) _qty).addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == _curCd) {
			doBeans_cur_cd_LC(info);
		}
		else if (lc == _bpCd) {
			doBeans_bp_cd_LC(info);
		}
		else if (lc == _itmCd || lc == _itmSub1 || lc == _itmSub2 || lc == _itmSub3) {
			doBeans_itm_LC(info);
		}
		else if (lc == _trdUnitCd) {
			doBeans_trd_unit_cd_LC(info);
		}
		else if (lc == _qty) {
			doBeans_qty_LC(info);
		}
	}

	/**
	 * 通貨ＣＤが変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_cur_cd_LC(MCEventInfo info) {
		clearTrdUpriAmt(info.getEventIndex());
		clearDscntAmt(info.getEventIndex());
	}

	/**
	 * 取引先ＣＤが変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_bp_cd_LC(MCEventInfo info) {
		setTrdCurAmt(info.getEventIndex());
	}

	/**
	 * 品目が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_itm_LC(MCEventInfo info) {
		clearTrdUpriAmt(info.getEventIndex());
		clearDscntAmt(info.getEventIndex());
	}

	/**
	 * 単位ＣＤが変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_trd_unit_cd_LC(MCEventInfo info) {
		clearTrdUpriAmt(info.getEventIndex());
	}

	/**
	 * 数量が変更されたときに実行される。<br>
	 * 
	 * @param info イベント情報
	 */
	protected void doBeans_qty_LC(MCEventInfo info) {
		int i = info.getEventIndex();
		setTrdCurAmt(i);
		setDscntAmt(i);
	}
	
	@Override
	public void doTrdUpriAmt_trd_cur_upri_LC(MCEventInfo info) {
		super.doTrdUpriAmt_trd_cur_upri_LC(info);
		// 金額を入力している場合に金額指定ＦＬＧをオンにし、金額を設定しない
		if (TrdUpriAmtTable.getBaseTable().getEditingColumnConfig() == columnTrdUpriAmt_trd_cur_amt) {
			getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(true);
		}
		// 税込金額を入力している場合に金額指定ＦＬＧをオンにし、金額を設定しない
		else if (TrdUpriAmtTable.getBaseTable().getEditingColumnConfig() == columnTrdUpriAmt_trd_cur_inc_tax_amt) {
			getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(true);
		}
		// その他の場合（≒単価を入力している場合）は金額指定ＦＬＧをオフにし、金額を設定する
		else {
			getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(false);
			setTrdCurDscntAmt(info.getEventIndex());
			setTrdCurAmt(info.getEventIndex());
		}
	}
	
	@Override
	public void doTrdUpriAmt_tax_cd_LC(MCEventInfo info) {
		super.doTrdUpriAmt_tax_cd_LC(info);
		setTrdCurAmt(info.getEventIndex());
	}
	
	@Override
	public void doTrdUpriAmt_trd_cur_dscnt_amt_LC(MCEventInfo info) {
		super.doTrdUpriAmt_trd_cur_dscnt_amt_LC(info);
		setTrdCurAmt(info.getEventIndex());
		setDscntRsnCd(info.getEventIndex());
	}
	
	@Override
	public void doTrdUpriAmt_trd_cur_amt_LC(MCEventInfo info) {
		super.doTrdUpriAmt_trd_cur_amt_LC(info);
		if (_amtToUpri) {
			MCNumber tax_amt = MAUCP_AmtUtil.getTaxAmt(
			(MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_amt, info.getEventIndex())
			, (MCNumber)getValueOf(columnTrdUpriAmt_tax_rate, info.getEventIndex())
			, (MCNumber)getValueOf(_amtDecPlace, info.getEventIndex())
			, (String)getValueOf(_taxRndTyp, info.getEventIndex())
			);
			// 金額を入力している場合に金額指定ＦＬＧをオンにし、単価・税込金額を設定する
			if (TrdUpriAmtTable.getBaseTable().getEditingColumnConfig() == columnTrdUpriAmt_trd_cur_amt) {
				getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(true);
				setTrdCurUpri(info.getEventIndex());
				setTrdCurIncTaxAmtFrTrdCurAmt(info.getEventIndex(), tax_amt);
			}
			// 税込金額を入力している場合に金額指定ＦＬＧをオンにし、単価・税込金額を設定しない
			else if (TrdUpriAmtTable.getBaseTable().getEditingColumnConfig() == columnTrdUpriAmt_trd_cur_inc_tax_amt) {
				getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(true);
			}
			// その他の場合（≒単価を入力している場合）は金額指定ＦＬＧをオフにし、税込金額を設定し、単価を設定しない
			else {
				getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(false);
				setTrdCurIncTaxAmtFrTrdCurAmt(info.getEventIndex(), tax_amt);
			}
			setTrdCurTaxAmt(info.getEventIndex(), tax_amt);
		}
	}
	
	@Override
	public void doTrdUpriAmt_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		super.doTrdUpriAmt_trd_cur_inc_tax_amt_LC(info);
		if (_amtToUpri) {
			MCNumber tax_amt = MAUCP_AmtUtil.getIncTaxAmt(
					(MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_inc_tax_amt, info.getEventIndex())
					, (MCNumber)getValueOf(columnTrdUpriAmt_tax_rate, info.getEventIndex())
					, (MCNumber)getValueOf(_amtDecPlace, info.getEventIndex())
					, (String)getValueOf(_taxRndTyp, info.getEventIndex())
					);
			// 金額を入力している場合に金額指定ＦＬＧをオンにし、単価・金額を設定しない
			if (TrdUpriAmtTable.getBaseTable().getEditingColumnConfig() == columnTrdUpriAmt_trd_cur_amt) {
				getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(true);
			}
			// 税込金額を入力している場合に金額指定ＦＬＧをオンにし、単価・金額を設定する
			else if (TrdUpriAmtTable.getBaseTable().getEditingColumnConfig() == columnTrdUpriAmt_trd_cur_inc_tax_amt) {
				getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(true);
				setTrdCurAmtFrTrdCurIncTaxAmt(info.getEventIndex(), tax_amt);
				setTrdCurUpri(info.getEventIndex());
			}
			// その他の場合（≒単価を入力している場合）は金額指定ＦＬＧをオフにし、単価・金額を設定しない
			else {
				getTrdUpriAmtL().get(info.getEventIndex()).amt_inpt_flg(false);
			}
			setTrdCurTaxAmt(info.getEventIndex(), tax_amt);
		}
	}
	
	protected void clearTrdUpriAmt(int i) {

		
		// 変更対象がヘッダの場合（全てクリア）
		if (i < 0) {
			for (TrdUpriAmtR r : exceptBaseEmpty(TrdUpriAmtTable)) {
				if (isNull(getValueOf(_schdNo, r.getGUIIndex()))) {
					setValueEx(columnTrdUpriAmt_trd_cur_upri, r.getGUIIndex(), null);
					setValueEx(columnTrdUpriAmt_trd_cur_amt, r.getGUIIndex(), null);
					setValueEx(columnTrdUpriAmt_trd_cur_inc_tax_amt, r.getGUIIndex(), null);
					setValueEx(columnTrdUpriAmt_trd_cur_tax_amt, r.getGUIIndex(), null);
					setValueEx(columnTrdUpriAmt_interim_flg, r.getGUIIndex(), false);
					setValueEx(columnTrdUpriAmt_upri_not_tgt_flg, r.getGUIIndex(), false);
				}
			}
		}
		// 変更対象が明細の場合（指定された行のみクリア）
		else {
			if (isNull(getValueOf(_schdNo, i))) {
				setValueEx(columnTrdUpriAmt_trd_cur_upri, i, null);
				setValueEx(columnTrdUpriAmt_trd_cur_amt, i, null);
				setValueEx(columnTrdUpriAmt_trd_cur_inc_tax_amt, i, null);
				setValueEx(columnTrdUpriAmt_trd_cur_tax_amt, i, null);
				setValueEx(columnTrdUpriAmt_interim_flg, i, false);
				setValueEx(columnTrdUpriAmt_upri_not_tgt_flg, i, false);
			}
		}
	}
	
	protected void clearDscntAmt(int i) {
		// 変更対象がヘッダの場合（全てクリア）
		if (i < 0) {
			for (TrdUpriAmtR r : exceptBaseEmpty(TrdUpriAmtTable)) {
				if (isNull(getValueOf(_schdNo, r.getGUIIndex()))) {
					setValueEx(columnTrdUpriAmt_trd_cur_dscnt_amt, r.getGUIIndex(), null);
					setValueEx(columnTrdUpriAmt_dscnt_rsn_cd, r.getGUIIndex(), null);
					setValueEx(columnTrdUpriAmt_dscnt_rsn_nm, r.getGUIIndex(), null);
				}
			}
		}
		// 変更対象が明細の場合（指定された行のみクリア）
		else {
			if (isNull(getValueOf(_schdNo, i))) {
				setValueEx(columnTrdUpriAmt_trd_cur_dscnt_amt, i, null);
				setValueEx(columnTrdUpriAmt_dscnt_rsn_cd, i, null);
				setValueEx(columnTrdUpriAmt_dscnt_rsn_nm, i, null);
			}
		}
	}
	protected void setDscntAmt(int i) {

		if (isNull(getValueOf(_schdNo, i))) {
			return;
		}
		
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (TrdUpriAmtR r : exceptBaseEmpty(TrdUpriAmtTable)) {
				setNewDscnt(r.getGUIIndex());
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			setNewDscnt(i);
		}
	}
	
	protected void setNewDscnt(int i) {
		MCNumber orgDscnt = (MCNumber)getValueOf(columnTrdUpriAmt_org_trd_cur_dscnt_amt, i);
		MCNumber orgQty = (MCNumber)getValueOf(columnTrdUpriAmt_org_qty, i);
		MCNumber curQty = (MCNumber)getValueOf(_qty, i);
		if (orgDscnt == null || curQty == null || orgQty == null) {
			return;
		}
		MCNumber newDscnt =
				orgDscnt
				.multiply(
						convToBaseUnit(curQty, 
								(MCNumber)getValueOf(_curTrdUnitConvBaseQty, i), 
								(MCNumber)getValueOf(_curTrdUnitConvQty, i),
								(MCNumber)getValueOf(_baseUnitDecPlace, i), 
								(String)getValueOf(_baseUnitRndTyp, i)))
				.divide(
						convToBaseUnit(orgQty,  
								(MCNumber)getValueOf(_orgTrdUnitConvBaseQty, i), 
								(MCNumber)getValueOf(_orgTrdUnitConvQty, i),
								(MCNumber)getValueOf(_baseUnitDecPlace, i), 
								(String)getValueOf(_baseUnitRndTyp, i)), 
						((MCNumber)getValueOf(_amtDecPlace, i)).intValue(),
						toRoundingMode((String)getValueOf(_amtRndTyp, i)));
				setValueEx(columnTrdUpriAmt_trd_cur_dscnt_amt, i, newDscnt);
	}
	
	protected java.math.RoundingMode toRoundingMode(String rndTyp) {
		MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
		if (typ == null) {
			return null;
		}
		else {
			return typ.toMC();
		}
	}
	
	public void setTrdCurAmt(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (TrdUpriAmtR r : exceptBaseEmpty(TrdUpriAmtTable)) {
				MCRow amtR = MAUCP_AmtUtil.getAmtAndTax(
						(MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_upri, r.getGUIIndex())
						, (MCNumber)getValueOf(_qty, r.getGUIIndex())
						, (MCNumber)getValueOf(columnTrdUpriAmt_tax_rate, r.getGUIIndex())
						, (Boolean)getValueOf(columnTrdUpriAmt_inc_tax_flg, r.getGUIIndex())
						, (MCNumber)getValueOf(_amtDecPlace, r.getGUIIndex())
						, (String)getValueOf(_amtRndTyp, r.getGUIIndex())
						, (String)getValueOf(_taxRndTyp, r.getGUIIndex())
						, (MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_dscnt_amt, r.getGUIIndex())
						);
				setValueEx(columnTrdUpriAmt_trd_cur_amt, r.getGUIIndex(), amtR.getNumberNE("amt"));
				setValueEx(columnTrdUpriAmt_trd_cur_inc_tax_amt, r.getGUIIndex(), amtR.getNumberNE("inc_tax_amt"));
				setValueEx(columnTrdUpriAmt_trd_cur_tax_amt, r.getGUIIndex(), amtR.getNumberNE("tax_amt"));
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			MCRow amtR = MAUCP_AmtUtil.getAmtAndTax(
					(MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_upri, i)
					, (MCNumber)getValueOf(_qty, i)
					, (MCNumber)getValueOf(columnTrdUpriAmt_tax_rate, i)
					, (Boolean)getValueOf(columnTrdUpriAmt_inc_tax_flg, i)
					, (MCNumber)getValueOf(_amtDecPlace, i)
					, (String)getValueOf(_amtRndTyp, i)
					, (String)getValueOf(_taxRndTyp, i)
					, (MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_dscnt_amt, i)
					);
			setValueEx(columnTrdUpriAmt_trd_cur_amt, i, amtR.getNumberNE("amt"));
			setValueEx(columnTrdUpriAmt_trd_cur_inc_tax_amt, i, amtR.getNumberNE("inc_tax_amt"));
			setValueEx(columnTrdUpriAmt_trd_cur_tax_amt, i, amtR.getNumberNE("tax_amt"));
		}
	}
	
	public void setTrdCurDscntAmt(int i) {
		
		if (i >= 0 && !isNull(getValueOf(columnTrdUpriAmt_trd_cur_upri, i)) && ((MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_upri, i)).isZero()) {
			
			setValueEx(columnTrdUpriAmt_trd_cur_dscnt_amt, i, null);
		}
	}
	
	protected void setTrdCurUpri(int i) {
		// 変更対象がヘッダの場合（全て再計算）
		if (i < 0) {
			for (TrdUpriAmtR r : exceptBaseEmpty(TrdUpriAmtTable)) {
				int idx = r.getGUIIndex();
				MCNumber amt = (MCNumber)((Boolean)getValueOf(columnTrdUpriAmt_inc_tax_flg, idx) ?
						 getValueOf(columnTrdUpriAmt_trd_cur_inc_tax_amt, idx) : getValueOf(columnTrdUpriAmt_trd_cur_amt, idx));
				MCNumber upri = MAUCP_AmtUtil.getUpri(
						amt
						, (MCNumber)getValueOf(_qty, idx)
						, (MCNumber)getValueOf(_upriDecPlace, idx)
						, (MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_dscnt_amt, idx)
						);
				setValueEx(columnTrdUpriAmt_trd_cur_upri, idx, upri);
			}
		}
		// 変更対象が明細の場合（指定された行のみ再計算）
		else {
			MCNumber amt = (MCNumber)((Boolean)getValueOf(columnTrdUpriAmt_inc_tax_flg, i) ?
					 getValueOf(columnTrdUpriAmt_trd_cur_inc_tax_amt, i) : getValueOf(columnTrdUpriAmt_trd_cur_amt, i));
			MCNumber upri = MAUCP_AmtUtil.getUpri(
					amt
					, (MCNumber)getValueOf(_qty, i)
					, (MCNumber)getValueOf(_upriDecPlace, i)
					, (MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_dscnt_amt, i)
					);

			setValueEx(columnTrdUpriAmt_trd_cur_upri, i, upri);
		}
	}
	
	protected void setTrdCurTaxAmt(int i, MCNumber tax_amt) {
		setValueEx(columnTrdUpriAmt_trd_cur_tax_amt, i, tax_amt);
	}
	
	protected void setTrdCurAmtFrTrdCurIncTaxAmt(int i, MCNumber tax_amt) {
		TrdUpriAmtR r = getTrdUpriAmtL().get(i);
		if (isNull(r.trd_cur_inc_tax_amt()) || isNull(tax_amt)) {	
			setValueEx(columnTrdUpriAmt_trd_cur_amt, i, null);

		}
		else {
			setValueEx(columnTrdUpriAmt_trd_cur_amt, i, r.trd_cur_inc_tax_amt().add(tax_amt.negate()));
		}
	}
	
	protected void setTrdCurIncTaxAmtFrTrdCurAmt(int i, MCNumber tax_amt) {
		TrdUpriAmtR r = getTrdUpriAmtL().get(i);
		if (isNull(r.trd_cur_amt()) || isNull(tax_amt)) {
			setValueEx(columnTrdUpriAmt_trd_cur_inc_tax_amt, i, null);
		}
		else {
			setValueEx(columnTrdUpriAmt_trd_cur_inc_tax_amt, i, r.trd_cur_amt().add(tax_amt));
		}
	}
	
	protected void setDscntRsnCd(int i) {
		TrdUpriAmtR r = getTrdUpriAmtL().get(i);
		if (isNull(r.trd_cur_dscnt_amt())) {
			setValueEx(columnTrdUpriAmt_dscnt_rsn_cd, i, null);
		}
	}

	// セルコンフィグ

	@Override
	protected void setPartsCellConfig() {
		super.setPartsCellConfig();
		TrdUpriAmtTable.setCellConfig(createPartsCellConfig());
	}

	protected PartsCellConfig createPartsCellConfig() {
		return new PartsCellConfig();
	}

	public class PartsCellConfig extends MAUDP_CommonCellConfig {

		@Override
		protected boolean isAmtColumn(MCColumnConfig column) {
			return (column == columnTrdUpriAmt_trd_cur_amt
					|| column == columnTrdUpriAmt_trd_cur_inc_tax_amt
					|| column == columnTrdUpriAmt_trd_cur_tax_amt
					|| column == columnTrdUpriAmt_trd_cur_dscnt_amt
							);
		}

		@Override
		protected boolean isUpriColumn(MCColumnConfig column) {
			return (column == columnTrdUpriAmt_trd_cur_upri);
		}

		@Override
		protected MCNumber getUpriDecPlace(int index, MCColumnConfig column) {
			if (isUpriColumn(column)) {
				return (MCNumber) getBeansValue(_upriDecPlace, index);
			}
			return super.getUpriDecPlace(index, column);
		}

		@Override
		protected MCNumber getAmtDecPlace(int index, MCColumnConfig column) {
			if (isAmtColumn(column)) {
				return (MCNumber) getBeansValue(_amtDecPlace, index);
			}
			return super.getAmtDecPlace(index, column);
		}

		@Override
		protected int getCustomScale(int index, MCColumnConfig column,
				MCTable table) {

			if (isAmtColumn(column)) {
				MCNumber decPlace = getAmtDecPlace(index, column);
				return MAUCP_AmtUtil.nullToZero(decPlace);
			}
			if (isUpriColumn(column)) {
				MCNumber decPlace = getUpriDecPlace(index, column);
				return MAUCP_AmtUtil.nullToZero(decPlace);
			}
			return super.getCustomScale(index, column, table);
		}

		@Override
		protected int getCustomLength(int index, MCColumnConfig column,
				MCTable table) {

			if (isAmtColumn(column)) {
				MCNumber decPlace = getAmtDecPlace(index, column);
				return MAUCP_AmtUtil.getAmtLength(column.getMeta(), decPlace);
			}
			if (isUpriColumn(column)) {
				MCNumber decPlace = getUpriDecPlace(index, column);
				return MAUCP_AmtUtil.getAmtLength(column.getMeta(), decPlace);
			}
			return super.getCustomLength(index, column, table);
		}
	}

	@Override
	public MCMode getCellMode(int index, MCColumnConfig column) {
		if (column == columnTrdUpriAmt_trd_cur_upri || column == columnTrdUpriAmt_interim_flg) {
			// 取引先と品目の両方の単価変更許可フラグがfalseだったらREAD_ONLYにする
			if (_bpUpriChngFlg != null && _itmUpriChngFlg != null) {
				if (!(Boolean)getValueOf(_bpUpriChngFlg, index) && !(Boolean)getValueOf(_itmUpriChngFlg, index)) {
					return MCMode.READ_ONLY;
				}
			}
			// 単価取得対象外がオフの場合は単価を入力不可とする
			if (!isUpriNotTgtFlg(index)) {
				return MCMode.READ_ONLY;
			}
			return super.getCellMode(index, column);
		}
		if (column == columnTrdUpriAmt_trd_cur_amt) {
			if (_amtToUpri && !(Boolean)getValueOf(columnTrdUpriAmt_inc_tax_flg, index)) {
				return super.getCellMode(index, column);
			}
			else {
				return MCMode.READ_ONLY;
			}
		}
		if (column == columnTrdUpriAmt_trd_cur_inc_tax_amt) {
			if (_amtToUpri && (Boolean)getValueOf(columnTrdUpriAmt_inc_tax_flg, index)) {
				return super.getCellMode(index, column);
			}
			else {
				return MCMode.READ_ONLY;
			}
		}
		if (column == columnTrdUpriAmt_tax_fix_flg) {
			if (!_schd) {
				return MCMode.READ_ONLY;
			}
			else {
				return super.getCellMode(index, column);
			}
		}
		if (column == columnTrdUpriAmt_tax_cd) {
			if (_schd && !(Boolean)getValueOf(columnTrdUpriAmt_tax_fix_flg, index)) {
				return MCMode.READ_ONLY;
			}
			else {
				return super.getCellMode(index, column);
			}
		}
		if (column == columnTrdUpriAmt_dscnt_rsn_cd) {
			if (isNull(getValueOf(columnTrdUpriAmt_trd_cur_dscnt_amt, index))) {
				return MCMode.READ_ONLY;
			}
			else {
				return super.getCellMode(index, column);
			}
		}
		if (column == columnTrdUpriAmt_trd_cur_dscnt_amt) {
			if ((_dscntItmFlg != null && (Boolean)getValueOf(_dscntItmFlg, index)) 
					|| (!isNull(getValueOf(columnTrdUpriAmt_trd_cur_upri, index)) && ((MCNumber)getValueOf(columnTrdUpriAmt_trd_cur_upri, index)).isZero())) {
				return MCMode.READ_ONLY;
			}
			else {
				return super.getCellMode(index, column);
			}
		}
		return super.getCellMode(index, column);
	}

	@Override
	public void afterCallParts(mcframe.commonCore.container.MCRowMatcher matcher,
			mcframe.clientCore.beans.MCCaller caller) {
		super.afterCallParts(matcher, caller);
		
		//予定引継ぎ時の値引額計算のために値をキャッシュ

		//数量部品がない場合及び検索以外は対象外
		if (!(caller instanceof FXBAP_Searcher)) {
			return;
		}
		
		if (_qty == null ) {
			return;
		}
		
		//検索後の値引額をキャッシュする
		int i = caller.getDownParamBlockIndex(TrdUpriAmtTable);
		MCList<MCRow> down = caller.getDownParamList(i);
		if (down == null) {
			return;
		}


		MCRowBeans rqty = null;
		MCColumnConfig cqty = null;
		if(_qty instanceof MCRowBeans) {
			rqty = (MCRowBeans)_qty;
		}
		else {
			cqty = (MCColumnConfig)_qty;
		}
		
		for (MCRow r : down) {
			//値引額キャッシュ
			String orgDscntCol = columnTrdUpriAmt_org_trd_cur_dscnt_amt.getBaseRowColumnName();
			String curDscntCol = columnTrdUpriAmt_trd_cur_dscnt_amt.getBaseRowColumnName();
			r.setValue(orgDscntCol, r.getValue(curDscntCol));

			//数量キャッシュ
			String orgQtyCol = columnTrdUpriAmt_org_qty.getBaseRowColumnName();
			String curQtyCol = (rqty != null) ? rqty.getBaseRowColumnName() : cqty.getBaseRowColumnName();
			r.setValue(orgQtyCol, r.getValue(curQtyCol));
		}
	}

}