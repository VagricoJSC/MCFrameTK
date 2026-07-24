package mcframe.serverMSBB.MSBBL1230;

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
 * "MSBBL_SlsDlvDtAdjstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsDlvDtAdjstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL1230";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsDlvDtAdjstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL1230_Srch01_INFO;
		this.aSrch01 = ((MSBBL_SlsDlvDtAdjstReg)this).new Srch01();
	}

	public static MSBBL_SlsDlvDtAdjstReg.Srch01 crtSrch01() {
		MSBBL_SlsDlvDtAdjstReg lgc = new MSBBL_SlsDlvDtAdjstReg();
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
		p.addDownBlock(aSrch01.down9());
		p.addDownBlock(aSrch01.down10());
		p.addDownBlock(aSrch01.down11());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.CndR createCndR(){
		return mcframe.serverMSBB.MSBBL1230.CndR.create();
	}

	/**
	 * Rslt_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_HdrR createRslt_HdrR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_HdrR.create();
	}

	/**
	 * Rslt_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_DtlR createRslt_DtlR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_DtlR.create();
	}

	/**
	 * Rslt_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_DtlR> createRslt_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_DtlR.class);
	}

	/**
	 * Rslt_Dtl_Ship_SchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR createRslt_Dtl_Ship_SchdR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR.create();
	}

	/**
	 * Rslt_Dtl_Ship_SchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR> createRslt_Dtl_Ship_SchdL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR.class);
	}

	/**
	 * Rslt_Dtl_Slo_PrmsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR createRslt_Dtl_Slo_PrmsR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR.create();
	}

	/**
	 * Rslt_Dtl_Slo_PrmsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR> createRslt_Dtl_Slo_PrmsL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR.class);
	}

	/**
	 * Rslt_Dtl_Slo_StsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR createRslt_Dtl_Slo_StsR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR.create();
	}

	/**
	 * Rslt_Dtl_Slo_StsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR> createRslt_Dtl_Slo_StsL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR.class);
	}

	/**
	 * Rslt_Dtl_Alloc_StsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR createRslt_Dtl_Alloc_StsR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR.create();
	}

	/**
	 * Rslt_Dtl_Alloc_StsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR> createRslt_Dtl_Alloc_StsL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR.class);
	}

	/**
	 * Rslt_Dtl_Dlv_Inst_RcptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR createRslt_Dtl_Dlv_Inst_RcptR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR.create();
	}

	/**
	 * Rslt_Dtl_Dlv_Inst_RcptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR> createRslt_Dtl_Dlv_Inst_RcptL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR.class);
	}

	/**
	 * Rslt_Dtl_WG_RqstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR createRslt_Dtl_WG_RqstR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR.create();
	}

	/**
	 * Rslt_Dtl_WG_RqstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR> createRslt_Dtl_WG_RqstL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR.class);
	}

	/**
	 * Rslt_Dtl_WG_Rqst_PrmsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR createRslt_Dtl_WG_Rqst_PrmsR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR.create();
	}

	/**
	 * Rslt_Dtl_WG_Rqst_PrmsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR> createRslt_Dtl_WG_Rqst_PrmsL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR.class);
	}

	/**
	 * Rslt_Dtl_Ship_ActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR createRslt_Dtl_Ship_ActR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR.create();
	}

	/**
	 * Rslt_Dtl_Ship_ActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR> createRslt_Dtl_Ship_ActL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR.class);
	}

	/**
	 * Rslt_Dtl_Slo_Prms_hisブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR createRslt_Dtl_Slo_Prms_hisR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR.create();
	}

	/**
	 * Rslt_Dtl_Slo_Prms_hisブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR> createRslt_Dtl_Slo_Prms_hisL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR.class);
	}

	/**
	 * Rslt_Dtl_Sls_SchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR createRslt_Dtl_Sls_SchdR(){
		return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR.create();
	}

	/**
	 * Rslt_Dtl_Sls_SchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR> createRslt_Dtl_Sls_SchdL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR.class);
	}
	protected MSBBL_SlsDlvDtAdjstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBBL1230_Chk01_INFO;
		this.aChk01 = ((MSBBL_SlsDlvDtAdjstReg)this).new Chk01();
	}

	public static MSBBL_SlsDlvDtAdjstReg.Chk01 crtChk01() {
		MSBBL_SlsDlvDtAdjstReg lgc = new MSBBL_SlsDlvDtAdjstReg();
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
		p.addUpBlock(aChk01.up3());
		p.addUpBlock(aChk01.up4());
		p.addUpBlock(aChk01.up5());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
		p.addDownBlock(aChk01.down3());
		p.addDownBlock(aChk01.down4());
		p.addDownBlock(aChk01.down5());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Upd01_SloブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Upd01_SloR createUpd01_SloR(){
		return mcframe.serverMSBB.MSBBL1230.Upd01_SloR.create();
	}

	/**
	 * Upd01_Slo_DブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR createUpd01_Slo_DR(){
		return mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.create();
	}

	/**
	 * Upd01_Slo_DブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> createUpd01_Slo_DL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.class);
	}

	/**
	 * Upd01_Ship_SchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR createUpd01_Ship_SchdR(){
		return mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.create();
	}

	/**
	 * Upd01_Ship_SchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> createUpd01_Ship_SchdL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.class);
	}

	/**
	 * Upd01_Slo_PrmsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR createUpd01_Slo_PrmsR(){
		return mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.create();
	}

	/**
	 * Upd01_Slo_PrmsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> createUpd01_Slo_PrmsL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.class);
	}

	/**
	 * Upd01_WG_RqstブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR createUpd01_WG_RqstR(){
		return mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.create();
	}

	/**
	 * Upd01_WG_RqstブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> createUpd01_WG_RqstL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.class);
	}

	/**
	 * Upd01_Sls_SchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR createUpd01_Sls_SchdR(){
		return mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.create();
	}

	/**
	 * Upd01_Sls_SchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> createUpd01_Sls_SchdL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.class);
	}
	protected MSBBL_SlsDlvDtAdjstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBBL1230_Upd01_INFO;
		this.aUpd01 = ((MSBBL_SlsDlvDtAdjstReg)this).new Upd01();
	}

	public static MSBBL_SlsDlvDtAdjstReg.Upd01 crtUpd01() {
		MSBBL_SlsDlvDtAdjstReg lgc = new MSBBL_SlsDlvDtAdjstReg();
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
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
		p.addUpBlock(aUpd01.up5());
		p.addUpBlock(aUpd01.up6());
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
	public mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR createUpd01_CtrlR(){
		return mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR.create();
	}
	protected MSBBL_SlsDlvDtAdjstReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBBL1230_Prnt01_INFO;
		this.aPrnt01 = ((MSBBL_SlsDlvDtAdjstReg)this).new Prnt01();
	}

	public static MSBBL_SlsDlvDtAdjstReg.Prnt01 crtPrnt01() {
		MSBBL_SlsDlvDtAdjstReg lgc = new MSBBL_SlsDlvDtAdjstReg();
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
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_SloブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Prnt01_SloR createPrnt01_SloR(){
		return mcframe.serverMSBB.MSBBL1230.Prnt01_SloR.create();
	}

	/**
	 * Prnt01_Slo_PrmsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR createPrnt01_Slo_PrmsR(){
		return mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR.create();
	}

	/**
	 * Prnt01_Slo_PrmsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR> createPrnt01_Slo_PrmsL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR.class);
	}
	protected MSBBL_SlsDlvDtAdjstReg.RevUpd01 aRevUpd01;

	protected void initRevUpd01() {
		this.info = PDef.MS_MSBBL1230_RevUpd01_INFO;
		this.aRevUpd01 = ((MSBBL_SlsDlvDtAdjstReg)this).new RevUpd01();
	}

	public static MSBBL_SlsDlvDtAdjstReg.RevUpd01 crtRevUpd01() {
		MSBBL_SlsDlvDtAdjstReg lgc = new MSBBL_SlsDlvDtAdjstReg();
		lgc.initRevUpd01();
		return lgc.aRevUpd01;
	}

	protected void paramRevUpd01(MCParam p) {
		if (this.aRevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRevUpd01.up0());
	}

	protected void doRevUpd01() {
		aRevUpd01.call();
	};

	/**
	 * RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受注に関する各種情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1230.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1230.Rslt_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR> down7;
		/** このオペレーションからの下り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR> down8;
		/** このオペレーションからの下り電文パラメータの第9ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR> down9;
		/** このオペレーションからの下り電文パラメータの第10ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR> down10;
		/** このオペレーションからの下り電文パラメータの第11ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR> down11;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1230.CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1230.Rslt_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR.class);
			down3 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR.class);
			down4 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR.class);
			down5 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR.class);
			down6 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR.class);
			down7 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR.class);
			down8 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR.class);
			down9 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR.class);
			down10 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR.class);
			down11 = MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR.class);

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
			if (i == 9) return down9();
			if (i == 10) return down10();
			if (i == 11) return down11();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this);
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
			down9().clear();
			down10().clear();
			down11().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.CndR createCndR(){
			return mcframe.serverMSBB.MSBBL1230.CndR.create();
		}

		/**
		 * Rslt_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_HdrR createRslt_HdrR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_HdrR.create();
		}

		/**
		 * Rslt_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_DtlR createRslt_DtlR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_DtlR.create();
		}

		/**
		 * Rslt_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_DtlR> createRslt_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_DtlR.class);
		}

		/**
		 * Rslt_Dtl_Ship_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR createRslt_Dtl_Ship_SchdR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR.create();
		}

		/**
		 * Rslt_Dtl_Ship_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR> createRslt_Dtl_Ship_SchdL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR.class);
		}

		/**
		 * Rslt_Dtl_Slo_PrmsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR createRslt_Dtl_Slo_PrmsR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR.create();
		}

		/**
		 * Rslt_Dtl_Slo_PrmsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR> createRslt_Dtl_Slo_PrmsL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR.class);
		}

		/**
		 * Rslt_Dtl_Slo_StsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR createRslt_Dtl_Slo_StsR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR.create();
		}

		/**
		 * Rslt_Dtl_Slo_StsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR> createRslt_Dtl_Slo_StsL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR.class);
		}

		/**
		 * Rslt_Dtl_Alloc_StsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR createRslt_Dtl_Alloc_StsR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR.create();
		}

		/**
		 * Rslt_Dtl_Alloc_StsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR> createRslt_Dtl_Alloc_StsL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR.class);
		}

		/**
		 * Rslt_Dtl_Dlv_Inst_RcptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR createRslt_Dtl_Dlv_Inst_RcptR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR.create();
		}

		/**
		 * Rslt_Dtl_Dlv_Inst_RcptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR> createRslt_Dtl_Dlv_Inst_RcptL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR.class);
		}

		/**
		 * Rslt_Dtl_WG_RqstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR createRslt_Dtl_WG_RqstR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR.create();
		}

		/**
		 * Rslt_Dtl_WG_RqstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR> createRslt_Dtl_WG_RqstL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR.class);
		}

		/**
		 * Rslt_Dtl_WG_Rqst_PrmsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR createRslt_Dtl_WG_Rqst_PrmsR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR.create();
		}

		/**
		 * Rslt_Dtl_WG_Rqst_PrmsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR> createRslt_Dtl_WG_Rqst_PrmsL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR.class);
		}

		/**
		 * Rslt_Dtl_Ship_ActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR createRslt_Dtl_Ship_ActR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR.create();
		}

		/**
		 * Rslt_Dtl_Ship_ActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR> createRslt_Dtl_Ship_ActL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR.class);
		}

		/**
		 * Rslt_Dtl_Slo_Prms_hisブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR createRslt_Dtl_Slo_Prms_hisR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR.create();
		}

		/**
		 * Rslt_Dtl_Slo_Prms_hisブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR> createRslt_Dtl_Slo_Prms_hisL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR.class);
		}

		/**
		 * Rslt_Dtl_Sls_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR createRslt_Dtl_Sls_SchdR(){
			return mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR.create();
		}

		/**
		 * Rslt_Dtl_Sls_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR> createRslt_Dtl_Sls_SchdL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1230.CndR
		 */
		public mcframe.serverMSBB.MSBBL1230.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>assort_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>adv_rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
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
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1230.Rslt_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1230.Rslt_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
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
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_day_week_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>ship_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>iv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>iv_act_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>re_ship_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_send_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>org_slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
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
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>iv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>iv_act_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>org_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>re_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>answd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_abl_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_hm</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
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
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_day_week_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_SchdR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>prms_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>last_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_PrmsR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_sts_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>upri</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>biz_dt</td></tr>
		 * 	<tr><td><br></td><td>biz_hm</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * 	<tr><td><br></td><td>st_act_hm</td></tr>
		 * 	<tr><td><br></td><td>end_act_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_StsR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Alloc_StsR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Dlv_Inst_RcptR> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>re_prms_ntc_flg</td></tr>
		 * 	<tr><td><br></td><td>re_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_RqstR> down7() {
			return down7;
		}

		/**
		 * 下り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_rqst_prms_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_src_no</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms_trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_WG_Rqst_PrmsR> down8() {
			return down8;
		}

		/**
		 * 下り電文の第9ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第9ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Ship_ActR> down9() {
			return down9;
		}

		/**
		 * 下り電文の第10ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第10ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Slo_Prms_hisR> down10() {
			return down10;
		}

		/**
		 * 下り電文の第11ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第11ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>sls_ac_abl_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sls_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Rslt_Dtl_Sls_SchdR> down11() {
			return down11;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 更新前のチェック処理<br>
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
		private final mcframe.serverMSBB.MSBBL1230.Upd01_SloR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> up5;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1230.Upd01_SloR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> down5;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1230.Upd01_SloR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.class);
			up3 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.class);
			up4 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.class);
			up5 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.class);
			down0 = mcframe.serverMSBB.MSBBL1230.Upd01_SloR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.class);
			down3 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.class);
			down4 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.class);
			down5 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.class);

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
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
		}
		/**
		 * Upd01_SloブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_SloR createUpd01_SloR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_SloR.create();
		}

		/**
		 * Upd01_Slo_DブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR createUpd01_Slo_DR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.create();
		}

		/**
		 * Upd01_Slo_DブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> createUpd01_Slo_DL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.class);
		}

		/**
		 * Upd01_Ship_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR createUpd01_Ship_SchdR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.create();
		}

		/**
		 * Upd01_Ship_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> createUpd01_Ship_SchdL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.class);
		}

		/**
		 * Upd01_Slo_PrmsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR createUpd01_Slo_PrmsR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.create();
		}

		/**
		 * Upd01_Slo_PrmsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> createUpd01_Slo_PrmsL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.class);
		}

		/**
		 * Upd01_WG_RqstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR createUpd01_WG_RqstR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.create();
		}

		/**
		 * Upd01_WG_RqstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> createUpd01_WG_RqstL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.class);
		}

		/**
		 * Upd01_Sls_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR createUpd01_Sls_SchdR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.create();
		}

		/**
		 * Upd01_Sls_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> createUpd01_Sls_SchdL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1230.Upd01_SloR
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_SloR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>slo_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>re_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
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
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_index</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_index</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> up5() {
			return up5;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_err_flg</td></tr>
		 * 	<tr><td><br></td><td>dac_err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1230.Upd01_SloR
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_SloR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>re_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>org_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_index</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_index</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> down5() {
			return down5;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 受注に関する各種情報を更新する<br>
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
		private final mcframe.serverMSBB.MSBBL1230.Upd01_SloR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR up6;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> down1;
		/** [Upd01_Slo]ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1230.Upd01_SloR aUpd01_Slo;
		/** [Upd01_Slo_D]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> aUpd01_Slo_D;
		/** [Upd01_Sls_Schd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> aUpd01_Sls_Schd;
		/** [Upd01_WG_Rqst]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> aUpd01_WG_Rqst;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1230.MSBBL_SlsDlvDtAdjstReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1230.MSBBL_SlsDlvDtAdjstReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBB.MSBBL1230.Upd01_SloR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR&gt; （{@link #chk01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR&gt; （{@link #chk01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR&gt; （{@link #chk01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR&gt; （{@link #chk01_up5}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBB.MSBBL1230.Upd01_SloR （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR&gt; （{@link #chk01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR&gt; （{@link #chk01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR&gt; （{@link #chk01_down4}）<br>
		 * 第6 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR&gt; （{@link #chk01_down5}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1230.MSBBL_SlsDlvDtAdjstReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBB.MSBBL1230.Upd01_SloR chk01_up0;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> chk01_up1;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> chk01_up2;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> chk01_up3;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> chk01_up4;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> chk01_up5;
		// 連携ロジック下り
		public final mcframe.serverMSBB.MSBBL1230.Upd01_SloR chk01_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> chk01_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> chk01_down2;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> chk01_down3;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> chk01_down4;
		public final MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> chk01_down5;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1230.Upd01_SloR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.class);
			up3 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.class);
			up4 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.class);
			up5 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.class);
			up6 = mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.class);
			aUpd01_Slo = mcframe.serverMSBB.MSBBL1230.Upd01_SloR.create();
			aUpd01_Slo_D = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.class);
			aUpd01_Sls_Schd = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.class);
			aUpd01_WG_Rqst = MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1230.MSBBL_SlsDlvDtAdjstReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBB.MSBBL1230.Upd01_SloR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR>)chk01.up(2);
			chk01_up3 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR>)chk01.up(3);
			chk01_up4 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR>)chk01.up(4);
			chk01_up5 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR>)chk01.up(5);
			chk01_down0 = (mcframe.serverMSBB.MSBBL1230.Upd01_SloR)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR>)chk01.down(2);
			chk01_down3 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR>)chk01.down(3);
			chk01_down4 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR>)chk01.down(4);
			chk01_down5 = (MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR>)chk01.down(5);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverMSBB.MSBBL1230.Upd01_SloR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR&gt; （{@link #chk01_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR&gt; （{@link #chk01_up2}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR&gt; （{@link #chk01_up3}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR&gt; （{@link #chk01_up4}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR&gt; （{@link #chk01_up5}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk01_up0, chk01_up1, chk01_up2, chk01_up3, chk01_up4, chk01_up5, up0(), up1(), up2(), up3(), up4(), up5());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * mcframe.serverMSBB.MSBBL1230.Upd01_SloR（{@link #chk01_down0}）=> aUpd01_Slo<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR&gt;（{@link #chk01_down1}）=> aUpd01_Slo_D<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR&gt;（{@link #chk01_down2}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR&gt;（{@link #chk01_down3}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR&gt;（{@link #chk01_down4}）=> aUpd01_WG_Rqst<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR&gt;（{@link #chk01_down5}）=> aUpd01_Sls_Schd<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(aUpd01_Slo, aUpd01_Slo_D, down0(), down1(), aUpd01_WG_Rqst, aUpd01_Sls_Schd, chk01_down0, chk01_down1, chk01_down2, chk01_down3, chk01_down4, chk01_down5);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			if (i == 6) return up6();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd01_SloブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_SloR createUpd01_SloR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_SloR.create();
		}

		/**
		 * Upd01_Slo_DブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR createUpd01_Slo_DR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.create();
		}

		/**
		 * Upd01_Slo_DブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> createUpd01_Slo_DL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR.class);
		}

		/**
		 * Upd01_Ship_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR createUpd01_Ship_SchdR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.create();
		}

		/**
		 * Upd01_Ship_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> createUpd01_Ship_SchdL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR.class);
		}

		/**
		 * Upd01_Slo_PrmsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR createUpd01_Slo_PrmsR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.create();
		}

		/**
		 * Upd01_Slo_PrmsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> createUpd01_Slo_PrmsL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR.class);
		}

		/**
		 * Upd01_WG_RqstブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR createUpd01_WG_RqstR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.create();
		}

		/**
		 * Upd01_WG_RqstブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> createUpd01_WG_RqstL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR.class);
		}

		/**
		 * Upd01_Sls_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR createUpd01_Sls_SchdR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.create();
		}

		/**
		 * Upd01_Sls_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> createUpd01_Sls_SchdL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR.class);
		}

		/**
		 * Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR createUpd01_CtrlR(){
			return mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1230.Upd01_SloR
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_SloR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>slo_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>edi_prms_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>re_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
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
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_index</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_index</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_flg</td></tr>
		 * 	<tr><td><br></td><td>re_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_re_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms_uncn_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_CtrlR up6() {
			return up6;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>param_row_index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> down1() {
			return down1;
		}


		/**
		 * [Upd01_Slo]ブロックのコンテナaUpd01_SloRを返します。
		 *
		 * @return Upd01_SloR
		 */
		public mcframe.serverMSBB.MSBBL1230.Upd01_SloR Upd01_Slo() {
			return aUpd01_Slo;
		}

		/**
		 * [Upd01_Slo_D]ブロックのコンテナaUpd01_Slo_DLを返します。
		 *
		 * @return Upd01_Slo_DL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> Upd01_Slo_D() {
			return aUpd01_Slo_D;
		}

		/**
		 * [Upd01_Sls_Schd]ブロックのコンテナaUpd01_Sls_SchdLを返します。
		 *
		 * @return Upd01_Sls_SchdL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> Upd01_Sls_Schd() {
			return aUpd01_Sls_Schd;
		}

		/**
		 * [Upd01_WG_Rqst]ブロックのコンテナaUpd01_WG_RqstLを返します。
		 *
		 * @return Upd01_WG_RqstL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> Upd01_WG_Rqst() {
			return aUpd01_WG_Rqst;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverMSBB.MSBBL1230.Upd01_SloR dest0_0, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> dest0_1, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> dest0_2, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> dest0_3, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> dest0_4, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> dest0_5, mcframe.serverMSBB.MSBBL1230.Upd01_SloR src_Upd01_Slo, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> src_Upd01_Slo_D, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> src_Upd01_Ship_Schd, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> src_Upd01_Slo_Prms, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> src_Upd01_WG_Rqst, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> src_Upd01_Sls_Schd){
			up_CALL_OPE_chk01_0(dest0_0, src_Upd01_Slo);
			up_CALL_OPE_chk01_1(dest0_1, src_Upd01_Slo_D);
			up_CALL_OPE_chk01_2(dest0_2, src_Upd01_Ship_Schd);
			up_CALL_OPE_chk01_3(dest0_3, src_Upd01_Slo_Prms);
			up_CALL_OPE_chk01_4(dest0_4, src_Upd01_WG_Rqst);
			up_CALL_OPE_chk01_5(dest0_5, src_Upd01_Sls_Schd);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("can_rsn_cd", "can_rsn_cd");
				addColumnPathMap("can_rmrks", "can_rmrks");
				addColumnPathMap("slo_prms_prnt_flg", "slo_prms_prnt_flg");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1230.Upd01_SloR dest, mcframe.serverMSBB.MSBBL1230.Upd01_SloR src) {
			createMap_up_CALL_OPE_chk01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("can_rsn_cd", "can_rsn_cd");
				addColumnPathMap("slo_d_can_rmkrs", "slo_d_can_rmkrs");
				addColumnPathMap("slo_d_upd_cntr", "slo_d_upd_cntr");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("edi_prms_flg", "edi_prms_flg");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_2() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("fix_flg", "fix_flg");
				addColumnPathMap("re_ship_schd_flg", "re_ship_schd_flg");
				addColumnPathMap("ship_rqst_tm", "ship_rqst_tm");
				addColumnPathMap("pd_inst_dlv_tm", "pd_inst_dlv_tm");
				addColumnPathMap("not_dt_calc_flg", "not_dt_calc_flg");
				addColumnPathMap("ship_schd_tm", "ship_schd_tm");
				addColumnPathMap("dlv_schd_tm", "dlv_schd_tm");
				addColumnPathMap("ship_block_flg", "ship_block_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("ship_cnt_rmrks", "ship_cnt_rmrks");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_lg_grp_cd", "dlv_lg_grp_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("tdlv_nm", "tdlv_nm");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_cntct_dpt", "tdlv_cntct_dpt");
				addColumnPathMap("tdlv_cntct_psn", "tdlv_cntct_psn");
				addColumnPathMap("tdlv_zip_cd", "tdlv_zip_cd");
				addColumnPathMap("tdlv_addr1", "tdlv_addr1");
				addColumnPathMap("tdlv_addr2", "tdlv_addr2");
				addColumnPathMap("tdlv_addr3", "tdlv_addr3");
				addColumnPathMap("tdlv_addr4", "tdlv_addr4");
				addColumnPathMap("tdlv_tel", "tdlv_tel");
				addColumnPathMap("tdlv_fax", "tdlv_fax");
				addColumnPathMap("tdlv_lg_grp_cd", "tdlv_lg_grp_cd");
				addColumnPathMap("dlv_day_week_typ", "dlv_day_week_typ");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("slo_prms_index", "slo_prms_index");
				addColumnPathMap("param_row_index", "param_row_index");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_3() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_3();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("slo_prms_rev", "slo_prms_rev");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("prms_dlv_tm", "prms_dlv_tm");
				addColumnPathMap("trd_unit_prms_qty", "trd_unit_prms_qty");
				addColumnPathMap("prms_rmrks", "prms_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("slo_prms_index", "slo_prms_index");
				addColumnPathMap("param_row_index", "param_row_index");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_3(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_3(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_3();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_4() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_4();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("wg_rqst_no", "wg_rqst_no");
				addColumnPathMap("re_rqst_flg", "re_rqst_flg");
				addColumnPathMap("re_rqst_dt", "re_rqst_dt");
				addColumnPathMap("wg_re_rqst_cnt_rmrks", "wg_re_rqst_cnt_rmrks");
				addColumnPathMap("prms_uncn_flg", "prms_uncn_flg");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_4(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_4(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_4();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_5() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_5();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sls_schd_dt", "sls_schd_dt");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_5(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_5(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_5();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(mcframe.serverMSBB.MSBBL1230.Upd01_SloR dest_Upd01_Slo, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> dest_Upd01_Slo_D, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> dest_Upd01_Ship_Schd, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> dest_Upd01_Slo_Prms, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> dest_Upd01_WG_Rqst, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> dest_Upd01_Sls_Schd, mcframe.serverMSBB.MSBBL1230.Upd01_SloR src0_0, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> src0_1, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> src0_2, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> src0_3, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> src0_4, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> src0_5){
			down_CALL_OPE_chk01_0(dest_Upd01_Slo, src0_0);
			down_CALL_OPE_chk01_1(dest_Upd01_Slo_D, src0_1);
			down_CALL_OPE_chk01_2(dest_Upd01_Ship_Schd, src0_2);
			down_CALL_OPE_chk01_3(dest_Upd01_Slo_Prms, src0_3);
			down_CALL_OPE_chk01_4(dest_Upd01_WG_Rqst, src0_4);
			down_CALL_OPE_chk01_5(dest_Upd01_Sls_Schd, src0_5);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("can_rsn_cd", "can_rsn_cd");
				addColumnPathMap("can_rmrks", "can_rmrks");
				addColumnPathMap("slo_prms_prnt_flg", "slo_prms_prnt_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("upd_cntr_err_flg", "upd_cntr_err_flg");
				addColumnPathMap("dac_err_flg", "dac_err_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1230.Upd01_SloR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_SloR r_src) {
			createMap_down_CALL_OPE_chk01_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("can_rsn_cd", "can_rsn_cd");
				addColumnPathMap("slo_d_can_rmkrs", "slo_d_can_rmkrs");
				addColumnPathMap("edi_prms_flg", "edi_prms_flg");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Slo_DR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_2() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("fix_flg", "fix_flg");
				addColumnPathMap("re_ship_schd_flg", "re_ship_schd_flg");
				addColumnPathMap("ship_rqst_tm", "ship_rqst_tm");
				addColumnPathMap("pd_inst_dlv_tm", "pd_inst_dlv_tm");
				addColumnPathMap("not_dt_calc_flg", "not_dt_calc_flg");
				addColumnPathMap("ship_schd_tm", "ship_schd_tm");
				addColumnPathMap("dlv_schd_tm", "dlv_schd_tm");
				addColumnPathMap("ship_block_flg", "ship_block_flg");
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("org_abort_flg", "org_abort_flg");
				addColumnPathMap("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd");
				addColumnPathMap("ship_fr_lg_grp_wg_cd", "ship_fr_lg_grp_wg_cd");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("ship_cnt_rmrks", "ship_cnt_rmrks");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_lg_grp_cd", "dlv_lg_grp_cd");
				addColumnPathMap("dlv_cntry_cd", "dlv_cntry_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("tdlv_sundry_flg", "tdlv_sundry_flg");
				addColumnPathMap("tdlv_nm", "tdlv_nm");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_cntct_dpt", "tdlv_cntct_dpt");
				addColumnPathMap("tdlv_cntct_psn", "tdlv_cntct_psn");
				addColumnPathMap("tdlv_zip_cd", "tdlv_zip_cd");
				addColumnPathMap("tdlv_addr1", "tdlv_addr1");
				addColumnPathMap("tdlv_addr2", "tdlv_addr2");
				addColumnPathMap("tdlv_addr3", "tdlv_addr3");
				addColumnPathMap("tdlv_addr4", "tdlv_addr4");
				addColumnPathMap("tdlv_tel", "tdlv_tel");
				addColumnPathMap("tdlv_fax", "tdlv_fax");
				addColumnPathMap("tdlv_lg_grp_cd", "tdlv_lg_grp_cd");
				addColumnPathMap("dlv_day_week_typ", "dlv_day_week_typ");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("slo_prms_index", "slo_prms_index");
				addColumnPathMap("param_row_index", "param_row_index");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Ship_SchdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_3() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_3();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("slo_prms_no", "slo_prms_no");
				addColumnPathMap("slo_prms_rev", "slo_prms_rev");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("dlv_inst_rcpt_no", "dlv_inst_rcpt_no");
				addColumnPathMap("prms_dlv_tm", "prms_dlv_tm");
				addColumnPathMap("trd_unit_prms_qty", "trd_unit_prms_qty");
				addColumnPathMap("base_unit_prms_qty", "base_unit_prms_qty");
				addColumnPathMap("prms_rmrks", "prms_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("slo_prms_h_no", "slo_prms_h_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("slo_prms_index", "slo_prms_index");
				addColumnPathMap("param_row_index", "param_row_index");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_3(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_3(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_3();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Slo_PrmsR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_4() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_4();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("wg_rqst_no", "wg_rqst_no");
				addColumnPathMap("re_rqst_flg", "re_rqst_flg");
				addColumnPathMap("re_rqst_dt", "re_rqst_dt");
				addColumnPathMap("wg_re_rqst_cnt_rmrks", "wg_re_rqst_cnt_rmrks");
				addColumnPathMap("prms_uncn_flg", "prms_uncn_flg");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_4(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_4(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_4();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_WG_RqstR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック5のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_5() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_5();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sls_schd_dt", "sls_schd_dt");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("peg_no", "peg_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_5(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_dest, mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_5(MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> dest, MCList<mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_5();
			for(mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_src : src){
				mcframe.serverMSBB.MSBBL1230.Upd01_Sls_SchdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納期回答書を発行する<br>
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
		private final mcframe.serverMSBB.MSBBL1230.Prnt01_SloR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR> up1;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1230.Prnt01_SloR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR.class);

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
			invoke((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_SloブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Prnt01_SloR createPrnt01_SloR(){
			return mcframe.serverMSBB.MSBBL1230.Prnt01_SloR.create();
		}

		/**
		 * Prnt01_Slo_PrmsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR createPrnt01_Slo_PrmsR(){
			return mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR.create();
		}

		/**
		 * Prnt01_Slo_PrmsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR> createPrnt01_Slo_PrmsL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1230.Prnt01_SloR
		 */
		public mcframe.serverMSBB.MSBBL1230.Prnt01_SloR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_prms_h_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1230.Prnt01_Slo_PrmsR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this).info;
		}


	}
	/**
	 * RevUpd01オペレーション.<p>
	 *
	 * 受注納期回答改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected RevUpd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);

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
			invoke((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRevUpd01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsDlvDtAdjstReg)MSBBL_SlsDlvDtAdjstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}