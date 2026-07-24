package mcframe.serverMABC.MABCL0280;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_DptReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_DptReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0280";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_DptReg.DptHis_UpdChk01 aDptHis_UpdChk01;

	protected void initDptHis_UpdChk01() {
		this.info = PDef.MA_MABCL0280_DptHis_UpdChk01_INFO;
		this.aDptHis_UpdChk01 = ((MABCL_DptReg)this).new DptHis_UpdChk01();
	}

	public static MABCL_DptReg.DptHis_UpdChk01 crtDptHis_UpdChk01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDptHis_UpdChk01();
		return lgc.aDptHis_UpdChk01;
	}

	protected void paramDptHis_UpdChk01(MCParam p) {
		if (this.aDptHis_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptHis_UpdChk01.up0());
	}

	protected void doDptHis_UpdChk01() {
		aDptHis_UpdChk01.call();
	};

	/**
	 * DptHis_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR createDptHis_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.create();
	}

	/**
	 * DptHis_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> createDptHis_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);
	}
	protected MABCL_DptReg.DptHis_Upd01 aDptHis_Upd01;

	protected void initDptHis_Upd01() {
		this.info = PDef.MA_MABCL0280_DptHis_Upd01_INFO;
		this.aDptHis_Upd01 = ((MABCL_DptReg)this).new DptHis_Upd01();
	}

	public static MABCL_DptReg.DptHis_Upd01 crtDptHis_Upd01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDptHis_Upd01();
		return lgc.aDptHis_Upd01;
	}

	protected void paramDptHis_Upd01(MCParam p) {
		if (this.aDptHis_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptHis_Upd01.up0());
	}

	protected void doDptHis_Upd01() {
		aDptHis_Upd01.call();
	};

	/**
	 * DptHis_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR createDptHis_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.create();
	}

	/**
	 * DptHis_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> createDptHis_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);
	}
	protected MABCL_DptReg.Dpt_UpdChk01 aDpt_UpdChk01;

	protected void initDpt_UpdChk01() {
		this.info = PDef.MA_MABCL0280_Dpt_UpdChk01_INFO;
		this.aDpt_UpdChk01 = ((MABCL_DptReg)this).new Dpt_UpdChk01();
	}

	public static MABCL_DptReg.Dpt_UpdChk01 crtDpt_UpdChk01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDpt_UpdChk01();
		return lgc.aDpt_UpdChk01;
	}

	protected void paramDpt_UpdChk01(MCParam p) {
		if (this.aDpt_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDpt_UpdChk01.up0());
	}

	protected void doDpt_UpdChk01() {
		aDpt_UpdChk01.call();
	};

	/**
	 * Dpt_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR createDpt_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.create();
	}

	/**
	 * Dpt_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> createDpt_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.class);
	}
	protected MABCL_DptReg.Dpt_Upd01 aDpt_Upd01;

	protected void initDpt_Upd01() {
		this.info = PDef.MA_MABCL0280_Dpt_Upd01_INFO;
		this.aDpt_Upd01 = ((MABCL_DptReg)this).new Dpt_Upd01();
	}

	public static MABCL_DptReg.Dpt_Upd01 crtDpt_Upd01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDpt_Upd01();
		return lgc.aDpt_Upd01;
	}

	protected void paramDpt_Upd01(MCParam p) {
		if (this.aDpt_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDpt_Upd01.up0());
	}

	protected void doDpt_Upd01() {
		aDpt_Upd01.call();
	};

	/**
	 * Dpt_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR createDpt_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.create();
	}

	/**
	 * Dpt_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> createDpt_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.class);
	}
	protected MABCL_DptReg.DptMap_UpdChk01 aDptMap_UpdChk01;

	protected void initDptMap_UpdChk01() {
		this.info = PDef.MA_MABCL0280_DptMap_UpdChk01_INFO;
		this.aDptMap_UpdChk01 = ((MABCL_DptReg)this).new DptMap_UpdChk01();
	}

	public static MABCL_DptReg.DptMap_UpdChk01 crtDptMap_UpdChk01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDptMap_UpdChk01();
		return lgc.aDptMap_UpdChk01;
	}

	protected void paramDptMap_UpdChk01(MCParam p) {
		if (this.aDptMap_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptMap_UpdChk01.up0());
	}

	protected void doDptMap_UpdChk01() {
		aDptMap_UpdChk01.call();
	};

	/**
	 * DptMap_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR createDptMap_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.create();
	}

	/**
	 * DptMap_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> createDptMap_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);
	}
	protected MABCL_DptReg.DptMap_Upd01 aDptMap_Upd01;

	protected void initDptMap_Upd01() {
		this.info = PDef.MA_MABCL0280_DptMap_Upd01_INFO;
		this.aDptMap_Upd01 = ((MABCL_DptReg)this).new DptMap_Upd01();
	}

	public static MABCL_DptReg.DptMap_Upd01 crtDptMap_Upd01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDptMap_Upd01();
		return lgc.aDptMap_Upd01;
	}

	protected void paramDptMap_Upd01(MCParam p) {
		if (this.aDptMap_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptMap_Upd01.up0());
	}

	protected void doDptMap_Upd01() {
		aDptMap_Upd01.call();
	};

	/**
	 * DptMap_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR createDptMap_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.create();
	}

	/**
	 * DptMap_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> createDptMap_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);
	}
	protected MABCL_DptReg.Dpt_DelChk01 aDpt_DelChk01;

	protected void initDpt_DelChk01() {
		this.info = PDef.MA_MABCL0280_Dpt_DelChk01_INFO;
		this.aDpt_DelChk01 = ((MABCL_DptReg)this).new Dpt_DelChk01();
	}

	public static MABCL_DptReg.Dpt_DelChk01 crtDpt_DelChk01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDpt_DelChk01();
		return lgc.aDpt_DelChk01;
	}

	protected void paramDpt_DelChk01(MCParam p) {
		if (this.aDpt_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDpt_DelChk01.up0());
	}

	protected void doDpt_DelChk01() {
		aDpt_DelChk01.call();
	};

	/**
	 * Dpt_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR createDpt_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.create();
	}

	/**
	 * Dpt_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> createDpt_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);
	}
	protected MABCL_DptReg.Dpt_Del01 aDpt_Del01;

	protected void initDpt_Del01() {
		this.info = PDef.MA_MABCL0280_Dpt_Del01_INFO;
		this.aDpt_Del01 = ((MABCL_DptReg)this).new Dpt_Del01();
	}

	public static MABCL_DptReg.Dpt_Del01 crtDpt_Del01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDpt_Del01();
		return lgc.aDpt_Del01;
	}

	protected void paramDpt_Del01(MCParam p) {
		if (this.aDpt_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDpt_Del01.up0());
	}

	protected void doDpt_Del01() {
		aDpt_Del01.call();
	};

	/**
	 * Dpt_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR createDpt_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.create();
	}

	/**
	 * Dpt_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> createDpt_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);
	}
	protected MABCL_DptReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0280_Srch01_INFO;
		this.aSrch01 = ((MABCL_DptReg)this).new Srch01();
	}

	public static MABCL_DptReg.Srch01 crtSrch01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0280.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0280.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0280.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABC.MABCL0280.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt3R.class);
	}
	protected MABCL_DptReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0280_Upd01_INFO;
		this.aUpd01 = ((MABCL_DptReg)this).new Upd01();
	}

	public static MABCL_DptReg.Upd01 crtUpd01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Upd01_Dtl2R createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL0280.Upd01_Dtl2R.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Upd01_Dtl2R> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Upd01_Dtl2R.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);
	}
	protected MABCL_DptReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0280_Del01_INFO;
		this.aDel01 = ((MABCL_DptReg)this).new Del01();
	}

	public static MABCL_DptReg.Del01 crtDel01() {
		MABCL_DptReg lgc = new MABCL_DptReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DptHis_UpdChk01オペレーション.<p>
	 *
	 * 部門変更履歴マスタを登録する前のチェックを行う<br>
	 */
	abstract public class DptHis_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptHis_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected DptHis_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DptHis_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR createDptHis_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.create();
		}

		/**
		 * DptHis_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> createDptHis_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_his_rmrks</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}


	}
	/**
	 * DptHis_Upd01オペレーション.<p>
	 *
	 * 部門変更履歴マスタを登録する<br>
	 */
	abstract public class DptHis_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptHis_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_HIS_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_HIS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_HIS_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_HIS_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_HIS_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_HIS_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_HIS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_HIS_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_HIS_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_HIS_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptHis_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DPT_HIS_R.create("T1"));
			chkMaster = MCController.create(MAM_DPT_HIS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DPT_HIS_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DPT_HIS_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_HIS_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DPT_HIS_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DptHis_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR createDptHis_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.create();
		}

		/**
		 * DptHis_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> createDptHis_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_his_rmrks</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_DPT_HIS_R> dest0_0, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> src_DptHis_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_DptHis_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_his_rmrks", "dpt_his_rmrks");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_DPT_HIS_R r_dest, mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DPT_HIS_R> dest, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src : src){
				MAM_DPT_HIS_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DPT_HIS_R> dest0_0, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> src_DptHis_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_DptHis_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_his_rmrks", "dpt_his_rmrks");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_DPT_HIS_R r_dest, mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DPT_HIS_R> dest, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src : src){
				MAM_DPT_HIS_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Dpt_UpdChk01オペレーション.<p>
	 *
	 * 部門マスタを登録する前のチェックを行う<br>
	 */
	abstract public class Dpt_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Dpt_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Dpt_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Dpt_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR createDpt_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.create();
		}

		/**
		 * Dpt_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> createDpt_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>up_lv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}


	}
	/**
	 * Dpt_Upd01オペレーション.<p>
	 *
	 * 部門マスタを登録する<br>
	 */
	abstract public class Dpt_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Dpt_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Dpt_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DPT_R.create("T1"));
			chkMaster = MCController.create(MAM_DPT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DPT_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DPT_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DPT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Dpt_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR createDpt_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.create();
		}

		/**
		 * Dpt_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> createDpt_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>up_lv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_DPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> src_Dpt_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Dpt_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("up_lv_dpt_cd", "up_lv_dpt_cd");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rcv_bank_ac_cd", "rcv_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("asst_dpt_flg", "asst_dpt_flg");
				addColumnPathMap("ar_dpt_flg", "ar_dpt_flg");
				addColumnPathMap("ap_dpt_flg", "ap_dpt_flg");
				addColumnPathMap("sls_dpt_flg", "sls_dpt_flg");
				addColumnPathMap("purc_dpt_flg", "purc_dpt_flg");
				addColumnPathMap("ship_dpt_flg", "ship_dpt_flg");
				addColumnPathMap("arr_dpt_flg", "arr_dpt_flg");
				addColumnPathMap("mfg_dpt_flg", "mfg_dpt_flg");
				addColumnPathMap("sd_dpt_flg", "sd_dpt_flg");
				addColumnPathMap("insp_dpt_flg", "insp_dpt_flg");
				addColumnPathMap("bd_dpt_flg", "bd_dpt_flg");
				addColumnPathMap("cost_dpt_cd", "cost_dpt_cd");
				addColumnPathMap("ac_dpt_cd", "ac_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_DPT_R r_dest, mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DPT_R> dest, MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_src : src){
				MAM_DPT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> src_Dpt_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Dpt_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("up_lv_dpt_cd", "up_lv_dpt_cd");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rcv_bank_ac_cd", "rcv_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("asst_dpt_flg", "asst_dpt_flg");
				addColumnPathMap("ar_dpt_flg", "ar_dpt_flg");
				addColumnPathMap("ap_dpt_flg", "ap_dpt_flg");
				addColumnPathMap("sls_dpt_flg", "sls_dpt_flg");
				addColumnPathMap("purc_dpt_flg", "purc_dpt_flg");
				addColumnPathMap("ship_dpt_flg", "ship_dpt_flg");
				addColumnPathMap("arr_dpt_flg", "arr_dpt_flg");
				addColumnPathMap("mfg_dpt_flg", "mfg_dpt_flg");
				addColumnPathMap("sd_dpt_flg", "sd_dpt_flg");
				addColumnPathMap("insp_dpt_flg", "insp_dpt_flg");
				addColumnPathMap("bd_dpt_flg", "bd_dpt_flg");
				addColumnPathMap("cost_dpt_cd", "cost_dpt_cd");
				addColumnPathMap("ac_dpt_cd", "ac_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_DPT_R r_dest, mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DPT_R> dest, MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_src : src){
				MAM_DPT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * DptMap_UpdChk01オペレーション.<p>
	 *
	 * 部門変更対応マスタを登録する前のチェックを行う<br>
	 */
	abstract public class DptMap_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptMap_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected DptMap_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DptMap_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR createDptMap_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.create();
		}

		/**
		 * DptMap_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> createDptMap_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>old_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>old_dpt_cd_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}


	}
	/**
	 * DptMap_Upd01オペレーション.<p>
	 *
	 * 部門変更対応マスタを登録する<br>
	 */
	abstract public class DptMap_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptMap_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_MAP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_MAP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_MAP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_MAP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_MAP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_MAP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_MAP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_MAP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_MAP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_MAP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptMap_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DPT_MAP_R.create("T1"));
			chkMaster = MCController.create(MAM_DPT_MAP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DPT_MAP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DPT_MAP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_MAP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DPT_MAP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DptMap_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR createDptMap_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.create();
		}

		/**
		 * DptMap_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> createDptMap_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>old_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>old_dpt_cd_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_DPT_MAP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> src_DptMap_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_DptMap_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("old_dpt_cd", "old_dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_DPT_MAP_R r_dest, mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DPT_MAP_R> dest, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src : src){
				MAM_DPT_MAP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DPT_MAP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> src_DptMap_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_DptMap_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("old_dpt_cd", "old_dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_DPT_MAP_R r_dest, mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DPT_MAP_R> dest, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src : src){
				MAM_DPT_MAP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Dpt_DelChk01オペレーション.<p>
	 *
	 * 部門マスタ、組織変更履歴マスタ、部門変更対応マスタ、部門マスタ（ロケール別情報）を削除する前のチェックを行う<br>
	 */
	abstract public class Dpt_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Dpt_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Dpt_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Dpt_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR createDpt_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.create();
		}

		/**
		 * Dpt_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> createDpt_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}


	}
	/**
	 * Dpt_Del01オペレーション.<p>
	 *
	 * 部門マスタ、組織変更履歴マスタ、部門変更対応マスタ、部門マスタ（ロケール別情報）を削除する<br>
	 */
	abstract public class Dpt_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Dpt_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_DPT_R> updMaster1_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Dpt_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_DPT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_DPT_R>)updMaster1.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Dpt_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR createDpt_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.create();
		}

		/**
		 * Dpt_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> createDpt_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_DPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> src_Dpt_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Dpt_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_DPT_R r_dest, mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_DPT_R> dest, MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_src : src){
				MAM_DPT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0280.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt3R> down2;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_HIS_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_HIS_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_DPT_HIS_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_HIS_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_DPT_HIS_R> c0_down0;
		/**
		 * 連携情報 SELECT1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT1 = "SELECT1";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_DPT_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_DPT_R> c1_down0;
		/**
		 * 連携情報 SELECT2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_MAP_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT2 = "SELECT2";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_MAP_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_DPT_MAP_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_MAP_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_DPT_MAP_R> c2_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0280.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt3R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_DPT_HIS_R.create("T1"));
			c1 = MCController.create(MAM_DPT_R.create("T1"));
			c2 = MCController.create(MAM_DPT_MAP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_DPT_HIS_R>)c0.down(0);
			c1_down0 = (MCList<MAM_DPT_R>)c1.down(0);
			c2_down0 = (MCList<MAM_DPT_MAP_R>)c2.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT1, c1);
			appendOpe(SELECT2, c2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT1<br>
		 * （上りブロック定義なし）<br>
		 * SELECT2<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT1)) {
				up_SELECT1();
			}
			if (key.equals(SELECT2)) {
				up_SELECT2();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_DPT_HIS_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT1<br>
		 * MCList&lt;MAM_DPT_R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT2<br>
		 * MCList&lt;MAM_DPT_MAP_R&gt;（{@link #c2_down0}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT1)) {
				down_SELECT1(down1(), c1_down0);
			}
			if (key.equals(SELECT2)) {
				down_SELECT2(down2(), c2_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0280.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0280.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0280.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABC.MABCL0280.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Srch01_Rslt3R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0280.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0280.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_his_rmrks</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_nm</td></tr>
		 * 	<tr><td><br></td><td>up_lv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>up_lv_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sd_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>cal_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>old_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt3R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT1(){
		}
		//-----------------------SELECT2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT2(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_DPT_HIS_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_his_rmrks", "dpt_his_rmrks");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0280.Srch01_Rslt1R r_dest, MAM_DPT_HIS_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt1R> dest, MCList<MAM_DPT_HIS_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_DPT_HIS_R r_src : src){
				mcframe.serverMABC.MABCL0280.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT1(MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_DPT_R> src0_0){
			down_SELECT1_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT1_c1_0() {
			MCRowMapper map = new Map_down_SELECT1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "base_end_dt");
				addColumnPathMap("dpt_nm_lcl", "dpt_nm");
				addColumnPathMap("dpt_nm", "base_dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("dpt_lvl_nm", "dpt_lvl_nm");
				addColumnPathMap("up_lv_dpt_cd", "up_lv_dpt_cd");
				addColumnPathMap("up_lv_dpt_nm", "up_lv_dpt_nm");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("zip_cd", "base_zip_cd");
				addColumnPathMap("addr1", "base_addr1");
				addColumnPathMap("addr2", "base_addr2");
				addColumnPathMap("addr3", "base_addr3");
				addColumnPathMap("addr4", "base_addr4");
				addColumnPathMap("tel", "base_tel");
				addColumnPathMap("fax", "base_fax");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("lg_flg", "lg_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("ar_flg", "ar_flg");
				addColumnPathMap("ap_flg", "ap_flg");
				addColumnPathMap("sd_flg", "sd_flg");
				addColumnPathMap("rcv_bank_ac_cd", "rcv_bank_ac_cd");
				addColumnPathMap("rcv_bank_ac_nm", "rcv_bank_ac_nm");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_nm", "pay_bank_ac_nm");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("cal_nm", "cal_nm");
				addColumnPathMap("asst_dpt_flg", "asst_dpt_flg");
				addColumnPathMap("ar_dpt_flg", "ar_dpt_flg");
				addColumnPathMap("ap_dpt_flg", "ap_dpt_flg");
				addColumnPathMap("sls_dpt_flg", "sls_dpt_flg");
				addColumnPathMap("purc_dpt_flg", "purc_dpt_flg");
				addColumnPathMap("ship_dpt_flg", "ship_dpt_flg");
				addColumnPathMap("arr_dpt_flg", "arr_dpt_flg");
				addColumnPathMap("mfg_dpt_flg", "mfg_dpt_flg");
				addColumnPathMap("sd_dpt_flg", "sd_dpt_flg");
				addColumnPathMap("insp_dpt_flg", "insp_dpt_flg");
				addColumnPathMap("bd_dpt_flg", "bd_dpt_flg");
				addColumnPathMap("cost_dpt_cd", "cost_dpt_cd");
				addColumnPathMap("cost_dpt_nm", "cost_dpt_nm");
				addColumnPathMap("ac_dpt_cd", "ac_dpt_cd");
				addColumnPathMap("ac_dpt_nm", "ac_dpt_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT1_c1_0(mcframe.serverMABC.MABCL0280.Srch01_Rslt2R r_dest, MAM_DPT_R r_src) {
		}

		/**
		 * 連携処理SELECT1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT1_c1_0(MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt2R> dest, MCList<MAM_DPT_R> src) {
			MCRowMapper _rm = createMap_down_SELECT1_c1_0();
			for(MAM_DPT_R r_src : src){
				mcframe.serverMABC.MABCL0280.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT2(MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_DPT_MAP_R> src0_0){
			down_SELECT2_c2_0(dest_Srch01_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT2_c2_0() {
			MCRowMapper map = new Map_down_SELECT2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("old_dpt_cd", "old_dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理SELECT2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT2_c2_0(mcframe.serverMABC.MABCL0280.Srch01_Rslt3R r_dest, MAM_DPT_MAP_R r_src) {
		}

		/**
		 * 連携処理SELECT2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT2_c2_0(MCList<mcframe.serverMABC.MABCL0280.Srch01_Rslt3R> dest, MCList<MAM_DPT_MAP_R> src) {
			MCRowMapper _rm = createMap_down_SELECT2_c2_0();
			for(MAM_DPT_MAP_R r_src : src){
				mcframe.serverMABC.MABCL0280.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Upd01_Dtl2R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> up2;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptHis_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptHis_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptHis_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptHis_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptHis_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptHis_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptMap_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptMap_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptMap_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptMap_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptMap_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.DptMap_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL0280.Upd01_Dtl2R.class);
			up2 = MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDptHis_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDptHis_Upd01();
			chk02 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDpt_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDpt_Upd01();
			chk03 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDptMap_UpdChk01();
			upd03 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDptMap_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR>)upd03.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Upd01_Dtl2R createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL0280.Upd01_Dtl2R.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Upd01_Dtl2R> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Upd01_Dtl2R.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_his_rmrks</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>up_lv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>sd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>new_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Upd01_Dtl2R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>old_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>old_dpt_cd_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>new_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_his_rmrks", "dpt_his_rmrks");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_his_rmrks", "dpt_his_rmrks");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0280.DptHis_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0280.Upd01_Dtl2R> src_Upd01_Dtl2){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_cd_key", "dpt_cd_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("up_lv_dpt_cd", "up_lv_dpt_cd");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rcv_bank_ac_cd", "rcv_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("asst_dpt_flg", "asst_dpt_flg");
				addColumnPathMap("ar_dpt_flg", "ar_dpt_flg");
				addColumnPathMap("ap_dpt_flg", "ap_dpt_flg");
				addColumnPathMap("sls_dpt_flg", "sls_dpt_flg");
				addColumnPathMap("purc_dpt_flg", "purc_dpt_flg");
				addColumnPathMap("ship_dpt_flg", "ship_dpt_flg");
				addColumnPathMap("arr_dpt_flg", "arr_dpt_flg");
				addColumnPathMap("mfg_dpt_flg", "mfg_dpt_flg");
				addColumnPathMap("sd_dpt_flg", "sd_dpt_flg");
				addColumnPathMap("insp_dpt_flg", "insp_dpt_flg");
				addColumnPathMap("bd_dpt_flg", "bd_dpt_flg");
				addColumnPathMap("cost_dpt_cd", "cost_dpt_cd");
				addColumnPathMap("ac_dpt_cd", "ac_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.Upd01_Dtl2R r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.Upd01_Dtl2R> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0280.Upd01_Dtl2R r_src : src){
				mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_cd_key", "dpt_cd_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("up_lv_dpt_cd", "up_lv_dpt_cd");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("rcv_bank_ac_cd", "rcv_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("asst_dpt_flg", "asst_dpt_flg");
				addColumnPathMap("ar_dpt_flg", "ar_dpt_flg");
				addColumnPathMap("ap_dpt_flg", "ap_dpt_flg");
				addColumnPathMap("sls_dpt_flg", "sls_dpt_flg");
				addColumnPathMap("purc_dpt_flg", "purc_dpt_flg");
				addColumnPathMap("ship_dpt_flg", "ship_dpt_flg");
				addColumnPathMap("arr_dpt_flg", "arr_dpt_flg");
				addColumnPathMap("mfg_dpt_flg", "mfg_dpt_flg");
				addColumnPathMap("sd_dpt_flg", "sd_dpt_flg");
				addColumnPathMap("insp_dpt_flg", "insp_dpt_flg");
				addColumnPathMap("bd_dpt_flg", "bd_dpt_flg");
				addColumnPathMap("cost_dpt_cd", "cost_dpt_cd");
				addColumnPathMap("ac_dpt_cd", "ac_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.Upd01_Dtl2R r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.Upd01_Dtl2R> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0280.Upd01_Dtl2R r_src : src){
				mcframe.serverMABC.MABCL0280.Dpt_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> src_Upd01_Dtl3){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_Dtl3);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_Dtl3);
		}
		
		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("old_dpt_cd", "old_dpt_cd");
				addColumnPathMap("old_dpt_cd_key", "old_dpt_cd_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_upd03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_upd03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("old_dpt_cd", "old_dpt_cd");
				addColumnPathMap("old_dpt_cd_key", "old_dpt_cd_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("new_dpt_cd", "new_dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0280.DptMap_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0280.MABCL_DptReg.Dpt_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDpt_DelChk01();
			del01 = mcframe.serverMABC.MABCL0280.MABCL_DptReg.crtDpt_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_DptReg)MABCL_DptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_DptReg)MABCL_DptReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> src_Del01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl1);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0280.Dpt_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}