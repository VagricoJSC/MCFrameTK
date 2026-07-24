package mcframe.serverMSBD.MSBDL0120;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBDL_PurcDlvDtAdjstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcDlvDtAdjstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL0120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcDlvDtAdjstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBDL0120_Srch01_INFO;
		this.aSrch01 = ((MSBDL_PurcDlvDtAdjstReg)this).new Srch01();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Srch01 crtSrch01() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
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
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
		p.addDownBlock(aSrch01.down5());
		p.addDownBlock(aSrch01.down6());
		p.addDownBlock(aSrch01.down7());
		p.addDownBlock(aSrch01.down8());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_CndR.create();
	}

	/**
	 * Srch01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R createSrch01_Dtl1R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R.create();
	}

	/**
	 * Srch01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R> createSrch01_Dtl1L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R.class);
	}

	/**
	 * Srch01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R createSrch01_Dtl2R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R.create();
	}

	/**
	 * Srch01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R> createSrch01_Dtl2L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R.class);
	}

	/**
	 * Srch01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R createSrch01_Dtl3R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R.create();
	}

	/**
	 * Srch01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R> createSrch01_Dtl3L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R.class);
	}

	/**
	 * Srch01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R createSrch01_Dtl4R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R.create();
	}

	/**
	 * Srch01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R> createSrch01_Dtl4L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R.class);
	}

	/**
	 * Srch01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R createSrch01_Dtl5R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R.create();
	}

	/**
	 * Srch01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R> createSrch01_Dtl5L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R.class);
	}

	/**
	 * Srch01_Dtl6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R createSrch01_Dtl6R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R.create();
	}

	/**
	 * Srch01_Dtl6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R> createSrch01_Dtl6L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R.class);
	}

	/**
	 * Srch01_Dtl7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R createSrch01_Dtl7R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R.create();
	}

	/**
	 * Srch01_Dtl7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R> createSrch01_Dtl7L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R.class);
	}

	/**
	 * Srch01_Dtl8ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R createSrch01_Dtl8R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R.create();
	}

	/**
	 * Srch01_Dtl8ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R> createSrch01_Dtl8L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R.class);
	}

	/**
	 * Srch01_Dtl9ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R createSrch01_Dtl9R(){
		return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R.create();
	}

	/**
	 * Srch01_Dtl9ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R> createSrch01_Dtl9L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R.class);
	}
	protected MSBDL_PurcDlvDtAdjstReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBDL0120_Srch02_INFO;
		this.aSrch02 = ((MSBDL_PurcDlvDtAdjstReg)this).new Srch02();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Srch02 crtSrch02() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverMSBD.MSBDL0120.Srch02_CndR.create();
	}

	/**
	 * Srch02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch02_CndR> createSrch02_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch02_CndR.class);
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Srch02_DtlR createSrch02_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Srch02_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Srch02_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch02_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBDL0120_Chk01_INFO;
		this.aChk01 = ((MSBDL_PurcDlvDtAdjstReg)this).new Chk01();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Chk01 crtChk01() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.create();
	}

	/**
	 * Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> createChk01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBDL0120_Upd01_INFO;
		this.aUpd01 = ((MSBDL_PurcDlvDtAdjstReg)this).new Upd01();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Upd01 crtUpd01() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
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
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR createUpd01_CtrlR(){
		return mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR.create();
	}

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.create();
	}

	/**
	 * Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> createUpd01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBDL0120_Chk02_INFO;
		this.aChk02 = ((MSBDL_PurcDlvDtAdjstReg)this).new Chk02();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Chk02 crtChk02() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
		p.addDownBlock(aChk02.down0());
		p.addDownBlock(aChk02.down1());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.create();
	}

	/**
	 * Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> createChk02_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
	}

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstReg.Chk05 aChk05;

	protected void initChk05() {
		this.info = PDef.MS_MSBDL0120_Chk05_INFO;
		this.aChk05 = ((MSBDL_PurcDlvDtAdjstReg)this).new Chk05();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Chk05 crtChk05() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
		lgc.initChk05();
		return lgc.aChk05;
	}

	protected void paramChk05(MCParam p) {
		if (this.aChk05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk05.up0());
		p.addDownBlock(aChk05.down0());
	}

	protected void doChk05() {
		aChk05.call();
	};

	/**
	 * Chk05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk05_DtlR createChk05_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.create();
	}

	/**
	 * Chk05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> createChk05_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBDL0120_Upd02_INFO;
		this.aUpd02 = ((MSBDL_PurcDlvDtAdjstReg)this).new Upd02();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Upd02 crtUpd02() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addUpBlock(aUpd02.up1());
		p.addUpBlock(aUpd02.up2());
		p.addDownBlock(aUpd02.down0());
		p.addDownBlock(aUpd02.down1());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk02_HdrR createUpd02_HdrR(){
		return mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.create();
	}

	/**
	 * Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> createUpd02_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
	}

	/**
	 * Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk02_DtlR createUpd02_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.create();
	}

	/**
	 * Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> createUpd02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
	}

	/**
	 * Upd02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR createUpd02_CtrlR(){
		return mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR.create();
	}
	protected MSBDL_PurcDlvDtAdjstReg.Upd05 aUpd05;

	protected void initUpd05() {
		this.info = PDef.MS_MSBDL0120_Upd05_INFO;
		this.aUpd05 = ((MSBDL_PurcDlvDtAdjstReg)this).new Upd05();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Upd05 crtUpd05() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
		lgc.initUpd05();
		return lgc.aUpd05;
	}

	protected void paramUpd05(MCParam p) {
		if (this.aUpd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd05.up0());
		p.addUpBlock(aUpd05.up1());
		p.addDownBlock(aUpd05.down0());
	}

	protected void doUpd05() {
		aUpd05.call();
	};

	/**
	 * Upd05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk05_DtlR createUpd05_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.create();
	}

	/**
	 * Upd05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> createUpd05_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);
	}

	/**
	 * Upd05_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR createUpd05_CtrlR(){
		return mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR.create();
	}
	protected MSBDL_PurcDlvDtAdjstReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBDL0120_Prnt01_INFO;
		this.aPrnt01 = ((MSBDL_PurcDlvDtAdjstReg)this).new Prnt01();
	}

	public static MSBDL_PurcDlvDtAdjstReg.Prnt01 crtPrnt01() {
		MSBDL_PurcDlvDtAdjstReg lgc = new MSBDL_PurcDlvDtAdjstReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addUpBlock(aPrnt01.up1());
		p.addUpBlock(aPrnt01.up2());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR createPrnt01_CtrlR(){
		return mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR.create();
	}

	/**
	 * Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR createPrnt01_DtlR(){
		return mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR.create();
	}

	/**
	 * Prnt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR> createPrnt01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR.class);
	}

	/**
	 * Prnt01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R createPrnt01_Dtl2R(){
		return mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R.create();
	}

	/**
	 * Prnt01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R> createPrnt01_Dtl2L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発注情報、入荷予定、仕入予定、入荷実績、仕入実績、納入指示情報、納期回答情報を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final mcframe.serverMSBD.MSBDL0120.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R> down7;
		/** このオペレーションからの下り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R> down8;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0120.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R.class);
			down3 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R.class);
			down4 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R.class);
			down5 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R.class);
			down6 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R.class);
			down7 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R.class);
			down8 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			if (i == 7) return down7();
			if (i == 8) return down8();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
			down7().clear();
			down8().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_CndR.create();
		}

		/**
		 * Srch01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R createSrch01_Dtl1R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R.create();
		}

		/**
		 * Srch01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R> createSrch01_Dtl1L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R.class);
		}

		/**
		 * Srch01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R createSrch01_Dtl2R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R.create();
		}

		/**
		 * Srch01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R> createSrch01_Dtl2L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R.class);
		}

		/**
		 * Srch01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R createSrch01_Dtl3R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R.create();
		}

		/**
		 * Srch01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R> createSrch01_Dtl3L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R.class);
		}

		/**
		 * Srch01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R createSrch01_Dtl4R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R.create();
		}

		/**
		 * Srch01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R> createSrch01_Dtl4L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R.class);
		}

		/**
		 * Srch01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R createSrch01_Dtl5R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R.create();
		}

		/**
		 * Srch01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R> createSrch01_Dtl5L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R.class);
		}

		/**
		 * Srch01_Dtl6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R createSrch01_Dtl6R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R.create();
		}

		/**
		 * Srch01_Dtl6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R> createSrch01_Dtl6L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R.class);
		}

		/**
		 * Srch01_Dtl7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R createSrch01_Dtl7R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R.create();
		}

		/**
		 * Srch01_Dtl7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R> createSrch01_Dtl7L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R.class);
		}

		/**
		 * Srch01_Dtl8ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R createSrch01_Dtl8R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R.create();
		}

		/**
		 * Srch01_Dtl8ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R> createSrch01_Dtl8L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R.class);
		}

		/**
		 * Srch01_Dtl9ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R createSrch01_Dtl9R(){
			return mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R.create();
		}

		/**
		 * Srch01_Dtl9ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R> createSrch01_Dtl9L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0120.Srch01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_rev</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>po_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rmrks</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>purc_if_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_po_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_addr1</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_addr2</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_addr3</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_addr4</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_tel</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_fax</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_prms_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_refl_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_prms_rcpt_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_prms_refl_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ext_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>edi_dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_ext_sys_typ</td></tr>
		 * 	<tr><td><br></td><td>pri_print_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>act_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_act_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_cmpl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl5R> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_flg</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl6R> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>in_to_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>act_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_act_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl7R> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl8R> down7() {
			return down7;
		}

		/**
		 * 下り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>act_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_act_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_cmpl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch01_Dtl9R> down8() {
			return down8;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 納入指示受領を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Srch02_DtlR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Srch02_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverMSBD.MSBDL0120.Srch02_CndR.create();
		}

		/**
		 * Srch02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch02_CndR> createSrch02_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch02_CndR.class);
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Srch02_DtlR createSrch02_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Srch02_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch02_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Srch02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Srch02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 納入指示を登録・訂正可能かチェックする<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.create();
		}

		/**
		 * Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> createChk01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>crnt_edi_dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_ext_sys_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 納入指示を登録・訂正する<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		private final mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR createUpd01_CtrlR(){
			return mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR.create();
		}

		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.create();
		}

		/**
		 * Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> createUpd01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_HdrR.class);
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR
		 */
		public mcframe.serverMSBD.MSBDL0120.Upd01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>crnt_edi_dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_ext_sys_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 納期回答受領を登録・訂正可能かチェックする<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.create();
		}

		/**
		 * Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> createChk02_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
		}

		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 入荷予定・仕入予定を訂正可能かチェックする<br>
	 */
	abstract public class Chk05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> down0;
		
		
		// コンストラクタ
		protected Chk05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk05_DtlR createChk05_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.create();
		}

		/**
		 * Chk05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> createChk05_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 納期回答受領を登録・訂正する<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> down1;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk02_HdrR createUpd02_HdrR(){
			return mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.create();
		}

		/**
		 * Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> createUpd02_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
		}

		/**
		 * Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk02_DtlR createUpd02_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.create();
		}

		/**
		 * Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> createUpd02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
		}

		/**
		 * Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR createUpd02_CtrlR(){
			return mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR
		 */
		public mcframe.serverMSBD.MSBDL0120.Upd02_CtrlR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd05オペレーション.<p>
	 *
	 * 入荷予定・仕入予定を訂正する<br>
	 */
	abstract public class Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> down0;
		
		
		// コンストラクタ
		protected Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);
			up1 = mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk05_DtlR createUpd05_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.create();
		}

		/**
		 * Upd05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> createUpd05_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk05_DtlR.class);
		}

		/**
		 * Upd05_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR createUpd05_CtrlR(){
			return mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR
		 */
		public mcframe.serverMSBD.MSBDL0120.Upd05_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk05_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書・納入指示書を発行する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R> up2;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR createPrnt01_CtrlR(){
			return mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR.create();
		}

		/**
		 * Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR createPrnt01_DtlR(){
			return mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR.create();
		}

		/**
		 * Prnt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR> createPrnt01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR.class);
		}

		/**
		 * Prnt01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R createPrnt01_Dtl2R(){
			return mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R.create();
		}

		/**
		 * Prnt01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R> createPrnt01_Dtl2L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR
		 */
		public mcframe.serverMSBD.MSBDL0120.Prnt01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Prnt01_Dtl2R> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstReg)MSBDL_PurcDlvDtAdjstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}