package mcframe.serverMSBE.MSBEL2210;

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
 * "MSBEL_RcptIvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_RcptIvReg_MC_A extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL2210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_RcptIvReg.RcptIv_Chk01 aRcptIv_Chk01;

	protected void initRcptIv_Chk01() {
		this.info = PDef.MS_MSBEL2210_RcptIv_Chk01_INFO;
		this.aRcptIv_Chk01 = ((MSBEL_RcptIvReg)this).new RcptIv_Chk01();
	}

	public static MSBEL_RcptIvReg.RcptIv_Chk01 crtRcptIv_Chk01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initRcptIv_Chk01();
		return lgc.aRcptIv_Chk01;
	}

	protected void paramRcptIv_Chk01(MCParam p) {
		if (this.aRcptIv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcptIv_Chk01.up0());
		p.addUpBlock(aRcptIv_Chk01.up1());
		p.addUpBlock(aRcptIv_Chk01.up2());
		p.addDownBlock(aRcptIv_Chk01.down0());
		p.addDownBlock(aRcptIv_Chk01.down1());
		p.addDownBlock(aRcptIv_Chk01.down2());
	}

	protected void doRcptIv_Chk01() {
		aRcptIv_Chk01.call();
	};

	/**
	 * Iv_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Chk01_HdrR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Chk01_DtlR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Chk01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Chk01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Iv_Chk01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Chk01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL2210_Srch01_INFO;
		this.aSrch01 = ((MSBEL_RcptIvReg)this).new Srch01();
	}

	public static MSBEL_RcptIvReg.Srch01 crtSrch01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addUpBlock(aSrch01.up1());
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
	public mcframe.serverMSBD.MSBDL0140.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBD.MSBDL0140.Srch01_CndR.create();
	}

	/**
	 * Srch01_Cnd2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R createSrch01_Cnd2R(){
		return mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R.create();
	}

	/**
	 * Srch01_Cnd2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R> createSrch01_Cnd2L(){
		return MCList.create(mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R.class);
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.class);
	}

	/**
	 * Srch01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Srch01_IoR createSrch01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Srch01_IoR.create();
	}

	/**
	 * Srch01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> createSrch01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBEL2210_Srch02_INFO;
		this.aSrch02 = ((MSBEL_RcptIvReg)this).new Srch02();
	}

	public static MSBEL_RcptIvReg.Srch02 crtSrch02() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
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
		p.addDownBlock(aSrch02.down1());
		p.addDownBlock(aSrch02.down2());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverMSBD.MSBDL0140.Srch02_CndR.create();
	}

	/**
	 * Srch02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Srch01_HdrR createSrch02_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Srch01_HdrR.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Srch01_DtlR createSrch02_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.class);
	}

	/**
	 * Srch02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Srch01_IoR createSrch02_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Srch01_IoR.create();
	}

	/**
	 * Srch02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> createSrch02_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Iv_Ins01 aIv_Ins01;

	protected void initIv_Ins01() {
		this.info = PDef.MS_MSBEL2210_Iv_Ins01_INFO;
		this.aIv_Ins01 = ((MSBEL_RcptIvReg)this).new Iv_Ins01();
	}

	public static MSBEL_RcptIvReg.Iv_Ins01 crtIv_Ins01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initIv_Ins01();
		return lgc.aIv_Ins01;
	}

	protected void paramIv_Ins01(MCParam p) {
		if (this.aIv_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Ins01.up0());
		p.addUpBlock(aIv_Ins01.up1());
		p.addUpBlock(aIv_Ins01.up2());
		p.addDownBlock(aIv_Ins01.down0());
		p.addDownBlock(aIv_Ins01.down1());
		p.addDownBlock(aIv_Ins01.down2());
	}

	protected void doIv_Ins01() {
		aIv_Ins01.call();
	};

	/**
	 * Iv_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Ins01_HdrR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Ins01_DtlR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Ins01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Ins01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Iv_Ins01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Ins01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Iv_Upd01 aIv_Upd01;

	protected void initIv_Upd01() {
		this.info = PDef.MS_MSBEL2210_Iv_Upd01_INFO;
		this.aIv_Upd01 = ((MSBEL_RcptIvReg)this).new Iv_Upd01();
	}

	public static MSBEL_RcptIvReg.Iv_Upd01 crtIv_Upd01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initIv_Upd01();
		return lgc.aIv_Upd01;
	}

	protected void paramIv_Upd01(MCParam p) {
		if (this.aIv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Upd01.up0());
		p.addUpBlock(aIv_Upd01.up1());
		p.addUpBlock(aIv_Upd01.up2());
		p.addDownBlock(aIv_Upd01.down0());
		p.addDownBlock(aIv_Upd01.down1());
		p.addDownBlock(aIv_Upd01.down2());
	}

	protected void doIv_Upd01() {
		aIv_Upd01.call();
	};

	/**
	 * Iv_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Upd01_HdrR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Upd01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Upd01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Iv_Upd01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Upd01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Iv_Del01 aIv_Del01;

	protected void initIv_Del01() {
		this.info = PDef.MS_MSBEL2210_Iv_Del01_INFO;
		this.aIv_Del01 = ((MSBEL_RcptIvReg)this).new Iv_Del01();
	}

	public static MSBEL_RcptIvReg.Iv_Del01 crtIv_Del01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initIv_Del01();
		return lgc.aIv_Del01;
	}

	protected void paramIv_Del01(MCParam p) {
		if (this.aIv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Del01.up0());
		p.addUpBlock(aIv_Del01.up1());
		p.addUpBlock(aIv_Del01.up2());
	}

	protected void doIv_Del01() {
		aIv_Del01.call();
	};

	/**
	 * Iv_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Del01_HdrR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Del01_DtlR(){
		return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Del01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Del01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Iv_Del01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Del01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL2210_Chk01_INFO;
		this.aChk01 = ((MSBEL_RcptIvReg)this).new Chk01();
	}

	public static MSBEL_RcptIvReg.Chk01 crtChk01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
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
		p.addUpBlock(aChk01.up2());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
	}

	/**
	 * Chk01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createChk01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Chk01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createChk01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBEL2210_Chk02_INFO;
		this.aChk02 = ((MSBEL_RcptIvReg)this).new Chk02();
	}

	public static MSBEL_RcptIvReg.Chk02 crtChk02() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
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
		p.addUpBlock(aChk02.up2());
		p.addDownBlock(aChk02.down0());
		p.addDownBlock(aChk02.down1());
		p.addDownBlock(aChk02.down2());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createChk02_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
	}

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createChk02_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
	}

	/**
	 * Chk02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createChk02_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Chk02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createChk02_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBEL2210_Chk03_INFO;
		this.aChk03 = ((MSBEL_RcptIvReg)this).new Chk03();
	}

	public static MSBEL_RcptIvReg.Chk03 crtChk03() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
		p.addUpBlock(aChk03.up1());
		p.addUpBlock(aChk03.up2());
		p.addDownBlock(aChk03.down0());
		p.addDownBlock(aChk03.down1());
		p.addDownBlock(aChk03.down2());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createChk03_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
	}

	/**
	 * Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createChk03_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
	}

	/**
	 * Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createChk03_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
	}

	/**
	 * Chk03_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createChk03_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Chk03_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createChk03_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBEL2210_Ins01_INFO;
		this.aIns01 = ((MSBEL_RcptIvReg)this).new Ins01();
	}

	public static MSBEL_RcptIvReg.Ins01 crtIns01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addUpBlock(aIns01.up1());
		p.addUpBlock(aIns01.up2());
		p.addDownBlock(aIns01.down0());
		p.addDownBlock(aIns01.down1());
		p.addDownBlock(aIns01.down2());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createIns01_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
	}

	/**
	 * Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createIns01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
	}

	/**
	 * Ins01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIns01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Ins01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIns01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL2210_Upd01_INFO;
		this.aUpd01 = ((MSBEL_RcptIvReg)this).new Upd01();
	}

	public static MSBEL_RcptIvReg.Upd01 crtUpd01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
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
		p.addDownBlock(aUpd01.down2());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
	}

	/**
	 * Upd01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createUpd01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Upd01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createUpd01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}
	protected MSBEL_RcptIvReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBEL2210_Del01_INFO;
		this.aDel01 = ((MSBEL_RcptIvReg)this).new Del01();
	}

	public static MSBEL_RcptIvReg.Del01 crtDel01() {
		MSBEL_RcptIvReg lgc = new MSBEL_RcptIvReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
		p.addUpBlock(aDel01.up2());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createDel01_HdrR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
	}

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createDel01_DtlR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
	}

	/**
	 * Del01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createDel01_IoR(){
		return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
	}

	/**
	 * Del01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createDel01_IoL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RcptIv_Chk01オペレーション.<p>
	 *
	 * 受領インボイス登録・訂正・取消前のチェックを行う。（共通処理）<br>
	 */
	abstract public class RcptIv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcptIv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected RcptIv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Iv_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Chk01_HdrR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Chk01_DtlR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Chk01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Chk01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Iv_Chk01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Chk01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pd.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.peg_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>pd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ph.err_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.cred_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>bef_fix_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pd.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.peg_no</td></tr>
		 * 	<tr><td><br></td><td>pd.err_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.ver_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.pack_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.dlv_loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>pd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_rate</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 仕入予定、入荷予定、入荷実績情報を検索する。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Srch01 {
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
		private final mcframe.serverMSBD.MSBDL0140.Srch01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Srch01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R.class);
			down0 = mcframe.serverMSBD.MSBDL0140.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
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
		public mcframe.serverMSBD.MSBDL0140.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBD.MSBDL0140.Srch01_CndR.create();
		}

		/**
		 * Srch01_Cnd2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R createSrch01_Cnd2R(){
			return mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R.create();
		}

		/**
		 * Srch01_Cnd2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R> createSrch01_Cnd2L(){
			return MCList.create(mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R.class);
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.class);
		}

		/**
		 * Srch01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_IoR createSrch01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Srch01_IoR.create();
		}

		/**
		 * Srch01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> createSrch01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>io_srch_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Srch01_CndR
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Srch01_Cnd2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
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
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>slo_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_xrate</td></tr>
		 * 	<tr><td><br></td><td>slo_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
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
		 * @see mcframe.serverMSBD.MSBDL0140.Srch01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>src_wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bf_cng</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>scst_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_nm</td></tr>
		 * 	<tr><td><br></td><td>scst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>scst_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_addr1</td></tr>
		 * 	<tr><td><br></td><td>scst_addr2</td></tr>
		 * 	<tr><td><br></td><td>scst_addr3</td></tr>
		 * 	<tr><td><br></td><td>scst_addr4</td></tr>
		 * 	<tr><td><br></td><td>scst_tel</td></tr>
		 * 	<tr><td><br></td><td>scst_fax</td></tr>
		 * 	<tr><td><br></td><td>scst_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>scst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>scst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 受領インボイス情報もしくは仕入実績情報を検索する。<br>
	 */
	abstract public class Srch02 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Srch02 {
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
		private final mcframe.serverMSBD.MSBDL0140.Srch02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Srch02_CndR.create();
			down0 = mcframe.serverMSBD.MSBDL0140.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_IoR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverMSBD.MSBDL0140.Srch02_CndR.create();
		}

		/**
		 * Srch02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_HdrR createSrch02_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Srch01_HdrR.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_DtlR createSrch02_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_DtlR.class);
		}

		/**
		 * Srch02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_IoR createSrch02_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Srch01_IoR.create();
		}

		/**
		 * Srch02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> createSrch02_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>newest_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Srch02_CndR
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
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
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>slo_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_xrate</td></tr>
		 * 	<tr><td><br></td><td>slo_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
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
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_reg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Srch01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>src_wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bf_cng</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>scst_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_nm</td></tr>
		 * 	<tr><td><br></td><td>scst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>scst_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_addr1</td></tr>
		 * 	<tr><td><br></td><td>scst_addr2</td></tr>
		 * 	<tr><td><br></td><td>scst_addr3</td></tr>
		 * 	<tr><td><br></td><td>scst_addr4</td></tr>
		 * 	<tr><td><br></td><td>scst_tel</td></tr>
		 * 	<tr><td><br></td><td>scst_fax</td></tr>
		 * 	<tr><td><br></td><td>scst_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>scst_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>scst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>scst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Iv_Ins01オペレーション.<p>
	 *
	 * 受領インボイス・仕入実績を登録する。<br>
	 */
	abstract public class Iv_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Iv_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Iv_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Ins01_HdrR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Ins01_DtlR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Ins01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Ins01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Iv_Ins01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Ins01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pd.peg_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>pd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pd.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.tmp_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_id_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_schd_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pd.peg_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Iv_Upd01オペレーション.<p>
	 *
	 * 受領インボイスを訂正する。仕入実績を登録・訂正する。（確定ＦＬＧにより変動）<br>
	 */
	abstract public class Iv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Iv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Iv_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Upd01_HdrR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Upd01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Upd01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Iv_Upd01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Upd01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pd.peg_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>pd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pd.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.tmp_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_id_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_schd_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pd.peg_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Iv_Del01オペレーション.<p>
	 *
	 * 受領インボイスを取り消す。仕入実績を登録・取消する。（暫定ＦＬＧにより変動）<br>
	 */
	abstract public class Iv_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		
		
		// コンストラクタ
		protected Iv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Iv_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR createIv_Del01_HdrR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR createIv_Del01_DtlR(){
			return mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> createIv_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Del01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIv_Del01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Iv_Del01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIv_Del01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ac_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ph.rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>ph.purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ph.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ph.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ph.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>ph.tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL2210.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pd.peg_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pd.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>pd.upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>pd.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>pd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pd.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>pd.arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>pd.tmp_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>pd.purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pd.manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2210.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_id_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 仕入実績登録前のチェックを行う。<br>
	 */
	abstract public class Chk01 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Chk01 {
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
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
		}

		/**
		 * Chk01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createChk01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Chk01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createChk01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 仕入実績訂正前のチェックを行う。<br>
	 */
	abstract public class Chk02 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Chk02 {
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
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createChk02_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
		}

		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createChk02_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
		}

		/**
		 * Chk02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createChk02_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Chk02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createChk02_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>old_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 仕入実績取消前のチェックを行う。<br>
	 */
	abstract public class Chk03 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Chk03 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createChk03_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
		}

		/**
		 * Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createChk03_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
		}

		/**
		 * Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createChk03_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
		}

		/**
		 * Chk03_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createChk03_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Chk03_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createChk03_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>outsrc_act_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 仕入実績を登録する。<br>
	 */
	abstract public class Ins01 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Ins01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createIns01_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
		}

		/**
		 * Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createIns01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
		}

		/**
		 * Ins01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createIns01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Ins01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createIns01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_id_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕入実績を訂正する。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Upd01 {
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
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
		}

		/**
		 * Upd01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createUpd01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Upd01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createUpd01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 仕入実績を取り消す。<br>
	 */
	abstract public class Del01 extends mcframe.serverMSBD.MSBDL0140.MSBDL_PurcReg.Del01 {
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
		private final mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);

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
			invoke((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR createDel01_HdrR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_HdrR.create();
		}

		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_DtlR createDel01_DtlR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_DtlR.class);
		}

		/**
		 * Del01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_IoR createDel01_IoR(){
			return mcframe.serverMSBD.MSBDL0140.Chk01_IoR.create();
		}

		/**
		 * Del01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> createDel01_IoL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0140.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0140.Chk01_HdrR
		 */
		public mcframe.serverMSBD.MSBDL0140.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0140.Chk01_IoR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvReg)MSBEL_RcptIvReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}