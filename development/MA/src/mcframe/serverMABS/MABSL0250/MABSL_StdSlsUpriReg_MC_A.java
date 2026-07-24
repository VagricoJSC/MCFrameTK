package mcframe.serverMABS.MABSL0250;

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
 * "MABSL_StdSlsUpriReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_StdSlsUpriReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABSL0250";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_StdSlsUpriReg.StdSlsUpri_UpdChk01 aStdSlsUpri_UpdChk01;

	protected void initStdSlsUpri_UpdChk01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_UpdChk01_INFO;
		this.aStdSlsUpri_UpdChk01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_UpdChk01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_UpdChk01 crtStdSlsUpri_UpdChk01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_UpdChk01();
		return lgc.aStdSlsUpri_UpdChk01;
	}

	protected void paramStdSlsUpri_UpdChk01(MCParam p) {
		if (this.aStdSlsUpri_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_UpdChk01.up0());
	}

	protected void doStdSlsUpri_UpdChk01() {
		aStdSlsUpri_UpdChk01.call();
	};

	/**
	 * StdSlsUpri_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR createStdSlsUpri_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> createStdSlsUpri_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.StdSlsUpri_Upd01 aStdSlsUpri_Upd01;

	protected void initStdSlsUpri_Upd01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_Upd01_INFO;
		this.aStdSlsUpri_Upd01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_Upd01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_Upd01 crtStdSlsUpri_Upd01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_Upd01();
		return lgc.aStdSlsUpri_Upd01;
	}

	protected void paramStdSlsUpri_Upd01(MCParam p) {
		if (this.aStdSlsUpri_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_Upd01.up0());
	}

	protected void doStdSlsUpri_Upd01() {
		aStdSlsUpri_Upd01.call();
	};

	/**
	 * StdSlsUpri_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR createStdSlsUpri_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> createStdSlsUpri_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.StdSlsUpri_DelChk01 aStdSlsUpri_DelChk01;

	protected void initStdSlsUpri_DelChk01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_DelChk01_INFO;
		this.aStdSlsUpri_DelChk01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_DelChk01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_DelChk01 crtStdSlsUpri_DelChk01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_DelChk01();
		return lgc.aStdSlsUpri_DelChk01;
	}

	protected void paramStdSlsUpri_DelChk01(MCParam p) {
		if (this.aStdSlsUpri_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_DelChk01.up0());
	}

	protected void doStdSlsUpri_DelChk01() {
		aStdSlsUpri_DelChk01.call();
	};

	/**
	 * StdSlsUpri_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR createStdSlsUpri_DelChk01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> createStdSlsUpri_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.StdSlsUpri_Del01 aStdSlsUpri_Del01;

	protected void initStdSlsUpri_Del01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_Del01_INFO;
		this.aStdSlsUpri_Del01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_Del01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_Del01 crtStdSlsUpri_Del01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_Del01();
		return lgc.aStdSlsUpri_Del01;
	}

	protected void paramStdSlsUpri_Del01(MCParam p) {
		if (this.aStdSlsUpri_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_Del01.up0());
	}

	protected void doStdSlsUpri_Del01() {
		aStdSlsUpri_Del01.call();
	};

	/**
	 * StdSlsUpri_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR createStdSlsUpri_Del01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> createStdSlsUpri_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_UpdChk01 aStdSlsUpri_Aprv_UpdChk01;

	protected void initStdSlsUpri_Aprv_UpdChk01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_Aprv_UpdChk01_INFO;
		this.aStdSlsUpri_Aprv_UpdChk01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_Aprv_UpdChk01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_UpdChk01 crtStdSlsUpri_Aprv_UpdChk01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_Aprv_UpdChk01();
		return lgc.aStdSlsUpri_Aprv_UpdChk01;
	}

	protected void paramStdSlsUpri_Aprv_UpdChk01(MCParam p) {
		if (this.aStdSlsUpri_Aprv_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_Aprv_UpdChk01.up0());
		p.addUpBlock(aStdSlsUpri_Aprv_UpdChk01.up1());
	}

	protected void doStdSlsUpri_Aprv_UpdChk01() {
		aStdSlsUpri_Aprv_UpdChk01.call();
	};

	/**
	 * StdSlsUpri_Aprv_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR createStdSlsUpri_Aprv_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_Aprv_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> createStdSlsUpri_Aprv_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
	}

	/**
	 * StdSlsUpri_Aprv_UpdChk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R createStdSlsUpri_Aprv_UpdChk01_Dtl2R(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();
	}
	protected MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Upd01 aStdSlsUpri_Aprv_Upd01;

	protected void initStdSlsUpri_Aprv_Upd01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_Aprv_Upd01_INFO;
		this.aStdSlsUpri_Aprv_Upd01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_Aprv_Upd01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Upd01 crtStdSlsUpri_Aprv_Upd01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_Aprv_Upd01();
		return lgc.aStdSlsUpri_Aprv_Upd01;
	}

	protected void paramStdSlsUpri_Aprv_Upd01(MCParam p) {
		if (this.aStdSlsUpri_Aprv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_Aprv_Upd01.up0());
		p.addUpBlock(aStdSlsUpri_Aprv_Upd01.up1());
	}

	protected void doStdSlsUpri_Aprv_Upd01() {
		aStdSlsUpri_Aprv_Upd01.call();
	};

	/**
	 * StdSlsUpri_Aprv_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR createStdSlsUpri_Aprv_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_Aprv_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> createStdSlsUpri_Aprv_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
	}

	/**
	 * StdSlsUpri_Aprv_Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R createStdSlsUpri_Aprv_Upd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();
	}
	protected MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_DelChk01 aStdSlsUpri_Aprv_DelChk01;

	protected void initStdSlsUpri_Aprv_DelChk01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_Aprv_DelChk01_INFO;
		this.aStdSlsUpri_Aprv_DelChk01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_Aprv_DelChk01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_DelChk01 crtStdSlsUpri_Aprv_DelChk01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_Aprv_DelChk01();
		return lgc.aStdSlsUpri_Aprv_DelChk01;
	}

	protected void paramStdSlsUpri_Aprv_DelChk01(MCParam p) {
		if (this.aStdSlsUpri_Aprv_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_Aprv_DelChk01.up0());
	}

	protected void doStdSlsUpri_Aprv_DelChk01() {
		aStdSlsUpri_Aprv_DelChk01.call();
	};

	/**
	 * StdSlsUpri_Aprv_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR createStdSlsUpri_Aprv_DelChk01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_Aprv_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> createStdSlsUpri_Aprv_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Del01 aStdSlsUpri_Aprv_Del01;

	protected void initStdSlsUpri_Aprv_Del01() {
		this.info = PDef.MA_MABSL0250_StdSlsUpri_Aprv_Del01_INFO;
		this.aStdSlsUpri_Aprv_Del01 = ((MABSL_StdSlsUpriReg)this).new StdSlsUpri_Aprv_Del01();
	}

	public static MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Del01 crtStdSlsUpri_Aprv_Del01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initStdSlsUpri_Aprv_Del01();
		return lgc.aStdSlsUpri_Aprv_Del01;
	}

	protected void paramStdSlsUpri_Aprv_Del01(MCParam p) {
		if (this.aStdSlsUpri_Aprv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStdSlsUpri_Aprv_Del01.up0());
	}

	protected void doStdSlsUpri_Aprv_Del01() {
		aStdSlsUpri_Aprv_Del01.call();
	};

	/**
	 * StdSlsUpri_Aprv_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR createStdSlsUpri_Aprv_Del01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.create();
	}

	/**
	 * StdSlsUpri_Aprv_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> createStdSlsUpri_Aprv_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL0250_Srch01_INFO;
		this.aSrch01 = ((MABSL_StdSlsUpriReg)this).new Srch01();
	}

	public static MABSL_StdSlsUpriReg.Srch01 crtSrch01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL0250.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMABS.MABSL0250.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.Srch01_RsltR.class);
	}
	protected MABSL_StdSlsUpriReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MA_MABSL0250_Sprt01_INFO;
		this.aSprt01 = ((MABSL_StdSlsUpriReg)this).new Sprt01();
	}

	public static MABSL_StdSlsUpriReg.Sprt01 crtSprt01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};

	/**
	 * Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMABS.MABSL0250.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.Sprt01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABSL0250_Upd01_INFO;
		this.aUpd01 = ((MABSL_StdSlsUpriReg)this).new Upd01();
	}

	public static MABSL_StdSlsUpriReg.Upd01 crtUpd01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABSL0250_Del01_INFO;
		this.aDel01 = ((MABSL_StdSlsUpriReg)this).new Del01();
	}

	public static MABSL_StdSlsUpriReg.Del01 crtDel01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
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
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR createDel01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.Aprv_Srch01 aAprv_Srch01;

	protected void initAprv_Srch01() {
		this.info = PDef.MA_MABSL0250_Aprv_Srch01_INFO;
		this.aAprv_Srch01 = ((MABSL_StdSlsUpriReg)this).new Aprv_Srch01();
	}

	public static MABSL_StdSlsUpriReg.Aprv_Srch01 crtAprv_Srch01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initAprv_Srch01();
		return lgc.aAprv_Srch01;
	}

	protected void paramAprv_Srch01(MCParam p) {
		if (this.aAprv_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Srch01.up0());
		p.addDownBlock(aAprv_Srch01.down0());
	}

	protected void doAprv_Srch01() {
		aAprv_Srch01.call();
	};

	/**
	 * Aprv_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.Srch01_CndR createAprv_Srch01_CndR(){
		return mcframe.serverMABS.MABSL0250.Srch01_CndR.create();
	}

	/**
	 * Aprv_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR createAprv_Srch01_RsltR(){
		return mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR.create();
	}

	/**
	 * Aprv_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR> createAprv_Srch01_RsltL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR.class);
	}
	protected MABSL_StdSlsUpriReg.Aprv_Upd01 aAprv_Upd01;

	protected void initAprv_Upd01() {
		this.info = PDef.MA_MABSL0250_Aprv_Upd01_INFO;
		this.aAprv_Upd01 = ((MABSL_StdSlsUpriReg)this).new Aprv_Upd01();
	}

	public static MABSL_StdSlsUpriReg.Aprv_Upd01 crtAprv_Upd01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initAprv_Upd01();
		return lgc.aAprv_Upd01;
	}

	protected void paramAprv_Upd01(MCParam p) {
		if (this.aAprv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Upd01.up0());
		p.addUpBlock(aAprv_Upd01.up1());
		p.addDownBlock(aAprv_Upd01.down0());
	}

	protected void doAprv_Upd01() {
		aAprv_Upd01.call();
	};

	/**
	 * Aprv_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR createAprv_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.create();
	}

	/**
	 * Aprv_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> createAprv_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
	}

	/**
	 * Aprv_Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R createAprv_Upd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();
	}
	protected MABSL_StdSlsUpriReg.Aprv_Del01 aAprv_Del01;

	protected void initAprv_Del01() {
		this.info = PDef.MA_MABSL0250_Aprv_Del01_INFO;
		this.aAprv_Del01 = ((MABSL_StdSlsUpriReg)this).new Aprv_Del01();
	}

	public static MABSL_StdSlsUpriReg.Aprv_Del01 crtAprv_Del01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initAprv_Del01();
		return lgc.aAprv_Del01;
	}

	protected void paramAprv_Del01(MCParam p) {
		if (this.aAprv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Del01.up0());
	}

	protected void doAprv_Del01() {
		aAprv_Del01.call();
	};

	/**
	 * Aprv_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR createAprv_Del01_DtlR(){
		return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.create();
	}

	/**
	 * Aprv_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> createAprv_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);
	}
	protected MABSL_StdSlsUpriReg.AprvAfter_Upd01 aAprvAfter_Upd01;

	protected void initAprvAfter_Upd01() {
		this.info = PDef.MA_MABSL0250_AprvAfter_Upd01_INFO;
		this.aAprvAfter_Upd01 = ((MABSL_StdSlsUpriReg)this).new AprvAfter_Upd01();
	}

	public static MABSL_StdSlsUpriReg.AprvAfter_Upd01 crtAprvAfter_Upd01() {
		MABSL_StdSlsUpriReg lgc = new MABSL_StdSlsUpriReg();
		lgc.initAprvAfter_Upd01();
		return lgc.aAprvAfter_Upd01;
	}

	protected void paramAprvAfter_Upd01(MCParam p) {
		if (this.aAprvAfter_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvAfter_Upd01.up0());
	}

	protected void doAprvAfter_Upd01() {
		aAprvAfter_Upd01.call();
	};

	/**
	 * AprvAfter_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR createAprvAfter_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR.create();
	}

	/**
	 * AprvAfter_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR> createAprvAfter_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * StdSlsUpri_UpdChk01オペレーション.<p>
	 *
	 * 標準販売単価マスタを登録する前のチェックを行う<br>
	 */
	abstract public class StdSlsUpri_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected StdSlsUpri_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);

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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR createStdSlsUpri_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> createStdSlsUpri_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}


	}
	/**
	 * StdSlsUpri_Upd01オペレーション.<p>
	 *
	 * 標準販売単価マスタを登録する<br>
	 */
	abstract public class StdSlsUpri_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI__R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_STD_SLS_UPRI__R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI__R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_STD_SLS_UPRI__R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StdSlsUpri_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_STD_SLS_UPRI__R.create("T1"));
			chkMaster = MCController.create(MAM_STD_SLS_UPRI__R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_STD_SLS_UPRI__R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_STD_SLS_UPRI__R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR createStdSlsUpri_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> createStdSlsUpri_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_STD_SLS_UPRI__R> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> src_StdSlsUpri_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_StdSlsUpri_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_STD_SLS_UPRI__R r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_STD_SLS_UPRI__R> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src : src){
				MAM_STD_SLS_UPRI__R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_STD_SLS_UPRI__R> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> src_StdSlsUpri_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_StdSlsUpri_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt", "st_dt");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_STD_SLS_UPRI__R r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_STD_SLS_UPRI__R> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src : src){
				MAM_STD_SLS_UPRI__R r_dest = dest.createRow();
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
	 * StdSlsUpri_DelChk01オペレーション.<p>
	 *
	 * 標準販売単価マスタを削除する前のチェックを行う<br>
	 */
	abstract public class StdSlsUpri_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected StdSlsUpri_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);

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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR createStdSlsUpri_DelChk01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> createStdSlsUpri_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}


	}
	/**
	 * StdSlsUpri_Del01オペレーション.<p>
	 *
	 * 標準販売単価マスタを削除する<br>
	 */
	abstract public class StdSlsUpri_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI__R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_STD_SLS_UPRI__R> updMaster1_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StdSlsUpri_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_STD_SLS_UPRI__R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_STD_SLS_UPRI__R>)updMaster1.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster1_up0}）<br>
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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR createStdSlsUpri_Del01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> createStdSlsUpri_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_STD_SLS_UPRI__R> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> src_StdSlsUpri_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_StdSlsUpri_Del01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
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
		protected void up_UPDATE_updMaster1_0(MAM_STD_SLS_UPRI__R r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_STD_SLS_UPRI__R> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_src : src){
				MAM_STD_SLS_UPRI__R r_dest = dest.createRow();
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
	 * StdSlsUpri_Aprv_UpdChk01オペレーション.<p>
	 *
	 * 標準販売単価マスタ（申請）を登録する前のチェックを行う<br>
	 */
	abstract public class StdSlsUpri_Aprv_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_Aprv_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R up1;
		
		
		// コンストラクタ
		protected StdSlsUpri_Aprv_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
			up1 = mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_Aprv_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR createStdSlsUpri_Aprv_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_Aprv_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> createStdSlsUpri_Aprv_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
		}

		/**
		 * StdSlsUpri_Aprv_UpdChk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R createStdSlsUpri_Aprv_UpdChk01_Dtl2R(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>apl_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>mst_apl_memo</td></tr>
		 * 	<tr><td><br></td><td>st_dt_bf</td></tr>
		 * 	<tr><td><br></td><td>ref_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apl_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mst_apl_memo</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}


	}
	/**
	 * StdSlsUpri_Aprv_Upd01オペレーション.<p>
	 *
	 * 標準販売単価マスタ（申請）を登録する<br>
	 */
	abstract public class StdSlsUpri_Aprv_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_Aprv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R up1;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI_APL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_STD_SLS_UPRI_APL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI_APL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_STD_SLS_UPRI_APL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StdSlsUpri_Aprv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
			up1 = mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_STD_SLS_UPRI_APL_R.create("T1"));
			chkMaster = MCController.create(MAM_STD_SLS_UPRI_APL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_STD_SLS_UPRI_APL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_STD_SLS_UPRI_APL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #chkMaster_up0}）<br>
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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_Aprv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR createStdSlsUpri_Aprv_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_Aprv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> createStdSlsUpri_Aprv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
		}

		/**
		 * StdSlsUpri_Aprv_Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R createStdSlsUpri_Aprv_Upd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>apl_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>mst_apl_memo</td></tr>
		 * 	<tr><td><br></td><td>st_dt_bf</td></tr>
		 * 	<tr><td><br></td><td>ref_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apl_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mst_apl_memo</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_STD_SLS_UPRI_APL_R> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> src_StdSlsUpri_Aprv_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_StdSlsUpri_Aprv_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("mst_apl_memo", "mst_apl_memo");
				addColumnPathMap("st_dt_bf", "st_dt_bf");
				addColumnPathMap("ref_flg", "ref_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_STD_SLS_UPRI_APL_R r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_STD_SLS_UPRI_APL_R> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src : src){
				MAM_STD_SLS_UPRI_APL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_STD_SLS_UPRI_APL_R> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> src_StdSlsUpri_Aprv_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_StdSlsUpri_Aprv_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("apl_no", "apl_no");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_STD_SLS_UPRI_APL_R r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_STD_SLS_UPRI_APL_R> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src : src){
				MAM_STD_SLS_UPRI_APL_R r_dest = dest.createRow();
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
	 * StdSlsUpri_Aprv_DelChk01オペレーション.<p>
	 *
	 * 標準販売単価マスタ（申請）を削除する前のチェックを行う<br>
	 */
	abstract public class StdSlsUpri_Aprv_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_Aprv_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected StdSlsUpri_Aprv_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);

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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_Aprv_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR createStdSlsUpri_Aprv_DelChk01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_Aprv_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> createStdSlsUpri_Aprv_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}


	}
	/**
	 * StdSlsUpri_Aprv_Del01オペレーション.<p>
	 *
	 * 標準販売単価マスタ（申請）を削除する<br>
	 */
	abstract public class StdSlsUpri_Aprv_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StdSlsUpri_Aprv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI_APL_R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_STD_SLS_UPRI_APL_R> updMaster1_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StdSlsUpri_Aprv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_STD_SLS_UPRI_APL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_STD_SLS_UPRI_APL_R>)updMaster1.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #updMaster1_up0}）<br>
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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StdSlsUpri_Aprv_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR createStdSlsUpri_Aprv_Del01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.create();
		}

		/**
		 * StdSlsUpri_Aprv_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> createStdSlsUpri_Aprv_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_STD_SLS_UPRI_APL_R> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> src_StdSlsUpri_Aprv_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_StdSlsUpri_Aprv_Del01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_STD_SLS_UPRI_APL_R r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_STD_SLS_UPRI_APL_R> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_src : src){
				MAM_STD_SLS_UPRI_APL_R r_dest = dest.createRow();
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
		private final mcframe.serverMABS.MABSL0250.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt;<br>
		 * 第1 上りブロッククラス MAM_STD_SLS_UPRI__R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI__R> c0;
		// 連携ロジック上り
		public final MAM_STD_SLS_UPRI__R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_STD_SLS_UPRI__R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0250.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0250.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_STD_SLS_UPRI__R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_STD_SLS_UPRI__R)c0.up(0);
			c0_down0 = (MCList<MAM_STD_SLS_UPRI__R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_STD_SLS_UPRI__R （{@link #c0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_STD_SLS_UPRI__R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL0250.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMABS.MABSL0250.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>apl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>apl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0250.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0250.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0250.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_STD_SLS_UPRI__R dest0_0, mcframe.serverMABS.MABSL0250.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(MAM_STD_SLS_UPRI__R dest, mcframe.serverMABS.MABSL0250.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0250.Srch01_RsltR> dest_Srch01_Rslt, MCList<MAM_STD_SLS_UPRI__R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt, src0_0);
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
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
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
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0250.Srch01_RsltR r_dest, MAM_STD_SLS_UPRI__R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0250.Srch01_RsltR> dest, MCList<MAM_STD_SLS_UPRI__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_STD_SLS_UPRI__R r_src : src){
				mcframe.serverMABS.MABSL0250.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 重複期間の補正を行う<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLStEndDupChecker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> down0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI__R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_STD_SLS_UPRI__R> updMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMABS.MABSL0250.Sprt01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_STD_SLS_UPRI__R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_STD_SLS_UPRI__R>)updMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STD_SLS_UPRI__R&gt; （{@link #updMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMABS.MABSL0250.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_STD_SLS_UPRI__R> dest0_0, MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> src_Sprt01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Sprt01_Dtl);
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
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_STD_SLS_UPRI__R r_dest, mcframe.serverMABS.MABSL0250.Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_STD_SLS_UPRI__R> dest, MCList<mcframe.serverMABS.MABSL0250.Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0250.Sprt01_DtlR r_src : src){
				MAM_STD_SLS_UPRI__R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> src_Upd01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_DelChk01();
			del01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR createDel01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> src_Del01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
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
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_DelChk01_DtlR r_dest = dest.createRow();
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
	/**
	 * Aprv_Srch01オペレーション.<p>
	 *
	 * 検索処理（申請）を行う<br>
	 */
	abstract public class Aprv_Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0250.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STD_SLS_UPRI_APL_R&gt;<br>
		 * 第1 上りブロッククラス MAM_STD_SLS_UPRI_APL_R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_STD_SLS_UPRI_APL_R> c0;
		// 連携ロジック上り
		public final MAM_STD_SLS_UPRI_APL_R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_STD_SLS_UPRI_APL_R> c0_down0;
		
		// コンストラクタ
		protected Aprv_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0250.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_STD_SLS_UPRI_APL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_STD_SLS_UPRI_APL_R)c0.up(0);
			c0_down0 = (MCList<MAM_STD_SLS_UPRI_APL_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_STD_SLS_UPRI_APL_R （{@link #c0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_STD_SLS_UPRI_APL_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.Srch01_CndR createAprv_Srch01_CndR(){
			return mcframe.serverMABS.MABSL0250.Srch01_CndR.create();
		}

		/**
		 * Aprv_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR createAprv_Srch01_RsltR(){
			return mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR.create();
		}

		/**
		 * Aprv_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR> createAprv_Srch01_RsltL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>apl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>apl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0250.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0250.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>st_dt_bf</td></tr>
		 * 	<tr><td><br></td><td>apl_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ref_flg</td></tr>
		 * 	<tr><td><br></td><td>mst_apl_memo</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_STD_SLS_UPRI_APL_R dest0_0, mcframe.serverMABS.MABSL0250.Srch01_CndR src_Aprv_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Aprv_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(MAM_STD_SLS_UPRI_APL_R dest, mcframe.serverMABS.MABSL0250.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR> dest_Aprv_Srch01_Rslt, MCList<MAM_STD_SLS_UPRI_APL_R> src0_0){
			down_SELECT_c0_0(dest_Aprv_Srch01_Rslt, src0_0);
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
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("st_dt_bf", "st_dt_bf");
				addColumnPathMap("apl_dt", "apl_dt");
				addColumnPathMap("apl_usr_cd", "apl_usr_cd");
				addColumnPathMap("apl_usr_nm", "apl_usr_nm");
				addColumnPathMap("apl_dpt_cd", "apl_dpt_cd");
				addColumnPathMap("apl_dpt_nm", "apl_dpt_nm");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("aprv_sts_typ", "aprv_sts_typ");
				addColumnPathMap("ref_flg", "ref_flg");
				addColumnPathMap("mst_apl_memo", "mst_apl_memo");
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
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR r_dest, MAM_STD_SLS_UPRI_APL_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR> dest, MCList<MAM_STD_SLS_UPRI_APL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_STD_SLS_UPRI_APL_R r_src : src){
				mcframe.serverMABS.MABSL0250.Aprv_Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Aprv_Upd01オペレーション.<p>
	 *
	 * 登録処理（申請）を行う<br>
	 */
	abstract public class Aprv_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R down0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R （{@link #chk01_up1}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * 第2 上りブロッククラス mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R （{@link #upd01_up1}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> chk01_up0;
		public final mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R chk01_up1;
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> upd01_up0;
		public final mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R upd01_up1;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Aprv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
			up1 = mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();
			down0 = mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_Aprv_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_Aprv_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR>)chk01.up(0);
			chk01_up1 = (mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R)chk01.up(1);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR>)upd01.up(0);
			upd01_up1 = (mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R)upd01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up1() => mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R （{@link #chk01_up1}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * up1() => mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R （{@link #upd01_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, chk01_up1, upd01_up0, upd01_up1, up0(), up1());
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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR createAprv_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.create();
		}

		/**
		 * Aprv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> createAprv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR.class);
		}

		/**
		 * Aprv_Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R createAprv_Upd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>upri_bf</td></tr>
		 * 	<tr><td><br></td><td>sub_upri1</td></tr>
		 * 	<tr><td><br></td><td>sub_upri2</td></tr>
		 * 	<tr><td><br></td><td>sub_upri3</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>apl_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>mst_apl_memo</td></tr>
		 * 	<tr><td><br></td><td>st_dt_bf</td></tr>
		 * 	<tr><td><br></td><td>ref_flg</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apl_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mst_apl_memo</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> dest0_0, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R dest0_1, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> dest1_0, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R dest1_1, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> src_Aprv_Upd01_Dtl, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R src_Aprv_Upd01_Dtl2){
			up_CALL_OPE01_chk01_0(dest0_0, src_Aprv_Upd01_Dtl);
			up_CALL_OPE01_chk01_1(dest0_1, src_Aprv_Upd01_Dtl2);
			up_CALL_OPE01_upd01_0(dest1_0, src_Aprv_Upd01_Dtl);
			up_CALL_OPE01_upd01_1(dest1_1, src_Aprv_Upd01_Dtl2);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("apl_dt", "apl_dt");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("mst_apl_memo", "mst_apl_memo");
				addColumnPathMap("st_dt_bf", "st_dt_bf");
				addColumnPathMap("ref_flg", "ref_flg");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("apl_dt", "apl_dt");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("apl_usr_cd", "apl_usr_cd");
				addColumnPathMap("apl_dpt_cd", "apl_dpt_cd");
				addColumnPathMap("mst_apl_memo", "mst_apl_memo");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_1(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R src) {
			createMap_up_CALL_OPE01_chk01_1().copy(dest, src);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("upri", "upri");
				addColumnPathMap("upri_bf", "upri_bf");
				addColumnPathMap("sub_upri1", "sub_upri1");
				addColumnPathMap("sub_upri2", "sub_upri2");
				addColumnPathMap("sub_upri3", "sub_upri3");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("apl_dt", "apl_dt");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("mst_apl_memo", "mst_apl_memo");
				addColumnPathMap("st_dt_bf", "st_dt_bf");
				addColumnPathMap("ref_flg", "ref_flg");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("apl_dt", "apl_dt");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("apl_usr_cd", "apl_usr_cd");
				addColumnPathMap("apl_dpt_cd", "apl_dpt_cd");
				addColumnPathMap("mst_apl_memo", "mst_apl_memo");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_1(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_UpdChk01_Dtl2R src) {
			createMap_up_CALL_OPE01_upd01_1().copy(dest, src);
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}
	/**
	 * Aprv_Del01オペレーション.<p>
	 *
	 * 削除処理（申請）を行う<br>
	 */
	abstract public class Aprv_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.StdSlsUpri_Aprv_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Aprv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_Aprv_DelChk01();
			del01 = mcframe.serverMABS.MABSL0250.MABSL_StdSlsUpriReg.crtStdSlsUpri_Aprv_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Aprv_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR createAprv_Del01_DtlR(){
			return mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.create();
		}

		/**
		 * Aprv_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> createAprv_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>apl_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> src_Aprv_Del01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Aprv_Del01_Dtl);
			up_CALL_OPE01_del01_0(dest1_0, src_Aprv_Del01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("apl_no", "apl_no");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0250.StdSlsUpri_Aprv_DelChk01_DtlR r_dest = dest.createRow();
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
	/**
	 * AprvAfter_Upd01オペレーション.<p>
	 *
	 * 後処理（申請）を行う<br>
	 */
	abstract public class AprvAfter_Upd01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvAfter_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected AprvAfter_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR.class);

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
			invoke((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AprvAfter_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR createAprvAfter_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR.create();
		}

		/**
		 * AprvAfter_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR> createAprvAfter_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0250.AprvAfter_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_StdSlsUpriReg)MABSL_StdSlsUpriReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}